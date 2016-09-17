package clashOfCodes;

import java.util.Scanner;

public class pyramide {

	
	
	public static void main(String[] args) {
		System.out.println("Vous êtes un pharaon, combien de blocs de pierres avez-vous à disposition pour construire votre pyramide en 2D ?");
		Scanner scan = new Scanner(System.in);
		int n=  scan.nextInt();	
		
        int h=0;
        int rest=n;
        int a=0;
        
        while(rest>=a){
        	a++;
        	h++;
        	rest=rest-a;
        }
        
        System.out.println("Avec vos " + n + " pierres, vous pouvez construire une pyramide de " + h + " étages.\n" + "Il vous restera " + rest + " pierre(s) sur les bras.");

	}

}
