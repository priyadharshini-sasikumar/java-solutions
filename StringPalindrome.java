import java.util.Scanner;

class TestClass {
    public static void main(String args[] ) throws Exception {
      
        // Write your code here
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev+=str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }


    }
}
