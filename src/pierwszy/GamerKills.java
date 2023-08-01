package pierwszy;

public class GamerKills {
    private String name;
    private int boom_games, exo_games, eden_games, dry_games, angel_games, colony_games,  glitch_games, total_games;
    private int boom_kills, exo_kills, eden_kills, drydock_kills, angel_kills, colony_kills, glitch_kills, total_kills, best_boom_kill, best_exo_kill, best_eden_kill, best_drydock_kill, best_angel_kill, best_colony_kill, best_glitch_kill, best_total_kill;
    public GamerKills(String n, int bg, int bk, int bbk, int eg, int ek, int bek, int edg,
                 int edk, int bedk, int dg, int dk , int bdk, int ag, int ak, int bak, int cg, int ck, int bck, int gg, int gk, int bgk, int tg, int tk, int btk)
    {
        name=n;
        boom_games=bg; exo_games=eg; eden_games=edg; dry_games=dg; angel_games=ag; colony_games=cg;  glitch_games=gg; total_games=tg;
        boom_kills=bk; exo_kills=ek; eden_kills=edk; drydock_kills=dk; angel_kills=ak; colony_kills=ck; glitch_kills=gk; total_kills=tk;
        best_boom_kill=bbk; best_exo_kill=bek; best_eden_kill=bedk; best_drydock_kill=bdk; best_angel_kill=bak; best_colony_kill=bck; best_glitch_kill=bgk; best_total_kill=btk;
    }
    public GamerKills()
    {
        name="";
        boom_games=0; exo_games=0; eden_games=0; dry_games=0; angel_games=0; colony_games=0;  glitch_games=0; total_games=0;
        boom_kills=0; exo_kills=0; eden_kills=0; drydock_kills=0; angel_kills=0; colony_kills=0; glitch_kills=0;
        best_boom_kill=0; best_exo_kill=0; best_eden_kill=0; best_drydock_kill=0; best_angel_kill=0; best_colony_kill=0; best_glitch_kill=0;
    }
    public void cloneValues(GamerKills another) {

        this.setName(another.getName());
        this.setAngelGames(another.getAngelGames());
        this.setColonyGames(another.getColonyGames());
        this.setGlitchGames(another.getGlitchGames());
        this.setBoomGames(another.getBoomGames());
        this.setEdenGames(another.getEdenGames());
        this.setExoGames(another.getExoGames());
        this.setDryGames(another.getDryGames());
        this.setTotalGames(another.getTotalGames());
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


    }
    public void setName(String n) {
        this.name = n;
    }
    public String getName() {
        return name;
    }
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

    public int getTotalKills() {
        return this.total_kills;
    }
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
    public void setTotalKills(int n) {
        total_kills=n;
    }
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
    public int getTotalBestKill() {
        return this.best_total_kill;
    }

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
    public void setTotalBestKill(int n) {
        best_total_kill=n;
    }

}
