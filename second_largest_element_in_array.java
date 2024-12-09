package General_programs;

public class second_largest_element_in_array {
    public static void main(String[] args) {

        int arr[]={12, 56,43,98, 70,405, 820,600,1000,36, 91,78,999};
        int temp;
        int len= arr.length;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            //System.out.println(arr[len-2]);
        }
        System.out.println("Second largest element in array is: "+arr[len-2]);
    }
}
