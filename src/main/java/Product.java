public class Product {

  String name;

  public Double getPrice() {
    return price;
  }

  Double price;
  Double discount; // > 30% super promocao
  Double frete;

  public Product(String name, Double price, Double discount, Double frete) {
    this.name = name;
    this.price = price;
    this.discount = discount;
    this.frete = frete;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        ", discount=" + discount +
        ", frete=" + frete +
        '}';
  }
}
