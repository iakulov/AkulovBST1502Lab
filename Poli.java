import java.util.Scanner;

public class Poli {

public Poli(){

}

public void start() {
	String stroka = vvods();
	System.out.println(proverkap(stroka));
}

private boolean proverkap(String slovo){
	String slovo2 = reverse(slovo);
	for(int i1 = 0;i1 <= slovo.length() -1;i1++){
		if(slovo2.charAt(i1) != slovo.charAt(i1)){
			return false;
		}
	}
	return true;
}

private String reverse(String str){
	String rev = "";
	for (int i = str.length() - 1; i>=0; i--){
		rev=rev+str.charAt(i);
	}	
	return rev;

}

private String vvods(){
	Scanner s = new Scanner(System.in);
	return s.nextLine();
}
}