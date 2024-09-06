public class Escultura {
	public double pose;
	public String material;
	public String equipamento;
	
	public Escultura(double angulo, String pedra, String cincel) {
		this.pose = angulo;
		this.material = pedra;
		this.equipamento = cincel;
	}
 
	public void decorar() {
		System.out.println("Decorar o ambiente");
	}
	public void representarHistoria() {
		System.out.println("Historia");
	}
	public void esculpir() {
		System.out.println("Escultura esculpida!");
	}
	
}
