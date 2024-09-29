package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {

    private Map<String, Integer> contagemPalavra;

    public ContagemPalavra() {
        this.contagemPalavra = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem){
        contagemPalavra.put(palavra,contagem);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavra.isEmpty()){
            contagemPalavra.remove(palavra);
        }else{
            System.out.println("O map está vazio");
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavra);
    }

    public String encontrarPalavrasMaisFrequente() {
        String palavraMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : contagemPalavra.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraMaisFrequente = entry.getKey();
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavra contagemPalavra = new ContagemPalavra();

        contagemPalavra.adicionarPalavra("PARA", 10);
        contagemPalavra.adicionarPalavra("VOCÊ", 3);
        contagemPalavra.adicionarPalavra("ATÉ", 1);
        contagemPalavra.adicionarPalavra("ALÉM", 2);
        contagemPalavra.adicionarPalavra("QUE", 5);

        contagemPalavra.exibirContagemPalavras();

        System.out.println(contagemPalavra.encontrarPalavrasMaisFrequente());

        contagemPalavra.removerPalavra("QUE");
        contagemPalavra.exibirContagemPalavras();
    }

}
