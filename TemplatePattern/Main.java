import template.Armchair;
import template.Sofa;

public class Main {
    public static void main(String[] args) {
        Sofa sofa = new Sofa();
        sofa.buildFurniture();

        System.out.println("\n------------------------------\n");

        Armchair armchair = new Armchair();
        armchair.buildFurniture();
    }
}