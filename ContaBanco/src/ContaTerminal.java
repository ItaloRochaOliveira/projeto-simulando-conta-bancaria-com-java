import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, insira os dados a seguir.");

        System.out.println("Digita seu nome:");
        String nome = scanner.next();

        System.out.println("Digita sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu número: ");
        int numero = scanner.nextInt();
       
        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo é de " + saldo + " já está disponível para saque");

       scanner.close();
    }
}
