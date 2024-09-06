public class Smartphone {
	public String modelo;
	public double tela;
	public double camera;
	
	public Smartphone(String marca, double polegadas, double resolucao) {
		this.modelo = marca;
		this.tela = polegadas;
		this.camera = resolucao;
	}
 
	public void tirarFoto() {
		System.out.println("Foto tirada!");
	}
	public void acessarInternet() {
		System.out.println("Conectando...");
		System.out.println("Conectado.");
	}
	public void manipularFoto() {
		System.out.println("Imagem editada");
	}
}
