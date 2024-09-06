public class Galaxia {
	public String nome;
	public String tipo;
	public int quantidadeDeEstrelas;
	
	public Galaxia(String nome, String tipo, int quantidadeDeEstrelas) {
		this.nome = nome;
		this.tipo = tipo;
		this.quantidadeDeEstrelas = quantidadeDeEstrelas;
	}
	
	public void exibirInformacoes() {
		System.out.println("Nome: "+this.nome+"\nTipo: "+this.tipo+
				"\nQuantidade de Estrelas: "+this.quantidadeDeEstrelas);
	}
	
	public void adicionarEstrelas(int quantidade) {
		this.quantidadeDeEstrelas+=quantidade;
	}
	
	public void alterarNome(String novoNome) {
		this.nome = novoNome;
	}
	
}
