
/*
   * Una universidad ha creado una pequeña red social interna para que los
   * estudiantes compartan sus intereses, hobbies y proyectos. Con una lista de
   * usuarios, cada uno con nombre, edad, carrera, número de publicaciones e
   * intereses, realiza las siguientes tareas:
   * 1. Filtra los usuarios mayores de 20 años 
   * 2. Obtener la lista de nombres de los estudiantes de ingenieria de sistemas que tienen más de 5 publicaciones 
   * 3. Calcular el promedio de edad de los usuarios que tienen el interes en "Inteligencia Artificial "
   * 4. Listar todos los interes unicos de los usuarios 
   * 5. Encontrar al usuario con más publicaciones 
   * 
   * Usar:
   * Filter para aplicar varias condiciones 
   * Map para extraer nombres o edades
   * Collect(Collectors.toList()) y collect(Collectors.toSet()) para obtener resultados
   * flatMap para manejar listas anidades de intereses 
   * max(Comparator.comparingInt()) para encontrar el usuario con más publicaciones
*/
import java.util.List;

public class Usuario {

    private String nombre;
    private int edad;
    private String carrera;
    private int numeroPublicaciones;
    private List<String> intereses;

    public Usuario(String nombre, int edad, String carrera,
            int numeroPublicaciones, List<String> intereses) {

        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.numeroPublicaciones = numeroPublicaciones;
        this.intereses = intereses;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getNumeroPublicaciones() {
        return numeroPublicaciones;
    }

    public void setNumeroPublicaciones(int numeroPublicaciones) {
        this.numeroPublicaciones = numeroPublicaciones;
    }

    public List<String> getIntereses() {
        return intereses;
    }

    public void setIntereses(List<String> intereses) {
        this.intereses = intereses;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre
                + ", Edad: " + edad
                + ", Carrera: " + carrera
                + ", Publicaciones: " + numeroPublicaciones
                + ", Intereses: " + intereses;
    }
}