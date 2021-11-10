package adapters;

import interfaces.LinuxApplication;
import interfaces.MacApplication;

public class MacToLinuxAdapter implements LinuxApplication {
    private MacApplication app;

    public MacToLinuxAdapter(MacApplication app) {
        this.app = app;
    }

    @Override
    public String open() {
        return app.launch();
    }

    @Override
    public String close() {
        return app.terminate();
    }
}
