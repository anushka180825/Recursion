import java.util.Scanner;

public class print_1_to_n_after_recursive_call {
    public static void print(int n){
        if(n==0)return;
        print(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);

    }
}
