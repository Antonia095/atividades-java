package br.db.atividade.b_alunos;

import java.util.ArrayList;
import java.util.List;

// Nota 10: Alice, Arthur
// Nota 9: Cassiane, Karina
// Nota 8: Samuel
// Nota 7:
// Nota 6: Jaqueline, Juliana, Jonathan, Jeferson

public class TesteAluno {
    public static void main(String[] args) {
        List<Aluno> aluno = new ArrayList<Aluno>();
        aluno.add(new Aluno("Jaqueline", 6));
        aluno.add(new Aluno("Arthur", 10));
        aluno.add(new Aluno("Cassiane", 9));
        aluno.add(new Aluno("Jeferson", 6));
        aluno.add(new Aluno("Samuel", 8));
        aluno.add(new Aluno("Aline", 10));
        aluno.add(new Aluno("Jonathan", 6));


        AlunoService alunos = new AlunoService();
        alunos.alunosPorNota(aluno);

    }
}
