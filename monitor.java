public class Monitor {
	public double tamanho;
	public double resolucao;
	public String cor;
	
	public Monitor(double polegadas, Double qualidade, String cor) {
		this.tamanho = polegadas;
		this.resolucao = qualidade;
		this.cor = cor;
	}
 
	public void exibirImagem() {
		System.out.println("Imagem exibida!");
	}
	public void ajustarBrilho() {
		System.out.println("Brilho ajustado");
	}
}
