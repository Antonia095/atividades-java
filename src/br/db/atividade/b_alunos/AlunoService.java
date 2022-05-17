package br.db.atividade.b_alunos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlunoService {
    // Qual tipo de retorno? Como organizar alunos por nota?

    public Object alunosPorNota(List<Aluno> alunos) {
        // Nota 10: Alice, Arthur
        // Nota 9: Cassiane, Karina
        // Nota 8: Samuel
        // Nota 7:
        // Nota 6: Jaqueline, Juliana, Jonathan, Jeferson

        Map<Integer, String> map = new HashMap<>();

        for (Aluno aluno : alunos) {

            if (map.containsKey(aluno.getNota())) {
                map.put(aluno.getNota(), map.get(aluno.getNota()) + ", " + aluno.getNome());
            } else {
                map.put(aluno.getNota(), aluno.getNome());
            }

        }

        for (Map.Entry<Integer, String> elemento : map.entrySet())
            System.out.println("Nota " + elemento.getKey() + ": "  + elemento.getValue());

        return alunos;

    }

}
