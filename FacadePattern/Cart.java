package FacadePattern;

public class Cart implements HotelService {
    @Override
    public void provideService(String parameter, int numberOfCarts) {
        System.out.println("Cart service: Requesting " + numberOfCarts + " luggage cart(s).");
    }
}
