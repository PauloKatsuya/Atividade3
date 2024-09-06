public class Pintor {
	public String Criatividade;
	public String Pincel;
	public Double quadro;
	
	public Pintor(String estilo, String tipo, Double polegadas) {
		this.quadro = polegadas;
		this.Pincel = tipo;
		this.Criatividade = estilo;
	}
 
	public void Pintar() {
		System.out.println("Quadro pintado");
	}
	public void Expressar() {
		System.out.println("Pintura legal kk");
	}
	public void Trabalhar() {
		System.out.println("Trabalho realizado com muito amor e carinho");
	}
}
