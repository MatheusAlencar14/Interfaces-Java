package model.entities;

public class Funcionario implements Comparable<Funcionario>{

    private String nome;
    private Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public int compareTo(Funcionario o) {
        //Adicionando "-"(Sinal de menos) a lista fica em ordem decrescente
        //return nome.compareTo(o.getNome());
        //return -nome.compareTo(o.getNome());
        //return -salario.compareTo(o.getSalario());
        return salario.compareTo(o.getSalario());
    }
}
