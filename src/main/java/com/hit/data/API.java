package com.hit.data;


import java.util.List;



public class API {
//	1.Get list of matches by team. 
//	2.Get list of matches by team filtered by status 
//	3.Get list of matches by tournament. 
//	4.Get list of matches by tournament filtered by status
//	public static void main(String[] args) {
	
	public static List<Match> getMatchesByTeam() {
		DataOrigin data = DataOrigin.getInstance();
		String name = "matches/team";
		List<Match> matches = data.getMatches();
		matches.removeIf(match -> !match.firstTeam.getName().equals(name)
				&& !match.secondTeam.getName().equals(name));
		return matches;	
	

//	public List<Match> getMatchesByTeamFilteredByStatus(String name, String status) {
//		DataOrigin data = DataOrigin.getInstance();
//		String name = "matches/team";
//		String status = ""
//		List<Match> matches = data.getMatches();
//		matches.removeIf(match -> !match.firstTeam.getName().equals(name)
//				&& !match.secondTeam.getName().equals(name));
//		return matches;	
//		return null;
//	}
//	public List<Match> getMatchesByTournament(String name) {
//		return null;
//	}
//	public List<Match> getMatchesByTournamentFilteredByStatus(String name, String status) {
//		return null;
//	}
	
	}
}


