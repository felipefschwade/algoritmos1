package br.com.alura.algoritmos;

public class TestaMenorPreco {
	public static void main(String[] args){
		 Produto produtos[] = new Produto[5];
		 produtos[0] = new Produto("Lamborghini", 1000000);
         produtos[1] = new Produto("Jipe", 46000);
         produtos[2] = new Produto("Brasilia", 16000);
         produtos[3] = new Produto("Smart", 46000);
         produtos[4] = new Produto("Fusca", 17000);

         int maisBarato = 0;

         for(int atual = 0; atual < produtos.length; atual++){
             if (produtos[atual].getPreco() < produtos[maisBarato].getPreco()){
                 maisBarato = atual;
             }
         }
         System.out.println("O carro mais barato é: "+ produtos[maisBarato].getNome() +" e custa " + produtos[maisBarato].getPreco());
	}
}
