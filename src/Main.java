// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Vesta");
        Car skoda = new Car("Octavia");

        Bicycle forward = new Bicycle("Forward");
        Bicycle pelican = new Bicycle("Pelican");

        Truck kamaz = new Truck("Камаз");
        Truck actros = new Truck("Actros");

        TransportService[] transports = {
                lada, skoda, forward , pelican , kamaz, actros
        };

        ServiceStation serviceStation = new ServiceStation();
        for(TransportService transport : transports) {
            serviceStation.check(transport);
        }




    }
}

