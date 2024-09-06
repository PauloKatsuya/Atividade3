public class CameraDigital {
	public double lente;
	public double resolucao;
	public String imagem;
	
	public CameraDigital(double abertura, double qualidade, String cor) {
		this.lente = abertura;
		this.resolucao = qualidade;
		this.imagem = cor;
	}
 
	public void darZoom() {
		System.out.println("Ativar Zoom");
	}
	public void tirarFoto() {
		System.out.println("Foto Capturada");
	}
	public void gravar() {
		System.out.println("Gravação Iniciada");
	}
 
}
