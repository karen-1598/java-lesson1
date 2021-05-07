public class FirearmsWeapon extends Weapon {
    public int pahestatupQanak;
    public int automaticMinute;
    public int soloMinute;

    public int getAutomaticMinute() {
        return automaticMinute;
    }

    public void setAutomaticMinute(int automaticMinute) {
        this.automaticMinute = automaticMinute;
    }

    public int getSoloMinute() {
        return soloMinute;
    }

    public void setSoloMinute(int soloMinute) {
        this.soloMinute = soloMinute;
    }

    public int getPahestatupQanak() {
        return pahestatupQanak;
    }

    public void setPahestatupQanak(int pahestatupQanak) {
        this.pahestatupQanak = pahestatupQanak;
    }

    public void printFirearmsWeapon() {
        printWeapon();
        System.out.printf("pahestatupQanak: %d \n automatic: %d \n",getPahestatupQanak(),getAutomaticMinute());
        System.out.println("pahestatupQanak: %d"+getSoloMinute());

    }
}
