package Filter;

import java.util.ArrayList;
import java.util.List;

// 过滤器管理器
public class FilterManager {
    private List<Filter> filters;

    public FilterManager(List<Filter> filters) {
        this.filters = filters;
    }

    public List<Item> filterItems(List<Item> items){
        List<Item> fItems= new ArrayList<>(items);
        for (Filter filter : filters) {
            fItems = filterItems(fItems,filter);
        }
        return  fItems;
    }

    public List<Item> filterItems(List<Item> items,Filter filter){
        List<Item> filters = new ArrayList<>();
        for (Item item : items) {
            if(filter.filterItem(item)){
                filters.add(item);
            }
        }
        return filters;
    }
}
