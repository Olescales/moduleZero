import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task20 {

    public static void main(String[] args) {
        try {
            int number = getNumber();
            int sumOfItsNumbers = getNumberDigitSum(number);
            int result = getNumberOfOccurrences(number,sumOfItsNumbers);
            System.out.println(result);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int getNumberOfOccurrences (int number, int sumOfItsNumbers) {
        int counter = 0;

        while (number > 0 && number >= sumOfItsNumbers) {
            number -= sumOfItsNumbers;
            counter++;
        }
        return counter;
    }

    public static int getNumberDigitSum (int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int getNumber () throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            return Integer.parseInt(reader.readLine());
        }
    }
}
