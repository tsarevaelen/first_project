package test;

public abstract class Transport {
    private double speed;
    private int capasity;

    public Transport(int speed, int capasity){
        this.speed = speed;
        this.capasity = capasity;
    }

    public double getSpeed(){
        return this.speed;
    }

    public int getCapasity(){
        return this.capasity;
    }

    abstract void start();
}
