import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PushkaService implements FunctionArtillery{
    public static ArrayList<Pushka> pushkas=new ArrayList<>();
    public static void service() {
        try {
            pushkas=(ArrayList<Pushka>) PushkaService.readPushka("Pushka.txt");//
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
        PushkaService service=new PushkaService();
        Scanner s= new Scanner(System.in);
        boolean isMenuActive=true;
        while(isMenuActive) {
            System.out.println("1 : createPushka");
            System.out.println("2 : readFromFile");
            System.out.println("3 : printModelMaxYear");
            System.out.println("4 : printFlyDistance10000");
            System.out.println("5 : printDeadlyFlyDistance2000");
            System.out.println("6 : printCommanderKrakrope5PhestayinNshan10");
            System.out.println("7 : printNshanaruAndHashvarkoxPhestayinNshanAndHimnakanNshan");
            System.out.println("8 : printArtilleryYear1990AnywayPrintInfo");
            System.out.println("9 : printModelCountryArtilleryIsForbiddenAnyway");
            System.out.println("Process finished with exit");

            int command = s.nextInt();
            switch (command) {
                case 1:
                    pushkas.add(PushkaService.createPushka());
                    break;
                case 2:
                        for (int i = 0; i <pushkas.size(); i++) {
                            pushkas.get(i).printPushka();}
                    break;
                case 3:
                    if(pushkas.isEmpty())break;
                    System.out.print("index a1: ");
                    int p1=s.nextInt();
                    System.out.print("index a2: ");
                    int p2=s.nextInt();
                    if(p1>pushkas.size())p1=0;
                    if(p2>pushkas.size() && pushkas.size()>=1)p2=1;else p2=0;
                    service.printModelMaxYear(pushkas.get(p1),pushkas.get(p2));
                    break;
                case 4:
                    if(pushkas.isEmpty())break;
                    System.out.print("index a1: ");
                    int p3=s.nextInt();
                    if(p3>pushkas.size())p3=0;
                    service.printFlyDistance10000(pushkas.get(p3));
                    break;
                case 5:
                    if(pushkas.isEmpty())break;
                    System.out.print("index a1: ");
                    int p4=s.nextInt();
                    if(p4>pushkas.size())p4=0;
                    service.printDeadlyFlyDistance2000(pushkas.get(p4));
                    break;
                case 6:
                    service.printCommanderKrakrope5PhestayinNshan10(pushkas);
                    break;
                case 7:
                    System.out.print("index: ");
                    int index = s.nextInt();
                    if(index>pushkas.size())index=0;
                    service.printNshanaruAndHashvarkoxPhestayinNshanAndHimnakanNshan(pushkas.get(index));
                    break;
                case 8:
                    ArrayList<Artillery> a=new ArrayList<>();
                    for(int i=0;i<pushkas.size();i++)
                    a.add(pushkas.get(i));
                    service.printArtilleryYear1990AnywayPrintInfo(a);
                case 9:
                    service.printModelCountryArtilleryIsForbiddenAnyway(s.nextInt());
                default:
                    isMenuActive=false;
            }
        }
    }

    public static Pushka createPushka() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model Pushka");
        String model = s.next();

        System.out.println("Enter flyDistance Pushka");
        int flyDistance = s.nextInt();

        System.out.println("Enter deadlyFlyDistance Pushka");
        int deadlyFlyDistance = s.nextInt();

        System.out.println("Enter weight Pushka");
        int  weight = s.nextInt();

        System.out.println("Enter year Pushka");
        int year = s.nextInt();

        System.out.println("Enter country Pushka");
        String country = s.next();

        System.out.println("Enter continent Pushka");
        String continent = s.next();

        System.out.println("Enter isForbidden  Pushka? (y/n)");
        boolean isForbidden = s.next().charAt(0) == 'y';

        System.out.println("Enter phestayinNshan Pushka");
        int phestayinNshan = s.nextInt();

        System.out.println("Enter himnakanNshan Pushka");
        int himnakanNshan = s.nextInt();

        System.out.println("Enter commander  Pushka");
        String commander= s.next();
        System.out.println("Enter nshanaru  Pushka ");
        String nshanaru= s.next();
        System.out.println("Enter hashvarkox  Pushka ");
        String hashvarkox= s.next();
        System.out.println("Enter krakrope  Pushka ");
        int krakrope=s.nextInt();


        Pushka pushka = new Pushka();
        pushka.setModel(model);
        pushka.setFlyDistance(flyDistance);
        pushka.setDeadlyFlyDistance(deadlyFlyDistance);
        pushka.setWeight(weight);
        pushka.setYear(year);
        pushka.setCountry(country);
        pushka.setContinent(continent);
        pushka.setForbidden(isForbidden);
        pushka.setPhestayinNshan(phestayinNshan);
        pushka.setHimnakanNshan(himnakanNshan);
        pushka.setCommander(commander);
        pushka.setNshanaru(nshanaru);
        pushka.setHashvarkox(hashvarkox);
        pushka.setKrakrope(krakrope);
        try {
            FileService.write("Pushka.txt","\n");
            FileService.write("Pushka.txt",pushka);
            FileService.write("Pushka.txt",Integer.toString(phestayinNshan));
            FileService.write("Pushka.txt",Integer.toString(himnakanNshan));
            FileService.write("Pushka.txt",commander);
            FileService.write("Pushka.txt",nshanaru);
            FileService.write("Pushka.txt",hashvarkox);
            FileService.write("Pushka.txt",Integer.toString(krakrope));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pushka;
    }

    static List<Pushka> readPushka(String path) throws IOException {
        List<String> array= Files.readAllLines(Paths.get(path));
        List<Pushka> pushka=new ArrayList<>();
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
            //Pushka
            int phestayinNshan=Integer.parseInt(a[8]);
            int himnakanNshan=Integer.parseInt(a[9]);
            //Artillery
            String commander=a[10];
            String nshanaru=a[11];
            String hashvarkox=a[12];
            int krakrope=Integer.parseInt(a[13]);

            Pushka pu=new Pushka();
            pu.setModel(model);
            pu.setFlyDistance(flyDistance);
            pu.setDeadlyFlyDistance(deadlyFlyDistance);
            pu.setWeight(weight);
            pu.setYear(year);
            pu.setCountry(country);
            pu.setContinent(continent);
            pu.setForbidden(isForbidden);
            //Pushka
            pu.setPhestayinNshan(phestayinNshan);
            pu.setHimnakanNshan(himnakanNshan);
            //Artileria
            pu.setCommander(commander);
            pu.setNshanaru(nshanaru);
            pu.setHashvarkox(hashvarkox);
            pu.setKrakrope(krakrope);

            pushka.add(pu);
        }
        return pushka;

    }

    public void printCommanderKrakrope5PhestayinNshan10(ArrayList<Pushka> pushkas) {
        for(Pushka pushka : pushkas)
            if(pushka.getKrakrope()>5 && pushka.getPhestayinNshan()>10)
                System.out.println(pushka.getCommander());
    }

    public void printNshanaruAndHashvarkoxPhestayinNshanAndHimnakanNshan(Pushka pushka) {
        if (pushka.getPhestayinNshan()>0 && pushka.getHimnakanNshan()>0)
            System.out.printf("Nshanaru: %s \n Hashvarkox: ",pushka.getNshanaru(),pushka.getHashvarkox());
    }

    @Override
    public void printModelMaxYear(Weapon a, Weapon b) {
        if(a.getYear()>b.getYear())
            System.out.println("Pushka model: "+a.getModel());
        else System.out.println("Pushka model: "+b.getModel());
    }

    @Override
    public void printFlyDistance10000(Weapon a) {
        if(a.getYear()>10000)
            System.out.println("Pushka model: "+a.getModel());
        else System.out.println("Pushka fly Distance < 10000: ");
    }

    @Override
    public void printDeadlyFlyDistance2000(Weapon a) {
        if(a.getFlyDistance()==2000)
            System.out.println("Pushka model: "+a.getModel());
        System.out.println("Pushka deadly fly distance: "+a.getDeadlyFlyDistance());
    }

    @Override
    public void printArtilleryYear1990AnywayPrintInfo(ArrayList<Artillery> artilleries) {
        for (int i = 0; i < artilleries.size(); i++) {
            if(artilleries.get(i).getYear()>1990) {
                System.out.println("Year > 1990");
                artilleries.get(i).printWeapon();
            }
            else if(pushkas.get(i).getPhestayinNshan()!=0 && pushkas.get(i).getHimnakanNshan()>354){
                System.out.println("Phestayin nshan!=0 and himnakan nshan > 354");
                pushkas.get(i).printPushka();
            }
        }
    }

    @Override
    public void printModelCountryArtilleryIsForbiddenAnyway(int index) {
        if(index>pushkas.size()) index=0;
        if(pushkas.get(index).isForbidden())
            System.out.println("Pushka model: %s \n country: %s");
        else System.out.println("No forbidden weapon");
    }
}
