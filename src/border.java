
import java.io.*;
class border
{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    void disp()throws Exception
    {
        System.out.println("GIVE LIMIT OF THE ARRAY :");
        String x = br.readLine();
        int inp = Integer.parseInt(x);
        int doub[][] = new int[inp][inp];
        int cnt = 1;
        
        int len = inp;
        
        
        for(int j = 0; j<inp;j++)
        {
            for(int i =0;i<inp;i++)
            {
                System.out.print(cnt+".");
                String y = br.readLine();
                int lol = Integer.parseInt(y);
                doub[j][i] = lol;
                cnt++;
            }
        }
        System.out.println("normal:");
         for(int l = 0; l<inp;l++)
        {
            for(int k =0;k<inp;k++)
            {
                System.out.print(doub[l][k]+" ");
            }
            System.out.println("");
        }
        System.out.println("Border elements");
        
        for(int h = 0;h<inp; h++)
        {
            for(int hx = 0 ; hx<inp;hx++)
            {
                if((h==0)||(h==len-1)||(hx==0)||(hx==len-1))
                {
                    System.out.print(doub[h][hx]+" ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
       
       
    public static void main(String[]args)throws Exception
    {
        border o1 = new border();
        o1.disp();
    }
}