package Filter;

public class SizeFilter implements Filter{
    private  int size;

    public SizeFilter(int size) {
        this.size = size;
    }

    @Override
    public boolean filterItem(Item item) {
        return item.getSize() == size;
    }
}
