import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Ri4 {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Stream内の要素をリストに収集
        List<Integer> numberList = numbers.stream()
                .collect(Collectors.toList());

        System.out.println("収集されたリスト: " + numberList);
    }
}