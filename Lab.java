import java.util.Scanner;

public class Lab {

public Lab(){

}

public void start() {
	int n = vvod();
	for (int i = 2; i <= n; i++) {
		if (proverka(i)) {
			System.out.println(i);
		}
	}
}

private boolean proverka(int N) {
	int i = 0;
	for(int k = 2; k < N; k++) {
		if(N % k == 0) {
			return false;
		} 
	} 
	return true;
}

private int vvod() {
	Scanner s = new Scanner(System.in);
	return s.nextInt();
}
}
