public class ArrayOperations {
    public static void main(String[] args) {

        double[] myList = {1.9, 2.9, 3.4, 3.5};

        // Display array elements
        System.out.println("Array elements:");
        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
        }

        // Calculate sum of array elements
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            total += myList[i];
        }
        System.out.println("Total is: " + total);

        // Find the largest element
        double max = myList[0];
        for (int i = 1; i < myList.length; i++) {
            if (myList[i] > max) {
                max = myList[i];
            }
        }
        System.out.println("Maximum element is: " + max);
    }
}
