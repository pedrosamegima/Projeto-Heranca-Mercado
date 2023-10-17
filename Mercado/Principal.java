package Mercado;

public class Principal {

	public static void main(String[] args) {
		Produto produto = new Produto(1,"Suco de laranja", 10.00);
		System.out.println("\nFuncionario: ");
		System.out.println("Id: "+produto.getId());
		System.out.println("Nome: "+produto.getNome());
		System.out.println("Preco:" +produto.getPreco());
	
		System.out.println("--------------------------------------------------------------------------------------");
		Sorvete sorvete = new Sorvete(2,"Morango", 10.00, -1);
		System.out.println("\nSorvete: ");
		System.out.println("Salario: "+sorvete.getNome());
		System.out.println("Telefone:" +sorvete.getPreco());
		
		System.out.println("--------------------------------------------------------------------------------------");
		Camisas camisas = new Camisas(2,"Morango", 10.00, "Azul", "algodão", 'M');
		System.out.println("\nCamisas: ");
		System.out.println("Nome: "+camisas.getNome());
		System.out.println("Preco:" +camisas.getPreco());
		System.out.println("Cor:" +camisas.getCor());
		System.out.println("Tecido:" +camisas.getTecido());
		System.out.println("Tamanho:" +camisas.getTamanho());
	}

}
