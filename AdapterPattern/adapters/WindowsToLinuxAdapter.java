package adapters;

import interfaces.LinuxApplication;
import interfaces.WindowsApplication;

public class WindowsToLinuxAdapter implements LinuxApplication {
    private WindowsApplication app;

    public WindowsToLinuxAdapter(WindowsApplication app) {
        this.app = app;
    }

    @Override
    public String open() {
        return app.start();
    }

    @Override
    public String close() {
        return app.finish();
    }
}
