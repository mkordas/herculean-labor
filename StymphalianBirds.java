import java.util.HashSet;
import java.util.Set;

class StymphalianBirds {

    public static void main(String[] args) {
        Set<Short> birds = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            birds.add(i);
            birds.remove(i - 1);
        }
        System.out.println(birds.size());
    }

    private void catchHind() {
        long goldenHorns = 2l;
        long bronzeHoofs = 4l;
        long monthsSpent = 12l;
        System.out.println((goldenHorns + bronzeHoofs * monthsSpent));
    }
}