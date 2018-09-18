import java.util.Scanner;

public class Main{
	public static void main(String[] argv){
		Lab lab = new Lab();
		Poli poli = new Poli();

		System.out.println("naiti prostie chisla - 1");
		System.out.println("proverit' na polindrom - 2");

		switch(vibor()){
			case 1:{
				lab.start();
				break;
			}

			case 2:{
				poli.start();
				break;
			}
		}
	}

	public static int vibor(){
		Scanner scanner = new Scanner(System.in);
		return scanner.nextInt();
	}
}