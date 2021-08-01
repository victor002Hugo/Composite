import java.util.ArrayList;
import java.util.List;

public class CaixaPrata extends Caixa{

    private List<Produto> produtoLista = new ArrayList<>();


    @Override
    public void imprimirCaixas() {
        double valorTotal=0;
        for (int i=0;i<produtoLista.size();i++){
            System.out.println("Produto: "+produtoLista.get(i).getNomeProduto()+"|"+" Valor: R$: "+produtoLista.get(i).getValorProduto());
            valorTotal=produtoLista.get(i).getValorProduto()+valorTotal;
        }
        System.out.println("O valor total da caixa é :R$: "+valorTotal);
    }

    public void addProduto(Produto produto){
        if(produtoLista.size()<5){
            produtoLista.add(produto);
        }else{
            System.out.println("Você Ultrapassou o limite permitido");
        }
    }

    public void removeProduto(Produto produto){
        produtoLista.remove(produto);
    }
}
