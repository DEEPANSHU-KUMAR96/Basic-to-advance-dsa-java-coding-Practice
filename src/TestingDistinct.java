import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,1,2,2,3,5,9,8,7,7,9);
        List<Integer> distinctNumbers = numbers.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbers);
        System.out.println(distinctNumbers);
    }
}
