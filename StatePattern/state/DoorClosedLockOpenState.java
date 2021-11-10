package state;

public class DoorClosedLockOpenState implements DoorStateInterface {
    Door door;

    public DoorClosedLockOpenState(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The door is open, you can enter the room!");
        door.setState(door.getDoorOpenLockOpen());
    }

    @Override
    public void close() {
        System.out.println("The door is already closed, but you can pull the door knob to open it!");
    }

    @Override
    public void rotateKeyClockwise() {
        System.out.println("The door lock is now closed!");
        door.setState(door.getDoorClosedLockClosed());
    }

    @Override
    public void rotateKeyCounterclockwise() {
        System.out.println("The door lock is already open!");
    }
}
