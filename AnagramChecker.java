import java.util.Scanner;

public class AnagramChecker {

    static boolean isAnagram(String a, String b) {

        char temp1 = 0;
        char temp2 = 0;
        char[] arr1 = a.toLowerCase().toCharArray();
        char[] arr2 = b.toLowerCase().toCharArray();
        if (a.length() != b.length()) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[j] - arr1[i] > 0) {
                    temp1 = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp1;
                }
                if (arr2[j] - arr2[i] > 0) {
                    temp2 = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp2;
                }
            }
        }

        String s1 = "";
        String s2 = "";
        for (int i = 0; i < arr1.length; i++) {
            s1 += arr1[i];
            s2 += arr2[i];
        }
        if (s1.equals(s2)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        //condition?print(true):print(false)
//        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        if(ret){
            System.out.println("Anagrams");
        }else {
            System.out.println("Not Anagrams");
        }
    }
}
