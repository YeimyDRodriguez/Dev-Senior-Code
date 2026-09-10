
public class ProductoTecnologia extends ProductoML {
    
    private int garantiaMeses;

    public ProductoTecnologia(String nombre, double precio, int garantiaMeses){
        super(nombre, precio); 
        this.garantiaMeses = garantiaMeses; 
    }

    public int getgarantiaMeses(){
        return garantiaMeses;
    }
    public void setgarantiaMeses(int garantiaMeses){
        this.garantiaMeses = garantiaMeses;
    }
    @Override
    public void mostrarProducto(){
        super.mostrarProducto();
        System.out.println("Garantía en meses: "+garantiaMeses);
    }

}
