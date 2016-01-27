package br.com.alura.algoritmos;

public class TestaOrdenacao {
	public static void main(String[] args) {
		Produto[] produtos = {
				 new Produto("Lamborghini", 1000000),
				 new Produto("Jipe", 46000),
				 new Produto("Brasilia", 16000),
				 new Produto("Smart", 46000),
				 new Produto("Fusca", 17000)
				 };
		//selectionSort(produtos, produtos.length);
		novoSort(produtos, produtos.length);
		for (Produto produto : produtos){
			System.out.println(produto.getNome() + " Custa: " + produto.getPreco());
		}
	}
	private static void novoSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int atual = 1; atual < quantidadeDeElementos; atual++) {
			int analise = atual;
			System.out.println(produtos[analise - 1].getPreco());
			while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
				troca(produtos, analise, analise - 1);
				analise--;
			}
		}
	}
	private static void troca(Produto produtos[], int primeiro, int segundo) {
		Produto primeiroProduto = produtos[primeiro];
		Produto segundoProduto = produtos[segundo];
		produtos[primeiro] = segundoProduto;
		produtos[segundo] = primeiroProduto;
		
	}
	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
			int maisBarato = buscaMaisBarato(produtos, atual,quantidadeDeElementos- 1);
			troca(produtos, atual, maisBarato);
		}
	}
	private static int buscaMaisBarato(Produto[] produtos, int inicio, int termino) {
		int maisBarato = inicio;
        for(int atual = inicio; atual <= termino; atual++){
            if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                maisBarato = atual;
            }
        }
        return maisBarato;
	}
}
