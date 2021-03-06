/* Java | Numeric issues | 'long' literal ending with 'l' instead of 'L' */
class CeryneianHind {

    public static void main(String[] args) {
        System.out.println(100l + 1001);
        catchHind();
    }

    private static void catchHind() {
        long goldenHorns = 2l;
        long bronzeHoofs = 4l;
        long monthsSpent = 12l;
        System.out.println(goldenHorns + bronzeHoofs * monthsSpent);
    }
}
