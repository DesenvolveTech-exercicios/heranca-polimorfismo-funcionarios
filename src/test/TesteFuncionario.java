package test;
import models.Funcionario;
import models.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {
        Gerente gerente = new Gerente(
                "Marcos Rosario",
                "Financas",
                32,
                "financas digitais");
        Funcionario funcionario = new Funcionario(
                "Welter Desizar",
                "Financas",
                23,
                "financas digitais",
                "FinTech", gerente);

        System.out.println(funcionario);
    }
}
