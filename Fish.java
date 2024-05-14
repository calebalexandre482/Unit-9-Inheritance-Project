//Caleb Alexandre Period 7 AP CSA
import java.util.*;
public class Fish {
    //instance variables
    private String name;
    private String color;
    private int age;
    //constructors
    public Fish() {
        name = "Joe";
        color = "red";
        age = 0;
    }
    public Fish(String n, String c, int a) {
        name = n;
        color = c;
        age = a;
    }
    //get and set methods
    public String getName() {
        return name;
    }
    public String getColor() {
        return color;
    }
    public int getAge() {
        return age;
    }
    public void setName(String a) {
        name = a;
    }
    public void setColor(String b) {
        color = b;
    }
    public void setAge(int c) {
        age = c;
    }
    //other methods
    public boolean isAdult() {
        if (age >= 7) {
            return true;
        }
        return false;
    }
    public void swim() {
        System.out.println("The fish is swimming.");
    }
    //toString and equals method
    public String toString() {
        return "Name: " + name + ", Color: " + color + ", Age: " + age;
    }
    public boolean equals(Fish d) {
        if (this == d) {
            return true;
        }
        return false;
    }
}

class Shark extends Fish {
    //instance variable
    private int speed;
    //constructor
    public Shark() {
        super();
        speed = 1;
    }
    public Shark(int s) {
        super();
        speed = s;
    }
    public Shark(String n, String c, int a, int s) {
        super(n,c,a);
        speed = s;
    }
    //get and set methods
    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int a) {
        speed = a;
    }
    //inherited methods
    public boolean isAdult() {
        if (super.getAge() >= 12) {
            return true;
        }
        return false;
    }
    public void swim() {
        System.out.println("The shark is swimming.");
    }
    //non-inherited methods
    public void eat() {
        System.out.println("The shark ate " + speed/3 + " smaller fish. If it was faster, it could eat more fish.");
    }
    public void sensePrey() {
        System.out.println("The shark senses nearby prey.");
    } 
    //toString and equals methods
    public String toString() {
        return super.toString() + ", Speed: " + speed;
    }
    public boolean equals(Shark b) {
        if (this == b) {
            return true;
        }
        return false;
    }
}

class Hammerhead extends Shark {
    //instance variable
    private int weight;
    //constructor
    public Hammerhead() {
        super(1);
        weight = 500;
    }
    public Hammerhead(int s, int w) {
        super(s);
        weight = w;
    }
    public Hammerhead(String n, String c, int a, int s, int w) {
        super(n,c,a,s);
        weight = w;
    }
    //get and set methods
    public int getWeight() {
        return weight;
    }
    public void setWeight(int a) {
        weight = a;
    }
    //inherited method
    public void eat() {
        if(super.getSpeed() <= 12) {
            System.out.println("The shark ate " + super.getSpeed()/3 + " smaller fish. If it was faster, it could eat more fish.");
        }
        else {
            System.out.println("The shark ate " + super.getSpeed()/3 + " smaller fish. If it was faster, it could eat more fish.");
            System.out.println("Because the hammerhead is fast, no other shark got to any of its food.");
        }
    }
    public void sensePrey() {
        System.out.println("The hammerhead shark senses nearby prey.");
    }
    //non-inherited methods
    public void compareWeight() {
        if (weight >= 900) {
            System.out.println("This is a very heavy hammerhead shark. The largest recorded weight was 991 lbs");
        }
        else if (weight >= 750) {
            System.out.println("This hammerhead shark weighs as much as an adult polar bear.");
        }
        else if (weight >= 500) {
            System.out.println("This hammerhead shark weighs as much as an adult grizzly bear. This is the average weight.");
        }
        else if (weight >= 250) {
            System.out.println("This hammerhead shark weighs as much as a refrigerator.");
        }
        else {
            System.out.println("This hammerhead shark doesn't weigh a lot for a shark.");
        }
    }
    public void stingray() {
        System.out.println("The shark ate a stingray, its primary food source.");
    }
    //toString and equals methods
    public String toString() {
        return super.toString() + ", Weight: " + weight;
    }
    public boolean equals(Hammerhead b) {
        if (this == b) {
            return true;
        }
        return false;
    }
}

class Tester {
    public static void main(String[] args) {
        ArrayList<Fish> listOfFish = new ArrayList<Fish>();
        Fish fish1 = new Fish("Billy", "green", 10);
        Fish fish2 = new Fish();
        Fish fish3 = fish2;
        Fish fish4 = new Shark("Claire", "gray", 6, 11);
        Fish fish5 = fish4;
        Fish fish6 = new Shark("Claire", "gray", 6, 11);
        Fish fish7 = new Shark(15);
        Fish fish8 = new Hammerhead("Jonah", "red", 7, 14, 700);
        Fish fish9 = new Hammerhead();
        Fish fish10 = new Hammerhead(14, 200);
        System.out.println(fish2);
        System.out.println(fish3);
        System.out.println(fish4);
        System.out.println(fish7);
        System.out.println(fish8);
    }
}