public class Sumofdigit {
    public static void main(String[] args) {
        int n = 234567;
        int sum = Sumofdigit(n);
        while(sum>9){
            sum = Sumofdigit(sum);
        }
        System.out.println(sum);
    }
    public static int Sumofdigit(int n){
        int sum = 0;
        while(n!=0){
            int rem =n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
    
}
