public class App {

    private static int sum2(int num1, int num2) {
        return num1 + num2;
    }

    private static int sum3(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    /**
     * Modify the methods in such a way that the Class App
     * can now have 2 overloaded computeSum() methods.
     * One computing the sum of two numbers, and one computing the sum
     * of three numbers.
     */

    /** Method that returns the greater integer value */
    public static int greaterValue(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double greaterValue(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /** Method that returns the greater double value */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        /**
         * Create Method calls that takes in 2 parameters, and 3 parameters
         * respectively and computes their sum.
         */

        /**
         * Call the greaterValue method with integer parameters
         */
        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("Greater Number " + sum2(25, 100));
        System.out.println("Greater Number" + sum3(25, 50, 100));
        System.out.println("The greater value between 45 and 100 is " + greaterValue(45, 100));

        /**
         * Call the greaterValue method with double parameters
         */
        System.out.println("The greater value between 3.14 and 9.8 is " + greaterValue(3.14, 9.8));

    }
}
