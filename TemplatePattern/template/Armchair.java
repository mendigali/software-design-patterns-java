package template;

public class Armchair extends Furniture {
    @Override
    public void drawBlueprint() {
        System.out.println("Armchair class: Draw armchair blueprint!");
    }

    @Override
    public void buildWoodenFrame() {
        System.out.println("Armchair class: Build armchair wooden frame!");
    }

    @Override
    public void addUpholstery() {
        System.out.println("Armchair class: Add armchair upholstery!");
    }
}
