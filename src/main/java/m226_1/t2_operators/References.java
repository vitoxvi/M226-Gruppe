package m226_1.t2_operators;

public class References {
    public static void main(String[] args) {
        int x = 1;
        increment(x);
        System.out.println(x);

        int[] arr = {1,2,3,4};
        incrementElementsInArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-");
        }

    }

    // Increment value of an integer
    public static void increment(int x){
        x = x + 1;
    }

    // Increment values in an array
    public static void incrementElementsInArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    //Generic swap method
    public static void swap(Object o1, Object o2){
        Object temp = o1;
        o1=o2;
        o2=temp;
    }
}
