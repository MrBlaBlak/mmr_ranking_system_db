package pierwszy;
import java.io.IOException;
import java.io.FileNotFoundException;


public class Firts {

	public static void main(String[] args) throws IOException, FileNotFoundException
	{
		System.out.println("Lets game players:");
		
		String[] test = new String[]{"Toxic","Squishy","Blak","Naicrez","Zery","Skitts","Bobby","Becket","Timo","Zto","EU"};
		WriteFile writeFile;
		int loop=0, a=0, b=0, counter=0;
		float i = 0;
		String map_played;
		Lobby lobby = new Lobby();
		lobby.setAllGamers();
		//lobby.restart_stats(); Regnells Haboo

		lobby.setLobbyAuto(test);
		lobby.setLobbyMmrTitansWinrate();			
		lobby.checkLobby();		
		lobby.balanceTeams();
		/*
		lobby.setLobbyAndTeamsHere();
		lobby.checkTeam1();
		lobby.checkTeam2();
		lobby.teamPoints();
*/
		lobby.message();
		writeFile = new WriteFile();
		while(loop==0) 
			
		{	
			i = lobby.matchResult();		
			if(i==0) 
			{	
				
				writeFile.updateMapStats(lobby.getAllGamers());
				if(a!=0 || b!=0) writeFile.updateFile_archiwum(lobby.getTeam1(), lobby.getTeam2(), a, b, lobby.getGameServer());
				writeFile.updateFile_all_data(lobby.getAllGamers());
				loop++;
				lobby.scannerClose();		
				writeFile.closeWriting();				
			}
			
			
			else if((i>=10 && i<=16) || (i>=20 && i<=26)) {
				map_played=lobby.mapPlayed();
				if(i>=10 && i<=16) a++;
				if(i>=20 && i<=26) b++;
				lobby.increasePoints(i, map_played, a-b);
				writeFile.updateGameScores(lobby.getAllGamers(), lobby.getTeam1(), lobby.getTeam2(), i, map_played, lobby.getGameServer()) ;

			}			
			else if(i==3) {
				writeFile.updateFile_archiwum(lobby.getTeam1(), lobby.getTeam2(), a, b, lobby.getGameServer());
				a=0; b=0;
				lobby.setLobbyOwn();
				lobby.checkTeam1();
				lobby.checkTeam2();
				if(!lobby.checkTeamBalance()) {					
					lobby.balanceTeams();
					
				}				
					lobby.message();			
			}
			/*
			else if(i==9) {
				loop++;				
			}
			
			else if(i==8)
			{
				lobby.setLobby();
				lobby.setLobbyMmrTitansWinrate();
				lobby.checkLobby();
				lobby.checkAllGamers();
				lobby.balanceTeams();
			}
			else if(i==90)
			{
				lobby.setLobby();
				lobby.setAllGamers();
				lobby.setLobbyMmrTitansWinrate();
				lobby.checkLobby();
				lobby.checkAllGamers();
				lobby.balanceTeams();
			}
			
			else if(i==4) {
				lobby.checkLobby();
			}
			else if(i==5) {
				lobby.checkAllGamers();
			} */
			else {
				System.out.println("error");
			}
		}
		System.out.println("thanks for gaming");
		System.exit(0);
		
	}

} 
