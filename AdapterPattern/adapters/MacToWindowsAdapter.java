package adapters;

import interfaces.MacApplication;
import interfaces.WindowsApplication;

public class MacToWindowsAdapter implements WindowsApplication {
    private MacApplication app;

    public MacToWindowsAdapter(MacApplication app) {
        this.app = app;
    }

    @Override
    public String start() {
        return app.launch();
    }

    @Override
    public String finish() {
        return app.terminate();
    }
}
