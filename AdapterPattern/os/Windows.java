package os;

import interfaces.WindowsApplication;

public class Windows extends OperatingSystem<WindowsApplication> {
    @Override
    public String open(WindowsApplication app) {
        return app.start();
    }

    @Override
    public String close(WindowsApplication app) {
        return app.finish();
    }
}
