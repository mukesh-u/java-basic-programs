package General_programs;

public class longest_consecutive_occurence_of_integers {
    public static void main(String[] args) {

        int arr[]={12,45,4,5,6,7,8,45,90,65};

        int count=0;
        int ans=0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]+1==arr[i+1]){
                count++;
            }
            else {
                count=0;
            }
            if (count>ans){
                ans=count;
            }
//            max=Math.max(max,count+1);
        }
        System.out.println(ans+1);


    }
}
