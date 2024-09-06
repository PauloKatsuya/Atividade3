public class Motocicleta{
    public String rodas;
    public String capacete;
    public String bau;
    
    public Motocicleta(string rodasVar, string capaceteVar, string bauVar){
        this.rodas = rodasVar; 
        this.capacete = capaceteVar;
        this.bau = bauVar;
    }
    
    public void darPartida(){
        System.out.println("Dando partida...");
        System.out.println("Ligado");
    }
    
    public void empinarMoto(){
        System.out.println("Empinando");
    }
    
    public void usarBau(){
        System.out.println("Carregando carga...");
        System.out.println("Carga carregada.");
    }
}
