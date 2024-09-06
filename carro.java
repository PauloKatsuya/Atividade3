public class Carro{
    public String motor;
    public String rodas;
    public String veiculoFamiliar;
    
    public Carro(string motorVar, string rodasVar, string veiculoVar){
        this.motor = motorVar; 
        this.rodas = rodasVar;
        this.veiculoFamiliar = veiculoVar;
    }
    
    public void locomover(){
        System.out.println("Dando partida...");
        System.out.println("Ligado");
    }
    
    public void tocarRadio(){
        System.out.println("Escolhendo estação...");
        System.out.println("Tocando radio!");
    }
    
    public void carregarCarga(){
        System.out.println("Carregando carga...");
        System.out.println("Carga carregada.");
    }
}
