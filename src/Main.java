public class Main {
    public static void main(String[] args) {

        Produto quadrinho = new Produto("Quadrinhos",15);
        Produto chaveiro = new Produto("Chaveiros",5);
        Produto bustos = new Produto("Bustos",10);
        Produto adesivos = new Produto("Adesivos",1);
        Produto posters = new Produto("Posters",25);
        Produto camisetas = new Produto("Camisetas",25);
        Produto canetas = new Produto("Canetas",3);
        Produto miniaturas = new Produto("Miniaturas",20);


        Caixa caixaBronze = new CaixaBronze();
        Caixa caixaPrata = new CaixaPrata();
        Caixa caixaOuro = new CaixaOuro();
        Caixa caixaPlatina = new CaixaPlatina();



        caixaBronze.addProduto(quadrinho);
        caixaBronze.addProduto(quadrinho);
        caixaBronze.addProduto(quadrinho);
        caixaBronze.imprimirCaixas();


        System.out.println("---------------------------");
        caixaPrata.addProduto(quadrinho);
        caixaPrata.addProduto(chaveiro);
        caixaPrata.addProduto(bustos);
        caixaPrata.addProduto(canetas);
        caixaPrata.addProduto(miniaturas);


        caixaPrata.imprimirCaixas();
    }
}
