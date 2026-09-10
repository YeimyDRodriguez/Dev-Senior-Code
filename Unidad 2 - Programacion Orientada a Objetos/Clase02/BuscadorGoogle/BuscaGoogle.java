
public class BuscaGoogle {

    public void buscar(String texto){
        System.out.println("Buscando en Google: " + texto);
    }


    public void buscar(String texto, int cantidadResultados){
        System.out.println("Buscando en google:"+texto);
        System.out.println("Mostrando "+cantidadResultados+" resultados");
    }

    public void buscar(String texto, boolean incluirVideos){
        System.out.println("Buscando en google:"+texto);
        if(incluirVideos){
            System.out.println("Incluyendo videos en los resultados");
        } else {
            System.out.println("No se incluyen videos en los resultados");
        }
    }
    
}
