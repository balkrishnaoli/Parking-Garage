import java.util.ArrayList;
import java.util.Iterator;
public Garage{
  ArrayList<Space> spaceList = new ArrayList<Space>();
  int largeSlot;
  int regularSlot;
  int compactSlot;
  public Garage(int numerOfSpaces){
    this.largeSlot = numerOfSpaces/3;
    this.regularSlot = numerOfSpaces/3;
    this.compactSlot = numerOfSpaces/3;
  }
  public Garage(int largeSlot, int regularSlot, int compactSlot){
    this.largeSlot = largeSlot;
    this.regularSlot = regularSlot;
    this.compactSlot = regularSlot;
  }
  
}
