import java.util.Scanner;
public class Solution {
	public boolean isPalindrome(String str) {
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		if(str.equals(rev)) {
			return true;
		}else {
			return false;
		}
			}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Solution lt=new Solution();
		String str=sc.nextLine();
		
		boolean result=lt.isPalindrome(str);
		System.out.println(result);

	}

}
