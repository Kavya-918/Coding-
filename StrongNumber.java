import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean flag = false;
    for(int i=1; i<=n; i++){
        if(isStrong(i)){
            System.out.println(i+" ");
            flag=true;
        }
    }
    if(!flag){
        System.out.println("no strong number found");
    }
    }
    public static int factorial(int n){
        int fact =1;
        for(int i=2; i<=n; i++){
            fact *=i;
        }
        return fact;
    }
    public static boolean isStrong(int n){
        int sum=0, original =n;
        while (n>0) {
            int digit = n%10;
            sum +=factorial(digit);
            n /=10;
        }
        if(original == sum){
            return true;
        }
        else{
            return false;
        }
    }
    
}
