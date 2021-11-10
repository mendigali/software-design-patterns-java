import state.Door;

public class Main {

    public static void main(String[] args) {
        Door door = new Door();
        door.open();
        door.close();
        door.rotateKeyClockwise();

        // Open lock
        door.rotateKeyCounterclockwise();

        door.close();
        door.open();
    }
}