package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<PalavrasUnicas> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        palavrasUnicasSet.add(new PalavrasUnicas(palavra));
    }

    public void removerPalavra(String palavra){
        PalavrasUnicas palavraParaRemover = null;

        for(PalavrasUnicas p : palavrasUnicasSet){
            if(p.getPalavra().equalsIgnoreCase(palavra)){
                palavraParaRemover = p;
            }
        }
        if(palavraParaRemover == null){
            System.out.println("Essa palavra não está presente no set");
        }
        palavrasUnicasSet.remove(palavraParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return palavrasUnicasSet.contains(new PalavrasUnicas(palavra));
    }

    public void exibirPalavrasUnicas() {
        if(!palavrasUnicasSet.isEmpty()) {
            System.out.println(palavrasUnicasSet);
        } else {
            System.out.println("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Programação");
        conjuntoPalavrasUnicas.adicionarPalavra("POO");
        conjuntoPalavrasUnicas.adicionarPalavra("Encapsulamento");
        conjuntoPalavrasUnicas.adicionarPalavra("Dados");

        System.out.println("Set de palavras únicas: ");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        conjuntoPalavrasUnicas.removerPalavra("POO");
        System.out.println("Exibindo palavras depois da remoção");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

        System.out.println("A palavra 'Programação' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("Programação"));
        System.out.println("A palavra 'POO' está no conjunto? " + conjuntoPalavrasUnicas.verificarPalavra("POO"));

        // Exibindo as linguagens únicas atualizadas no conjunto
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


    }

}
