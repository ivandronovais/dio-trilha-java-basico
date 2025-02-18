import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, insira o nome do cliente: ");
        String nomeCliente = input.nextLine();

        System.out.println("Insira o numero da agência: ");
        String agencia = input.nextLine();

        System.out.println("insira o numero da conta: ");
        int numero = input.nextInt();

        System.out.println("insira o seu saldo: ");
        double saldo = input.nextDouble();
    
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        input.close();
    }
}
