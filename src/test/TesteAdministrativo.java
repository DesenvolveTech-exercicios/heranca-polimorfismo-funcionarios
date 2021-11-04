package test;

import dados.Turnos;
import models.Administrativo;
import models.Gerente;

public class TesteAdministrativo {
    public static void main(String[] args) {
        System.out.println("---------Administrativo noturno------");
        System.out.println(dadosNorturnos());
        System.out.println();
        System.out.println("---------Administrativo noturno------");
        System.out.println(dadosDiurno());
    }

    public static String dadosNorturnos(){
        Gerente gerente = new Gerente(
                "Valeria Santiago",
                "Gestão empresarial",
                27,
                "gestavil");

        Administrativo administrativo = new Administrativo(
                "fabiana maia",
                "92286311C",
                "Gestão empresarial",
                31,
                "Gestavil",
                "gestão de serviços comerciais",
                Turnos.DIURNO,
                gerente);

        return administrativo.exibeDados();
    }

    public static String dadosDiurno(){
        Gerente gerente = new Gerente(
                "Valeria Santiago",
                "Gestão empresarial",
                27,
                "gestavil");

        Administrativo administrativo = new Administrativo(
                "Gustavo maia",
                "42786412C",
                "Gestão empresarial",
                31,
                "Gestavil",
                "gestão de serviços comerciais",
                Turnos.NOTURNO,
                gerente);

        return administrativo.exibeDados();
    }
}
