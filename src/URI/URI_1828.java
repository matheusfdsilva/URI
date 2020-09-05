package URI;

import java.util.Scanner;

public class URI_1828 {
	
    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt(); 
        
        for (int i = 1; i <= n ; i++) {
            String sheldon = sc.next();
            String raj = sc.next();
            
            if(sheldon.equals(raj)){
                System.out.printf("Caso #%d: De novo!\n",i);               
            }
            else if (jogo(sheldon,raj)){
                System.out.printf("Caso #%d: Bazinga!\n",i);                
            }
            else{
                System.out.printf("Caso #%d: Raj trapaceou!\n",i);               
            }
        }
        sc.close();
    }

    private static boolean jogo (String sheldon, String raj){
        if (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))){
            return true;
        }
        else if(sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))){
            return true;
        }
        else if(sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))){
            return true;
        }
        else if(sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))){
            return true;
        }
        else if(sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))){
            return true;
        }        
        else{
            return false;
        }
    }
}