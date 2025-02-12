import java.util.Scanner;
import java.util.Random;
public class ContaTerminal {
    public static void main(String[] arg){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("seja bem vindo! Qual o seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Sua Agencia:");
        String agencia = scanner.nextLine();
        int numero = random.nextInt(9999);
        double saldo = random.nextDouble(100000);
        System.out.println("Olá " + nome + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " , conta " + numero + " e seu saldo "  + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
