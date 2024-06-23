import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ProductFilter {

  public static void main(String[] args) {

    Product product1 = new Product("pen", 7.89, 0.05, 0.50);
    Product product2 = new Product("pencil", 4.89, 0.15, 0.0);
    Product product3 = new Product("eraser", 3.50, 0.0,0.0);
    Product product4 = new Product("notebook", 17.5, 0.20, 0.35);
    Product product5 = new Product("english book", 25.90, 0.45, 1.50);

    List<Product> products = Arrays.asList(product1, product2, product3, product4, product5);

    Predicate<Product> sale = product -> product.discount > 0.05;
    Predicate<Product> withDelivery = product -> product.frete > 0.0;
    Function<Product, String> format = product -> product.name +  " "
        + (product.price * (1 - product.discount))
        + " delivery " + product.frete;
    //ToDoubleFunction<Product> comp = product -> product.getPrice();
    //BinaryOperator<Product> min = product -> Comparator.comparingDouble(comp);

    products.stream()
        .filter(sale)
        .filter(withDelivery)
        .map(format)
        .forEach(System.out::println);


  }

}
