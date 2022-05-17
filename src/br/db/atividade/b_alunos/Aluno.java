package br.db.atividade.b_alunos;

public class Aluno {
    private String nome;
    private Integer nota;

    public Aluno(String nome, Integer nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    public Integer getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
