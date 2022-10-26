package Fundamentos;

class RodarAplicacao {
	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		carro1.setCor("Branco");
		carro1.setModelo("BMW Série 3");
		carro1.setCapacidadeTanque(60);
		
		System.out.println("Carro Modelo: " + carro1.getModelo());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Capacidade do Tanque: " + carro1.getCapacidadeTanque());
		System.out.println("Custo para encher o Tanque: " + carro1.totalValorTanque(6.59) + "Reais");
		
		System.out.println("");
		Carro carro2 = new Carro("Cinza", "Ciena", 58);
		
		System.out.println("Carro Modelo: " + carro2.getModelo());
		System.out.println("Cor: " + carro2.getCor());
		System.out.println("Capacidade do Tanque: " + carro2.getCapacidadeTanque());
		System.out.println("Custo para encher o Tanque: " + carro2.totalValorTanque(6.59) + "Reais");
	
	
	}
}
