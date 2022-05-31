import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum=0;
            for(int j=0;j<=n-1;j++)
            {
                double power = Math.pow(2,j);
                int y = (int)power * b; 
                sum=sum+y;
                power++;
                
                System.out.print(a+sum+" ");
            }
            System.out.println();
        }
        in.close();
    }
}
//Created by Ashutosh Nandi❤️
