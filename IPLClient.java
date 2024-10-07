package com.ipl.client;

import com.ipl.controller.IPLController;

public class IPLClient {
	public static void main(String[] args) {
		IPLController controller = new IPLController();
		
		controller.addTeam("Chennai Super Kings");
		controller.addTeam("Mumbai Indians");
		controller.addTeam("Royal Challengers Bangalore");
		
		controller.addPlayerToTeam("Chennai Super Kings", "MS Dhoni", "Batsman", 4500, 5);
		controller.addPlayerToTeam("Chennai Super Kings", "Dwayne Bravo", "Bowler", 1500, 120);
		
		controller.addPlayerToTeam("Mumbai Indians", "Rohit Sharma", "Batsman", 5000, 15);
		controller.addPlayerToTeam("Mumbai Indians", "Jasprit Bumrah", "Bowler", 1000, 120);

		controller.addPlayerToTeam("Royal Challengers Bangalore", "Virat Kholi", "Batsman", 6000, 20);
		controller.addPlayerToTeam("Royal Challengers Bangalore", "Yuzvendra Chahal", "Bowler", 800, 125);

        controller.showAllTeams();

	}

}
