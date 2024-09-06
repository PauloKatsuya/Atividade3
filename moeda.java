public class Moeda {
	public String Material;
	public double Valor;
	public String Origem;
	
	public Moeda(String materialDaMoeda, Double reais, String local) {
		this.Material = materialDaMoeda;
		this.Valor = reais;
		this.Origem = local;
	}
 
	public void troca() {
		System.out.println("Troca efetuada");
	}
	public void compra() {
		System.out.println("Pagamento efetuado!");
	}
	public void inflacao() {
		System.out.println("Moeda inflacionada");
	}
}
