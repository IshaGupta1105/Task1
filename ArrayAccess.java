public class ArrayAccess {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};

        try {
            // Loop intentionally goes beyond last index to trigger exception
            for (int i = 0; i <= arr.length; i++) {
                System.out.println("Element at index " + i + ": " + arr[i]);
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of bounds.");
        }
    }
}
