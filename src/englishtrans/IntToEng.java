package englishtrans;
import java.util.Scanner;

public class IntToEng {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        System.out.println(translateEng(input));

    }

    public static String translateEng(int n) {
    	String a[] = {"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
        String b[] = {"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninty"};
    	//return a[n];
        if(n<=100)return judge(n, a, b);
        if(n>100)return judge2(n,a,b);
        return " ";
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
	
	
	private static String judge2(int n, String[] a, String[] b){
		String trans2;
		int hundsInt=n/100;
		if(hundsInt > 0){
		 trans2 =hunds(n,hundsInt,a,b);
		
		return trans2;
		}
		return " ";
	}
	
	private static String hunds(int n, int hundsInt,String a[],String b[]){
		String eng =a[hundsInt]+" hundred";
		int c=n%100;
		if(c!=0){ 

		eng+=" "+judge(c,a,b);
		return eng;
		}
		return "one thousand";
		
	}
	
	
}