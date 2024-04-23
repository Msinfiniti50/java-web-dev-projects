package org.launchcode;

public class CD implements OpticalDisc{

    private boolean isInitialized;
        private boolean hasErrors;
        private boolean isEjected;
        private Object storedData;

        public CD() {
            this.isInitialized = false;
            this.hasErrors = false;
            this.isEjected = true;
        }
public void spin() {
           public void storeData(Object data) {
               if (isInitialized) {
                   this.storedData = data;
               } else {
                   System.out.println("Please initialize first");
               }
    }
      public void
      writeDataWithLaser(Object data) {
               if (isInitialized) {
                   this.storedData = data;
                   System.out.println("Writing data to CD");
               } else {
                   System.out.println("Please initialize first before writing data");
               }

    }
     public Object readDataWithLaser() {
               if(isInitialized){
                   return this.storedData;
    } else{
            System.out.println
        ("Please initialize first");
                   return null;
        }}
    public void load() {

    }
    public String getName(){
               return "My CD";
    }
    public double getCapacity() {
               return 700;
    }
    public String getContents() {
               return storedData != null ? storedData.toString():"";
    }
    public String getDiscType() {
               return "CD";
    }
    public void initialize() {
               this.isInitialized = true;

    }
    public boolean checkErrors() {
               return this.hasErrors;
    }
    public void eject(){
               if (!isEjected) {
                   this.isEjected = true;
                   System.out.println("Ejected");
               } else{
                   System.out.println("CD already ejected.");
               }
    }
    public void display() {
               System.out.println("Displaying CD information");
        System.out.println("Name: " + getName());
        System.out.println("Capacity: " + getCapacity() + " MB");
        System.out.println("Contents: " + getContents());
        System.out.println("Disc Type: " + getDiscType());
    }
}

    @Override
    public void storeData(Object data) {

    }

    @Override
    public void writeDataWithLaser(Object data) {

    }

    @Override
    public Object readDataWithLaser() {
        return null;
    }

    @Override
    public void load() {

    }

    @Override
    public String getName() {
        return "";
    }

    @Override
    public double getCapacity() {
        return 0;
    }

    @Override
    public String getContents() {
        return "";
    }

    @Override
    public String getDiscType() {
        return "";
    }

    @Override
    public void initialize() {

    }

    @Override
    public boolean checkErrors() {
        return false;
    }
}

