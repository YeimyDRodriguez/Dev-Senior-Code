
public class Gerente extends Empleado implements Trabajable {

    private double bonoActual;

    public Gerente(String nombre, String id, double salarioBase, double bonoActual) {
        super(nombre, id, salarioBase);
        this.bonoActual = bonoActual;
    }

    public double getBonoActual() {
        return bonoActual;
    }

    public void setBonoActual(double bonoActual) {
        this.bonoActual = bonoActual;
    }

    @Override
    public double calcularSalario() {
        return this.getSalarioBase() + this.bonoActual;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Bono Actual: " + this.bonoActual);
        System.out.println("Salario Calculado: " + this.calcularSalario());
    }

    @Override
    public void trabajar() {
        System.out.println(this.getNombre() + " está gestionando el equipo y supervisando proyectos.");
    }

}
