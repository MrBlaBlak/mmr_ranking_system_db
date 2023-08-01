package pierwszy;


public class Gamer {
	
	private float mmr;
	private String name;
	private String titan;

	private String titan2;
	private int wins;
	private int losses;
	private int lastTen;
	private String server;
	private int boom_wins, boom_losses, exo_wins, exo_losses, eden_wins, eden_losses, dry_wins, dry_losses, angel_wins,
			angel_losses, colony_wins, glitch_wins, colony_losses, glitch_losses;
	private int boom_kills, exo_kills, eden_kills, drydock_kills, angel_kills, colony_kills, glitch_kills, total_kills,
			best_boom_kill, best_exo_kill, best_eden_kill, best_drydock_kill, best_angel_kill, best_colony_kill, best_glitch_kill, best_total_kill;
	private int boom_games, exo_games, eden_games, dry_games, angel_games, colony_games,  glitch_games, total_games;
	private int boom_caps, exo_caps, eden_caps, dry_caps, angel_caps, colony_caps,  glitch_caps, total_caps,
			best_boom_cap, best_exo_cap, best_eden_cap, best_drydock_cap, best_angel_cap, best_colony_cap, best_glitch_cap, best_total_cap;

	
	public Gamer(String n, float m, String t, String t2, int w, int l, int lt, String s, int bw, int bl, int bk, int bbk, int ew, int el, int ek, int bek, int edw, int edl,
				 int edk, int bedk, int dw, int dl, int dk , int bdk, int aw, int al, int ak, int bak, int cw, int cl, int ck, int bck, int gw, int gl, int gk, int bgk, int bg,
				 int eg, int edg, int dg, int ag, int cg, int gg, int tg, int tk, int btk, int bc, int ec,int edc, int dc, int ac, int cc, int gc, int tc, int bbc, int bec,
				 int bedc, int bdc, int bac, int bcc, int bgc, int btc)
	{
		mmr=m;
		name=n;
		titan=t;
		titan2=t2;
		wins=w;
		losses=l;
		lastTen=lt;
		server=s;
		boom_wins=bw;		boom_losses=bl;		exo_wins=ew;		exo_losses=el;		eden_wins=edw;		eden_losses=edl;		dry_wins=dw;		dry_losses=dl;		angel_wins=aw;	  angel_losses=al; 
		colony_wins=cw;   colony_losses=cl;    glitch_wins=gw;    glitch_losses=gl;
		boom_kills=bk; exo_kills=ek; eden_kills=edk; drydock_kills=dk; angel_kills=ak; colony_kills=ck; glitch_kills=gk;
		best_boom_kill=bbk; best_exo_kill=bek; best_eden_kill=bedk; best_drydock_kill=bdk; best_angel_kill=bak; best_colony_kill=bck; best_glitch_kill=bgk;
		boom_games=bg; exo_games=eg; eden_games=edg; dry_games=dg; angel_games=ag; colony_games=cg;  glitch_games=gg; total_games=tg;  total_kills=tk; best_total_kill=btk;
		boom_caps=bc; exo_caps=ec; eden_caps=edc; dry_caps=dc; angel_caps=ac; colony_caps=cc;  glitch_caps=gc; total_caps=tc;
		best_boom_cap=bbc; best_exo_cap=bec; best_eden_cap=bedc; best_drydock_cap=bdc; best_angel_cap=bac; best_colony_cap=bcc; best_glitch_cap=bgc; best_total_cap=btc;
	}
	public Gamer()
	{
		mmr=570;
		name="";
		titan="??";
		titan2="??";
		wins=0;
		losses=0;
		lastTen=0;
		server="??";
		boom_wins=0;		boom_losses=0;		exo_wins=0;		exo_losses=0;		eden_wins=0;		eden_losses=0;		dry_wins=0;		dry_losses=0;		angel_wins=0;		angel_losses=0;
		colony_wins=0;   colony_losses=0;    glitch_wins=0;    glitch_losses=0;
		boom_kills=0; exo_kills=0; eden_kills=0; drydock_kills=0; angel_kills=0; colony_kills=0; glitch_kills=0;
		best_boom_kill=0; best_exo_kill=0; best_eden_kill=0; best_drydock_kill=0; best_angel_kill=0; best_colony_kill=0; best_glitch_kill=0;
		boom_games=0; exo_games=0; eden_games=0; dry_games=0; angel_games=0; colony_games=0;  glitch_games=0; total_games=0;
		best_boom_cap=0; best_exo_cap=0; best_eden_cap=0; best_drydock_cap=0; best_angel_cap=0; best_colony_cap=0; best_glitch_cap=0; best_total_cap=0;

	}
	public void cloneValues(Gamer another) {
		this.setMmr(another.getMmr());
		this.setName(another.getName());
		this.setWinsAndLosses(another.getWins(), another.getLosses());
		this.setTitan(another.getTitan(), another.getTitan2());
		this.setLastTen(another.getLastTen());
		this.setServer(another.getServer());
		this.setAngelLosses(another.getAngelLosses());
		this.setAngelWins(another.getAngelWins());
		this.setColonyLosses(another.getColonyLosses());
		this.setColonyWins(another.getColonyWins());
		this.setGlitchLosses(another.getGlitchLosses());
		this.setGlitchWins(another.getGlitchWins());
		this.setBoomLosses(another.getBoomLosses());
		this.setBoomWins(another.getBoomWins());
		this.setEdenLosses(another.getEdenLosses());
		this.setEdenWins(another.getEdenWins());
		this.setExoLosses(another.getExoLosses());
		this.setExoWins(another.getExoWins());
		this.setDryLosses(another.getDryLosses());
		this.setDryWins(another.getDryWins());
		this.setBoomKills(another.getBoomKills());
		this.setExoKills(another.getExoKills());
		this.setEdenKills(another.getEdenKills());
		this.setDrydockKills(another.getDrydockKills());
		this.setAngelKills(another.getAngelKills());
		this.setColonyKills(another.getColonyKills());
		this.setGlitchKills(another.getGlitchKills());
		this.setBoomBestKill(another.getBoomBestKill());
		this.setExoBestKill(another.getExoBestKill());
		this.setEdenBestKill(another.getEdenBestKill());
		this.setDrydockBestKill(another.getDrydockBestKill());
		this.setAngelBestKill(another.getAngelBestKill());
		this.setColonyBestKill(another.getColonyBestKill());
		this.setGlitchBestKill(another.getGlitchBestKill());
		this.setAngelGames(another.getAngelGames());
		this.setColonyGames(another.getColonyGames());
		this.setGlitchGames(another.getGlitchGames());
		this.setBoomGames(another.getBoomGames());
		this.setEdenGames(another.getEdenGames());
		this.setExoGames(another.getExoGames());
		this.setDryGames(another.getDryGames());
		this.setTotalGames(another.getTotalGames());
		this.setTotalKills(another.getTotalKills());
		this.setBestTotalKill(another.getBestTotalKill());
		this.setBoomCaps(another.getBoomCaps());
		this.setExoCaps(another.getExoCaps());
		this.setEdenCaps(another.getEdenCaps());
		this.setDryCaps(another.getDryCaps());
		this.setAngelCaps(another.getAngelCaps());
		this.setColonyCaps(another.getColonyCaps());
		this.setGlitchCaps(another.getGlitchCaps());
		this.setTotalCaps(another.getTotalCaps());
		this.setBoomBestCap(another.getBoomBestCap());
		this.setExoBestCap(another.getExoBestCap());
		this.setEdenBestCap(another.getEdenBestCap());
		this.setDryBestCap(another.getDryBestCap());
		this.setAngelBestCap(another.getAngelBestCap());
		this.setColonyBestCap(another.getColonyBestCap());
		this.setGlitchBestCap(another.getGlitchBestCap());
		this.setTotalBestCap(another.getTotalBestCap());

	}
	public void setName(String n) {
		this.name = n;
	}
	public void setMmr(float n) {
		this.mmr = n;
	}
	public void setTitan(String t, String t2) {
		titan=t;
		titan2=t2;
	}
	public void setWinsAndLosses(int w, int l) {
		wins=w;
		losses=l;
	}
	public void setLastTen(int lt) {
		lastTen=lt;
	}
	public void setServer(String s) {
		server=s;
	}
	public void setBoomWins(int n) {
		boom_wins=n;
	}
	public int getBoomWins() {
		return boom_wins;
	}
	public void setExoWins(int n) {
		exo_wins=n;
	}
	public int getExoWins() {
		return exo_wins;
	}
	public void setEdenWins(int n) {
		eden_wins=n;
	}
	public int getEdenWins() {
		return eden_wins;
	}
	public void setDryWins(int n) {
		dry_wins=n;
	}
	public int getDryWins() {
		return dry_wins;
	}
	public void setAngelWins(int n) {
		angel_wins=n;
	}
	public int getAngelWins() {
		return angel_wins;
	}
	public void setColonyWins(int n) {
		colony_wins=n;
	}
	public int getColonyWins() {
		return colony_wins;
	}
	public void setGlitchWins(int n) {
		glitch_wins=n;
	}
	public int getGlitchWins() {
		return glitch_wins;
	}
	public void setBoomLosses(int n) {
		boom_losses=n;
	}
	public int getBoomLosses() {
		return boom_losses;
	}
	public void setExoLosses(int n) {
		exo_losses=n;
	}
	public int getExoLosses() {
		return exo_losses;
	}
	public void setEdenLosses(int n) {
		eden_losses=n;
	}
	public int getEdenLosses() {
		return eden_losses;
	}
	public void setDryLosses(int n) {
		dry_losses=n;
	}
	public int getDryLosses() {
		return dry_losses;
	}
	public void setAngelLosses(int n) {
		angel_losses=n;
	}
	public int getAngelLosses() {
		return angel_losses;
	}
	public void setColonyLosses(int n) {
		colony_losses=n;
	}
	public int getColonyLosses() {
		return colony_losses;
	}
	public void setGlitchLosses(int n) {
		glitch_losses=n;
	}
	public int getGlitchLosses() {
		return glitch_losses;
	}
	public String getName() {
		return this.name;
	}
	public float getMmr() {
		return this.mmr;
	}
	public String getTitan() {
		return this.titan;
	}
	public String getTitan2() {
		return this.titan2;
	}
	public int getWins() {
		return this.wins;
	}
	public int getLosses() {
		return this.losses;
	}
	public int getLastTen() {
		return this.lastTen;
	}
	public String getServer() {
		return this.server;
	}

