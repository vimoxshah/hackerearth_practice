import java.util.*;
 
class MarbleLover
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int[] arr = new int[length];
        int ans = 1, curr = 0;
        for(int i = 0; i<length;i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        curr = arr[0] + 4;
        for(int i = 1; i < length; i++)
        {
            if(arr[i] > curr)
            {
                curr = arr[i] + 4;
                ++ans;
            }
        }
        System.out.println(ans);
    }
}