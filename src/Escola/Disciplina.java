package src.Escola;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private int cargaHoraria;

    ArrayList<Professor> professores;
    ArrayList<Turma> turmas;


    public void getNome (String nome)
    {
        this.nome = nome;
    }
    public void getCargaHoraria (int cargaHoraria )
    {
        this.cargaHoraria = cargaHoraria;
    }

    public String setNome()
    {
        return nome;
    }
    public int setCargaHoraria()
    {
        return cargaHoraria;
    }
}