	public int getBoomKills() {
		return this.boom_kills;
	}
	public int getExoKills() {
		return this.exo_kills;
	}
	public int getEdenKills() {
		return this.eden_kills;
	}
	public int getDrydockKills() {
		return this.drydock_kills;
	}
	public int getAngelKills() {
		return this.angel_kills;
	}
	public int getColonyKills() {
		return this.colony_kills;
	}
	public int getGlitchKills() {
		return this.glitch_kills;
	}
	public int getTotalKills() {return total_kills;}

	public void setBoomKills(int n) {
		boom_kills=n;
	}
	public void setExoKills(int n) {
		exo_kills=n;
	}
	public void setEdenKills(int n) {
		eden_kills=n;
	}
	public void setDrydockKills(int n) {
		drydock_kills=n;
	}
	public void setAngelKills(int n) {
		angel_kills=n;
	}
	public void setColonyKills(int n) {
		colony_kills=n;
	}
	public void setGlitchKills(int n) {
		glitch_kills=n;
	}
	public void setTotalKills(int n) {total_kills=n;}

	public int getBoomBestKill() {
		return this.best_boom_kill;
	}
	public int getExoBestKill() {
		return this.best_exo_kill;
	}
	public int getEdenBestKill() {
		return this.best_eden_kill;
	}
	public int getDrydockBestKill() {
		return this.best_drydock_kill;
	}
	public int getAngelBestKill() {
		return this.best_angel_kill;
	}
	public int getColonyBestKill() {
		return this.best_colony_kill;
	}
	public int getGlitchBestKill() {
		return this.best_glitch_kill;
	}
	public int getBestTotalKill() {return best_total_kill;}

