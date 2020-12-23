package transport;

public abstract class Vehicle {

    static int capacity;
    static int speed;
    static int cost;

    public void Parameters(int capacity, int speed, int cost) {

        this.capacity = capacity;
        this.speed = speed;
        this.cost = cost;

    }

    public static void print(String[] args) {

        System.out.println("Transport started");

    }
}


