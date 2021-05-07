import java.util.ArrayList;

public class Pushka extends Artillery {
public int phestayinNshan;
public int himnakanNshan;

    public int getPhestayinNshan() {
        return phestayinNshan;
    }

    public void setPhestayinNshan(int phestayinNshan) {
        this.phestayinNshan = phestayinNshan;
    }

    public int getHimnakanNshan() {
        return himnakanNshan;
    }

    public void setHimnakanNshan(int himnakanNshan) {
        this.himnakanNshan = himnakanNshan;
    }

    public void printPushka() {
        printWeapon();
        System.out.printf("phestayinNshan: %d  \n himnakanNshan: %d \n",getPhestayinNshan(),getHimnakanNshan());
        printArtillery();
        System.out.println("------------------------------------");
    }
}
