package application;

import model.entities.*;

public class ProgramShape {

    public static void main(String[] args) {

        Shape s1 = new Circle(Color.BLACK, 2.0);
        Shape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Cor do círculo: " + s1.getColor());
        System.out.println("Área do círculo: " + String.format("%.2f", s1.area()));
        System.out.println("Cor do retângulo: " + s2.getColor());
        System.out.println("Área do retângulo: " + String.format("%.2f", s2.area()));

    }
}
