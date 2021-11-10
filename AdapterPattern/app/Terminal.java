package app;

import interfaces.LinuxApplication;

public class Terminal implements LinuxApplication {
    @Override
    public String open() {
        return "Terminal opened";
    }

    @Override
    public String close() {
        return "Terminal closed";
    }
}
