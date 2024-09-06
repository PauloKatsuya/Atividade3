public class ConservacaoDaEnergia {
	public double quantidadeEnergiaInicial;
	public double quantidadeEnergiaFinal;
	public double quantidadeEnergiaPerdida;
	
	public ConservacaoDaEnergia(double quantidadeEnergiaInicial, double quantidadeEnergiaFinal) {
		this.quantidadeEnergiaInicial = quantidadeEnergiaInicial;
		this.quantidadeEnergiaFinal = quantidadeEnergiaFinal;
	}
	
	public double calcularEnergiaPerdida() {
		return this.quantidadeEnergiaPerdida = this.quantidadeEnergiaFinal - this.quantidadeEnergiaInicial;
	}
	
	public void adicionarPerdaDeEnergia(double quantidade) {
		this.quantidadeEnergiaPerdida+=quantidade;
	}
	
	public String verificarConservacao(double quantidadeParaVerificar) {
		if(this.quantidadeEnergiaPerdida > quantidadeParaVerificar) {
			return "Houve um gasto maior do que o esperado";
		}else {
			return "O gasto de energia está dentro do limite";
		}
	}
}
 
