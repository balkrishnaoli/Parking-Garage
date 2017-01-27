import java.util.ArrayList;
import java.util.Iterator;

public class Garage{

  ArrayList<Slot> slotList = new ArrayList<Slot>();
  int largeSlot;
  int regularSlot;
  int compactSlot;

  public Garage(int numerOfSlots){
    this.largeSlot = numerOfSlots/3;
    this.regularSlot = numerOfSlots/3;
    this.compactSlot = numerOfSlots/3;
    fillListWithSlots(this.largeSlot,this.regularSlot,this.compactSlot);
  }
  public Garage(int largeSlot, int regularSlot, int compactSlot){
    this.largeSlot = largeSlot;
    this.regularSlot = regularSlot;
    this.compactSlot = regularSlot;
    fillListWithSlots(largeSlot,regularSlot,compactSlot);
  }

  public void fillListWithSlots(int largeSlot, int regularSlot, int compactSlot){
    int count=0;
    for(int i=0; i<compactSlot; i++){
      slotList.add(new Slot(false, count++, SlotType.COMPACT.toString(),false));
    }
    for(int i=compactSlot; i<regularSlot; i++){
      slotList.add(new Slot(false, count++, SlotType.REGULAR.toString(),false));
    }
    for(int i=regularSlot; i<largeSlot; i++){
      slotList.add(new Slot(false, count++, SlotType.LARGE.toString(),false));
    }
  }

  public int availableSlotNumber(String vehicle){
    if(slotList.isEmpty()){
      if(vehicle==Vehicle.BUS.toString())
        return regularSlot+compactSlot;
      else
        return 0;
    }
    else{
      if(vehicle==Vehicle.CAR.toString()||vehicle==Vehicle.BIKE.toString()){
        for(int i=0; i<compactSlot+regularSlot;i++){
          if(!slotList.get(i).isOccupied)
            return i;
        }
      }
      else{
        for(int i=compactSlot+regularSlot; i< largeSlot+compactSlot+regularSlot; i++){
          if(!slotList.get(i).isOccupied)
            return i;
        }
      }
    }
    return -1;
  }

  public void park(int slotNumber, String vehicle){
    if(!slotList.get(slotNumber).isOccupied){
      slotList.get(slotNumber).isOccupied = true;
      System.out.println(vehicle + " is parked at "+slotNumber+ " slot number");
    }else{
      System.out.println(vehicle +" couldn't be parked");
    }
  }
  public void unPark(int slotNumber, String vehicle){
    if(slotList.get(slotNumber).isOccupied){
      slotList.get(slotNumber).isOccupied = false;
      System.out.println( vehicle+ " is unparked from "+slotNumber+ " slot number");
    }
    else{
      System.out.println(vehicle +" couldn't be unparked");
    }
  }

}
