public class OnCar extends Artillery{
    public boolean isCarWheel;
    public int personnel;

    public boolean isCarWheel() {
        return isCarWheel;
    }

    public void setCarWheel(boolean carWheel) {
        isCarWheel = carWheel;
    }

    public int getPersonnel() {
        return personnel;
    }

    public void setPersonnel(int personnel) {
        this.personnel = personnel;
    }

    public void printOnCar() {
        printWeapon();
        System.out.printf("isCarWheel: %b  \n Personnel: %d ",isCarWheel(),getPersonnel());
        System.out.printf("commander: %s  \n nshanaru: %s ",getCommander(),getNshanaru());
        System.out.printf("hashvarkox: %s  \n krakrope: %d ",getHashvarkox(),getKrakrope());

    }

}
