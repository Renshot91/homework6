public class ArithmeticOperations {

        public static void main(String[] args) {
            int num1 = 10;
            int num2 = 5;

            int sum = addition(num1, num2);
            int difference = subtraction(num1, num2);
            int product = multiplication(num1, num2);
            double quotient = division(num1, num2);

            System.out.println("Сумма: " + sum);
            System.out.println("Разность: " + difference);
            System.out.println("Произведение: " + product);
            System.out.println("Частное: " + quotient);
        }

        public static int addition(int a, int b) {
            return a + b;
        }

        public static int subtraction(int a, int b) {
            return a - b;
        }

        public static int multiplication(int a, int b) {
            return a * b;
        }

        public static double division(int a, int b) {
            return (double) a / b;
        }
    }


