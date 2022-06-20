import java.util.Date;
import java.util.List;

/* Java | Encapsulation | Assignment or return of field with mutable type */
class Kerberos {

    private int heads = 3;
    private Tail tail = new DragonTail();
    private Underworld underworld;

    private List<Snake> snakes;

    public Date birthDate = new Date();

    public Date killDate = new Date(new Date().getTime() + 1000);

    public Date getKillDate() {
        return killDate;
    }

    public List<Snake> getSnakes() {
        return snakes;
    }

    public Date getBirthDate() {
        return birthDate;
    }


    public void setUnderworld(Underworld underworld) {
        this.underworld = underworld;
    }

    public void addSnake(Snake snake) {
        this.snakes.add(snake);
    }


    private static class Snake {
    }

    private static class Underworld {
    }

    private static class Tail {
    }

    private static class DragonTail extends Tail {
    }

    public static void main(String[] args) {
        Kerberos kerberos = new Kerberos();
        kerberos.addSnake(new Snake());
        kerberos.setUnderworld(new Underworld());
        System.out.println(kerberos.heads);
        System.out.println(kerberos.snakes);
        System.out.println(kerberos.tail);
        System.out.println(kerberos.underworld);
        System.out.println(kerberos.getBirthDate());
        System.out.println(kerberos.getKillDate());
    }
}
