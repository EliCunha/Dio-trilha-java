import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String agencia;
        int numero;
        String nomeDoCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira seu nome!");
        nomeDoCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();
        System.out.println("Por favor, insíra o saldo inicial da sua conta!");
        saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá "+nomeDoCliente+", obrigado por criar uma conta em nosso banco," +
                " sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível " +
                "para saque");


    }
}
