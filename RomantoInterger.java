import java.util.Scanner;
import java.util.Arrays;
public class Solution {
	int value(char ch) {
		if(ch=='I') return 1;
		if(ch=='V') return 5;
		if(ch=='X') return 10;
		if(ch=='L') return 50;
		if(ch=='C') return 100;
        if(ch=='D') return 500;
		if(ch=='M') return 1000;
		return 0;
	}
	int romanToInt(String str) {
		int sum=0;
		for(int i=0;i<str.length()-1;i++) {
			int cur=value(str.charAt(i));
			int next=value(str.charAt(i+1));
			if(cur<next){
				sum-=cur;
				
			}else {
				sum+=cur;
				
			}
		}
		sum+=value(str.charAt(str.length()-1));
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Solution ri=new Solution();
		int result=ri.romanToInt(str);
		
		System.out.println(result);
		

	}

}
