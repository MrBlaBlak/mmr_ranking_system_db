package pierwszy;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class WriteFile {
	
	private PrintWriter zapis, zapis2, zapis_all_data, zapis_kills, zapis_caps;

	private FileWriter zapis_archiwum2;
	private FileWriter zapis_map_stats;	
	private FileWriter zapis3;
	
	public WriteFile() throws IOException {
	
	zapis3 = new FileWriter("archiwum.txt", true);
	
	zapis_archiwum2 = new FileWriter("archiwum2.txt", true);
	
	}
	
    public void updateFile_all_data(List<Gamer> allGamers) throws IOException {
    	
    	zapis = new PrintWriter("plik.txt");
        zapis2 = new PrintWriter("plik2.csv");
    	zapis_all_data = new PrintWriter("all_data.txt");
		zapis_kills = new PrintWriter("kills.txt");
		zapis_caps = new PrintWriter("caps.txt");
    	Collections.sort(allGamers, new SortByMmr());
    	int wins=0, losses=0;
   		for(int i=0;i<allGamers.size();i++)
   		{
			wins=allGamers.get(i).getWins();
			losses=allGamers.get(i).getLosses();

			zapis_kills.println(allGamers.get(i).getName() + ","
					+ allGamers.get(i).getBoomGames() + "," +  allGamers.get(i).getBoomBestKill() + "," + Math.round((float)allGamers.get(i).getBoomKills()/ allGamers.get(i).getBoomGames()*100)/100f + ","
					+ allGamers.get(i).getExoGames() + "," +  allGamers.get(i).getExoBestKill() + "," + Math.round((float)allGamers.get(i).getExoKills()/ allGamers.get(i).getExoGames()*100)/100f + ","
					+ allGamers.get(i).getEdenGames() + "," +  allGamers.get(i).getEdenBestKill() + "," + Math.round((float)allGamers.get(i).getEdenKills()/ allGamers.get(i).getEdenGames()*100)/100f + ","
					+ allGamers.get(i).getDryGames() + "," +  allGamers.get(i).getDrydockBestKill() + "," + Math.round((float)allGamers.get(i).getDrydockKills()/ allGamers.get(i).getDryGames()*100)/100f + ","
					+ allGamers.get(i).getAngelGames() + "," +  allGamers.get(i).getAngelBestKill() + "," + Math.round((float)allGamers.get(i).getAngelKills()/ allGamers.get(i).getAngelGames()*100)/100f + ","
					+ allGamers.get(i).getColonyGames() + "," +  allGamers.get(i).getColonyBestKill() + "," + Math.round((float)allGamers.get(i).getColonyKills()/ allGamers.get(i).getColonyGames()*100)/100f + ","
					+ allGamers.get(i).getGlitchGames() + "," +  allGamers.get(i).getGlitchBestKill() + "," + Math.round((float)allGamers.get(i).getGlitchKills()/ allGamers.get(i).getGlitchGames()*100)/100f + ","
					+ allGamers.get(i).getTotalGames() + "," +  allGamers.get(i).getBestTotalKill() + "," + Math.round((float)allGamers.get(i).getTotalKills()/ allGamers.get(i).getTotalGames()*100)/100f
			);
			zapis_caps.println(allGamers.get(i).getName() + ","
					+ allGamers.get(i).getBoomGames() + "," +  allGamers.get(i).getBoomBestCap() + "," + Math.round((float)allGamers.get(i).getBoomCaps()/ allGamers.get(i).getBoomGames()*100)/100f + ","
					+ allGamers.get(i).getExoGames() + "," +  allGamers.get(i).getExoBestCap() + "," + Math.round((float)allGamers.get(i).getExoCaps()/ allGamers.get(i).getExoGames()*100)/100f + ","
					+ allGamers.get(i).getEdenGames() + "," +  allGamers.get(i).getEdenBestCap() + "," + Math.round((float)allGamers.get(i).getEdenCaps()/ allGamers.get(i).getEdenGames()*100)/100f + ","
					+ allGamers.get(i).getDryGames() + "," +  allGamers.get(i).getDryBestCap() + "," + Math.round((float)allGamers.get(i).getDryCaps()/ allGamers.get(i).getDryGames()*100)/100f + ","
					+ allGamers.get(i).getAngelGames() + "," +  allGamers.get(i).getAngelBestCap() + "," + Math.round((float)allGamers.get(i).getAngelCaps()/ allGamers.get(i).getAngelGames()*100)/100f + ","
					+ allGamers.get(i).getColonyGames() + "," +  allGamers.get(i).getColonyBestCap() + "," + Math.round((float)allGamers.get(i).getColonyCaps()/ allGamers.get(i).getColonyGames()*100)/100f + ","
					+ allGamers.get(i).getGlitchGames() + "," +  allGamers.get(i).getGlitchBestCap() + "," + Math.round((float)allGamers.get(i).getGlitchCaps()/ allGamers.get(i).getGlitchGames()*100)/100f + ","
					+ allGamers.get(i).getTotalGames() + "," +  allGamers.get(i).getTotalBestCap() + "," + Math.round((float)allGamers.get(i).getTotalCaps()/ allGamers.get(i).getTotalGames()*100)/100f
			);

   			zapis.println(allGamers.get(i).getName() + " " + String.valueOf(allGamers.get(i).getMmr()) + " " + 
   		allGamers.get(i).getTitan()+ " " + allGamers.get(i).getTitan2()+ " " + allGamers.get(i).getWins()+ " " + 
   		allGamers.get(i).getLosses()+ " " + Integer.toBinaryString(allGamers.get(i).getLastTen()) + " " + allGamers.get(i).getServer()); 
   			
   			zapis2.println(allGamers.get(i).getName() + "," + String.valueOf(allGamers.get(i).getMmr()) + "," + 
   		allGamers.get(i).getTitan()+ "," + allGamers.get(i).getTitan2()+ "," + allGamers.get(i).getWins()+ "," + 
   		allGamers.get(i).getLosses()+ "," + Integer.toBinaryString(allGamers.get(i).getLastTen())+ "," + allGamers.get(i).getServer());
   		
   			zapis_all_data.println(allGamers.get(i).getName() + " " + String.valueOf(allGamers.get(i).getMmr()) + " "
					+ allGamers.get(i).getTitan()+ " " + allGamers.get(i).getTitan2()+ " " + wins + " " + losses + " "
					+ Integer.toBinaryString(allGamers.get(i).getLastTen())+ " " + allGamers.get(i).getServer() + " "
   			   		+ allGamers.get(i).getBoomWins()+ " " + allGamers.get(i).getBoomLosses()+ " "
					+ allGamers.get(i).getBoomKills() + " " + allGamers.get(i).getBoomBestKill() + " "
					+ allGamers.get(i).getExoWins()+ " " + allGamers.get(i).getExoLosses()+ " "
					+ allGamers.get(i).getExoKills() + " " + allGamers.get(i).getExoBestKill() + " "
					+ allGamers.get(i).getEdenWins()+ " " + allGamers.get(i).getEdenLosses()+ " "
					+ allGamers.get(i).getEdenKills() + " " + allGamers.get(i).getEdenBestKill() + " "
					+ allGamers.get(i).getDryWins()+ " " + allGamers.get(i).getDryLosses()+ " "
					+ allGamers.get(i).getDrydockKills() + " " + allGamers.get(i).getDrydockBestKill() + " "
					+ allGamers.get(i).getAngelWins()+ " " + allGamers.get(i).getAngelLosses()+ " "
					+ allGamers.get(i).getAngelKills() + " " + allGamers.get(i).getAngelBestKill() + " "
					+ allGamers.get(i).getColonyWins()+ " " + allGamers.get(i).getColonyLosses()+ " "
					+ allGamers.get(i).getColonyKills() + " " + allGamers.get(i).getColonyBestKill() + " "
			   		+ allGamers.get(i).getGlitchWins()+ " " + allGamers.get(i).getGlitchLosses()+ " "
					+ allGamers.get(i).getGlitchKills() + " " + allGamers.get(i).getGlitchBestKill() + " "
			   		+ allGamers.get(i).getBoomGames()+ " " + allGamers.get(i).getExoGames()+ " " + allGamers.get(i).getEdenGames()+ " " + allGamers.get(i).getDryGames()+ " "
					+ allGamers.get(i).getAngelGames()+ " " + allGamers.get(i).getColonyGames()+ " " + allGamers.get(i).getGlitchGames()+ " " + allGamers.get(i).getTotalGames()+ " "
					+ allGamers.get(i).getTotalKills()+ " " + allGamers.get(i).getBestTotalKill() + " "
					+ allGamers.get(i).getBoomCaps() + " "  + allGamers.get(i).getExoCaps() + " "
					+ allGamers.get(i).getEdenCaps() + " " + allGamers.get(i).getDryCaps() + " "
					+ allGamers.get(i).getAngelCaps() + " " +  allGamers.get(i).getColonyCaps() + " "
					+ allGamers.get(i).getGlitchCaps() + " " + allGamers.get(i).getTotalCaps()+ " "
					+ allGamers.get(i).getBoomBestCap() + " " + allGamers.get(i).getExoBestCap() + " "
					+ allGamers.get(i).getEdenBestCap() + " " + allGamers.get(i).getDryBestCap() + " "
					+ allGamers.get(i).getAngelBestCap() + " " + allGamers.get(i).getColonyBestCap() + " "
					+ allGamers.get(i).getGlitchBestCap() + " " + allGamers.get(i).getTotalBestCap()

			);
			// 8bw 9bl !%10 !ka11 12kt 13kb 14 15 !15 !16 17 18 19 !20 !21 22 23 24 !25 !26 27 28 29 !30 !31 32 33 34 !35 !36 37 38 39 !40 !41 42
   		}
    }
    public void updateFile_archiwum(Gamer[] team1, Gamer[] team2, int a, int b, String server) throws IOException{
    	Date today=new Date();   		
   		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");  
   		String strToday = dateFormat.format(today);  
   		zapis3.write(strToday+ " ");
   		for(int i=0;i<5;i++)
   		{
   			zapis3.write(team1[i].getName() + " ");
   		}
   		zapis3.write("  || " +a+ ":" +b+ " ||  ");  		
   		for(int i=0;i<5;i++)
   		{
   			zapis3.write(team2[i].getName() + " ");
   		}
		zapis3.write(server);
   		zapis3.write("\n");
   		zapis3.flush();
   		
    }
    public void updateGameScores(List<Gamer> allGamers, Gamer[] team1, Gamer[] team2, float score, String map_played, String server) throws IOException {
    		
		int advantage = (int)score%10;
		for(int i=0;i<5;i++)
   		{
   			zapis_archiwum2.write("\""+team1[i].getName()+ "\"" + ", ");
   		}
		if(score>=20) zapis_archiwum2.write("  || -> "+advantage+" ||  "+map_played+"  ||  ");
		if(score<20) zapis_archiwum2.write("  || <- "+advantage+" ||  "+map_played+"  ||  ");
   		 		
   		for(int i=0;i<5;i++)
   		{
   			zapis_archiwum2.write("\""+team2[i].getName()+ "\"" + ", ");
   		}
		zapis_archiwum2.write(server);
   		zapis_archiwum2.write("\n");
   		zapis_archiwum2.flush();		
	}
    public void updateMapStats(List<Gamer> allGamers) throws IOException {
    	zapis_map_stats = new FileWriter("map_stats.txt", false);
    	for(int i=0;i<allGamers.size();i++)
    		{   			
    			zapis_map_stats.write(allGamers.get(i).getName() +  "," +  allGamers.get(i).getWins()+ "," + allGamers.get(i).getLosses()+ ","
						+ Math.round((float)allGamers.get(i).getWins()/((float)allGamers.get(i).getWins()+(float)allGamers.get(i).getLosses())*100)+ "%"+ ","
    					+ allGamers.get(i).getBoomWins()+ "," + allGamers.get(i).getBoomLosses()+ "," 
       			   		+ Math.round((float)allGamers.get(i).getBoomWins()/(allGamers.get(i).getBoomWins() + allGamers.get(i).getBoomLosses())*100)+ "%"+ "," 
       			   		+ allGamers.get(i).getExoWins()+ "," + allGamers.get(i).getExoLosses()+ "," 
       			   		+ Math.round((float)allGamers.get(i).getExoWins()/(allGamers.get(i).getExoWins() + allGamers.get(i).getExoLosses())*100)+ "%"+ ","
    			   		+ allGamers.get(i).getEdenWins()+ "," + allGamers.get(i).getEdenLosses()+ "," 
    			   		+ Math.round((float)allGamers.get(i).getEdenWins()/(allGamers.get(i).getEdenWins() + allGamers.get(i).getEdenLosses())*100)+ "%"+ ","
    			   		+ allGamers.get(i).getDryWins()+ "," + allGamers.get(i).getDryLosses()+ "," 
    			   		+ Math.round((float)allGamers.get(i).getDryWins()/(allGamers.get(i).getDryWins() + allGamers.get(i).getDryLosses())*100)+ "%"+ ","
    			   		+ allGamers.get(i).getAngelWins()+ "," + allGamers.get(i).getAngelLosses()+ "," 
    			   		+ Math.round((float)allGamers.get(i).getAngelWins()/(allGamers.get(i).getAngelWins() + allGamers.get(i).getAngelLosses())*100)+ "%"+ "," 
    			   		+ allGamers.get(i).getColonyWins()+ "," + allGamers.get(i).getColonyLosses()+ "," 
    			   		+ Math.round((float)allGamers.get(i).getColonyWins()/(allGamers.get(i).getColonyWins() + allGamers.get(i).getColonyLosses())*100)+ "%"+ "," 
    			   		+ allGamers.get(i).getGlitchWins()+ "," + allGamers.get(i).getGlitchLosses()+ "," 
    			   		+ Math.round((float)allGamers.get(i).getGlitchWins()/(allGamers.get(i).getGlitchWins() + allGamers.get(i).getGlitchLosses())*100)+ "%" ); 
    			zapis_map_stats.write("\n");   			
    		}
    		zapis_map_stats.flush();
    	}
    public void closeWriting() throws IOException {    	
    	zapis.close();
   		zapis2.close();
   		zapis3.close();
   		zapis_all_data.close();
   		zapis_archiwum2.close(); 
   		zapis_map_stats.close();
		   zapis_kills.close();
		zapis_caps.close();
    }
}

///95-115-135-155-175-195 5-6-7-8-10-12 EU1 EU2 EU3 EU4 EU5 EU6 
//30 27 Daire
//Tark  45 39