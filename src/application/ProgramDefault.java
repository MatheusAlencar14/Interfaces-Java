package application;

import model.services.BrazilInterestService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramDefault {

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        BrazilInterestService bis = new BrazilInterestService(2.0);
        double pagamento = bis.pagamento(valor, meses);

        System.out.println("Pagamento após " + meses + "meses.");
        System.out.println("Valor: " + String.format("%.2f", pagamento));
    }
}
