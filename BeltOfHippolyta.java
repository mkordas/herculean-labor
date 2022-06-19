/* Simplifiable annotations */
@Heracles()
@Belt(powers = {"strength",}, materials = {"gold",})
class BeltOfHippolyta {
    public static void main(String[] args) {
    }
}

@interface Heracles {
}

@interface Belt {
    String[] powers();

    String[] materials();
}