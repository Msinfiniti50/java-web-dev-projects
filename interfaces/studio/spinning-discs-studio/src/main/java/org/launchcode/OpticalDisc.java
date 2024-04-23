package org.launchcode;

public interface OpticalDisc {
    void spin();
    void storeData(Object data);
    void writeDataWithLaser(Object data);
    Object readDataWithLaser();
    void load();
    String getName();
    double getCapacity();
    String getContents();
    String getDiscType();
    void initialize();
    boolean checkErrors();
}
