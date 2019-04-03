package domain;

import java.util.ArrayList;

public class RaceResultPrinter {
    private static final Character CAR_DISTANCE ='-';
    private ArrayList<Car> carList;

    RaceResultPrinter(ArrayList<Car> carList) {
        this.carList = carList;
    }

    public void PrintEachRaceAttemptResult(){
        for(int carOrder = 0; carOrder < carList.size(); carOrder++){
            PrintEachCarResult(carOrder);
        }
        System.out.println();
    }

    private void PrintEachCarResult(int carOrder){
        Car car = carList.get(carOrder);
        String carName = car.getName();
        System.out.print(carName+" : ");
        PrintRacingDistance(car.getPosition());
    }

    private void PrintRacingDistance(int carPosition){
        for(int i=0; i<carPosition; i++){
            System.out.print(CAR_DISTANCE);
        }
        System.out.println();
    }
}
