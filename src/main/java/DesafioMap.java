import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

  public static void main(String[] args) {
    List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);


    /*
      1. número para string binária 6 => "110"
      2. inverter a string "110" => "011"
      3. converter de volta para inteiro => "011" => 3
     */

    Function<Integer, String> binary = x -> Integer.toBinaryString(x);
    UnaryOperator<String> reverse = x -> new StringBuffer(x).reverse().toString();
    Function<String, Integer> binaryToInteger = x -> Integer.parseInt(x, 2);

    nums.stream()
        .map(num -> binary.apply(num))
        .map(num -> reverse.apply(num))
        .map(num -> binaryToInteger.apply(num))
        .forEach(System.out::println);


  }

}
