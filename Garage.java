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
    fillListWithSlots(this.largeSlot,this.regularSlot,this.compactSlot);
  }
  public Garage(int largeSlot, int regularSlot, int compactSlot){
    this.largeSlot = largeSlot;
    this.regularSlot = regularSlot;
    this.compactSlot = regularSlot;
    fillListWithSlots(largeSlot,regularSlot,compactSlot);
  }

  public void fillListWithSlots(int largeSlot, int regularSlot, int compactSlot){
    int count=1;
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

  
}
