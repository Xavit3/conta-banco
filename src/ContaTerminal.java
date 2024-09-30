import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
      //TODO: Conhecer e importar a classe Scanner
      
      //Exibir as mensagens para o nosso usuário

      // obter pela classe Scanner os valores digitados no terminal

      //Exibir a mensagem da conta criada

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da Conta!");
        Integer numero = scanner.nextInt();
        
        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome 
                            + ", obrigado por criar uma conta em nosso banco, sua agência é " 
                            + agencia + ", conta " + numero + "  e seu saldo " 
                            + saldo + " já está disponível para saque.");
    }
   
}
