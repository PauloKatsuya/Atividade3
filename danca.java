public class danca{
    public String ritmo;
    public String musica;
    public String corpo;
    
    public danca(String ritmoVar, String musicaVar, String corpoVar){
        this.ritmo = ritmoVar; 
        this.musica = musicaVar;
        this.corpo = corpoVar;
    }
    
    public void expressarDanca(){
        System.out.println("Expressar...");
    }
}
