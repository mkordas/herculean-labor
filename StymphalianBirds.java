import java.util.HashSet;
import java.util.Set;

/* Java | Probable bugs | Suspicious collection method call */
class StymphalianBirds {

    public static void main(String[] args) {
        Set<Short> birds = new HashSet<>();
        for (short i = 0; i < 100; i++) {
            birds.add(i);
            birds.remove(i - 1);
        }
        System.out.println(birds.size());
    }
}