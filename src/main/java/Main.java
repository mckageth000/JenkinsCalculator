import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Calculator calc = new Calculator();
    Scanner scan = new Scanner(System.in);

    while(scan.hasNext()){

      Integer result = null;
      String command = scan.next();

      if(command.equals("add")){
        int left = scan.nextInt();
        int right = scan.nextInt();
        result = calc.add(left, right);
      }
      else if(command.equals("subtract")){
        int left = scan.nextInt();
        int right = scan.nextInt();
        result = calc.subtract(left,right);
      }
      else if(command.equals("multiply")){
        int left = scan.nextInt();
        int right = scan.nextInt();
        result = calc.multiply(left,right);
      }
      else if(command.equals("divide")){
        int left = scan.nextInt();
        int right = scan.nextInt();
        result = calc.divide(left,right);
      }
      else if(command.equals("fibonacci")){
        int operand = scan.nextInt();
        result = calc.fibonacciNumberFinder(operand);
      }
      else if(command.equals("binary")){
        int operand = scan.nextInt();
        System.out.println(calc.intToBinaryNumber(operand));
      }

      if(result != null){
        System.out.println(result);
      }
    }
  }
}
