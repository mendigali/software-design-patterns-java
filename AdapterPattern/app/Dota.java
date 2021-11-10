package app;

import interfaces.WindowsApplication;

public class Dota implements WindowsApplication {
    @Override
    public String start() {
        return "Dota started working";
    }

    @Override
    public String finish() {
        return "Dota finished working";
    }
}
