package in.verma.app8.selectionsort;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] formulas = {
                "5+6+32=43",
                "1+1=2",
                "(3+5)*4*21=483",
                "((21-20)*(32-30))/2=1"
        };

        for (int i = 0; i < formulas.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < formulas.length; j++) {
                if (complexity(formulas[j]) < complexity(formulas[minIndex])) {
                    minIndex = j;
                }
            }

            String temp = formulas[i];
            formulas[i] = formulas[minIndex];
            formulas[minIndex] = temp;
        }

        System.out.println(Arrays.toString(formulas));
    }

    private static int complexity(String formula) {
        int count = 0;
        for (char x : formula.toCharArray()) {
            if (x == '+' || x == '-' || x == '*' || x == '/') {
                count++;
            }
        }
        return count;
    }
}

