package ex1;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Test cases
        int result1 = calculator.add(5, 3);
        int result2 = calculator.subtract(8, 2);
        int result3 = calculator.multiply(4, 7);
        int result4 = calculator.divide(10, 2);

        //DEFECT #1 can't divide by 0
        int result5 = calculator.divide(7, 0);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);
        System.out.println("Result 4: " + result4);
        System.out.println("Result 5: " + result5);
    }
}