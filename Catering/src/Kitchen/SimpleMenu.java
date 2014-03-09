package Kitchen;

import java.util.ArrayList;
import java.util.Iterator;

public class SimpleMenu implements Menu {

    private final ArrayList<MenuItem> menuItems;

    SimpleMenu() {
        menuItems = new ArrayList<MenuItem>();
    }

    @Override
    public void printMenu() {

        Iterator i = menuItems.iterator();
        while (i.hasNext()) {
            System.out.print(i.next().toString());
        }

    }

    @Override
    public void addItem(MenuItem x) {

        menuItems.add(x);
    }

    @Override
    public void deleteItem(MenuItem x) {

    }

    @Override
    public Iterator getIterator() {
        return menuItems.iterator();
    }
}