package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrasilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Digite os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), dtf);
        System.out.print("Devolução (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), dtf);
        CarRental carRental = new CarRental(start, finish, new Vehicle (carModel));

        System.out.print("Digite o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Digite o preço por dia: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrasilTaxService());

        rentalService.processInvoice(carRental);

        System.out.println();
        System.out.println("FATURA");
        System.out.println("Pagamento básico: " + carRental.getInvoice().getBasicPayment());
        System.out.println("Imposto: " + carRental.getInvoice().getTax());
        System.out.println("Pagamento total: " + carRental.getInvoice().getTotalPayment());

        sc.close();
    }
}
