import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerMulAdd {
    public static void main(String[] args) throws IOException {
       // InputStreamReader intReader=new InputStreamReader(System.in);
       // BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
       // String n= bufferedReader.readLine();
       // BigInteger a=new BigInteger(n);
       // BigInteger b=new BigInteger(n);

        Scanner sc=new Scanner(System.in);
        BigInteger a=sc.nextBigInteger();
        BigInteger b=sc.nextBigInteger();

        if( a.signum()>=0 && b.signum()>=0 && String.valueOf(a).length()<200
                && String.valueOf(b).length()<200){
            System.out.println(a.add(b));
            System.out.println(a.multiply(b));

        }
    }
}
