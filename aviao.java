public class Aviao{
    public String caixaPreta;
    public String turbina;
    public int acentos;
    
    public Aviao(String caixaPretaVar, String turbinaVar, int acentosVar){
        this.caixaPreta = caixaPretaVar; 
        this.turbina = turbinaVar;
        this.acentos = acentosVar;
    }
    
    public void voar(){
        System.out.println("Decolando...");
        System.out.println("Voando");
    }
    
    public void pousar(){
        System.out.println("Levantando trem de pouso");
        System.out.println("Pousando");
    }
}
