public class Supermarket {
    private String name;
    private String location;
    private double profit;
    private int employees;

    public Supermarket() {
        name = "Supermarket";
        location = "Unknown";
        profit = 0.0;
        employees = 0;
    }
    public Supermarket(String n, String l, double p, int e) {
        name = n;
        location = l;
        profit = p;
        employees = e;
    }

    public String getName() {
        return name;
    }
    public String getLocation() {
        return location;
    }
    public double getProfit() {
        return profit;
    }
    public int getEmployees() {
        return employees;
    }
    public void setName(String a) {
        name = a;
    }
    public void setLocation(String b) {
        location = b;
    }
    public void setProfit(double c) {
        profit = c;
    }
    public void setEmployees(double d) {
        employees = d;
    }
    public void checkOut(double e) {
        profit += c;
    }
    public void hire() {
        employees++;
    }
    public String toString() {
        return "Name: " + name + ", Location: " + location + ", Profit: $" + profit + ", total employees: " + employees;
    }
    
}

class DiaryAisle extends Supermarket {
    private boolean busy;

}

class Cheese extends DiaryAisle {
    private boolean shredded;
    private String type;
}

class Tester {
    public static void main(String[] args) {

    }
}