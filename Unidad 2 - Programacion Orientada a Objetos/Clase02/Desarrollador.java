
public class Desarrollador extends Empleado implements Trabajable {

    private String lenguajePrincipal;

    public Desarrollador(String nombre, String id, double salarioBase, String lenguajePrincipal) {
        super(nombre, id, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
    }

    public String getLenguajePrincipal() {
        return lenguajePrincipal;
    }

    public void setLenguajePrincipal(String lenguajePrincipal) {
        this.lenguajePrincipal = lenguajePrincipal;
    }

    @Override
    public double calcularSalario() {
        double bono;
        if (this.lenguajePrincipal.equals("Java")) {
            bono = this.getSalarioBase() * 0.1;
        } else {
            bono = this.getSalarioBase() * 0.09;
        }
        return this.getSalarioBase() + bono;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Lenguaje Principal: " + this.lenguajePrincipal);
        System.out.println("Salario Calculado: " + this.calcularSalario());
    }

    @Override
    public void trabajar() {
        System.out.println((this.getNombre() + " está escribiendo código en " + this.lenguajePrincipal + "."));
    }
}
