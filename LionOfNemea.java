import java.util.ArrayList;
import java.util.List;

class LionOfNemea {

    public static void main(String[] args) {
        List listOfNumbers = new ArrayList();
        listOfNumbers.add(10);
        listOfNumbers.add("Twenty");
        for (Object object : listOfNumbers) {
            Integer number = (Integer) object;
            System.out.println(number);
        }
    }

}
