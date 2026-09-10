
public class Podcast extends ContenidoSpotify{

    public Podcast(String nombre){
        super(nombre); 
    }

    @Override
    public void reproducir(){
        System.out.println("Reproduciendo el podcast: "+getnombre());
    }
    
}
