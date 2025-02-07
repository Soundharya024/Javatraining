public class Pattern10 {
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<n*2;i++)
        {
            int totalcolinrow=i>n?2*n-i:i;
            int spaces=n-totalcolinrow;
            for(int j=1;j<=spaces;j++)
            {
                System.out.print(" ");
            }
            for(int k=totalcolinrow;k>0;k--)
            {
                System.out.print(k);
            }
            for(int l=2;l<=totalcolinrow;l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }

    }
    
}
