package interfaces;

import all.*;
public interface intActions {
    void grewUp();
    void gotUp(partsBody type);
    void lay(String object);
    void leanedOn(partsBody type,String object);
    void putIn(partsBody type);
    void StickedOut(partsBody type,String object);
    void placedIn(partsBody type,String object);
    void flopped(Subjects first,Subjects second) throws NotFlopableException;
    void getTrauma();
    void flashed();
    void runAway();
    void looked(Directions type);

}
