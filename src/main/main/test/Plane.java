package test;

public class Plane extends Transport{
    public Plane(){
        super(400, 100000);
    }


    @Override
    public void start() {
      System.out.println("Самолет полетел");
    }
}
