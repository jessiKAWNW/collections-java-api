package set.Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private Long matricula;
    private double nota;

    public Aluno(String nomeAluno,Long matriculaAluno,double notaAluno){
        this.nome = nomeAluno;
        this.matricula = matriculaAluno;
        this.nota = notaAluno;
    }


    public String getNome(){
        return nome;
    }

    public Long getMatricula(){
        return matricula;
    }

    public double getNota(){
        return nota;
    }

    public String toString(){
        return "Aluno [ nome: " + getNome() + ", matricula: " + getMatricula() + ", nota: " + getNota();
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(getMatricula(), aluno.getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getMatricula());
    }
}

class ComparatorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getNota(), a2.getNota());
    }
}
