import java.util.*;

public class QuestionFour {
    public static int findPosition(int num) {
        int a = 1, b = 2, c;
        int position = 0;


        int maxValue = 1000000;


        Set<Integer> notFibonacci = new HashSet<>();
        notFibonacci.add(1);
        notFibonacci.add(2);

        while (true) {
            c = a + b;
            if (c > maxValue) break;
            notFibonacci.add(c);
            a = b;
            b = c;
            if (c != num)
                position++;
        }

        return position;
    }

    public static void main(String[] args) {
        System.out.println(findPosition(8));
        System.out.println(findPosition(1640));
    }
}
