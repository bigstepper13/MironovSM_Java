import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class Solution<T, V, K> {
    T t;
    V v;
    K k;
    public Solution(T t, V v, K k) {
        this.t = t;
        this.v = v;
        this.k = k;
    }
    public <T> ArrayList<T> newArrayList (Collection<T> t) {
        return new ArrayList<>(t);
    }
    public <T> HashSet<T> newHashSet (Collection<T> t) {
        return new HashSet<>(t);
    }
    public <K, V> HashMap<K, V> newHashMap (HashMap<K,V> h) {
        return new HashMap<>(h);
    }
}