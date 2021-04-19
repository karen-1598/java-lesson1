package airportTest;

import plane.Plane;
import planeService.PlaneService;

import java.util.Scanner;

public class AirportTest {
    public static void main(String[] args)
    {
        PlaneService service=new PlaneService();
        Plane p1=service.create();
        Plane p2=service.create();
        Plane p3=service.create();
        Plane[] planes={p1,p2,p3};


        Scanner s= new Scanner(System.in);

        boolean isMenuActive=true;
        while(isMenuActive) {
            System.out.println("1 : printCostTopSpeedOrModelCountry ");
            System.out.println("2 : returnNewer ");
            System.out.println("3 : printCountry ");
            System.out.println("4 : printAllNotMilitaryPlanes ");
            System.out.println("5 : printAllMilitaryPlanes ");
            System.out.println("6 : returnPlaneMinimalWeight ");
            System.out.println("7 : returnPlaneWithMinimalCost ");
            System.out.println("8 : printPlanesOrderByYear ");
            System.out.println("Process finished with exit");

            int command = s.nextInt();

            switch (command) {
                case 1:
                    service.printCostTopSpeedOrModelCountry(p1);
                    break;
                case 2:
                    service.returnNewer(p1,p2);
                    break;
                case 3:
                    service.printCountry(p2,p3,p1);
                    break;
                case 4:
                    service.printAllNotMilitaryPlanes(planes);
                    break;
                case 5:
                    service.printAllMilitaryPlanes(planes);
                    break;
                case 6:
                    service.returnPlaneMinimalWeight(planes);
                    break;
                case 7:
                    service.returnPlaneWithMinimalCost(planes);
                    break;
                case 8:
                    service.printPlanesOrderByYear(planes);
                    break;
                default:
                    isMenuActive=false;
            }
        }
    }
}
