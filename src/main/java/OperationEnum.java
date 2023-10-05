import java.util.function.IntBinaryOperator;

public enum OperationEnum {

  SUM("+", (x, y) -> x + y),
  MINUS("-", (x, y) -> x - y),
  MULTIPY("*", (x, y) -> x * y),
  DIVISION("/", (x, y) -> x / y);
  private final String signal;
  private final IntBinaryOperator operation;

  OperationEnum(String signal, IntBinaryOperator operation) {
    this.signal = signal;
    this.operation = operation;
  }

  public int apply(int x, int y) {
    return operation.applyAsInt(x, y);
  }

  @Override
  public String toString(){
    return signal;
  }

}
