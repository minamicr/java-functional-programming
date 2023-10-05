public class Operation {

  public static void main(String[] args) {
    String sum = "4 " + OperationEnum.SUM + " 3 = " + OperationEnum.SUM.apply(4, 3);
    System.out.println(sum);
  }

}
