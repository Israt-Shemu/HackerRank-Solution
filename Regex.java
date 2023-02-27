import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Regex {



        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            while(in.hasNext()){
                String IP = in.next();
                System.out.println(IP.matches(new MyRegex().pattern));
            }

        }
    }

    //Write your code here
    class MyRegex{
    String regularEx="";
    Pattern pattern= Pattern.compile(regularEx);
    Matcher m=pattern.matcher();


    }

