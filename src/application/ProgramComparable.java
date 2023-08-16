package application;

import model.entities.Color;
import model.entities.Funcionario;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramComparable {

    public static void main(String[] args) {

        List<Funcionario> list = new ArrayList<>();
        String path = "C:\\temp\\in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String funcionarioCsv = br.readLine();
            while (funcionarioCsv != null) {
                String[] vet = funcionarioCsv.split(",");
                list.add(new Funcionario(vet[0], Double.parseDouble(vet[1])));
                funcionarioCsv = br.readLine();
            }
            Collections.sort(list);
            for (Funcionario s : list) {
                System.out.println(s.getNome() + ", " + s.getSalario());
            }
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
