import java.util.ArrayList;
import java.util.List;

public class Caixa implements Composite{


    private List<Produto> produtoLista = new ArrayList<>();

    @Override
    public void imprimirCaixas() {
        double valorTotal=0;
        for(Produto produto:produtoLista){
            produto.imprimirCaixas();
        }
    }


    public void addProduto(Produto produto){
        produtoLista.add(produto);
    }

    public void removeProduto(Produto produto){
        produtoLista.remove(produto);
    }
}
