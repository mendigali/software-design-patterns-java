package state;

public class DoorOpenLockClosedState implements DoorStateInterface {
    Door door;

    public DoorOpenLockClosedState(Door door) {
        this.door = door;
    }

    @Override
    public void open() {
        System.out.println("The door is already open!");
    }

    @Override
    public void close() {
        System.out.println("You cannot close the door while lock is closed!");
    }

    @Override
    public void rotateKeyClockwise() {
        System.out.println("The lock is already closed!");
    }

    @Override
    public void rotateKeyCounterclockwise() {
        System.out.println("The lock is now open!");
        door.setState(door.getDoorOpenLockOpen());
    }
}
