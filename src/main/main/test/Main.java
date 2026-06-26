package test;

public class Main {
    public static void main (String[] args){
        Transport car = new Car();
        Transport ship = new Ship();
        Transport plane = new Plane();

        Dispatcher dispatcher = new Dispatcher();

        dispatcher.control(car);
        dispatcher.printTransportDitails(car);

        dispatcher.control(ship);
        dispatcher.printTransportDitails(ship);

        dispatcher.control(plane);
        dispatcher.printTransportDitails(plane);


    }
}
