package state;

public class DoorClosedLockClosedState implements DoorStateInterface {
    Door door;

    public DoorClosedLockClosedState(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The door lock is closed! Rotate the key counterclockwise to open!");
    }

    @Override
    public void close() {
        System.out.println("The door and the lock are already closed!");
    }

    @Override
    public void rotateKeyClockwise() {
        System.out.println("The door lock is already closed! In order to open it, rotate the key in opposite direction!");
    }

    @Override
    public void rotateKeyCounterclockwise() {
        System.out.println("Congratulations, the door lock is now open! You can pull the door knob to open it!");
        door.setState(door.getDoorClosedLockOpen());
    }
}
