package models;

public class Assistente extends Funcionario{
    private String matricula;
    private double salario = 10000.00;

    public Assistente(String nome, String matricula, String areaDeAtuacao, int idade, String time, String squad, Gerente gerente) {
        super(nome, areaDeAtuacao, idade, time, squad, gerente);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public double getSalario() {
        return salario;
    }

    public String exibeDados(){
        return "nome: " + super.getNome() + "\n" +
                "Matricula: " + matricula + "\n" +
                "Area de atuação: " + super.getAreaDeAtuacao() + "\n" +
                "Idade: " + super.getIdade() + "\n" +
                "Time: " + super.getTime() + "\n" +
                "Squad: " + super.getSquad() + "\n" +
                "Gerente: " + super.getGerente().getNome() + "\n" +
                "Salario: " + salario;
    }
}
