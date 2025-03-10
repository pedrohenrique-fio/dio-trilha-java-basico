import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main (String[] args) {

        /* Apresentação do sistema */
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("------ Seja bem vindo(a) ao sistema de criação de agências proposto pelo desafio da DigitalInnovationOne! ------");

        /* Inserção do nome do cliente*/
        System.out.println("Insira o nome do cliente que estará criando a agencia abaixo:");
        String nomeCliente = scanner.nextLine();

         /* Inserção do nome da agencia */
        System.out.println("Insira o nome da agência abaixo:");
        String nomeAgencia = scanner.nextLine();

         /* Inserção do número da agencia */
        System.out.println("Insira o número da agência:");
        int numeroAgencia = scanner.nextInt();

         /* inserção do saldo da agencia */
        System.out.println("Insira o saldo da agência:");
        double saldoAgencia = scanner.nextDouble(); 

        /* Apresentação dos dados alocados pelo usuário e finalização do sistema */
        System.out.println("Olá " + nomeCliente + " " + "Obrigado por criar uma conta em nosso sistema, sua agência é " +nomeAgencia+ ", " + "conta " + numeroAgencia + " " + "e seu saldo de " + saldoAgencia + " " + "já está disponivel para saque");

    }
    
}
