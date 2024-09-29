package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer > numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
    numeros.add(numero);
    }

    public int calcularSoma(){
        int somaTodosNumeros = 0;

        for(Integer n : numeros){
            somaTodosNumeros +=n ;
        }
        return somaTodosNumeros;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!numeros.isEmpty()) {
            for (Integer numero : numeros) {
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numeros.isEmpty()){
            for(Integer n : numeros){
                if(n <= menorNumero){
                    menorNumero = n;
                }
            }
        } else {
            System.out.println("A lista está vazia");
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        if (!numeros.isEmpty()) {
            System.out.println(numeros);
        } else{
            System.out.println("A lista está fazia");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(6);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();

        System.out.println("A soma de todos os números da lista: " + somaNumeros.calcularSoma());

        System.out.println("O maior valor é: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor valor é: " + somaNumeros.encontrarMenorNumero());
    }

}
