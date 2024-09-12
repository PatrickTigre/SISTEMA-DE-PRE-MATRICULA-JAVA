package model;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String codigo;
    private String nome;
    private int creditos;
    private List<Aluno> alunosMatriculados;

    public Disciplina(String codigo, String nome, int creditos) {
        this.codigo = codigo;
        this.nome = nome;
        this.creditos = creditos;
        this.alunosMatriculados = new ArrayList<>();
    }

    // Getters e setters
}
