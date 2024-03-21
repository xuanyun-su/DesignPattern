package Composite;


import java.util.ArrayList;
import java.util.List;

// 树枝节点
public class Composite implements  Component {
    private List<Component> children = new ArrayList<>();
    public  void addChild(Component child){
        children.add(child);
    }

    @Override
    public void operation() {
        for (Component child:children){
            child.operation();
        }
    }
}
