import java.util.ArrayList;
import java.util.List;

public class Datos {

        public static List<Usuario> cargarUsuarios() {

                List<Usuario> usuarios = new ArrayList<>();

                usuarios.add(new Usuario("Juan", 25, "Ingeniería de sistemas", 10,List.of("Programación", "Videojuegos")));

                usuarios.add(new Usuario("María", 30, "Medicina", 5,List.of("Salud", "Deportes")));

                usuarios.add(new Usuario("Pedro", 22, "Arquitectura", 8,List.of("Diseño", "Arte")));

                usuarios.add(new Usuario("Ana", 28, "Derecho", 12,List.of("Justicia", "Política")));

                usuarios.add(new Usuario("Luis", 35, "Ingeniería de sistemas", 15,List.of("Programación", "Robótica")));

                usuarios.add(new Usuario("Sofía", 27, "Medicina", 7,List.of("Ingenieria de sistemas", "Inteligencia Artificial")));

                usuarios.add(new Usuario("Carlos", 24, "Ingeniería de sistemas", 3,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Laura", 29, "Ingeniería de sistemas", 6,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Diego", 31, "Ingeniería de sistemas", 9,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Valentina", 26, "Ingeniería de sistemas", 4,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Miguel", 23, "Ingeniería de sistemas", 2,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Isabel", 32, "Ingeniería de sistemas", 11,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Andrés", 28, "Ingeniería de sistemas", 8,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Camila", 27, "Ingeniería de sistemas", 5,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Javier", 29, "Ingeniería de sistemas", 7,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Natalia", 30, "Ingeniería de sistemas", 9,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Fernando", 31, "Ingeniería de sistemas", 10,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Gabriela", 26, "Ingeniería de sistemas", 6,List.of("Inteligencia Artificial", "Ciencia de datos")));

                usuarios.add(new Usuario("Ricardo", 25, "Ingeniería de sistemas", 4,List.of("Inteligencia Artificial", "Ciencia de datos")));

                return usuarios;
        }
}