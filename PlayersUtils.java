package com.amigos.utiles;

import java.util.Arrays;
//import java.util.Iterator;
import java.util.Scanner;
import com.amigos.models.Player;
public class PlayersUtils {
	//initial phase of players arrays =size =0;
		private static Player[] players= new Player[0];
	private static Scanner sc = new Scanner(System.in);
   public static void addNewPlayer() {
		
	   System.out.println("enter the Player Id:");
	   int playerId = sc.nextInt();
	   System.out.println("enter the Player Name:");
	   String playerNmae = sc.next();
	   System.out.println("enter the Player Team:");
	   String teamName = sc.next();
	   System.out.println("enter the Player Jersey Number:");
	   String jerseyNumber = sc.next();
	   System.out.println("enter the Player Runs:");
	   int runs = sc.nextInt();
	   System.out.println("enter the Player Wickets:");
	   int wickets = sc.nextInt();
	   System.out.println("enter the Player Matched Played:");
	   int matchPlayed = sc.nextInt();
	   Player newPlayer = new Player(playerId, playerNmae,teamName, jerseyNumber,runs,wickets, matchPlayed);
       
	   System.out.println("New to Palyer with Name:"+playerNmae+" has been created successfully..");
	   players =growArray(players);
		//players[0]=newPlayer
		players[players.length-1]= newPlayer;
		System.out.println("New Player added sucessfully.........");
   }
   
   private static Player[] growArray(Player[] array)
   {
   	return Arrays.copyOf(array,array.length+1);
   }
   
   public static void display(Player player)
	{
		System.out.println("=================================================");
		System.out.println("Player Id::"+player.getPlayerId());
		System.out.println("Player Name::"+player.getPlayerName());
		System.out.println("Player Team::"+player.getPlaterTeam());
		System.out.println("Player Jersery Number::"+player.getPlayerJerseryNumber());
		System.out.println("Player Runs::"+player.getPlayerRuns());
		System.out.println("Player Wickets::"+player.getPlayerWickets());
		System.out.println("Player Matched played::"+player.getMatchedPlayed());
		System.out.println("=================================================");
	}
   
   public static void scannerClosed()
   {
	   sc.close();
   }
public static void searchPlayer() {
	System.out.println("1.search by Jersey number:");
	System.out.println("2.Search by player name:");
	int searchChoice=getUserChoice();
	switch(searchChoice)
	{
		case 1:
			System.out.println("Enter jersey number to search:");
			sc.nextLine();//consume the new line character
			String jerseyNumberToSearch =sc.nextLine();
			System.out.println("choice:"+jerseyNumberToSearch);
			searchAndDisplayPlayer(jerseyNumberToSearch);
//			for (int i = 0; i < players.length; i++) {
//				if(players[i].getPlayerJerseryNumber()==jerseyNumberToSearch)
//				
//			}
			break;
		case 2:
			System.out.println("Enter Player name to search:");
			sc.nextLine();//consume the new line character
			String playerNameToSearch =sc.nextLine();
			System.out.println("choice:"+playerNameToSearch);
			searchAndDisplayPlayer(playerNameToSearch);
			break;
		default:
			System.out.println("Invalid options");
			break;
	}
}
	
	private static void searchAndDisplayPlayer(String searchKey )
		{
		System.out.println("Search key:"+searchKey);
			for (int i = 0; i < players.length; i++) 
			{System.out.println(players[i].getPlayerJerseryNumber());
					if(players[i].getPlayerJerseryNumber().equals(searchKey)  || players[i].getPlayerName().equals(searchKey) )
				{
						
					display(players[i]);	
					return;
     		    }
		    }
		System.out.println("player not found with the given specific ceriteris....");
		}
	
		public static int getUserChoice()
		{
			System.out.println("Enter your choice:");
			return sc.nextInt();
		}

			
	public static void displayAllPlayers() {
	if(players.length==0)
	{
		System.out.println("No players in the sysytem..");
		return;
	}
	for (int i = 0; i < players.length; i++) {
		display(players[i]);
		
	}
	}
	
