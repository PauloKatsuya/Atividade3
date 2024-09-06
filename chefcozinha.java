import java.util.Scanner;
 
public class ChefeDeCozinha {
	
	Scanner entrada = new Scanner(System.in);
	
	public String nome;
	public int anosDeExperiencia;
	public String[] pratosQueSabeFazer;
	
	public ChefeDeCozinha(String nome, int anosDeExperiencia, String[] pratosQueSabeFazer) {
		this.nome = nome;
		this.anosDeExperiencia = anosDeExperiencia;
		this.pratosQueSabeFazer = pratosQueSabeFazer;
	}
	
	public void temperar() {
		System.out.println("TOMPERO");
	}
	
	public void prepararPrato() {
		System.out.println("Preparando...");
		System.out.println("Pronto");
	}
	
	public String instruirCozinheiroPrepararPrato(String instrucao) {
		instrucao = entrada.nextLine();
		return instrucao;
	}
	
}
 
