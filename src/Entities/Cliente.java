package Entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Cliente {
    String nome;
    String rg;
    String cpf;
    String dataNascimento;



    public static int calcularIdade(String dataDeNascimentoString) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataDeNascimento = LocalDate.parse(dataDeNascimentoString, formatter);
        LocalDate dataAtual = LocalDate.now();
        Period idade = Period.between(dataDeNascimento, dataAtual);
        return idade.getYears();

    }
}
