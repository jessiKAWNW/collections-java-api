package list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {

    private List<Integer> numeros;

    @Override
    public int compareTo(Integer n) {
        return 0;
    }

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosAscendente);
        return numerosAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> numerosAscendentes = new ArrayList<>(numeros);
        numerosAscendentes.sort(Collections.reverseOrder());
        return numerosAscendentes;
    }

    public void exibirNumeros(){
        System.out.println(numeros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(24);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(10);

        ordenacaoNumeros.exibirNumeros();

        System.out.println("Números em ordem ascendente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Némros em ordem descendente: " + ordenacaoNumeros.ordenarDescendente());
    }

}
