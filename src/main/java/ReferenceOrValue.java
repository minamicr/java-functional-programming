public class ReferenceOrValue {

  public static void main(String[] args) {
    Product product = new Product("pen", 2.5, 0.5, 0.0);
    int x = 1;

    printElements(product, x);

    System.out.println("Value Main -> " + x);
    System.out.println("Product Main -> " + product);

  }

  private static void printElements(Product product, int value){
    System.out.println("Original Product -> " + product);
    System.out.println("Original Value -> " + value);
    value = value + 5;
    product.price = 3.0;
    System.out.println("New Value -> " + value);
    System.out.println("New Product -> " + product);
  }


}
