package Filter;


// 具体过滤器
public class ColorFilter implements Filter{
    private String color;

    public ColorFilter(String color) {
        this.color = color;
    }

    @Override
    public boolean filterItem(Item item) {
        return item.getColor().equals(color);
    }
}
