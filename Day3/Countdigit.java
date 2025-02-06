public class Countdigit {
    public static void main(String[] args) {
        int n=4567,count=0;

        while(n!=0)
        {
             int rem=n%10;
            count++;
            n=n/10;
        }
        {
            System.out.println(count);
        }
        for(int i=n;i>0;i=i/10)
        {
            count++;
        }
        System.out.println(count);
    }
    
}
