package application;

import model.entities.Contrato;
import model.entities.Parcelas;
import model.services.ContratoService;
import model.services.PayPalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicio {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite os dados do contrato: ");
        System.out.print("Número: ");
        int numero = sc.nextInt();
        System.out.print("Data: ");
        LocalDate data = LocalDate.parse(sc.next(), dtf);
        System.out.print("Valor do contrato: ");
        double valor = sc.nextDouble();

        Contrato contrato = new Contrato(numero, data, valor);

        System.out.print("Digite o número de parcelas: ");
        int numeroParcelas = sc.nextInt();

        ContratoService contratoService = new ContratoService(new PayPalService());

        contratoService.processoContrato(contrato, numeroParcelas);

        System.out.println("Parcelas: ");
        for (Parcelas p : contrato.getParcelas()) {
            System.out.println(p);
        }

        sc.close();
    }
}
