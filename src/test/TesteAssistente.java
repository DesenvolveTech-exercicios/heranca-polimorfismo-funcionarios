package test;

import models.Assistente;
import models.Gerente;

public class TesteAssistente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
                "Vanderlei da costa",
                "Segurança",
                27,
                "monitoramento estratégico");

        Assistente assistente = new Assistente(
                "Robson fortuna",
                "01284524A",
                "Segurança",
                20,
                "monitoramento estratégico",
                "montero",
                gerente);

        System.out.println(assistente.exibeDados());
    }
}
