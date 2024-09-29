package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario() {
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra,definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        } else{
            System.out.println("O conjunto está vazio");
        }
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Palavra não encontrada no dicionário.";
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Agnóstico","Aquele que não acredita em Deus e nem nega a sua existência.");
        dicionario.adicionarPalavra("Alvíssaras","Expressão de alegria por notícia recebida.");
        dicionario.adicionarPalavra(" Balaústre","Pequena coluna ornamentada utilizada em cercas.");
        dicionario.adicionarPalavra("Beneplácito","Consentimento ou aprovação.");
        dicionario.adicionarPalavra("Cornucópia","Abundância, vaso em forma de chifre cheio de flores e frutos que representa a fartura.");
        dicionario.adicionarPalavra("Cuntatório","Em que há demora");

        System.out.println("Palavras do dicionario: ");
        dicionario.exibirPalavras();
        System.out.println("\n");

        System.out.println("Definição da palavra pesquisada: ");
        System.out.println(dicionario.pesquisarPorPalavra("Agnóstico"));
        System.out.println("\n");

        dicionario.removerPalavra("Cuntatório");
        System.out.println("Dicionario após a remoção de uma palavra: ");
        dicionario.exibirPalavras();

    }


}
