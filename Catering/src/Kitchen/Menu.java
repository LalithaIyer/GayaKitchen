package Kitchen;

import java.util.Iterator;

public interface Menu {

    void printMenu();

    void addItem(MenuItem x);

    void deleteItem(MenuItem x);

    public Iterator getIterator();
}
