package app;

import interfaces.MacApplication;

public class FinalCut implements MacApplication {
    @Override
    public String launch() {
        return "Final cut has launched";
    }

    @Override
    public String terminate() {
        return "Final cut has terminated";
    }
}
