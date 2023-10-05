import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Examples {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Mary", "John", "Peter", "Louis");

    names.stream().map(name -> name + " test").forEach(System.out::println);
    names.stream().forEach(System.out::println);
    names.forEach(new Consumer<String>() {
      @Override
      public void accept(final String name) {
        System.out.println(name);
      }


    });
    System.out.println("string size");

    names.stream().map(name -> name + " " + name.length())
        .forEach(System.out::println);

    System.out.println(names
        .stream()
        .mapToInt(name -> name.length())
        .reduce(Integer::sum)
        .getAsInt());
  }

}
