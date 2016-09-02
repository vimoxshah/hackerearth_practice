import java.util.Random;
import java.util.Scanner;


public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		
		long[] arr = new long[ N];
	
		
		for(int i=0;i<N;i++){
			
			arr[i] = s.nextInt();
		}
	
		
		quickSort(arr, 0, arr.length-1);
		
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
		
		
	}

	private static long random_partition(long arr[], long start,long end){
		
		
			long t,t1;
		    long i = start + 1;
		    long piv = arr[(int) start] ;            //make the first element as pivot element.
		    for(int j =(int) (start + 1); j <= end ; j++ )  {
		    /*rearrange the array by putting elements which are less than pivot
		       on one side and which are greater that on other. */

		          if ( arr[ j ] < piv) {
		                // swap (arr[ (int) i ],arr[ j ]);
		                 t=arr[(int)i];
		                 arr[(int)i]=arr[j];
		                 arr[j]=t;
		                 
		            i += 1;
		        }
		   }
		  // swap ( arr[ (int) start ] ,arr[ (int) (i-1) ] ) ;  
		   t1=arr[(int) start];
		   arr[(int) start]=arr[(int) (i-1)];
		   arr[(int) (i-1)]=t1;
		   
		   return i-1;                     
		
		/*Random rand = new Random();
		
		
	     long tmp;
	     long pivot = arr[ (int)(start + (rand.nextInt( (int) (end - start)+1)))];

	      while (start <= end) {
	            while (arr[ (int)start] < pivot)
	                  start++;
	            while (arr[ (int)end] > pivot)
	                  end--;
	            if (start <= end) {
	                  tmp =  arr[ (int) start];
	                  arr[ (int) start] = arr[(int) pivot];
	                  arr[ (int)pivot] = tmp;
	                  start++;
	                  end--;
	            }
	      };

	      return start;*/
		
	}
	private static void quickSort(long arr[], long start,long end){
		
		if(start<end){
			 long piv_pos = random_partition(arr, start, end) ;  
			 if(start<piv_pos-1){
	         quickSort (arr,start , piv_pos -1);  
	         }
			 if(end>piv_pos){
	         quickSort (arr,piv_pos +1 , end) ; 
	         }
		}
		
	}
}
