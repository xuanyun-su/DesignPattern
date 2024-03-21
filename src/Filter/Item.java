package Filter;


// 要被过滤的对象
public class Item {
    private String color;
    private int size;

    public Item(String color, int size) {
        this.color = color;
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
