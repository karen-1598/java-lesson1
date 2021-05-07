public abstract class Artillery extends Weapon {
    public String commander;
    public String nshanaru;
    public String hashvarkox;
    public int krakrope;

    public int getKrakrope() {
        return krakrope;
    }

    public void setKrakrope(int krakrope) {
        this.krakrope = krakrope;
    }

    public String getCommander() {
        return commander;
    }

    public void setCommander(String commander) {
        this.commander = commander;
    }

    public String getNshanaru() {
        return nshanaru;
    }

    public void setNshanaru(String nshanaru) {
        this.nshanaru = nshanaru;
    }

    public String getHashvarkox() {
        return hashvarkox;
    }

    public void setHashvarkox(String hashvarkox) {
        this.hashvarkox = hashvarkox;
    }

    public void printArtillery() {
        System.out.printf("commander: %s  \n nshanaru: %s \n",getCommander(),getNshanaru());
        System.out.printf("hashvarkox: %s  \n krakrope: %d \n",getHashvarkox(),getKrakrope());
    }
}
