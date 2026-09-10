
public class App {

    public static void main(String[] args) throws Exception {
        PerfilInstagram perfil1 = new PerfilInstagram("Yeimy");

        String var10001 = perfil1.getUsername();
        System.out.println("seguidores de " + var10001 + ": " + perfil1.getSeguidores());

        PerfilInstagram perfil2 = new PerfilInstagram("maria_89", "Amo viajar y fotografar");
        System.out.println("Seguidores de "+ perfil2.getUsername() + ": " + perfil2.getSeguidores());

        perfil1.follow();
        System.out.println("Seguidores de " + perfil1.getUsername() + ": " + perfil1.getSeguidores());
        perfil1.follow();
        perfil1.follow();
        System.out.println("Seguidores de " + perfil1.getUsername() + ": " + perfil1.getSeguidores());

        perfil2.follow();
        perfil2.follow();
        System.out.println("Seguidores de " + perfil2.getUsername() + ": " + perfil2.getSeguidores());
    }

}
