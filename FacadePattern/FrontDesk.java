package FacadePattern;

public class FrontDesk {
    private final HotelService valet = new Valet();
    private final HotelService houseKeeping = new HouseKeeping();
    private final HotelService cart = new Cart();

    public void pickUpVehicle(String plateNumber) {
        valet.provideService(plateNumber, 0);
    }

    public void cleanRoom(String roomNumber) {
        houseKeeping.provideService(roomNumber, 0);
    }

    public void requestCart(int numberOfCarts) {
        cart.provideService("", numberOfCarts);
    }
}

