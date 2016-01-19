package br.com.alura.algoritmos;

public class TestaMenorPreco {
	public static void main(String[] args){
		 Produto[] produtos = {
				 new Produto("Lamborghini", 1000000),
				 new Produto("Jipe", 46000),
				 new Produto("Brasilia", 16000),
				 new Produto("Smart", 46000),
				 new Produto("Fusca", 17000)
				 };
		 int maisBarato = buscaMaisBarato(produtos, 0, 4);
         System.out.println("O carro mais barato é: "+ produtos[maisBarato].getNome() +" e custa " + produtos[maisBarato].getPreco());
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
