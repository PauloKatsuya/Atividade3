public class PiramideDoEgito {
	public double altura;
	public String materialPrincipal;
	public int dataDaConstrucao;
	
	public PiramideDoEgito(double altura, String materialPrincipal, int dataDaConstrucao) {
		this.altura = altura;
		this.materialPrincipal = materialPrincipal;
		this.dataDaConstrucao = dataDaConstrucao;
	}
	
	public int determinarIdade(int anoAtual) {
		return anoAtual - dataDaConstrucao;
	}
	
	public String avaliarEstadoConservacao() {
		return "IMPECÁVEL";
	}
}
