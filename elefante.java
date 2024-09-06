public class Elefante {
	public double tromba;
	public double peso;
	public double tamanho;
	
	public Elefante(double tamanhoTromba, double quilos, double metros) {
		this.tromba = tamanhoTromba;
		this.peso = quilos;
		this.tamanho = metros;
	}
 
	public void agarrarTromba() {
		System.out.println("Pegando com a Tromba");
	}
	public void usarMarfim() {
		System.out.println("Usando Marfim");
	}
	
}
