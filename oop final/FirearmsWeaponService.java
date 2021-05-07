import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirearmsWeaponService implements Function{
    public static ArrayList<FirearmsWeapon> firearmsWeapons=new ArrayList<>();

    public static void service() {
        FirearmsWeaponService service=new FirearmsWeaponService();
        try {
            firearmsWeapons=(ArrayList<FirearmsWeapon>) FirearmsWeaponService.readFirearmsWeapon("FirearmsWeapon.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        Scanner s= new Scanner(System.in);
        boolean isMenuActive=true;
        while(isMenuActive) {
            System.out.println("1 : createFirearmsWeapon");
            System.out.println("2 : readFromFile");
            System.out.println("3 : printInfoPahestatupQanakAnd30AutomaticMinute180");
            System.out.println("4 : printModelWeight10AndWithoutPahestatup");
            System.out.println("5 : printModelMaxYear");
            System.out.println("6 : printFlyDistance10000");
            System.out.println("7 : printDeadlyFlyDistance2000");
            System.out.println("Process finished with exit");

            int command = s.nextInt();
            switch (command) {
                case 1:
                    firearmsWeapons.add(FirearmsWeaponService.createFirearmsWeapon());
                    break;
                case 2:
                        for (int i = 0; i < firearmsWeapons.size(); i++) {
                            firearmsWeapons.get(i).printFirearmsWeapon();
                        }
                    break;
                case 3:
                    service.printInfoPahestatupQanakAnd30AutomaticMinute180(firearmsWeapons);
                    break;
                case 4:
                    if(firearmsWeapons.isEmpty())break;
                    System.out.print("index: ");
                    int index = s.nextInt();
                    if(index>firearmsWeapons.size())index=0;
                    service.printModelWeight10AndWithoutPahestatup(firearmsWeapons.get(1));
                    break;
                case 5:
                    if(firearmsWeapons.isEmpty())break;
                    System.out.print("index a1: ");
                    int a1=s.nextInt();
                    System.out.print("index a2: ");
                    int a2=s.nextInt();
                    if(a1>firearmsWeapons.size())a1=0;
                    if(a2>firearmsWeapons.size() && firearmsWeapons.size()>=1)a2=1;
                    service.printModelMaxYear(firearmsWeapons.get(a1),firearmsWeapons.get(a2));
                    break;
                case 6:
                    if(firearmsWeapons.isEmpty())break;
                    System.out.print("index a1: ");
                    int a3=s.nextInt();
                    if(a3>firearmsWeapons.size())a3=0;
                    service.printFlyDistance10000(firearmsWeapons.get(a3));
                    break;
                case 7:
                    if(firearmsWeapons.isEmpty())break;
                    System.out.print("index a1: ");
                    int a4=s.nextInt();
                    if(a4>firearmsWeapons.size())a4=0;
                    service.printDeadlyFlyDistance2000(firearmsWeapons.get(a4));
                    break;
                default:
                    isMenuActive=false;
            }
        }
    }

    public static FirearmsWeapon createFirearmsWeapon() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model FirearmsWeapon");
        String model = s.next();

        System.out.println("Enter flyDistance FirearmsWeapon");
        int flyDistance = s.nextInt();

        System.out.println("Enter deadlyFlyDistance FirearmsWeapon");
        int deadlyFlyDistance = s.nextInt();

        System.out.println("Enter weight FirearmsWeapon");
        int  weight = s.nextInt();

        System.out.println("Enter year FirearmsWeapon");
        int year = s.nextInt();

        System.out.println("Enter country FirearmsWeapon");
        String country = s.next();

        System.out.println("Enter continent FirearmsWeapon");
        String continent = s.next();

        System.out.println("Enter isForbidden  FirearmsWeapon? (y/n)");
        boolean isForbidden = s.next().charAt(0) == 'y';

        System.out.println("Enter pahestatupQanak FirearmsWeapon");
        int pahestatupQanak = s.nextInt();

        System.out.println("Enter automatic FirearmsWeapon");
        int automaticMinute = s.nextInt();

        System.out.println("Enter solo FirearmsWeapon");
        int soloMinute = s.nextInt();

        FirearmsWeapon firearmsWeapon = new FirearmsWeapon();
        firearmsWeapon.setModel(model);
        firearmsWeapon.setFlyDistance(flyDistance);
        firearmsWeapon.setDeadlyFlyDistance(deadlyFlyDistance);
        firearmsWeapon.setWeight(weight);
        firearmsWeapon.setYear(year);
        firearmsWeapon.setCountry(country);
        firearmsWeapon.setContinent(continent);
        firearmsWeapon.setForbidden(isForbidden);
        firearmsWeapon.setPahestatupQanak(pahestatupQanak);
        firearmsWeapon.setAutomaticMinute(automaticMinute);
        firearmsWeapon.setSoloMinute(soloMinute);

        try {
            FileService.write("FirearmsWeapon.txt","\n");
            FileService.write("FirearmsWeapon.txt",firearmsWeapon);
            FileService.write("FirearmsWeapon.txt",Integer.toString(pahestatupQanak));
            FileService.write("FirearmsWeapon.txt",Integer.toString(automaticMinute));
            FileService.write("FirearmsWeapon.txt",Integer.toString(soloMinute));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return firearmsWeapon;
    }

    public static List<FirearmsWeapon> readFirearmsWeapon(String path) throws IOException {
        List<String> array= Files.readAllLines(Paths.get(path));
        List<FirearmsWeapon> firearmsWeapon=new ArrayList<>();
        for (int i = 0; i < array.size(); i++) {
            String[] a=array.get(i).split(",");
            //awwapon
            String model=a[0];
            int flyDistance=Integer.parseInt(a[1]);
            int deadlyFlyDistance=Integer.parseInt(a[2]);
            int weight=Integer.parseInt(a[3]);
            int year=Integer.parseInt(a[4]);
            String country=a[5];
            String continent=a[6];
            boolean isForbidden= Boolean.parseBoolean(a[7]);
            //FirearmsWeapon
            int pahestatupQanak=Integer.parseInt(a[8]);
            int automaticMinute=Integer.parseInt(a[9]);
            int soloMinute=Integer.parseInt(a[10]);

            FirearmsWeapon fire=new FirearmsWeapon();
            fire.setModel(model);
            fire.setFlyDistance(flyDistance);
            fire.setDeadlyFlyDistance(deadlyFlyDistance);
            fire.setWeight(weight);
            fire.setYear(year);
            fire.setCountry(country);
            fire.setContinent(continent);
            fire.setForbidden(isForbidden);
            //FirearmsWeapon
            fire.setPahestatupQanak(pahestatupQanak);
            fire.setAutomaticMinute(automaticMinute);
            fire.setSoloMinute(soloMinute);
            firearmsWeapon.add(fire);
        }
        return firearmsWeapon;

    }

    public void printInfoPahestatupQanakAnd30AutomaticMinute180(ArrayList<FirearmsWeapon> firearmsWeapons) {
        for(FirearmsWeapon firearmsWeapon : firearmsWeapons)
            if(firearmsWeapon.getPahestatupQanak()>=30 && firearmsWeapon.getAutomaticMinute()==180)
                firearmsWeapon.printFirearmsWeapon();
    }

    public void printModelWeight10AndWithoutPahestatup(FirearmsWeapon firearmsWeapon) {
        if(firearmsWeapon.getWeight()==10 && firearmsWeapon.getPahestatupQanak()==0)
            System.out.println(firearmsWeapon.getModel());
    }

    @Override
    public void printModelMaxYear(Weapon a, Weapon b) {
        if(a.getYear()>b.getYear())
            System.out.println("Model"+a.getModel());
        else System.out.println("Model"+b.getModel());
    }

    @Override
    public void printFlyDistance10000(Weapon a) {
        if(a.getYear()>10000)
            System.out.println("Model"+a.getModel());
        else System.out.println("Fly Distance < 10000");
    }

    @Override
    public void printDeadlyFlyDistance2000(Weapon a) {
        if(a.getFlyDistance()==2000)
            System.out.println("Model"+a.getModel());
        System.out.println("DeadlyFlyDistance"+a.getDeadlyFlyDistance());
    }
}
