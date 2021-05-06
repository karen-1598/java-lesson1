import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnCarService implements Function,FunctionArtillery {
    public static ArrayList<OnCar> onCars=new ArrayList<>();

    public static void service() {
        try {
            onCars= (ArrayList<OnCar>) OnCarService.readOnCar("OnCare.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        OnCarService service=new OnCarService();
        Scanner s= new Scanner(System.in);
        boolean isMenuActive=true;
        while(isMenuActive) {
            System.out.println("1 : createFirearmsWeapon ");
            System.out.println("2 : readFromFile ");
            System.out.println("3 : printModelMaxYear ");
            System.out.println("4 : printFlyDistance10000 ");
            System.out.println("5 : printDeadlyFlyDistance2000 ");
            System.out.println("6 : printInfoPersonnel4AndEurope ");
            System.out.println("7 : printModelIsCarWheelAndYear1950 ");
            System.out.println("Process finished with exit");

            int command = s.nextInt();
            switch (command) {
                case 1:
                    onCars.add(OnCarService.createOnCar());
                    break;
                case 2:
                        for (int i = 0; i < onCars.size(); i++) {
                            onCars.get(i).printOnCar();
                        }
                    break;
                case 3:
                    System.out.println("index a1: ");
                    int a1=s.nextInt();
                    System.out.println("index a2: ");
                    int a2=s.nextInt();
                    Weapon artillery1,artillery2;
                    artillery1=new OnCar();
                    artillery2=new OnCar();
                    if(onCars.isEmpty())break;
                    if(a1>onCars.size())a1=0;
                    artillery1=onCars.get(a1);
                    if(a2>onCars.size() && onCars.size()>=1)a2=1;
                    artillery2=onCars.get(a2);
                    service.printModelMaxYear(artillery1,artillery2);
                    break;
                case 4:
                    System.out.println("index a1: ");
                    int a3=s.nextInt();
                    Artillery artillery3;
                    artillery3=new OnCar();
                    if(onCars.isEmpty())break;
                    if(a3>onCars.size())a3=0;
                    artillery3=onCars.get(a3);
                    service.printFlyDistance10000(artillery3);
                    break;
                case 5:
                    System.out.println("index a1: ");
                    int a4=s.nextInt();
                    Artillery artillery4;
                    artillery4=new OnCar();
                    if(onCars.isEmpty())break;
                    if(a4>onCars.size())a4=0;
                    artillery4=onCars.get(a4);
                    service.printDeadlyFlyDistance2000(artillery4);
                    break;
                case 6:
                    service.printInfoPersonnel4AndEurope(onCars);
                    break;
                case 7:
                    service.printModelIsCarWheelAndYear1950(onCars);
                    break;
                default:
                    isMenuActive=false;
            }
        }
    }

    public static OnCar createOnCar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model OnCar");
        String model = s.next();

        System.out.println("Enter flyDistance OnCar");
        int flyDistance = s.nextInt();

        System.out.println("Enter deadlyFlyDistance OnCar");
        int deadlyFlyDistance = s.nextInt();

        System.out.println("Enter weight OnCar");
        int  weight = s.nextInt();

        System.out.println("Enter year OnCar");
        int year = s.nextInt();

        System.out.println("Enter country OnCar");
        String country = s.next();

        System.out.println("Enter continent OnCar");
        String continent = s.next();

        System.out.println("Enter isForbidden  OnCar? (y/n)");
        boolean isForbidden = s.next().charAt(0) == 'y';

        System.out.println("Enter isCarWheel  OnCar? (y/n)");
        boolean isCarWheel = s.next().charAt(0) == 'y';

        System.out.println("Enter personnel OnCar");
        int personnel = s.nextInt();

        System.out.println("Enter commander  OnCar");
        String commander= s.next();
        System.out.println("Enter nshanaru  OnCar ");
        String nshanaru= s.next();
        System.out.println("Enter hashvarkox  OnCar ");
        String hashvarkox= s.next();
        System.out.println("Enter krakrope  OnCar ");
        int krakrope=s.nextInt();

        OnCar onCar = new OnCar();
        onCar.setModel(model);
        onCar.setFlyDistance(flyDistance);
        onCar.setDeadlyFlyDistance(deadlyFlyDistance);
        onCar.setWeight(weight);
        onCar.setYear(year);
        onCar.setCountry(country);
        onCar.setContinent(continent);
        onCar.setForbidden(isForbidden);
        //OnCar
        onCar.setCarWheel(isCarWheel);
        onCar.setPersonnel(personnel);

        onCar.setCommander(commander);
        onCar.setNshanaru(nshanaru);
        onCar.setHashvarkox(hashvarkox);
        onCar.setKrakrope(krakrope);
        try {
            FileService.write("OnCare.txt","\n");
            FileService.write("OnCare.txt",onCar);
            FileService.write("OnCare.txt",Boolean.toString(isCarWheel));
            FileService.write("OnCare.txt",Integer.toString(personnel));
            FileService.write("OnCare.txt",commander);
            FileService.write("OnCare.txt",nshanaru);
            FileService.write("OnCare.txt",hashvarkox);
            FileService.write("OnCare.txt",Integer.toString(krakrope));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return onCar;
    }

    static List<OnCar> readOnCar(String path) throws IOException {
        List<String> array= Files.readAllLines(Paths.get(path));
        List<OnCar> onCar=new ArrayList<>();
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
            //OnCar
            boolean isCarWheel=Boolean.parseBoolean(a[8]);
            int personnel=Integer.parseInt(a[9]);
            //Artillery
            String commander=a[10];
            String nshanaru=a[11];
            String hashvarkox=a[12];
            int krakrope=Integer.parseInt(a[13]);

            OnCar car=new OnCar();
            car.setModel(model);
            car.setFlyDistance(flyDistance);
            car.setDeadlyFlyDistance(deadlyFlyDistance);
            car.setWeight(weight);
            car.setYear(year);
            car.setCountry(country);
            car.setContinent(continent);
            car.setForbidden(isForbidden);
            //OnCar
            car.setCarWheel(isCarWheel);
            car.setPersonnel(personnel);
            //Artileria
            car.setCommander(commander);
            car.setNshanaru(nshanaru);
            car.setHashvarkox(hashvarkox);
            car.setKrakrope(krakrope);
            onCar.add(car);
        }
        return onCar;
    }

    public void printInfoPersonnel4AndEurope(ArrayList<OnCar> onCars) {
        for(OnCar onCar : onCars)
            if(onCar.getPersonnel()>4 && onCar.getContinent()=="Europe")
                onCar.printOnCar();
    }

    public void printModelIsCarWheelAndYear1950(ArrayList<OnCar> onCars) {
        for(OnCar onCar : onCars)
            if(onCar.isCarWheel() && onCar.getYear()>1950)
                System.out.println("Model: "+onCar.getModel());
    }

    @Override
    public void printModelMaxYear(Weapon a,Weapon b) {
            if(a.getYear()>b.getYear())
                System.out.println("Model: "+a.getModel());
            else System.out.println("Model: "+b.getModel());
    }

    @Override
    public void printFlyDistance10000(Weapon a) {
        if(a.getYear()>10000)
            System.out.println("Model: "+a.getModel());
        else System.out.println("Fly Distance < 10000: ");
    }

    @Override
    public void printDeadlyFlyDistance2000(Weapon a) {
        if(a.getFlyDistance()==2000)
            System.out.println("Model: "+a.getModel());
            System.out.println("DeadlyFlyDistance: "+a.getDeadlyFlyDistance());
    }
}
