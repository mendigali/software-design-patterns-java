package os;

import interfaces.MacApplication;

public class MacOS extends OperatingSystem<MacApplication> {
    @Override
    public String open(MacApplication app) {
        return app.launch();
    }

    @Override
    public String close(MacApplication app) {
        return app.terminate();
    }
}
