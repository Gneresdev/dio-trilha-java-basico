import java.util.Locale;
import java.util.Scanner;


//Entender como funciona o Scanner
//Projeto realizado para o Bootcamp Santander, com foco em consolidar o aprendizado.

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta !");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome Completo !");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o valor do Saldo !");
        saldo = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}