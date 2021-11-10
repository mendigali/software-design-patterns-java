import adapters.*;
import app.Dota;
import app.FinalCut;
import app.Terminal;
import os.Linux;
import os.MacOS;
import os.Windows;


public class Main {

    public static void main(String[] args) {
        Windows windows = new Windows();
        MacOS macos = new MacOS();
        Linux linux = new Linux();

        Dota dota = new Dota();
        FinalCut finalCut = new FinalCut();
        Terminal terminal = new Terminal();

        MacToWindowsAdapter finalCutWindows = new MacToWindowsAdapter(finalCut);
        System.out.println("Windows: " + windows.open(finalCutWindows));
        System.out.println("Windows: " + windows.close(finalCutWindows));

        LinuxToWindowsAdapter terminalWindows = new LinuxToWindowsAdapter(terminal);
        System.out.println("Windows: " + windows.open(terminalWindows));
        System.out.println("Windows: " + windows.close(terminalWindows));



        LinuxToMacAdapter terminalMac = new LinuxToMacAdapter(terminal);
        System.out.println("MacOS: " + macos.open(terminalMac));
        System.out.println("MacOS: " + macos.close(terminalMac));

        WindowsToMacAdapter dotaMac = new WindowsToMacAdapter(dota);
        System.out.println("MacOS: " + macos.open(dotaMac));
        System.out.println("MacOS: " + macos.close(dotaMac));



        MacToLinuxAdapter finalCutLinux = new MacToLinuxAdapter(finalCut);
        System.out.println("Linux: " + linux.open(finalCutLinux));
        System.out.println("Linux: " + linux.close(finalCutLinux));

        WindowsToLinuxAdapter dotaLinux = new WindowsToLinuxAdapter(dota);
        System.out.println("Linux: " + linux.open(dotaLinux));
        System.out.println("Linux: " + linux.close(dotaLinux));
    }
}