	public static void displaySortedPlayers()
	{
		System.out.println("1.Sorting based on Minimum Runs:");
		System.out.println("1.Sorting based on Maximum Runs:");
		System.out.println("1.Sorting based on Minimum Wickets:");
		System.out.println("1.Sorting based on Maximum Wickets:");
		
		int sortChoice = getUserChoice();
		switch(sortChoice)
		{
		case 1:
		 sortPlayersByRunsAsc(players);	
			break;
case 2:
	sortPlayersByRunsDesc(players);
			break;
case 3:
	sortPlayersByWicketsAsc(players);
	
	break;
case 4:
	sortPlayersByWicketsDesc(players);
	break;
	default:
		System.out.println("invalid choice!!");
		break;
		}
		System.out.println("Sorted Players");
		displayAllPlayers();
	}
	
	
	//sorting
	private static void sortPlayersByRunsAsc(Player[] players) {
		for (int i = 0; i < players.length-1; i++) {
			for (int j = 0; j < players.length-i-1; j++) {
				if(players[j].getPlayerRuns()>players[j+1].getPlayerRuns())
				{
					//swapping
					Player temp=players[j];
					players[j]=players[j+1];
					players[j+1]=temp;
				}
			}
		}
		
	}
	private static void sortPlayersByRunsDesc(Player[] players) {
		for (int i = 0; i < players.length-1; i++) {
			for (int j = 0; j < players.length-i-1; j++) {
				if(players[j].getPlayerRuns()<players[j+1].getPlayerRuns())
				{
					//swapping
					Player temp=players[j];
					players[j]=players[j+1];
					players[j+1]=temp;
				}
			}
		}
		
	}
	private static void sortPlayersByWicketsAsc(Player[] players) {
		for (int i = 0; i < players.length-1; i++) {
			for (int j = 0; j < players.length-i-1; j++) {
				if(players[j].getPlayerWickets()>players[j+1].getPlayerWickets())
				{
					//swapping
					Player temp=players[j];
					players[j]=players[j+1];
					players[j+1]=temp;
				}
			}
		}
		
	}
	private static void sortPlayersByWicketsDesc(Player[] players) {
		for (int i = 0; i < players.length-1; i++) {
			for (int j = 0; j < players.length-i-1; j++) {
				if(players[j].getPlayerWickets()<players[j+1].getPlayerWickets())
				{
					//swapping
					Player temp=players[j];
					players[j]=players[j+1];
					players[j+1]=temp;
				}
			}
		}
		
	}

	public static void removePlayer() {
		System.out.println("Enter the jersey number of the player to remove:");
		sc.nextLine();
		String jerseyNumberToRemove = sc.nextLine();
		int indexToRemove = -1;
		for (int i = 0; i < players.length; i++) {
			if(players[i].getPlayerJerseryNumber().equals(jerseyNumberToRemove))
			{
				indexToRemove=i;//updated
				break;
			}
		}
		if(indexToRemove!=-1)
		{
			Player[] updatedPlayersArray =new Player[players.length-1];
			for (int i = 0,j=0; i < players.length; i++)
			{
				if(i!=indexToRemove) {
					updatedPlayersArray[j++]=players[i];
				}
			}
			players =updatedPlayersArray;
			System.out.println("player removed sucessfully");
			
		}else {
			System.out.println("player not found with jersey number"+jerseyNumberToRemove);
		}
		
	}

	public static void updatePlayer() {
		System.out.println("Enter the jersey number of the player to update:");
		sc.nextLine();
		String jerseyNumberToUpdate = sc.nextLine();
		for (Player player : players) {
			if(player.getPlayerJerseryNumber().equals(jerseyNumberToUpdate))
			{
				System.out.println("1.update runs:");
				System.out.println("1.update wickets:");
				System.out.println("1.update matched play:");
				int updateChoice = getUserChoice();
				switch(updateChoice)
				{
				case 1:
					System.out.println("Enter new runs");
					int newRhuns =sc.nextInt();
					player.setPlayerRuns(newRhuns);
					System.out.println("runs update sucessfully");
					break;
				case 2:
					System.out.println("Enter new Wickets");
					int newWickets =sc.nextInt();
					player.setPlayerWickets(newWickets);
					System.out.println("wickets update sucessfully");
					break;
				case 3:
					System.out.println("Enter new matches played");
					int newMatchesPlayed =sc.nextInt();
					player.setMatchedPlayed(newMatchesPlayed);
					System.out.println("matches update sucessfully");
					break;
					default:
						System.out.println("update choice invalid");
						break;
				}
				return;
			}else {
				System.out.println("player not found to update with jersey number:"+jerseyNumberToUpdate);
			}
		}
		
		
	}


}
