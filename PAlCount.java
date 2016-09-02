import java.lang.StringBuilder;
import java.util.Scanner;
class PALCount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String t1,t2;
       
       
        int count=0;
        for(int i=0;i<text.length();i++)
        {
            for(int j=i+1;j<=text.length();j++)
            {
                t1 = text.substring(i,j);
               // System.out.println(t1);
                
                StringBuilder sb = new StringBuilder();
           
               	sb= sb.append(t1);
                //System.out.println("b4"   +sb);
                sb= sb.reverse();
                //System.out.println("rev"   +sb);
               
                if(sb.toString().equals(t1)){
                 count=count+1;
                }
            }
        }
        System.out.println(count);
    }
}