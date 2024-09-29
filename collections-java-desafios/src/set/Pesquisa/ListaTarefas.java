package set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefasSet;

    public ListaTarefas() {
        this.tarefasSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao){
        tarefasSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        Tarefa tarefaParaRemover = null;

        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefaParaRemover = t;
                    break;
                }
            }
        }
        tarefasSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas(){
        System.out.println(tarefasSet);
    }

    public int contarTarefas(){
        return tarefasSet.size();
    }

    public Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> taferasConcluidas = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.isTarefaConcluida()){
                    taferasConcluidas.add(t);
                }
            }
        }else {
            System.out.println("O set está vazio");
        }
        return taferasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(!t.isTarefaConcluida()){
                  tarefasPendentes.add(t);
                }
            }
        }else {
            System.out.println("O set está vazio");
        }
        return tarefasPendentes;
    }

    public void marcarTarefaConcluida(String descricao){
        if(!tarefasSet.isEmpty()){
            for(Tarefa t : tarefasSet){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setTarefaConcluida(true);
                }
            }
        }else {
            System.out.println("O set está vazio");
        }
    }
    public void marcarTarefaPendente(String descricao) {
        Tarefa tarefaParaMarcarComoPendente = null;
        for (Tarefa t : tarefasSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaParaMarcarComoPendente = t;
                break;
            }
        }
        if (tarefaParaMarcarComoPendente != null) {
            if(tarefaParaMarcarComoPendente.isTarefaConcluida()){
                tarefaParaMarcarComoPendente.setTarefaConcluida(false);
            }
        } else {
            System.out.println("Tarefa não encontrada na lista.");
        }
    }

    public void limparListaTarefas() {
        if (tarefasSet.isEmpty()) {
            System.out.println("A lista já está vazia!");
        } else {
            tarefasSet.clear();
        }
    }

    public static void main(String[] args) {

        ListaTarefas tarefas = new ListaTarefas();

        tarefas.adicionarTarefa("Lavar louça");
        tarefas.adicionarTarefa("Estudar Java");
        tarefas.adicionarTarefa("Fazer comida");
        tarefas.adicionarTarefa("Estudar Calculo");
        tarefas.adicionarTarefa("Pesquisar materia");

        System.out.println("Exibindo tarefas:");
        tarefas.exibirTarefas();

        System.out.println("Quantidade de tarefas no set: " + tarefas.contarTarefas());
        System.out.println("\n");

        System.out.println("As tarefas concluidas são: " + tarefas.obterTarefasConcluidas());
        System.out.println("As tarefas pendentes são: " + tarefas.obterTarefasPendentes());
        System.out.println("\n");

        tarefas.marcarTarefaConcluida("Lavar louça");
        tarefas.marcarTarefaPendente("Fazer comida");
        tarefas.marcarTarefaConcluida("Estudar java");
        tarefas.marcarTarefaPendente("Estudar Calculo");
        tarefas.marcarTarefaPendente("Pesquisar materia");

        System.out.println("As tarefas concluidas são: " + tarefas.obterTarefasConcluidas());
        System.out.println("As tarefas pendentes são: " + tarefas.obterTarefasPendentes());
        System.out.println("\n");

        tarefas.removerTarefa("Pesquisar materia");
        System.out.println("Exibindo tarefas depois da remoção");
        tarefas.exibirTarefas();
        System.out.println("Quantidade de tarefas no set: " + tarefas.contarTarefas());
        System.out.println("\n");

        tarefas.limparListaTarefas();
        System.out.println("Lista de tarefa após remover todas as terefas: ");
        tarefas.exibirTarefas();




    }
}
