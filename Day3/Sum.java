public class Sum {
    public static void main(String[] args) {
         int n=12345;
         int sum=0;
         int rem=0;
         while(n!=0)
         {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
         }
         {
            System.out.println(sum);
         }

    }
    
}
