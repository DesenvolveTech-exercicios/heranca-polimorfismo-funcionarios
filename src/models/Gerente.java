package models;

public class Gerente {
    private String nome;
    private String AreaDeAtuacao;
    private int idade;
    private String time;
    private double salario = 15000.00;

    public Gerente(String nome, String AreaDeAtuacao, int idade, String time){
        this.nome = nome;
        this.AreaDeAtuacao = AreaDeAtuacao;
        this.idade = idade;
        this.time = time;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeAtuacao() {
        return AreaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        AreaDeAtuacao = areaDeAtuacao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "models.Gerente{" +
                "nome='" + nome + '\'' +
                ", AreaDeAtuacao='" + AreaDeAtuacao + '\'' +
                ", idade=" + idade + '\'' +
                ", Time=" + time + + '\'' +
                ", Salario=" + salario +
                '}';
    }
}
