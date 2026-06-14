package java3;
import java.util.*;
public class FlipProgram {
	public static int flip(int[] arr,int k) {
		while(k!=0) {
			arr[0]=arr[0]*(-1);
			Arrays.sort(arr);
			k-=1;
			
		}
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		sc.nextLine();
		String input=sc.nextLine();

        String[] strArr = input.trim().split(" ");
		int[] arr=new int[strArr.length];
		for(int i=0;i<strArr.length;i++) {
			arr[i]=Integer.parseInt(strArr[i]);
		}
		Arrays.sort(arr);
		int result=flip(arr,k);
		
		System.out.println(result);
		

	}

}
