package test;

import models.Gerente;
import models.Tecnico;

public class TesteTecnico {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
                "Matias da Rosa",
                "Infra",
                43,
                "Suporte");

        Tecnico tecnico = new Tecnico(
                "Caio vargas",
                "21532686D",
                "Infra",
                35,
                "Suporte",
                "Suporte ao usuario",
                247.75,
                gerente);

        System.out.println(tecnico.exibeDados());
    }
}
