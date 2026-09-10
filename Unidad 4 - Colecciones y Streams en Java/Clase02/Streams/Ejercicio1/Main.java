import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

        public static void main(String[] args) {

                List<Usuario> usuarios = Datos.cargarUsuarios();

                // 1. Filtrar usuarios mayores de 20 años
                List<Usuario> usuariosMayores20 = usuarios.stream()
                                .filter(usuario -> usuario.getEdad() > 20)
                                .collect(Collectors.toList());

                System.out.println("1. USUARIOS MAYORES DE 20 AÑOS:");

                usuariosMayores20.forEach(System.out::println);

                // 2. Obtener nombres de estudiantes de Ingeniería de sistemas con más de 5
                // publicaciones
                List<String> nombresIngenieria = usuarios.stream()
                                .filter(usuario -> usuario.getNumeroPublicaciones() > 5)
                                .filter(usuario -> "Ingeniería de sistemas"
                                                .equals(usuario.getCarrera()))
                                .map(Usuario::getNombre)
                                .collect(Collectors.toList());

                System.out.println("\n2. NOMBRES DE INGENIERÍA DE SISTEMAS CON MÁS DE 5 PUBLICACIONES:");

                nombresIngenieria.forEach(System.out::println);

                // 3. Calcular el promedio de edad de los usuarios
                double promedioEdad = usuarios.stream()
                                .filter(usuario -> usuario.getIntereses().contains("Inteligencia Artificial"))
                                .mapToInt(Usuario::getEdad) // Toma la edad de cada usuario
                                .average() // Calcula el promedio (Media aritmetica)
                                .orElse(0); // Valor por defecto si no hay usuarios que cumplan con la condición

                System.out.println("\n3. PROMEDIO DE EDAD DE USUARIOS INTERESADOS EN IA:");

                System.out.println(promedioEdad);

                // 4. Listar todos los intereses únicos
                Set<String> interesesUnicos = usuarios.stream()
                                .flatMap(usuario -> usuario.getIntereses().stream())
                                .collect(Collectors.toSet());

                System.out.println("\n4. INTERESES ÚNICOS:");

                interesesUnicos.forEach(System.out::println);

                // 5. Encontrar al usuario con más publicaciones
                Usuario usuarioConMasPublicaciones = usuarios.stream()
                                .max((usuario1, usuario2) -> Integer.compare(
                                                usuario1.getNumeroPublicaciones(),
                                                usuario2.getNumeroPublicaciones()))
                                .orElse(null);

                System.out.println("\n5. USUARIO CON MÁS PUBLICACIONES:");

                System.out.println(usuarioConMasPublicaciones);
        }
}