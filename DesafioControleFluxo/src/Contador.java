
    import java.util.Scanner ;

public class Contador{

    public static void main(String[] args) {

            try (Scanner terminal = new Scanner(System.in)) {
                System.out.println("Digite o primeiro numero (Parametro) : ");

                int parametroUm = terminal.nextInt();

                System.out.println("Digite o primeiro numero (Parametro) : ");
                int parametroDois = terminal.nextInt();
      
                try {
   
                contar(parametroUm, parametroDois);


   }
   catch(ParametrosInvalidosException e) {



      System.out.println("Mensagem de error: " + e.getMessage());



    }
            }
}
static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {

if(parametroUm > parametroDois) {
    throw new ParametrosInvalidosException("O Segundo nunero deve ser maior que o primeiro ");

}

for (int i = parametroUm; i <= parametroDois; i++) {
    System.out.println("Imprimindo o numero " + i);
    
}

    //necessario criar uma classe ParametrosInvalidosException
}
    class ParametrosInvalidosException extends Exception{
        public ParametrosInvalidosException(String message) { 
            super (message);
            
        }
}
}
