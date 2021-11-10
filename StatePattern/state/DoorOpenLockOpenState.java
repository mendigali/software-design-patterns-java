package state;

public class DoorOpenLockOpenState implements DoorStateInterface {
    Door door;

    public DoorOpenLockOpenState(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The door is already open!");
    }

    @Override
    public void close() {
        System.out.println("The door is closed!");
        door.setState(door.getDoorClosedLockOpen());
    }

    @Override
    public void rotateKeyClockwise() {
        System.out.println("The lock is closed but the door is open!");
        door.setState(door.getDoorOpenLockClosed());
    }

    @Override
    public void rotateKeyCounterclockwise() {
        System.out.println("The lock is already open!");
    }
}
