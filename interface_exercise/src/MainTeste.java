import java.util.Scanner;

public class MainTeste {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total:");
        double value = sc.nextDouble();
        System.out.println("Digite o número de parcelas:");
        int numberOfInstallments = sc.nextInt();

        sc.close();

        methodTeste(value, numberOfInstallments);

    }

    private static void methodTeste(double value, int numberOfInstallments) {
        double valorDaParcela = value / numberOfInstallments;
        double parcial;
        double total;
        for(int i=0; i<numberOfInstallments; i++) {
            parcial = valorDaParcela + ((valorDaParcela*(i+1)/100) * 1);
            total = (parcial + parcial * 0.02);
            System.out.println(total);
        }
    }
}
