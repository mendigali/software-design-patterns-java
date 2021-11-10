package state;

public interface DoorStateInterface {
    void open();
    void close();

    // closes the door
    void rotateKeyClockwise();

    // opens the door
    void rotateKeyCounterclockwise();
}
