import java.util.ArrayList;
import java.util.Iterator;
public Garage{
  ArrayList<Slot> slotList = new ArrayList<Slot>();
  int largeSlot;
  int regularSlot;
  int compactSlot;
  public Garage(int numerOfslots){
    this.largeSlot = numerOfSlots/3;
    this.regularSlot = numerOfSlots/3;
    this.compactSlot = numerOfSlots/3;
  }
  public Garage(int largeSlot, int regularSlot, int compactSlot){
    this.largeSlot = largeSlot;
    this.regularSlot = regularSlot;
    this.compactSlot = regularSlot;
  }
  public void fillListWithSlots(int largeSlot, int regularSlot, int compactSlot){
    if(slotList.isEmpty()){
      if()
    }
  }
}
