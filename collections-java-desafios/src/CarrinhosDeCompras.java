import java.util.ArrayList;
import java.util.List;

public class CarrinhosDeCompras {

    private List<Item> itemList;

    public CarrinhosDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itensParaRemover.add(i);
            }
            itemList.removeAll(itensParaRemover);
        }
    }


    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {

        CarrinhosDeCompras carrinhosDeCompras = new CarrinhosDeCompras();

//        System.out.println("Todos os itens do carrinho são: " );
//        carrinhosDeCompras.exibirItens();

        carrinhosDeCompras.adicionarItem("Blusa",57.00,2);

        System.out.println("O valor total do carrinho é de: " + carrinhosDeCompras.calcularValorTotal());
        System.out.println("Todos os itens do carrinho são: " );
        carrinhosDeCompras.exibirItens();
        System.out.println("\n");

        carrinhosDeCompras.adicionarItem("Bermuda",20.0,1);

        System.out.println("O valor total do carrinho é de: " + carrinhosDeCompras.calcularValorTotal());
        System.out.println("Todos os itens do carrinho são: " );
        carrinhosDeCompras.exibirItens();
        System.out.println("\n");

        carrinhosDeCompras.removerItem("Blusa");

        System.out.println("O valor total do carrinho é de: " + carrinhosDeCompras.calcularValorTotal());
        System.out.println("Todos os itens do carrinho são: " );
        carrinhosDeCompras.exibirItens();


    }

}
