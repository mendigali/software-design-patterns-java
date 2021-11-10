package os;

public abstract class OperatingSystem<T> {
    abstract String open(T app);
    abstract String close(T app);
}
