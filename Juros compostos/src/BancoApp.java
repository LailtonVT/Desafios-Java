import java.text.DecimalFormat;
import java.util.Scanner;

public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();

        double valorFinal = calcularValorFinal(valorInicial, taxaJuros, periodo);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Valor final do investimento: R$ " + df.format(valorFinal));

        scanner.close();
    }

    public static double calcularValorFinal(double valorInicial, double taxaJuros, int periodo) {
        double valorFinal = valorInicial;

        for (int ano = 1; ano <= periodo; ano++) {
            valorFinal *= (1 + taxaJuros);
        }

        return valorFinal;
    }
}