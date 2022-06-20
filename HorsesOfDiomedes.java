/* Java | Performance | Method can be made 'static' */
class HorsesOfDiomedes {

    public static void main(String[] args) {
        new HorsesOfDiomedes().runStory();
    }

    private void runStory() {
        eatHumanMeat();
        catchDejnos();
        catchKsantos();
        catchLampon();
        catchPodargos();
        eatAbderos();
        eatDiomedes();
    }

    private void eatHumanMeat() {
        System.out.println("scary!");
    }

    private void catchDejnos() {
        System.out.println("caught!");
    }

    private void catchKsantos() {
        System.out.println("caught!");
    }

    private void catchLampon() {
        System.out.println("caught!");
    }

    private void catchPodargos() {
        System.out.println("caught!");
    }

    private void eatAbderos() {
        System.out.println("oh no!");
    }

    private void eatDiomedes() {
        System.out.println("calm down!");
    }
}
