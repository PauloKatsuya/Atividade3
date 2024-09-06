public class fotossintese{
    public String planta;
    public String ambiente;
    public String sol;
    
    public fotossintese(String plantaVar, String ambienteVar, String solVar){
        this.planta = plantaVar; 
        this.ambiente = ambienteVar;
        this.sol = solVar;
    }
    
    public void purificarAr(){
        System.out.println("Purificando");
        System.out.println("Purificado");
    }
    
    public void converterCO2(){
        System.out.println("Convertendo...");
        System.out.println("Convertido!");
    }
}
