package Austostrada;

import java.sql.SQLOutput;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Highway {

    private List<VehicleInfo> vehicleList = new ArrayList<>();

    public void vehicleEntry(String nrRejestracyjny, CarType cartype) {

        VehicleInfo enteredOne = new VehicleInfo(nrRejestracyjny, cartype, LocalDateTime.now()); // ciekawe ...
        vehicleList.add(enteredOne);
        System.out.println("Wjechal: " + enteredOne);
    }


    public void vehicleInfo(String nrRejestracyjny) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getNrRejestracyjny().equals(nrRejestracyjny)) {
                System.out.println("Samochod jedzie" );
            }
        }

    }

}
