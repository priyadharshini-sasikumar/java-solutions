import java.util.Scanner;
import java.util.Arrays;
public class Solution {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
   
	int[] merge =new int[nums1.length+nums2.length];
	 for (int i = 0; i < nums1.length; i++) {
         merge[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {
            merge[nums1.length + i] = nums2[i];
        }

	 Arrays.sort(merge);
	int len=merge.length;
	 
	 double mid;
	 if ( len % 2 == 0) {
		     mid = (merge[len/2- 1] + merge[len/2]) / 2.0;
		
	} else {
		    mid = merge[len/2];
	}
	 
	return mid ;
	 
     }
}


