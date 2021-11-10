package template;

import interfaces.FurnitureInterface;

public abstract class Furniture implements FurnitureInterface {
    @Override
    public void buildFurniture() {
        drawBlueprint(); // чертеж мебели
        collectMaterials(); // собрать необходимые материалы
        buildWoodenFrame(); // деревянный каркас
        addUpholstery(); // мягкая обивка
    }

    @Override
    public abstract void drawBlueprint();

    @Override
    public void collectMaterials() {
        System.out.println("Abstract Furniture class: Collecting required materials!");
    };

    @Override
    public abstract void buildWoodenFrame();

    @Override
    public abstract void addUpholstery();
}