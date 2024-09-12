package model;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private String matricula;
    private String nome;
    private List<Disciplina> disciplinasMatriculadas;

    public Aluno(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
        this.disciplinasMatriculadas = new ArrayList<>();
    }

    // Getters e setters
}