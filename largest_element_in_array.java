package General_programs;

public class largest_element_in_array {
    public static void main(String[] args) {

        int arr[]={12, 34,78,51,90,67,89,60, 105, 35, 500};
        int max=arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("largest element in array is: "+max);
    }
}
