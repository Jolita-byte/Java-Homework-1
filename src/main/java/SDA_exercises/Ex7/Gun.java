package SDA_exercises.Ex7;

import java.util.ArrayList;
import java.util.List;

public class Gun {
    private List<String> bullets;
    private int capacity;

    public Gun(int capacity) {
        bullets = new ArrayList<>();
        this.capacity = capacity;
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < capacity) {
            bullets.add(bullet);
        }
    }

    public boolean isLoaded() {
        return !bullets.isEmpty();
    }

    public void shoot() {
        if (isLoaded()) {
            int indexLast = bullets.size()-1;
            String bullet = bullets.get(indexLast);
            System.out.println(bullet);
            bullets.remove(indexLast);

        } else System.out.println("Empty magazine");
    }

}
