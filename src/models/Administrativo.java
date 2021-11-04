package models;

import dados.Turnos;

public class Administrativo extends Assistente{
    public Turnos turno;

    public Administrativo(String nome,
                          String matricula,
                          String areaDeAtuacao,
                          int idade,
                          String time,
                          String squad,
                          Turnos turno,
                          Gerente gerente) {
        super(nome, matricula, areaDeAtuacao, idade, time, squad, gerente);
        this.turno = turno;
    }

    public Turnos getTurno() {
        return turno;
    }

    public String exibeAdicionalNorturno(){
        if (turno.equals(Turnos.NOTURNO)) {
            String adicional = Double.toString(450.12 + super.getSalario());
            return adicional;
        }
        return "Não possui adicional norturno";
    }

    @Override
    public String exibeDados() {
        return super.exibeDados() + "\n" +
                "Adicional noturno: " + exibeAdicionalNorturno();
    }
}
