import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //TO DO: Conhecer e importar a classe Scanner
        try (Scanner scan = new Scanner (System.in).useLocale(Locale.US)) {
            //Exibir as mensagens para o nosso usuário
            System.out.println("Por favor, digite o número da agência:");
            //Obter pela Scanner os valores digitados no terminal
            String agencia = scan.next();

            System.out.println("Por favor, digite o número da conta:");
            int conta = scan.nextInt();

            System.out.println("Por favor, digite seu nome e sobrenome:");
            String nome = scan.next();
            String sobrenome = scan.next();

            System.out.println("Por favor, digite o saldo atual da conta:");
            double saldo = scan.nextDouble();

            //Exibir a mensagem final
            System.out.printf("Olá %s %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nome, sobrenome, agencia, conta, saldo);
        }
    }
}
