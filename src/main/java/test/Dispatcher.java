package test;

public class Dispatcher {
    public void control(Transport transport){
        transport.start();
    }

    public void printTransportDitails(Transport transport){
        System.out.println("Скорость: " + transport.getSpeed() + ", вместимость: " + transport.getCapasity());
    }
}
