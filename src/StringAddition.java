public class StringAddition {
    public static void main(String[] args) {
        // Define two string representations of numbers
        String str1 = "222211111";
        String str2 = "33333";

        // Convert the strings to integers
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        // Perform addition
        int sum = num1 + num2;

        // Convert the result back to a string
        String result = Integer.toString(sum);

        // Display the result
        System.out.println("The result of adding the two strings is: " + result);
    }
}




