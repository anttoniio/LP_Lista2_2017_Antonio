import java.util.Scanner;


public class Questao06b {
	
	public static void main (String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int N, RESTO;
		
		N = ent.nextInt();
		
		RESTO = N - 2 * (N / 2);
		
		if(RESTO == 0){
			
			System.out.println("O valor " + N + " e PAR.");
			
		}
		else{
			
			System.out.println("O valor " + N + " e IMPAR.");
			
		}
		
	}
}

