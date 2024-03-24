package Memo;


import java.util.ArrayList;
import java.util.List;

// 管理者
public class Caretaker {
    private  final List<Memento> memetoList = new ArrayList<>();
    public void addMemento(Memento memento){
        memetoList.add(memento);
    }

    public Memento getMemento(int index){
        return memetoList.get(index);
    }
}
