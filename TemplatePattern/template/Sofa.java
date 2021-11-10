package template;

public class Sofa extends Furniture {
    @Override
    public void drawBlueprint() {
        System.out.println("Sofa class: Draw sofa blueprint!");
    }

    @Override
    public void buildWoodenFrame() {
        System.out.println("Sofa class: Build sofa wooden frame!");
    }

    @Override
    public void addUpholstery() {
        System.out.println("Sofa class: Add sofa upholstery!");
    }
}
