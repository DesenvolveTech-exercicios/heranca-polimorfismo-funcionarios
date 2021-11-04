package models;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(String nome,
                   String matricula,
                   String areaDeAtuacao,
                   int idade,
                   String time,
                   String squad,
                   double bonusSalarial,
                   Gerente gerente) {
        super(nome, matricula, areaDeAtuacao, idade, time, squad, gerente);
        this.bonusSalarial = bonusSalarial;
    }

    public String exibeBonusSalarial() {
        double bonus = bonusSalarial + super.getSalario();
        return Double.toString(bonus);
    }

    public String exibeDados(){
        return super.exibeDados() + "\n" +
                "Bonus Salarial: " + exibeBonusSalarial();
    }
}
