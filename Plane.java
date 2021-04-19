package plane;

public class Plane {
   String model;
   String country;
   int year;
   int hours;
   boolean isMilitary;
   double weight;
   int topSpeed=1000;
   int seats;
   int cost;



    public void printInfo()
    {
        System.out.println("**********");
        System.out.printf("model: %s country: %s \n",model,country);
        System.out.println("year: "+year);
        System.out.println("Hours: "+hours);
        System.out.println("isMilitary: "+(isMilitary?"Yeas":"No"));
        System.out.println("weight: "+weight);
        System.out.println("topSpeed"+topSpeed);
        System.out.println("seats: "+seats);
        System.out.println("cost"+cost);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year>=1903 && year<=2020)
        this.year = year;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
