import java.util.Scanner;

public class print_n_to_1 {
    public static void print(int n){
        if(n==0) return ;
        System.out.println(n);
        print(n-1);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the the value of n :");
        int n=sc.nextInt();
        print(n);

}}
