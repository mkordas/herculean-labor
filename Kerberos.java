import java.util.List;

class Kerberos {

    private int heads = 3;
    private Tail tail = new DragonTail();
    private Underworld underworld;
    private List<Snake> snakes;

    public void setUnderworld(Underworld underworld) {
        this.underworld = underworld;
    }

    public void addSnake(Snake snake) {
        this.snakes.add(snake);
    }


    private class Snake {
    }

    private class Underworld {
    }

    private class Tail {
    }

    private class DragonTail extends Tail {
    }
}