	public void setBoomBestKill(int n) {
		best_boom_kill=n;
	}
	public void setExoBestKill(int n) {
		best_exo_kill=n;
	}
	public void setEdenBestKill(int n) {
		best_eden_kill=n;
	}
	public void setDrydockBestKill(int n) {
		best_drydock_kill=n;
	}
	public void setAngelBestKill(int n) {
		best_angel_kill=n;
	}
	public void setColonyBestKill(int n) {
		best_colony_kill=n;
	}
	public void setGlitchBestKill(int n) {
		best_glitch_kill=n;
	}
	public void setBestTotalKill(int n) {best_total_kill=n;}


	public void setBoomGames(int n) {
		boom_games=n;
	}
	public int getBoomGames() {
		return boom_games;
	}
	public void setExoGames(int n) {
		exo_games=n;
	}
	public int getExoGames() {return exo_games;}
	public void setEdenGames(int n) {eden_games=n;}
	public int getEdenGames() {return eden_games;}
	public void setDryGames(int n) {dry_games=n;}
	public int getDryGames() {return dry_games;}
	public void setAngelGames(int n) {angel_games=n;}
	public int getAngelGames() {return angel_games;}
	public void setColonyGames(int n) {colony_games=n;}
	public int getColonyGames() {return colony_games;}
	public void setGlitchGames(int n) {glitch_games=n;}
	public int getGlitchGames() {return glitch_games;}
	public void setTotalGames(int n) {total_games=n;}
	public int getTotalGames() {return total_games;}

