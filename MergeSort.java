import java.util.Scanner;


public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		long[] arr = new long[ N];
	
		
		for(int i=0;i<N;i++){
			
			arr[i] = s.nextLong();
		}
		
		 MergeSort_Recursive(arr, 0, arr.length-1);
		 for(int j=0;j<arr.length;j++){
				System.out.print(arr[j]+" ");
			}
	
		
	}
	static public void DoMerge(long [] numbers, long left, long mid, long right)
    {
      long [] temp = new long[numbers.length];
      long i, left_end, num_elements, tmp_pos;
  
      left_end = (mid - 1);
      tmp_pos = left;
      num_elements = (right - left + 1);
  
      while ((left <= left_end) && (mid <= right))
      {
          if (numbers[(int) left] <= numbers[(int)mid])
              temp[(int)tmp_pos++] = numbers[(int)left++];
          else
              temp[(int)tmp_pos++] = numbers[(int)mid++];
      }
  
      while (left <= left_end)
          temp[(int)tmp_pos++] = numbers[(int)left++];

      while (mid <= right)
          temp[(int)tmp_pos++] = numbers[(int)mid++];

      for (i = 0; i < num_elements; i++)
      {
          numbers[(int)right] = temp[(int)right];
          right--;
      }
  }
	
	 static public void MergeSort_Recursive(long [] numbers, long left, long right)
	    {
	      long mid;
	    
	      if (right > left)
	      {
	        mid = (right + left) / 2;
	        MergeSort_Recursive(numbers, left, mid);
	        MergeSort_Recursive(numbers, (mid + 1), right);
	    
	        DoMerge(numbers, left, (mid+1), right);
	      }
	    }
}
