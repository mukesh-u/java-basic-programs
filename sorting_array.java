package General_programs;

public class sorting_array {
    public static void main(String[] args) {

        int arr[]={546, 56, 12, 45, 87, 3, 105};
        int len= arr.length;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }
        System.out.println("Largest element in array is :" +len);
    }
}
