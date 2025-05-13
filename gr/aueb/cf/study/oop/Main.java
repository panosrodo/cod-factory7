package gr.aueb.cf.study.oop;

public class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Item item1 = new Item("Generic Item", 10);
        Fruit item2 = new Fruit("Apple", 20, "Fuji");
        Weapon weapon = new Weapon("Sword", 2, 75, "Melee");

        inventory.addItem(item1);
        inventory.addItem(item2);
        inventory.addItem(weapon);

        inventory.displayInvetory();
    }
}
