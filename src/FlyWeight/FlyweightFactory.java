package FlyWeight;

import java.util.HashMap;
import java.util.Map;

// 享元工厂
public class FlyweightFactory {

    private Map<Integer,Flyweight> flyweights = new HashMap<>();
    public  Flyweight getFlyweight(int intrinsicState){
        if(!flyweights.containsKey(intrinsicState)){
            Flyweight flyweight = new ConcreteFlyweight(intrinsicState);
            flyweights.put(intrinsicState,flyweight);
        }
        return flyweights.get(intrinsicState);
    }
}
