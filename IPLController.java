package com.ipl.controller;

import com.ipl.entity.Player;
import com.ipl.entity.Team;
import com.ipl.service.IPLService;

public class IPLController {
	private IPLService iplService;
	
	public IPLController() {
		iplService = new IPLService();
	}
	
	public void addTeam(String name) {
		iplService.addTeam(name);
	}
	
	public void addPlayerToTeam(String teamName, String playerName, String role, int runs, int wickets) {
		Player player = new Player(playerName, role, runs, wickets);
		
		iplService.addPlayerToTeam(teamName, player);
	}
	
	public void showAllTeams() {
		for(Team team : iplService.getAllTeams()) {

			System.out.println("\nTeam : " + team.getName());
			System.out.println("=================================================================");

			System.out.printf("| %-15s | %-10s | %-5s | %-6s | \n" , " Name "," Role "," Runs "," Wickets ");
			System.out.println("=================================================================");

	//		System.out.println("|-----------------|------------|-------|--------|");
			for(Player player : team.getPlayers()) {
				System.out.println(player);
			}
			
		}
	}

}
