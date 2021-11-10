package adapters;

import interfaces.MacApplication;
import interfaces.WindowsApplication;

public class WindowsToMacAdapter implements MacApplication {
    private WindowsApplication app;

    public WindowsToMacAdapter(WindowsApplication app) {
        this.app = app;
    }

    @Override
    public String launch() {
        return app.start();
    }

    @Override
    public String terminate() {
        return app.finish();
    }
}