	public void setBoomCaps(int n) {
		boom_caps=n;
	}
	public int getBoomCaps() {
		return boom_caps;
	}
	public void setExoCaps(int n) {
		exo_caps=n;
	}
	public int getExoCaps() {return exo_caps;}
	public void setEdenCaps(int n) {eden_caps=n;}
	public int getEdenCaps() {return eden_caps;}
	public void setDryCaps(int n) {dry_caps=n;}
	public int getDryCaps() {return dry_caps;}
	public void setAngelCaps(int n) {angel_caps=n;}
	public int getAngelCaps() {return angel_caps;}
	public void setColonyCaps(int n) {colony_caps=n;}
	public int getColonyCaps() {return colony_caps;}
	public void setGlitchCaps(int n) {glitch_caps=n;}
	public int getGlitchCaps() {return glitch_caps;}
	public void setTotalCaps(int n) {total_caps=n;}
	public int getTotalCaps() {return total_caps;}

	public void setBoomBestCap(int n) {
		best_boom_cap=n;
	}
	public int getBoomBestCap() {
		return best_boom_cap;
	}
	public void setExoBestCap(int n) {
		best_exo_cap=n;
	}
	public int getExoBestCap() {return best_exo_cap;}
	public void setEdenBestCap(int n) {best_eden_cap=n;}
	public int getEdenBestCap() {return best_eden_cap;}
	public void setDryBestCap(int n) {best_drydock_cap=n;}
	public int getDryBestCap() {return best_drydock_cap;}
	public void setAngelBestCap(int n) {best_angel_cap=n;}
	public int getAngelBestCap() {return best_angel_cap;}
	public void setColonyBestCap(int n) {best_colony_cap=n;}
	public int getColonyBestCap() {return best_colony_cap;}
	public void setGlitchBestCap(int n) {best_glitch_cap=n;}
	public int getGlitchBestCap() {return best_glitch_cap;}
	public void setTotalBestCap(int n) {best_total_cap=n;}
	public int getTotalBestCap() {return best_total_cap;}

	public int serverHandicap(String game_server) {
		int handicap=0;
		switch (this.server) {
		case "EU1": {
		if(game_server=="NY") handicap=5;
		else if(game_server=="EU") handicap=0; break;
		}
		case "EU2": {
			if(game_server=="NY") handicap=6;
			else if(game_server=="EU") handicap=0; break;
		}
		case "EU3": {
			if(game_server=="NY") handicap=7;
			else if(game_server=="EU") handicap=0; break;
		}
		case "EU4": {
			if(game_server=="NY") handicap=8;
			else if(game_server=="EU") handicap=0; break;
		}
		case "EU5": {
			if(game_server=="NY") handicap=10;
			else if(game_server=="EU") handicap=5; break;
		}
		case "EU6": {
			if(game_server=="NY") handicap=12;
			else if(game_server=="EU") handicap=6; break;
		}
		case "NY1": {
		if(game_server=="EU") handicap=5;
		else if(game_server=="NY") handicap=0; break;
		}
		case "NY2": {
			if(game_server=="EU") handicap=6;
			else if(game_server=="NY") handicap=0; break;
		}
		case "NY3": {
			if(game_server=="EU") handicap=7;
			else if(game_server=="NY") handicap=0; break;
		}
		case "NY4": {
			if(game_server=="EU") handicap=8;
			else if(game_server=="NY") handicap=0; break;
		}
		case "NY5": {
			if(game_server=="EU") handicap=10;
			else if(game_server=="NY") handicap=5; break;
		}
		case "NY6": {
			if(game_server=="EU") handicap=12;
			else if(game_server=="NY") handicap=6; break;
		}
		default: {
			handicap=0;
		}

		}
		return handicap;
	}
}
//assertArrayEquals
//String.split()
