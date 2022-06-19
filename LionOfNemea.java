class LionOfNemea {

public static void main(String[] args) {
List listOfNumbers = new ArrayList();
listOfNumbers.add(10);
listOfNumbers.add("Twenty");
listOfNumbers.forEach(n -> System.out.println((int) n * 2));
}

}
