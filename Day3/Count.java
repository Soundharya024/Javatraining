import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int n= sc.nextInt();
        int Count=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0)
            {
                System.out.println(Count);
            }
        }

    }
    
}
