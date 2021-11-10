package adapters;

import interfaces.LinuxApplication;
import interfaces.MacApplication;

public class LinuxToMacAdapter implements MacApplication {
    private LinuxApplication app;

    public LinuxToMacAdapter(LinuxApplication app) {
        this.app = app;
    }

    @Override
    public String launch() {
        return app.open();
    }

    @Override
    public String terminate() {
        return app.close();
    }
}
