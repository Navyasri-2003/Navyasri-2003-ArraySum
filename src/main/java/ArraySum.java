public class ArraySum {
    /**
     * This method returns the sum of all ints in an array.
     *
     * @param arr an array of ints
     * @return the sum of all values in arr
     */
    public int sum(int[] arr){
        int sum = 0;
        // Loop through the array and add each element to sum
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    // Optional: main method to test
    public static void main(String[] args) {
        ArraySum arraySum = new ArraySum();
        int[] numbers = {1, 3, 5, 6};
        System.out.println(arraySum.sum(numbers)); // Output: 15
    }
}
