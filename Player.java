package com.amigos.models;

public class Player {
	private int playerId;
	private String playerName;
	private String platerTeam;
	private String playerJerseryNumber;
	private int playerRuns;
	private int playerWickets;
	private int matchedPlayed;
	//No arguments
	public Player() {
		
	}
	//parameterized constructer
	
	public Player(int playerId, String playerName, String platerTeam, String playerJerseryNumber, int playerRuns,
			int playerWickets, int matchedPlayed) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
		this.platerTeam = platerTeam;
		this.playerJerseryNumber = playerJerseryNumber;
		this.playerRuns = playerRuns;
		this.playerWickets = playerWickets;
		this.matchedPlayed = matchedPlayed;
	}
	public String getPlaterTeam() {
		return platerTeam;
	}

	public void setPlaterTeam(String platerTeam) {
		this.platerTeam = platerTeam;
	}

	//accessor and mutator
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerJerseryNumber() {
		return playerJerseryNumber;
	}
	public void setPlayerJerseryNumber(String playerJerseryNumber) {
		this.playerJerseryNumber = playerJerseryNumber;
	}
	public int getPlayerRuns() {
		return playerRuns;
	}
	public void setPlayerRuns(int playerRuns) {
		this.playerRuns = playerRuns;
	}
	public int getPlayerWickets() {
		return playerWickets;
	}
	public void setPlayerWickets(int playerWickets) {
		this.playerWickets = playerWickets;
	}
	public int getMatchedPlayed() {
		return matchedPlayed;
	}
	public void setMatchedPlayed(int matchedPlayed) {
		this.matchedPlayed = matchedPlayed;
	}
	
	
}
