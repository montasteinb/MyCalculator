public class Main {

    public static void main(String[] args){
        Calculator calculator = new Calculator();

        int num1 = 8;
        int num2 = 4;
        int result1 = calculator.add(num1, num2);
        int result2 = calculator.subtract(num1, num2);
        int result3 = calculator.multiply(num1, num2);
        int result4 = calculator.divide(num1, num2);


        System.out.println(num1 + "+" + num2 + "=" + result1);
        System.out.println(num1 + "-" + num2 + "=" + result2);
        System.out.println(num1 + "*" + num2 + "=" + result3);
        System.out.println(num1 + "/" + num2 + "=" + result4);

        System.out.println(Math.min(num1, num2));
        System.out.println(Math.max(num1, num2));
        System.out.println(Math.abs(num1));
        System.out.println(Math.abs(num2));
        System.out.println(Math.random());

    }
}
