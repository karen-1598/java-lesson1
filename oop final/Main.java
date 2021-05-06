import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args)
    {
Scanner s= new Scanner(System.in);
        boolean isMenuActive=true;
        while(isMenuActive) {
            System.out.println("1 : FirearmsWeapon ");
            System.out.println("2 : Pushka ");
            System.out.println("3 : OnCar ");
            System.out.println("Process finished with exit");
            int command = s.nextInt();
            switch (command) {
                case 1:
                    FirearmsWeaponService.service();
                    break;
                case 2:
                    PushkaService.service();
                    break;
                case 3:
                    OnCarService.service();
                    break;
                default:
                    isMenuActive=false;
            }
        }
    }
}
