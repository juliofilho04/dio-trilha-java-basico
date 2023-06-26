import java.util.Scanner;
public class Contador {
    public static void main(String[] args) throws Exception{
        try (Scanner scan = new Scanner (System.in)) {
            
            int parametroUm, parametroDois;
            System.out.println("Informe dois parâmetros: ");
            parametroUm = scan.nextInt();
            parametroDois = scan.nextInt();

            try {
                contar(parametroUm, parametroDois);

            } catch (ParametrosInvalidosException e) {
                System.out.println("O parâmetro um deve ser menor que o parâmetro dois.");
            }
        }
    }
    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        }
            int contagem = parametroDois - parametroUm;

            for (int i = 0; i < contagem; i++) {
                System.out.println("Imprimindo o número " + (i + 1));
            }
    }
}
