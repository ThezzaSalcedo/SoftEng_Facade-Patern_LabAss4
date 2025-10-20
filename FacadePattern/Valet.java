package FacadePattern;

public class Valet implements HotelService {
    @Override
    public void provideService(String plateNumber, int quantity) {
        System.out.println("Valet service: Picking up vehicle with plate number " + plateNumber + ".");
    }
}
