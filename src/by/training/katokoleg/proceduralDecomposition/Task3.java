import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = getFourNumbers();
        int answer = getNOD(numbers);
        System.out.println(answer);
    }

    public static List<Integer> getFourNumbers() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            List<Integer> numbers = new ArrayList<>();
            do {
                int number = Integer.parseInt(reader.readLine());
                numbers.add(number);
            } while (numbers.size() != 4);
            return numbers;
        }
    }

    public static int getNOD(List<Integer> numbers) {
        int minNumber = getMinNumber(numbers);
        for (int i = minNumber; i > 0; i--) {
            if (numbers.get(0) % i == 0
                    && numbers.get(1) % i == 0
                    && numbers.get(2) % i == 0
                    && numbers.get(3) % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static int getMinNumber(List<Integer> numbers) {
        return numbers.stream().min(Comparator.comparingInt(i -> i)).get();
    }
}
