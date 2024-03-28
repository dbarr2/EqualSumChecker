public class EqualSumChecker {


    //Write the main method to execute test cases
    public static void main(String[] args) {

        System.out.println("Are the first two parameters equal tp the paramter? " +
                hasEqualSum(1, 1, 1)); //Expected outcome ==> false;

        System.out.println("Are the first two parameters equal tp the paramter? " +
                hasEqualSum(2, 6, 1)); //Expected outcome ==> false

        System.out.println("Are the first two parameters equal tp the paramter? " +
                hasEqualSum(10, 20, 30)); //Expected outcome ==> true;


    }

    //This method should return if the first two parameters are equal to the third
    public static boolean hasEqualSum(int a, int b, int c) {

        return a + b == c;

    }

}
