package POO;

public class ObjetoComputador {

	public static void main(String[] args) {
		
		Computador computador1 = new Computador();
		Computador computador2 = new Computador(); 
		
		computador1.setMarca("Dell");
		computador1.setModelo("AlienWare");
		computador1.setCor("Preto");
		computador1.setPreco("R$ 12.999,00");
		
		computador2.setMarca("Apple");
		computador2.setModelo("MacPro");
		computador2.setCor("Prata");
		computador2.setPreco("R$ 131.134,80");
		
		System.out.println("--------------- Computador Samuel ---------------");
		System.out.println(computador1.getMarca());
		System.out.println(computador1.getModelo());
		System.out.println(computador1.getCor());
		System.out.println(computador1.getPreco());
		
		System.out.println("--------------- Computador João Pedro ---------------");
		System.out.println(computador2.getMarca());
		System.out.println(computador2.getModelo());
		System.out.println(computador2.getCor());
		System.out.println(computador2.getPreco());

	}

}
