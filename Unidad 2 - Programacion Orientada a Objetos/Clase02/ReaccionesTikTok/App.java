
public class App {
    public static void main(String[] args) {
        Reaccionable like = new Like();
        Reaccionable risa = new Risa();
        Reaccionable corazon = new Corazon();
        Reaccionable enojo = new Enojo();

        like.reaccionar();
        risa.reaccionar();
        corazon.reaccionar();
        enojo.reaccionar();
        like.reaccionar();
    }
}
