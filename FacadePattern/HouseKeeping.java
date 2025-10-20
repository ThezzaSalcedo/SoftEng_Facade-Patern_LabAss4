package FacadePattern;

public class HouseKeeping implements HotelService {
    @Override
    public void provideService(String roomNumber, int quantity) {
        System.out.println("Housekeeping service: Cleaning room number " + roomNumber + ".");
    }
}