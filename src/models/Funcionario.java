package models;

public class Funcionario {
    private String nome;
    private String areaDeAtuacao;
    private int idade;
    private String time;
    private String squad;
    private Gerente gerente;

    public Funcionario(String nome, String areaDeAtuacao, int idade, String time, String squad, Gerente gerente) {
        this.nome = nome;
        this.areaDeAtuacao = areaDeAtuacao;
        this.idade = idade;
        this.time = time;
        this.squad = squad;
        this.gerente = gerente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAreaDeAtuacao() {
        return areaDeAtuacao;
    }

    public void setAreaDeAtuacao(String areaDeAtuacao) {
        this.areaDeAtuacao = areaDeAtuacao;
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

    public String getSquad() {
        return squad;
    }

    public void setSquad(String squad) {
        this.squad = squad;
    }

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", areaDeAtuacao='" + areaDeAtuacao + '\'' +
                ", idade=" + idade +
                ", time='" + time + '\'' +
                ", squad='" + squad + '\'' +
                ", gerente=" + gerente +
                '}';
    }
}
