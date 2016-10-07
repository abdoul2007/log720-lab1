package ca.etsmtl.log720.lab1;

import java.util.Scanner;

public class ClientVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);

		while(true){
		
			System.out.println("Veuillez faire un choix : ");
			System.out.println("1. Obtenir liste de réactions possibles");
			System.out.println("2. Ajouter réaction");
			System.out.println("3. Obtenir liste de dossiers");
			System.out.println("4. Visualiser dossier");
			System.out.println("5. Obtenir liste d'infraction");
			System.out.println("0. Pour quitter");
			
			int key = input.nextInt();
	
			if(key == 0){
				break;
			}
			
			switch (key) {
			case 1:
				
				break;
	
			case 2:
				
				break;
	
			case 3:
	
				break;
	
			case 4:
	
				break;
	
			case 5:
	
				break;
				
			
			default :
				System.out.println("Ivalid input !!");
				break;
			}

		}
	}

}
