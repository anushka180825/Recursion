import java.util.Scanner;

public class factorial_using_recursion {
    public static int fact(int n){
        if(n==1)return 1;
        int ans=n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int n=sc.nextInt();
        System.out.println(fact(n));
    }

}
