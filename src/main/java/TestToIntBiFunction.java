import java.util.function.ToIntBiFunction;

public class TestToIntBiFunction {

  private record ProductPaper (String name, int amount){}
  private record ProductBook (String name, int amount) {}

  static ToIntBiFunction<ProductPaper, ProductBook> amountSum =
      (paper, book) -> paper.amount() + book.amount();

  public static void main(String[] args) {
    System.out.println("Total amount: " + amountSum.applyAsInt(
        new ProductPaper("pencil", 2),
        new ProductBook("Lord of the rings", 3)));
  }

}
