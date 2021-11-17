import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // create country
        Country poland = new Country("Poland", 'p');
        Country england = new Country("England", 'e');
        Country germany = new Country("Germany", 'g');
        Country japan = new Country("Japan", 'j');
        Country spain = new Country("Spain", 's');

        // create country lists for market
        List<Country> businessMarket = new ArrayList<>();
        businessMarket.add(poland);
        businessMarket.add(england);
        businessMarket.add(germany);

        List<Country> cargoMarket = new ArrayList<>();
        cargoMarket.add(japan);
        cargoMarket.add(germany);
        cargoMarket.add(spain);

        List<Country> transportMarket = new ArrayList<>();
        transportMarket.add(poland);
        transportMarket.add(spain);
        transportMarket.add(japan);

        List<Country> taxiMarket = new ArrayList<>();
        taxiMarket.add(japan);
        taxiMarket.add(england);
        taxiMarket.add(poland);

        List<Country> busMarket = new ArrayList<>();
        busMarket.add(spain);
        busMarket.add(germany);
        busMarket.add(poland);

        // create markets
        Market mar1 = new Market("business", businessMarket);
        Market mar2 = new Market("cargo", cargoMarket);
        Market mar3 = new Market("transport", transportMarket);
        Market mar4 = new Market("taxi", taxiMarket);
        Market mar5 = new Market("bus", busMarket);

        // create dimensions
        Dimension dim1 = new Dimension(100, 200, 200);
        Dimension dim2 = new Dimension(120, 210, 230);
        Dimension dim3 = new Dimension(130, 220, 260);
        Dimension dim4 = new Dimension(140, 230, 270);
        Dimension dim5 = new Dimension(150, 240, 300);
        Dimension dim6 = new Dimension(160, 250, 340);
        Dimension dim7 = new Dimension(170, 260, 380);
        Dimension dim8 = new Dimension(180, 270, 400);
        Dimension dim9 = new Dimension(190, 280, 440);
        Dimension dim10 = new Dimension(200, 290, 600);

        // create producents
        Producent toyota = new Producent("Toyota", "Corolla");
        Producent bmw3 = new Producent("BMW", "3");
        Producent bmw5 = new Producent("BMW", "5");
        Producent tesla = new Producent("Tesla", "3");
        Producent nissan = new Producent("Nissan", "Primera");
        Producent opel = new Producent("Opel", "Astra");
        Producent ford = new Producent("Ford", "Mondeo");
        Producent hyundai = new Producent("Hyundai", "Tuscon");
        Producent kia = new Producent("Kia", "Sportage");
        Producent bmwx3 = new Producent("BMW", "X3");

        // create cars
        Car car1 = new Car(bmw3, true, mar3, "standard", dim6);
        Car car2 = new Car(toyota, false, mar1, "premium", dim2);
        Car car3 = new Car(bmw5, true, mar4, "medium", dim7);
        Car car4 = new Car(ford, false, mar2, "premium", dim1);
        Car car5 = new Car(hyundai, true, mar5, "standard", dim4);
        Car car6 = new Car(kia, true, mar3, "standard", dim8);
        Car car7 = new Car(nissan, true, mar2, "premium", dim10);
        Car car8 = new Car(tesla, true, mar1, "premium", dim9);
        Car car9 = new Car(bmwx3, false, mar5, "medium", dim5);
        Car car10 = new Car(opel, true, mar4, "standard", dim2);
        Car car11 = new Car(nissan, true, mar3, "medium", dim3);
        Car car12 = new Car(ford, false, mar4, "standard", dim8);
        Car car13 = new Car(bmw3, true, mar5, "premium", dim8);
        Car car14 = new Car(hyundai, true, mar1, "standard", dim1);
        Car car15 = new Car(bmw5, false, mar1, "premium", dim3);

        // create list for cars
        List<Car> cars = new ArrayList<>();

        // add cars for cars list
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars.add(car6);
        cars.add(car7);
        cars.add(car8);
        cars.add(car9);
        cars.add(car10);
        cars.add(car11);
        cars.add(car12);
        cars.add(car13);
        cars.add(car14);
        cars.add(car15);

        // foreach
        for (Car car : cars) {
            car.searchCar(car.producent.getModel(), car.isAutomaticGear, car.dimensions.getTrankCapacity());
        }
    }
}
