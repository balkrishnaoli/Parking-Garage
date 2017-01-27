public class ParkingLot{
  public static void main(String args[]){
    Garage garage = new Garage(9);
    int slotNumber = garage.availableSlotNumber(Vehicle.CAR.toString());
    if(slotNumber<0){
      System.out.println("Parking is full");
    }
    else{

      garage.park(slotNumber,Vehicle.CAR.toString());
      garage.unPark(slotNumber,Vehicle.CAR.toString());
    }

  }
}
