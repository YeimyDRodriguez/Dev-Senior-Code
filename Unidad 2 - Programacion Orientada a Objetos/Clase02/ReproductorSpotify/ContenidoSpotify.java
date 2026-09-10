
public class ContenidoSpotify {
    private String nombre; 

    public ContenidoSpotify(String nombre){
        this.nombre = nombre; 
    }
    public String getnombre(){
        return nombre; 
    }
    public void setnombre(String nombre){
        this.nombre = nombre; 
    }
    public void reproducir(){
        System.out.println("Reproduciendo buena musica: "+nombre);
    }
}
