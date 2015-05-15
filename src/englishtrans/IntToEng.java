package englishtrans;
import java.util.Scanner;

public class IntToEng {
	 // メインメソッド
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    // 数値を英訳する変換するメソッド
    public static String translateEng(int n) {
    	String a[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String b[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
    	//return a[n];
    	return judge(n, a, b);
    }

	private static String judge(int n, String[] a, String[] b) {
		if(0<=n && n<=19){
    		return a[n];
    	}
    	else if(n>=20 && n<=99){
    		int ten = n/10 -2;
    		int one = n%10;
    		
    		if(one == 0){
    			String trans = (b[ten]);
    			return trans;
    		}    		
    		else{
    		String trans = (b[ten]+" "+a[one]);
    			return trans;
    		}
    	}
    	else{
    		return"one hundred";
    	}
	}
}