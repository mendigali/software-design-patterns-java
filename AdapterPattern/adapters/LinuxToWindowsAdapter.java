package adapters;

import interfaces.LinuxApplication;
import interfaces.WindowsApplication;

public class LinuxToWindowsAdapter implements WindowsApplication {
    private LinuxApplication app;

    public LinuxToWindowsAdapter(LinuxApplication app) {
        this.app = app;
    }

    @Override
    public String start() {
        return app.open();
    }

    @Override
    public String finish() {
        return app.close();
    }
}
