package gr.aueb.cf.study.oop;

public class Fruit extends Item {
    private String type;

    public Fruit(String name, int quanity, String type) {
        super(name, quanity);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Fruit: " + getName() + ", Quantity: " + getQuantity() + ", Type: " + type;
    }
}
