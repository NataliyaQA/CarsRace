package JustTrySecond;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class JustTrySecondRace {

    public static final int RACE_DURATION = 20;

    public static void main(String[] args) {
        final List<Race> cars = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            final Race car = new Race(); // Create a new car
            car.setCarNumber(i); // Set the car number
            car.start(); // Call a car to start the racing
            cars.add(car); // Add car to the list
        }

        final Comparator<Race> compareTotalWay = Comparator.comparing(Race::getTotalWay); // Create a comparator to sort car by the total way value.
        cars.sort(compareTotalWay.reversed());

        for (int i = 0; i <= 2; ) {
            printInfo(cars.get(i), ++i); // Display results of winners
        }
    }

    private static void printInfo(Race car, int place) {
        System.out.println(place
                + " place: The car number " + car.getCarNumber()
                + "! Total way = " + car.getTotalWay()
                + ". \nWay history: " + car.getWayHistory() + "\n");
    }
}