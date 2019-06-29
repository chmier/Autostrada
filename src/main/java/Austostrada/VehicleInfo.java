package Austostrada;

import java.time.LocalDateTime;

public class VehicleInfo {

    private String nrRejestracyjny;
    private CarType cartype;
    private LocalDateTime datawjazdu;

    public VehicleInfo(String nrRejestracyjny, CarType cartype, LocalDateTime datawjazdu) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.cartype = cartype;
        this.datawjazdu = datawjazdu;
    }

    public String getNrRejestracyjny() {
        return nrRejestracyjny;
    }

    public void setNrRejestracyjny(String nrRejestracyjny) {
        this.nrRejestracyjny = nrRejestracyjny;
    }

    public CarType getCartype() {
        return cartype;
    }

    public void setCartype(CarType cartype) {
        this.cartype = cartype;
    }

    public LocalDateTime getDatawjazdu() {
        return datawjazdu;
    }

    public void setDatawjazdu(LocalDateTime datawjazdu) {
        this.datawjazdu = datawjazdu;
    }
}
