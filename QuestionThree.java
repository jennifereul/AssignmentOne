public class QuestionThree {
    public static void main(String[] args) {
        int numberOfTerms = 10;

        long firstTerm = 0;
        long secondTerm = 1;

        System.out.print("NotFibonacci Sequence up to " + numberOfTerms + " terms: ");

        if (numberOfTerms >= 1) {
            System.out.print(firstTerm);
        }
        if (numberOfTerms >= 2) {
            System.out.print(", " + secondTerm);
        }

        for (int i = 3; i <= numberOfTerms; i++) {
            long nextTerm = secondTerm * 3 + firstTerm * 2;
            System.out.print(", " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
