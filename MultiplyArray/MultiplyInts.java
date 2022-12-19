

public class MultiplyInts {
    public static int arr[] = {1,2,3,4,5,6};
    public static int multiply(){
        int result = 1;
        for(int i =0;i<arr.length;i++){
            result=result*arr[i];

        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply());
    }
}
