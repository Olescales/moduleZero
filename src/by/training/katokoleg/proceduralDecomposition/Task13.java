import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task13 {

    public static void main(String[] args) {
        try {
            String strNumber = getStringNumber();
            Integer [] numbers = getNumbersArrayFromString(strNumber);
            Arrays.asList(numbers).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Integer[] getNumbersArrayFromString (String stringNumber) {
        return Arrays.stream(stringNumber.split("")).map(Integer::parseInt).toArray(Integer[]::new);
    }

    public static String getStringNumber () throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println("Enter number");
            return reader.readLine();
        }
    }
}
