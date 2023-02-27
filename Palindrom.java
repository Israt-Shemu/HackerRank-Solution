import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String rev="";
        for(int i=a.length()-1;i>=0;i--){
            rev=rev+a.charAt(i);

        }
        if(rev.equals(a)){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
