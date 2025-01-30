import java.util.Scanner;

public class ContaTerminal {

    private String nomeCliente;
    private String agencia;
    private int numeroConta;
    private double saldo;

    public static void main(String[] args) {

        ContaTerminal conta = new ContaTerminal();
        conta.cadastroConta();
        conta.exibirConta();
    }

    public void cadastroConta() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o numero da agencia");
        agencia = scanner.nextLine();

        System.out.println("Digite o numero da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("Digite o saldo da conta: ");
        saldo = scanner.nextDouble();

        scanner.close();

    }

    public void exibirConta() {

        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Agencia: " + agencia);
        System.out.println("Numero conta: " + numeroConta);
        System.out.println("Saldo da conta: " + saldo);
    }

}