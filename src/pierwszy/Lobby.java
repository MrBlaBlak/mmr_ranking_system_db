package pierwszy;

import java.io.File;
import java.io.FileNotFoundException;

import static java.lang.Math.*;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Lobby   {
	private Gamer[] lobby;
	private Gamer[] team1;
	private Gamer[] team2;
	private List<Gamer> allGamers;
	private Scanner inputScanner;
	private File file;
	private  Scanner fileScanner;
	private String game_server;
	
	public Lobby() throws FileNotFoundException 
	{		
		lobby = new Gamer[10];
		team1 = new Gamer[5];
		team2 = new Gamer[5];
		allGamers = new ArrayList<>();
		inputScanner = new Scanner(System.in);
		file = new File("all_data.txt");
		//file_kills = new File("kills.txt");
		
		for(int a=0;a<5;a++)
		{
			team1[a]= new Gamer();
			team2[a]= new Gamer();
		}
	}
	public void setLobby()
	{				
		for(int a=0;a<10;a++)
		   {			
			System.out.print("Gimme Gamer"+ (a+1) +" - "); 
			lobby[a]= new Gamer();
			lobby[a].setName(inputScanner.nextLine());	
		   } 
	}
	public void setLobbyAndTeamsHere()
	{	
		String[] test = new String[]{"Timo","Squishy","Zery","Naicrez","Bobby","Mitter","Haboo","Becket","Toxic","Suddi","EU"};
		for(int a=0;a<10;a++)
		   {
			lobby[a]= new Gamer();
			lobby[a].setName(test[a]);			
		   }
			game_server=test[10];
		for(int a=0;a<10;a++)
		   {
		   		for(int b=0;b<allGamers.size();b++)
		   		if(lobby[a].getName().equalsIgnoreCase(allGamers.get(b).getName()))   //allGamers.get(b).getName()
				{	
		   			lobby[a].cloneValues(allGamers.get(b));
					lobby[a].setMmr(allGamers.get(b).getMmr() - lobby[a].serverHandicap(game_server));
				} 	 
		   }
		for(int a=0;a<5;a++)
		   {
					team1[a].cloneValues(lobby[a]);
				}
		for(int a=5;a<10;a++)
		   {
					team2[a-5].cloneValues(lobby[a]);
				} 	 
		   
	}
	public void setLobbyAuto(String[] test) 
	{
		for(int a=0;a<10;a++)
		   {
			lobby[a]= new Gamer();
			lobby[a].setName(test[a]);			
		   }
			game_server=test[10];
	}
	public void setLobbyOwn(){
		for(int a=0;a<5;a++)
		   {			
			System.out.print("Gimme Team 1 Player"+ (a+1) +" - "); 
			team1[a].setName(inputScanner.nextLine());	
		   }
		for(int a=0;a<5;a++)
		   {			
			System.out.print("Gimme Team 2 Player"+ (a+1) +" - "); 
			team2[a].setName(inputScanner.nextLine());	
		   }
		for(int a=0;a<5;a++)
   		{
   			for(int b=0;b<10;b++) {   				   			
   				if(team1[a].getName().equalsIgnoreCase(lobby[b].getName()))
   				{
   					team1[a].cloneValues(lobby[b]);   					
   				} 
   				else if(team2[a].getName().equalsIgnoreCase(lobby[b].getName()))
   				{	
   					team2[a].cloneValues(lobby[b]);   					
   				}
   			}
   		}  
	}
	
	public void setAllGamers() throws IOException {
		fileScanner= new Scanner(file);
		boolean exists = file.exists();
		if(!exists) 
		{ 
			file.createNewFile();
		}
		allGamers.clear();

		while(fileScanner.hasNext())			
		{

			String str=fileScanner.nextLine();
			String[] actualValue = str.split(" ");
			allGamers.add(new Gamer(actualValue[0], Float.parseFloat(actualValue[1]), actualValue[2], actualValue[3], Integer.parseInt(actualValue[4]), Integer.parseInt(actualValue[5]), 
					Integer.parseInt(actualValue[6], 2), (actualValue[7]), Integer.parseInt(actualValue[8]), Integer.parseInt(actualValue[9]), Integer.parseInt(actualValue[10 ]),
					Integer.parseInt(actualValue[11]), Integer.parseInt(actualValue[12]), Integer.parseInt(actualValue[13]), Integer.parseInt(actualValue[14]), Integer.parseInt(actualValue[15]),
					Integer.parseInt(actualValue[16]), Integer.parseInt(actualValue[17]), Integer.parseInt(actualValue[18]), Integer.parseInt(actualValue[19]), Integer.parseInt(actualValue[20]),
					Integer.parseInt(actualValue[21]), Integer.parseInt(actualValue[22]), Integer.parseInt(actualValue[23]), Integer.parseInt(actualValue[24]), Integer.parseInt(actualValue[25]),
					Integer.parseInt(actualValue[26]), Integer.parseInt(actualValue[27]), Integer.parseInt(actualValue[28]), Integer.parseInt(actualValue[29]), Integer.parseInt(actualValue[30]),
					Integer.parseInt(actualValue[31]), Integer.parseInt(actualValue[32]), Integer.parseInt(actualValue[33]), Integer.parseInt(actualValue[34]), Integer.parseInt(actualValue[35]),
					Integer.parseInt(actualValue[36]), Integer.parseInt(actualValue[37]), Integer.parseInt(actualValue[38]), Integer.parseInt(actualValue[39]), Integer.parseInt(actualValue[40]),
					Integer.parseInt(actualValue[41]), Integer.parseInt(actualValue[42]), Integer.parseInt(actualValue[43]), Integer.parseInt(actualValue[44]), Integer.parseInt(actualValue[45]),
					Integer.parseInt(actualValue[46]), Integer.parseInt(actualValue[47]), Integer.parseInt(actualValue[48]), Integer.parseInt(actualValue[49]), Integer.parseInt(actualValue[50]),
					Integer.parseInt(actualValue[51]), Integer.parseInt(actualValue[52]), Integer.parseInt(actualValue[53]), Integer.parseInt(actualValue[54]), Integer.parseInt(actualValue[55]),
					Integer.parseInt(actualValue[56]), Integer.parseInt(actualValue[57]), Integer.parseInt(actualValue[58]), Integer.parseInt(actualValue[59]), Integer.parseInt(actualValue[60]),
					Integer.parseInt(actualValue[61])));
		}
		fileScanner.close();

	}
	public void setLobbyMmrTitansWinrate() {
		for(int a=0;a<10;a++)
		   {
		   		for(int b=0;b<allGamers.size();b++)
		   		if(lobby[a].getName().equalsIgnoreCase(allGamers.get(b).getName()))   //allGamers.get(b).getName()
				{	
		   			lobby[a].cloneValues(allGamers.get(b));
					lobby[a].setMmr(allGamers.get(b).getMmr() - lobby[a].serverHandicap(game_server));
				} 	 
		   }
	}
	

	public void balanceTeams() {
		float sum=checkPerfectBalance();   
		int   spr5=0, d=0; 
		float  licznik=0, test=0, best=0, bestd=1000;
		for(int i=1023;i>0;i--) 
		   {  
				
				  for(int k=0;k<10;++k)
				  {
					  if(((i>>k)&1)==1) 
					  {
					  	licznik=licznik+lobby[k].getMmr(); 
						spr5++;
					  }
				  }			   	
				  test= abs(licznik-sum);
				  if(test<bestd && spr5==5) 
				  {
				  	best = licznik;
				  	bestd = test;
				  	for(int b=0;b<10;++b)
				  	{
				  		if(((i>>b)&1)==1) 
					  	{
				  			team1[d].cloneValues(lobby[b]);										
							d++;
					  	}
				  	}				
				  }
			   licznik=0;
			   spr5=0;
			   d=0;
		   }
		System.out.println("team nr1 points - "+ Math.round(best*10)/10f + "\n"); 
		   checkTeam1();
		   int test2=0, m=0;
		   float  best2=0;
		   for(int c=0;c<10;c++)
		   {
		   		for(int d1=0;d1<5;d1++)
				   {
				   		if(lobby[c].getName()==team1[d1].getName()) test2++;
				   }
				   if(test2==0) 
				   {	
					    team2[m].cloneValues(lobby[c]);						
						best2=best2+team2[m].getMmr();   
		   				m++;
				   }
		   		test2=0;  	
		   }  
		   System.out.println("team nr2 points - "+ Math.round(best2*10)/10f + "\n");
		   checkTeam2();		   		   
	}
	public float matchResult() {
		System.out.print("Score: ");

		String result = inputScanner.nextLine();		
		float i=Float.parseFloat(result); 		
		return i;				
	}
	public String mapPlayed() {
		System.out.print("Map: ");

		String map = inputScanner.nextLine();				
		return map;				
	}
	
		
	public float checkPerfectBalance() {
		float sum=0;
		for(Gamer a : lobby)
		{
			sum = sum + a.getMmr(); 
		}
		   sum=sum/2;
		   System.out.println("perfect balance is - "+ Math.round(sum*10)/10f + "\n");
		   return sum;
	}
	public boolean checkTeamBalance(){
		float sum=0, sum2=0;
		boolean balanced= true;
		for(Gamer a : team1)
		{
			sum = sum + a.getMmr(); 
		}
		sum=Math.round(sum*10)/10;
		System.out.println("team nr1 points - "+ sum + "\n");
		for(Gamer a : team2)
		{
			sum2 = sum2 + a.getMmr(); 
		}
		sum2=Math.round(sum2*10)/10;
		System.out.println("team nr2 points - "+ sum2 + "\n");
		if(abs(sum-sum2)>80) {
			System.out.println("Teams are not balanced, gamers mmr is not gonna change");
			balanced = false;
		}
		return 	balanced;	
	}
	
	public void checkLobby()
	{
		for(Gamer a : lobby)
		{
			System.out.print(a.getName()+ " - ");
			System.out.print(a.getMmr()+", ");
		} 
		System.out.println("lobby checked");
	}
	
	public void checkAllGamers() 
	{
		for(Gamer a : allGamers)
		{
			System.out.print(a.getName()+ " - ");
			System.out.print(a.getMmr()+", ");
		}
		System.out.println("all gamers checked");
	}
	public void checkTeam1()
	{
		for(Gamer a : team1)
		{
			System.out.println(a.getName() + " - " + a.getMmr() + " - " + a.getTitan() + " - " + a.getTitan2()+ " - handicap -" + a.serverHandicap(game_server));	
		}
		System.out.println("team1 checked \n");
	}
	public void checkTeam2()
	{
		for(Gamer a : team2)
		{
			System.out.println(a.getName() + " - " + a.getMmr() + " - " + a.getTitan() + " - " + a.getTitan2()+ " - handicap -" + a.serverHandicap(game_server));
		} 
		System.out.println("team2 checked \n");
	}
	public void teamPoints()
	{
		float score1=0, score2=0;
		for(Gamer a : team1) {
			score1+=a.getMmr();
		}
		for(Gamer a : team2) {
			score2+=a.getMmr();
		}
		System.out.println("team nr1 points - "+ Math.round(score1*10)/10f + "\n");
		System.out.println("team nr2 points - "+ Math.round(score2*10)/10f + "\n");
	}

	public void increasePoints(float score, String map_played, int roznica_wynikow)
	{
		String result, result2, result_c, result2_c;
		int p=0, streak=0, streak2=0, changeT1=0, changeT2=0;
		float points=0, points2=0;
		int whoWon=(int)(score/10);
		for(int i=0;i<5;i++)
		{	
			int countDown=team1[i].getLastTen();
			int countDown2=team2[i].getLastTen();
			
			for(int a=0;a<10;a++)
			{ 
				if ((countDown & 1 )== 1) streak++; 
				countDown=countDown>>1;
				if ((countDown2 & 1 )== 1) streak2++; 
				countDown2=countDown2>>1;
			}
			System.out.print(team1[i].getName() + " - number of kills: " );
			result = inputScanner.nextLine();
			System.out.print("number of caps " );
			result_c = inputScanner.nextLine();

			System.out.print(team2[i].getName() + " - number of kills: " );
			result2 = inputScanner.nextLine();
			System.out.print("number of caps " );
			result2_c = inputScanner.nextLine();

			int t1_kills=Integer.parseInt(result);
			int t2_kills=Integer.parseInt(result2);
			int t1_caps=Integer.parseInt(result_c);
			int t2_caps=Integer.parseInt(result2_c);


			team1[i].setTotalKills(team1[i].getTotalKills()+t1_kills);
			team2[i].setTotalKills(team2[i].getTotalKills()+t2_kills);
			team1[i].setTotalGames(team1[i].getTotalGames()+1);
			team2[i].setTotalGames(team2[i].getTotalGames()+1);
			team1[i].setTotalCaps(team1[i].getTotalCaps()+t1_caps);
			team2[i].setTotalCaps(team2[i].getTotalCaps()+t2_caps);


			if(t1_kills>team1[i].getBestTotalKill()) team1[i].setBestTotalKill(t1_kills);
			if(t2_kills>team2[i].getBestTotalKill()) team2[i].setBestTotalKill(t2_kills);

			if(t1_caps>team1[i].getTotalBestCap()) team1[i].setTotalBestCap(t1_caps);
			if(t2_caps>team2[i].getTotalBestCap()) team2[i].setTotalBestCap(t2_caps);

			//change map total_kills, map total_games, map best kill_score
			switch (map_played) {
				case "boomtown":
					team1[i].setBoomKills(team1[i].getBoomKills()+t1_kills); team2[i].setBoomKills(team2[i].getBoomKills()+t2_kills);
					team1[i].setBoomCaps(team1[i].getBoomCaps()+t1_caps); team2[i].setBoomCaps(team2[i].getBoomCaps()+t2_caps);
					team1[i].setBoomGames(team1[i].getBoomGames()+1); team2[i].setBoomGames(team2[i].getBoomGames()+1);
					if(t1_kills>team1[i].getBoomBestKill()) team1[i].setBoomBestKill(t1_kills);
					if(t2_kills>team2[i].getBoomBestKill()) team2[i].setBoomBestKill(t2_kills);
					if(t1_caps>team1[i].getBoomBestCap()) team1[i].setBoomBestCap(t1_caps);
					if(t2_caps>team2[i].getBoomBestCap()) team2[i].setBoomBestCap(t2_caps);
					break;
				case "exo":
					team1[i].setExoKills(team1[i].getExoKills()+t1_kills); team2[i].setExoKills(team2[i].getExoKills()+t2_kills);
					team1[i].setExoCaps(team1[i].getExoCaps()+t1_caps); team2[i].setExoCaps(team2[i].getExoCaps()+t2_caps);
					team1[i].setExoGames(team1[i].getExoGames()+1); team2[i].setExoGames(team2[i].getExoGames()+1);
					if(t1_kills>team1[i].getExoBestKill()) team1[i].setExoBestKill(t1_kills);
					if(t2_kills>team2[i].getExoBestKill()) team2[i].setExoBestKill(t2_kills);
					if(t1_caps>team1[i].getExoBestCap()) team1[i].setExoBestCap(t1_caps);
					if(t2_caps>team2[i].getExoBestCap()) team2[i].setExoBestCap(t2_caps);
					break;
				case "eden":
					team1[i].setEdenKills(team1[i].getEdenKills()+t1_kills); team2[i].setEdenKills(team2[i].getEdenKills()+t2_kills);
					team1[i].setEdenCaps(team1[i].getEdenCaps()+t1_caps); team2[i].setEdenCaps(team2[i].getEdenCaps()+t2_caps);
					team1[i].setEdenGames(team1[i].getEdenGames()+1); team2[i].setEdenGames(team2[i].getEdenGames()+1);
					if(t1_kills>team1[i].getEdenBestKill()) team1[i].setEdenBestKill(t1_kills);
					if(t2_kills>team2[i].getEdenBestKill()) team2[i].setEdenBestKill(t2_kills);
					if(t1_caps>team1[i].getEdenBestCap()) team1[i].setEdenBestCap(t1_caps);
					if(t2_caps>team2[i].getEdenBestCap()) team2[i].setEdenBestCap(t2_caps);
					break;
				case "drydock":
					team1[i].setDrydockKills(team1[i].getDrydockKills()+t1_kills); team2[i].setDrydockKills(team2[i].getDrydockKills()+t2_kills);
					team1[i].setDryCaps(team1[i].getDryCaps()+t1_caps); team2[i].setDryCaps(team2[i].getDryCaps()+t2_caps);
					team1[i].setDryGames(team1[i].getDryGames()+1); team2[i].setDryGames(team2[i].getDryGames()+1);
					if(t1_kills>team1[i].getDrydockBestKill()) team1[i].setDrydockBestKill(t1_kills);
					if(t2_kills>team2[i].getDrydockBestKill()) team2[i].setDrydockBestKill(t2_kills);
					if(t1_caps>team1[i].getDryBestCap()) team1[i].setDryBestCap(t1_caps);
					if(t2_caps>team2[i].getDryBestCap()) team2[i].setDryBestCap(t2_caps);

					break;
				case "angel":
					team1[i].setAngelKills(team1[i].getAngelKills()+t1_kills); team2[i].setAngelKills(team2[i].getAngelKills()+t2_kills);
					team1[i].setAngelCaps(team1[i].getAngelCaps()+t1_caps); team2[i].setAngelCaps(team2[i].getAngelCaps()+t2_caps);
					team1[i].setAngelGames(team1[i].getAngelGames()+1); team2[i].setAngelGames(team2[i].getAngelGames()+1);
					if(t1_kills>team1[i].getAngelBestKill()) team1[i].setAngelBestKill(t1_kills);
					if(t2_kills>team2[i].getAngelBestKill()) team2[i].setAngelBestKill(t2_kills);
					if(t1_caps>team1[i].getAngelBestCap()) team1[i].setAngelBestCap(t1_caps);
					if(t2_caps>team2[i].getAngelBestCap()) team2[i].setAngelBestCap(t2_caps);
					break;
				case "colony":
					team1[i].setColonyKills(team1[i].getColonyKills()+t1_kills); team2[i].setColonyKills(team2[i].getColonyKills()+t2_kills);
					team1[i].setColonyCaps(team1[i].getColonyCaps()+t1_caps); team2[i].setColonyCaps(team2[i].getColonyCaps()+t2_caps);
					team1[i].setColonyGames(team1[i].getColonyGames()+1); team2[i].setColonyGames(team2[i].getColonyGames()+1);
					if(t1_kills>team1[i].getColonyBestKill()) team1[i].setColonyBestKill(t1_kills);
					if(t2_kills>team2[i].getColonyBestKill()) team2[i].setColonyBestKill(t2_kills);
					if(t1_caps>team1[i].getColonyBestCap()) team1[i].setColonyBestCap(t1_caps);
					if(t2_caps>team2[i].getColonyBestCap()) team2[i].setColonyBestCap(t2_caps);
					break;
				case "glitch":
					team1[i].setGlitchKills(team1[i].getGlitchKills()+t1_kills); team2[i].setGlitchKills(team2[i].getGlitchKills()+t2_kills);
					team1[i].setGlitchCaps(team1[i].getGlitchCaps()+t1_caps); team2[i].setGlitchCaps(team2[i].getGlitchCaps()+t2_caps);
					team1[i].setGlitchGames(team1[i].getGlitchGames()+1); team2[i].setGlitchGames(team2[i].getGlitchGames()+1);
					if(t1_kills>team1[i].getGlitchBestKill()) team1[i].setGlitchBestKill(t1_kills);
					if(t2_kills>team2[i].getGlitchBestKill()) team2[i].setGlitchBestKill(t2_kills);
					if(t1_caps>team1[i].getGlitchBestCap()) team1[i].setGlitchBestCap(t1_caps);
					if(t2_caps>team2[i].getGlitchBestCap()) team2[i].setGlitchBestCap(t2_caps);
					break;
				default: {
					System.out.println("wprowadzono z�� map�");
					break;
				}
			}

			if(whoWon==1) {
				changeT1=1;
				changeT2=0;
				if(score%10 != 0) {
					team1[i].setLastTen((team1[i].getLastTen() >> 1) | 512);
					team2[i].setLastTen(team2[i].getLastTen() >> 1);
				}
				//change map total_wins, map total_losses
				switch (map_played) {
				case "boomtown":
					team1[i].setBoomWins(team1[i].getBoomWins()+1);
					team2[i].setBoomLosses(team2[i].getBoomLosses()+1);
					break;
				case "exo":
					team1[i].setExoWins(team1[i].getExoWins()+1);
					team2[i].setExoLosses(team2[i].getExoLosses()+1);
					break;
				case "eden":
					team1[i].setEdenWins(team1[i].getEdenWins()+1);
					team2[i].setEdenLosses(team2[i].getEdenLosses()+1);
					break;
				case "drydock":
					team1[i].setDryWins(team1[i].getDryWins()+1);
					team2[i].setDryLosses(team2[i].getDryLosses()+1);
					break;
				case "angel":
					team1[i].setAngelWins(team1[i].getAngelWins()+1);
					team2[i].setAngelLosses(team2[i].getAngelLosses()+1);
					break;
				case "colony":
					team1[i].setColonyWins(team1[i].getColonyWins()+1);
					team2[i].setColonyLosses(team2[i].getColonyLosses()+1);
					break;
				case "glitch":
					team1[i].setGlitchWins(team1[i].getGlitchWins()+1);
					team2[i].setGlitchLosses(team2[i].getGlitchLosses()+1);
					break;
				default: {
				break;
				}
				}
			}
			else if(whoWon==2) {
				changeT1=0;
				changeT2=1;
				if(score%10 != 0) {
					team1[i].setLastTen(team1[i].getLastTen() >> 1);
					team2[i].setLastTen((team2[i].getLastTen() >> 1) | 512);
				}
				//change map total_wins, map total_losses
				switch (map_played) {
				case "boomtown":
					team2[i].setBoomWins(team2[i].getBoomWins()+1);
					team1[i].setBoomLosses(team1[i].getBoomLosses()+1);
					break;
				case "exo":
					team2[i].setExoWins(team2[i].getExoWins()+1);
					team1[i].setExoLosses(team1[i].getExoLosses()+1);
					break;
					case "eden":
					team2[i].setEdenWins(team2[i].getEdenWins()+1);
					team1[i].setEdenLosses(team1[i].getEdenLosses()+1);
					break;
				case "drydock":
					team2[i].setDryWins(team2[i].getDryWins()+1);
					team1[i].setDryLosses(team1[i].getDryLosses()+1);
					break;
				case "angel":
					team2[i].setAngelWins(team2[i].getAngelWins()+1);
					team1[i].setAngelLosses(team1[i].getAngelLosses()+1);
					break;
				case "colony":
					team2[i].setColonyWins(team2[i].getColonyWins()+1);
					team1[i].setColonyLosses(team1[i].getColonyLosses()+1);
					break;
				case "glitch":
					team2[i].setGlitchWins(team2[i].getGlitchWins()+1);
					team1[i].setGlitchLosses(team1[i].getGlitchLosses()+1);
					break;
				default: {
				break;
				}
				}
			}

			if((streak==7 || streak==8) && whoWon==1) points=1.2f;
			else if((streak==2 || streak==3) && whoWon==2) points=-1.2f;
			else if(streak>1 && whoWon==2) points=-1;
			else if(streak>=9 && whoWon==1) points=1.5f;
			else if(streak<=1 && whoWon==2) points=-1.5f;
			else if(streak<9 && whoWon==1) points=1;

			if((streak2==7 || streak2==8) && whoWon==2) points2=1.2f;
			else if((streak2==2 || streak2==3) && whoWon==1) points2=-1.2f;
			else if(streak2>1 && whoWon==1) points2=-1;
			else if(streak2>=9 && whoWon==2) points2=1.5f;
			else if(streak2<=1 && whoWon==1) points2=-1.5f;
			else if(streak2<9 && whoWon==2) points2=1;
/* placement matches removes as for now
			if(team1[i].getWins()+team1[i].getLosses()<10) points=points/abs(points)*3;
			if(team2[i].getWins()+team2[i].getLosses()<10) points2=points2/abs(points2)*3;
*/

				if (whoWon == 1) {
					points = points + (score % 10) / 5 - 0.2f;
					points2 = points2 - (score % 10) / 5 + 0.2f;

					if(score%10 == 0) {points = 0.5f;
						points2 = -0.5f;}
				}
				if (whoWon == 2) {
					points2 = points2 + (score  % 10) / 5 - 0.2f;
					points = points - (score  % 10) / 5 + 0.2f;

					if(score%10 == 0) {points = -0.5f;
						points2 = 0.5f;}
				}
			if (roznica_wynikow > 2) {
				points /= 2;
				points2 /= 2;
			}

			team1[i].setMmr(team1[i].getMmr()+points);
			team2[i].setMmr(team2[i].getMmr()+points2);
			team1[i].setWinsAndLosses(team1[i].getWins()+changeT1, team1[i].getLosses()+changeT2);
			team2[i].setWinsAndLosses(team2[i].getWins()+changeT2, team2[i].getLosses()+changeT1);

			streak=0; streak2=0;
		}
		for(int i=0;i<5;i++)
		{
			lobby[p].cloneValues(team1[i]);
			p++;
			lobby[p].cloneValues(team2[i]);
			p++;
		}
		for(int a=0;a<10;a++)
	    {
	   		for(int b=0;b<allGamers.size();b++)
	   		if(lobby[a].getName().equalsIgnoreCase(allGamers.get(b).getName()))
			{
	   			allGamers.get(b).cloneValues(lobby[a]);
				allGamers.get(b).setMmr(Math.round((lobby[a].getMmr())*10)/10f+lobby[a].serverHandicap(game_server));
			}
	    }
	}
	public List<Gamer> getAllGamers() {
		return this.allGamers;
	}
	public Gamer[] getLobby() {
		return this.lobby;
	}
	public Gamer[] getTeam1() {
		return this.team1;
	}
	public Gamer[] getTeam2() {
		return this.team2;
	}
	 public String getGameServer(){
		return this.game_server;
	 }
	public void scannerClose() {
		fileScanner.close();
		inputScanner.close();
	}

	public void message() {
		System.out.println("If you want to: \n -claim team1 win, type - 1x \n -claim team 2 win, type - 2x(x is number of flag difference) \n after putting a score type a map in next line \n -create your own teams(same players, keep results), type - 3 \n -check lobby, type - 4 \n -check allGamers, type - 5 \n -leave the programm, type - 0 \n -leave the program without saving data, type - 9  \n -start new teams(new players, keep results), type - 8 \n -cancel matches results and start new teams(new teams forget results), type - 90");
	}
	public void restart_stats(){
		for(int i=0;i<allGamers.size();i++)
		{
			allGamers.get(i).setBoomKills(allGamers.get(i).getBoomKills()-20);
			allGamers.get(i).setExoKills(allGamers.get(i).getExoKills()-20);
			allGamers.get(i).setEdenKills(allGamers.get(i).getEdenKills()-20);
			allGamers.get(i).setDrydockKills(allGamers.get(i).getDrydockKills()-20);
			allGamers.get(i).setAngelKills(allGamers.get(i).getAngelKills()-20);
			allGamers.get(i).setColonyKills(allGamers.get(i).getColonyKills()-20);
			allGamers.get(i).setGlitchKills(allGamers.get(i).getGlitchKills()-20);
			allGamers.get(i).setTotalKills(allGamers.get(i).getTotalKills()-20);

			allGamers.get(i).setBoomGames(allGamers.get(i).getBoomGames()-1);
			allGamers.get(i).setExoGames(allGamers.get(i).getExoGames()-1);
			allGamers.get(i).setEdenGames(allGamers.get(i).getEdenGames()-1);
			allGamers.get(i).setDryGames(allGamers.get(i).getDryGames()-1);
			allGamers.get(i).setAngelGames(allGamers.get(i).getAngelGames()-1);
			allGamers.get(i).setColonyGames(allGamers.get(i).getColonyGames()-1);
			allGamers.get(i).setGlitchGames(allGamers.get(i).getGlitchGames()-1);
			allGamers.get(i).setTotalGames(allGamers.get(i).getTotalGames()-1);
		}
	}
	
}
