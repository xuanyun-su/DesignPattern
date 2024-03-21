package Filter;

import java.util.ArrayList;
import java.util.List;

public class FilterPatternDemo {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<Item>();
//        items.add(new Item("red",10));
        items.add(new Item("red", 10));
        items.add(new Item("blue", 15));
        items.add(new Item("red", 20));
        items.add(new Item("green", 10));

        List<Filter> filters = new ArrayList<>();
        filters.add(new ColorFilter("red"));
        filters.add(new SizeFilter(10));

        FilterManager filterManager = new FilterManager(filters);
        List<Item> filteredItems = filterManager.filterItems(items);

        for (Item item : filteredItems) {
            System.out.println(item.getColor() + " " + item.getSize());
        }
    }
}
