package com.amigos.test;



//import com.amigos.models.Player;
import com.amigos.utiles.PlayersUtils;

public class PlayerManagementSystem {
	//private static Scanner scanner = new Scanner(System.in);
	//initial phase of players arrays =size =0;
	//private static Player[] players= new Player[0];
	
	//we will use Array.copyOf
	public static void main(String[] args) 
	{
		
		
	
		while(true)
		{
			System.out.println("==========================================");
			System.out.println("Player Mananagement System Menu::");
			System.out.println("1.Add Player");
			System.out.println("2.Remove Player");
			System.out.println("3.Search Player");
			System.out.println("4.Upadate Player");
			System.out.println("5.Display Sorted Players");
			System.out.println("6.Diaplay All Players");
			System.out.println("7.Exit");
			System.out.println("==========================================");
			int choice=PlayersUtils.getUserChoice();
			switch(choice) {
			case 1:
				PlayersUtils.addNewPlayer();
				
				break;
				case 2:
					PlayersUtils.removePlayer();
					break;
				case 3:
					PlayersUtils.searchPlayer();
					break;
				case 4:
					PlayersUtils.updatePlayer();
					break;
				case 5:
					PlayersUtils.displaySortedPlayers();
					break;
				case 6:
					PlayersUtils.displayAllPlayers();
					break;
				case 7:
					PlayersUtils.scannerClosed();
					System.out.println("Exiting players management system...");
					System.exit(choice);
					break;
					
							
						}
						
						}	
		}
 
	



	
}
