package SDA_exercises.Ex5;

import java.util.ArrayList;
import java.util.List;

public class SDAHashSet<T> {
    private List<T> list;

    public SDAHashSet() {
        this.list = new ArrayList<T>();
    }

    public void add(T value) {
        if (contains(value)) {
            list.add(value);
        }
    }

    public void remove(T value) {
        list.remove(value);
    }

    public int size() {
        return list.size();
    }

    public boolean contains(T value) {
        return list.contains(value);
    }

    public void clear() {
        list.clear();
    }
}
