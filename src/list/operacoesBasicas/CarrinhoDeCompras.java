package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item t : itemList) {
            if (t.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(t);
            }
        }
        itemList.removeAll(itensParaRemover);
    }
    public double calcularValorTotal(){
        double valorTotal = 0;
        for (Item item : itemList) {
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
    public void exibirItens(){
        for (Item item : itemList) {
            System.out.println("Nome: " + item.getNome() + ", Preço: " + item.getPreco() + ", Quantidade: " + item.getQuantidade());
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Camiseta", 50, 1);
        carrinho.adicionarItem("short", 30, 5);
        carrinho.adicionarItem("blusa", 80, 2);
        carrinho.removerItem("");
        carrinho.exibirItens();
        System.out.println("valor total: " + carrinho.calcularValorTotal());
    }
}
