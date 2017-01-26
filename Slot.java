public Slot{
  boolean isOccupied;
  int slotNumber;
  SlotType slotType;
  boolean isHandicap;
  public Slot(boolean isOccupied, int slotNumber, SlotType slotType, boolean isHandicap){
    this.isOccupied = isOccupied;
    this.slotNumber = slotNumber;
    this.slotType = slotType;
    this.isHandicap = isHandicap;
  }

}
