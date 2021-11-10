package os;

import interfaces.LinuxApplication;

public class Linux extends OperatingSystem<LinuxApplication> {
    @Override
    public String open(LinuxApplication app) {
        return app.open();
    }

    @Override
    public String close(LinuxApplication app) {
        return app.close();
    }
}
