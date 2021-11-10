package state;

public class Door implements DoorStateInterface {
    DoorStateInterface doorClosedLockClosed;
    DoorStateInterface doorClosedLockOpen;
    DoorStateInterface doorOpenLockClosed;
    DoorStateInterface doorOpenLockOpen;

    DoorStateInterface state;

    public Door() {
        doorClosedLockClosed = new DoorClosedLockClosedState(this);
        doorClosedLockOpen = new DoorClosedLockOpenState(this);
        doorOpenLockClosed = new DoorOpenLockClosedState(this);
        doorOpenLockOpen = new DoorOpenLockOpenState(this);

        this.state = doorClosedLockClosed;

        System.out.println("The door was created! Both door and lock are closed.");
    }

    @Override
    public void open() {
        this.state.open();
    }

    @Override
    public void close() {
        this.state.close();
    }

    @Override
    public void rotateKeyClockwise() {
        this.state.rotateKeyClockwise();
    }

    @Override
    public void rotateKeyCounterclockwise() {
        this.state.rotateKeyCounterclockwise();
    }

    protected DoorStateInterface getDoorClosedLockClosed() {
        return doorClosedLockClosed;
    }

    protected DoorStateInterface getDoorClosedLockOpen() {
        return doorClosedLockOpen;
    }

    protected DoorStateInterface getDoorOpenLockClosed() {
        return doorOpenLockClosed;
    }

    protected DoorStateInterface getDoorOpenLockOpen() {
        return doorOpenLockOpen;
    }

    protected void setState(DoorStateInterface state) {
        this.state = state;
    }
}