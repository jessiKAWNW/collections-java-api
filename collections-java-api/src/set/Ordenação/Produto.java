package set.Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private long codigoProduto;
    private String nomeProduto;
    private double precoProduto;
    private int quantidadeProduto;

    public Produto(long codigoProduto, String nomeProduto, double precoProduto, int quantidadeProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.quantidadeProduto = quantidadeProduto;
    }

    public Produto(long codigoProduto, String nomeProduto, double precoProduto) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    @Override
    public int compareTo(Produto p) {
        return nomeProduto.compareTo(p.getNomeProduto());
    }

    public long getCodigoProduto() {
        return codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return getCodigoProduto() == produto.getCodigoProduto();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCodigoProduto());
    }

    @Override
    public String toString() {
        return "[Produto{" +
                "codigoProduto=" + codigoProduto +
                ", nomeProduto='" + nomeProduto + '\'' +
                ", precoProduto=" + precoProduto +
                ", quantidadeProduto=" + quantidadeProduto +
                "}]";
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPrecoProduto(), p2.getPrecoProduto());
    }
}
