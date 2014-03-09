package Kitchen;

import java.util.Iterator;

public class KitchenClient {

    public static void main(String[] args) {
        Kitchen k = Kitchen.getInstance();
        Menu m = new SimpleMenu();
        m.addItem(new MenuItem("Upma", 30, 200));
        m.addItem(new MenuItem("Poha", 30, 150));
        k.addMenu(m);

        Iterator i = k.getIterator();
        while (i.hasNext()) {
            Menu menu = (Menu) i.next();
            menu.printMenu();
        }
    }

}
