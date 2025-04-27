public class print_all_element_in_array {

        public static void print(int i,int[] arr){
            if(i==arr.length)return;
            System.out.print(arr[i]+" ");
            print(i+1,arr);
        }
    public static void main(String[] args) {
        int[]arr={1,8,6,6,7,5,4,3,2};
        print(0,arr);
    }
}
