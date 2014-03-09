package Kitchen;

public class MenuItem {
    static int count = 0;
    private final int id;
    private String name;
    private final float price;
    private final float calorie;

    MenuItem(String name, float price, float calorie) {
        id = count++;
        this.name = name;
        this.price = price;
        this.calorie = calorie;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        return ("Menu Item: id=" + id + " Name=" + name + " Price=" + price + " Calorie=" + calorie+"\n");
    }

}
