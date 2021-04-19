package planeService;

import plane.Plane;

import java.util.Scanner;

public class PlaneService {

    public Plane create() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter model Plane");
        String model = s.next();

        System.out.println("Enter country Plane");
        String country = s.next();

        int year;
        do {
            System.out.println("Enter year Plane");
            year = s.nextInt();
        } while (year < 1903 || year > 2020);

        int hours;
        do {
            System.out.println("Enter hours Plane");
            hours = s.next().charAt(0);
        } while (hours < 0 || hours > 10000);

        System.out.println("Enter ismilitary  Plane? (y/n)");
        boolean isMilitary = s.next().charAt(0) == 'y';

        double weight;
        do {
            System.out.println("Enter weight Plane");
            weight = s.nextDouble();
        } while (weight < 1000 || weight > 160000);

        int topSpeed;
        do {
            System.out.println("Enter topSpeed Plane");
            topSpeed = s.nextInt();
        }while(topSpeed<-1);

        int seats;
        do{
        System.out.println("Enter seats Plane");
        seats = s.nextInt();
        }while(seats<-1);

        int cost;
        do {
        System.out.println("Enter cost Plane");
        cost = s.nextInt();
        }while(cost<-1);

        Plane plane = new Plane();
        plane.setModel(model);
        plane.setCountry(country);
        plane.setYear(year);

        plane.setHours(hours);
        plane.setMilitary(isMilitary);
        plane.setWeight(weight);
        plane.setSeats(seats);
        plane.setCost(cost);
        return plane;
    }

    public void printPlane() {
        System.out.println();
    }

    public void printCostTopSpeedOrModelCountry(Plane plane) {
        if (plane.isMilitary())
            System.out.println("cost : " + plane.getCost() + " topSpeed " + plane.getTopSpeed());
        else
            System.out.println("model : " + plane.getModel() + " country " + plane.getCountry());
    }

    public Plane returnNewer(Plane p1, Plane p2) {
        if (p1.getYear() == p2.getYear()) return p1;
        if (p1.getYear() > p2.getYear()) return p2;
        else return p1;
    }

    public void printCountry(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() <= p2.getSeats() && p1.getSeats() <= p3.getSeats())
            System.out.println("Country : " + p1.getCountry());
        if (p2.getSeats() < p1.getSeats() && p2.getSeats() < p3.getSeats())
            System.out.println("Country : " + p2.getCountry());
        if (p3.getSeats() < p1.getSeats() && p3.getSeats() < p2.getSeats())
            System.out.println("Country : " + p3.getCountry());
    }

    public void printAllNotMilitaryPlanes(Plane[] planes) {
        for (Plane p : planes)
            if (p.isMilitary()) p.printInfo();
    }

    public void printAllMilitaryPlanes(Plane[] planes) {
        for (Plane p : planes)
            if (p.getHours() > 100)
                if (p.isMilitary()) System.out.println(p.isMilitary());
    }

    public Plane returnPlaneMinimalWeight(Plane[] planes) {
        double plane= planes[0].getWeight();
        int count = 0;
        for (int i = 1; i < planes.length; i++)
            if (planes[i].getHours() <= plane) {
                plane = planes[i].getWeight();
                count++;
            }
        return planes[--count];
    }

    public Plane returnPlaneWithMinimalCost(Plane[] planes) {
        int c=planes[0].getCost();
        int count=0;
        for (int i = 0; i < planes.length; i++) {
            if (planes[i].isMilitary() && c<planes[i].getCost()) {
                c = planes[i].getCost();count++;
            }
        }
        return planes[--count];
    }

    public void printPlanesOrderByYear(Plane[] planes)
    {
        boolean isActive=true;
        int count=0;
        while(isActive) {
            for (int i = 0; i < planes.length - 1-count; i++) {
                if (planes[i].getYear() < planes[i + 1].getYear()) {
                    Plane x = planes[i];
                    planes[i] = planes[i + 1];
                    planes[i + 1] = x;
                    isActive=false;
                }
            } count++;
        }
        for (int i = 0; i < planes.length; i++) {
            planes[i].printInfo();
        }
    }
}
