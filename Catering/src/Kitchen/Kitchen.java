package Kitchen;

import java.util.ArrayList;
import java.util.Iterator;

public class Kitchen {

    private static Kitchen uniqueInstance = new Kitchen();
    private ArrayList<Menu> menuSelection;

    private Kitchen() {
    }

    public static Kitchen getInstance() {
        return uniqueInstance;
    }

    public Iterator getIterator() {
        return menuSelection.iterator();
    }

    public void addMenu(Menu m) {
        if (menuSelection == null) {
            menuSelection = new ArrayList<Menu>();
        }
        menuSelection.add(m);
    }
}
