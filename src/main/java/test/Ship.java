package test;

public class Ship extends Transport{
    public Ship(){
        super(40, 5000);
    }
    @Override
    public void start(){
        System.out.println("Корабль поплыл");
    }
}
