import java.util.Scanner;

public abstract class Weapon {
    public String model;
    public int flyDistance; //trichq
    public int deadlyFlyDistance;//mahaber
    public int weight;//qash
    public int year;
    public String country;
    public String continent;
    public boolean isForbidden;//arqelvat

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFlyDistance() {
        return flyDistance;
    }

    public void setFlyDistance(int flyDistance) {
        this.flyDistance = flyDistance;
    }

    public int getDeadlyFlyDistance() {
        return deadlyFlyDistance;
    }

    public void setDeadlyFlyDistance(int deadlyFlyDistance) {
        this.deadlyFlyDistance = deadlyFlyDistance;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public boolean isForbidden() {
        return isForbidden;
    }

    public void setForbidden(boolean forbidden) {
        isForbidden = forbidden;
    }

    public void printWeapon() {
        System.out.printf("model: %s \n flyDistance: %d \n deadlyFlyDistance: %d \n",model,flyDistance,deadlyFlyDistance);
        System.out.printf("weight: %d \n year: %d \n country: %s \n continent: %s \n",weight,year,country,continent);
        System.out.println("isForbidden: "+isForbidden);
    }
}
