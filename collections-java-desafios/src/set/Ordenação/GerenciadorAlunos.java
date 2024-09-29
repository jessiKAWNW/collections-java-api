package set.Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunosSet;

    public GerenciadorAlunos(){
        this.alunosSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunosSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula){
        Aluno alunoParaRemover = null;
        if(!alunosSet.isEmpty()){
            for(Aluno aluno : alunosSet){
                if(aluno.getMatricula() == matricula){
                    alunoParaRemover = aluno;
                    break;
                }
            }
            if(alunoParaRemover != null) {
                alunosSet.remove(alunoParaRemover);
                System.out.println("Aluno com matrícula " + matricula + " removido.");
            } else {
                System.out.println("Aluno com matrícula " + matricula + " não encontrado.");
            }
        } else {
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunosSet);
        if(!alunosSet.isEmpty()){
            System.out.println(alunosPorNome);
        } else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPornota = new TreeSet<>(new ComparatorNota());
        if(!alunosSet.isEmpty()){
            alunosPornota.addAll(alunosSet);
            System.out.println(alunosPornota);
        } else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirAlunos(){
        System.out.println(alunosSet);
    }

    public static void main(String[] args) {

        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Jessica", 123479L,10.0);
        gerenciadorAlunos.adicionarAluno("Joao", 456078L,9.0);
        gerenciadorAlunos.adicionarAluno("Marcos", 197646L,9.9);
        gerenciadorAlunos.adicionarAluno("José", 654673L,6.0);
        gerenciadorAlunos.adicionarAluno("Maria", 127487L,7.0);
        gerenciadorAlunos.adicionarAluno("Bia", 190479L,9.1);
        gerenciadorAlunos.adicionarAluno("Ana", 123489L,4.0);

        gerenciadorAlunos.exibirAlunos();
        System.out.println("Exibindo alunos por nome: ");
        gerenciadorAlunos.exibirAlunosPorNome();
        System.out.println("\n");

        System.out.println("Exibindo alunos por nota: ");
        gerenciadorAlunos.exibirAlunosPorNota();
        System.out.println("\n");

        gerenciadorAlunos.removerAluno(190479L);
        System.out.println("Conjunto após remoção: ");
        gerenciadorAlunos.exibirAlunosPorNome();
    }

}
