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
	private static void novoSort(Produto[] produtos, int length) {
		for (int atual = 0; atual < produtos.length; atual++) {
			int analise = atual;
			while (analise > 0 && produtos[analise].getPreco() < produtos[analise - 1].getPreco()) {
				Produto produtoAnalise = produtos[analise];
				Produto produtoAnterior = produtos[analise - 1];
				produtos[analise - 1] = produtoAnalise;
				produtos[analise] = produtoAnterior;
				analise--;
			}
		}
	}
	private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
		for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
			int maisBarato = buscaMaisBarato(produtos, atual,quantidadeDeElementos- 1);
			Produto produtoAtual = produtos[atual];
			Produto produtoMaisBarato = produtos[maisBarato];
			produtos[atual] = produtoMaisBarato;
			produtos[maisBarato] = produtoAtual;
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
