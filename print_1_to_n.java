import java.util.Scanner;

public class print_1_to_n {
    static int n;
    public static void print(int x){
        if(x>n) return;
        System.out.println(x);
        print(x+1);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number : ");
        n= sc.nextInt();
        print(1);
    }
}
