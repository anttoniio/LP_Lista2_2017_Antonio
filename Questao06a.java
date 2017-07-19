import java.util.Scanner;

public class Questao06a {
	
	public static void main (String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		float N1, N2, N3, N4, MD, NOVA_MD, EX;
		
		N1 = ent.nextFloat();
		N2 = ent.nextFloat();
		N3 = ent.nextFloat();
		N4 = ent.nextFloat();
		
		MD = (N1 + N2 + N3 + N4) / 4;
		
		if (MD >= 7){
			
			System.out.println("Aluno Aprovado " + MD);
		
		}
		else{
			
			EX = ent.nextFloat();
			
			NOVA_MD = (MD + EX) / 2;
			
			if (NOVA_MD >= 5){
				
				System.out.println("Aluno Aprovado em Exame " + NOVA_MD);
				
			}
			else{
				
				System.out.println("Aluno Reprovado " + NOVA_MD);
				
			}
			
		}
		
		
	}
}

