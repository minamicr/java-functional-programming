public class ProgrammingLanguage {

  final String name;
  final Integer amount;
  final boolean isEasy;
  final boolean isPopular;

  public ProgrammingLanguage(String name, Integer amount, boolean isEasy, boolean isPopular){
    this.name = name;
    this.amount = amount;
    this.isEasy = isEasy;
    this.isPopular = isPopular;
  }

  @Override
  public String toString() {
    return "ProgrammingLanguage{" +
        "name='" + name + '\'' +
        ", amount=" + amount +
        ", isEasy=" + isEasy +
        ", isPopular=" + isPopular +
        '}';
  }
}
