import java.util.Scanner;
import java.io.UnsupportedEncodingException;

public class ContaTerminal {
    public static void main(String[] args) throws UnsupportedEncodingException {
        
        // Configura o Scanner para usar UTF-8
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Solicita e lê o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        // Solicita e lê o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita e lê o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        // Solicita e lê o saldo da conta
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem final com os dados inseridos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!");
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);

        if(saldo > 0) {
            System.out.println("Seu saldo " + saldo + " já está disponível para saque.");
        } else if (saldo == 0) {
            System.out.println("Você não tem saldo disponível para saque.");
        } else {
            System.out.println("Você está com saldo negativo, regularize sua situação.");
        }

        // Fecha o scanner
        scanner.close();
    }
}