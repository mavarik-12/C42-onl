package homework_8;

import java.util.Random;

class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name);
    }

    @Override
    public final void voice() {
        System.out.println(name + "пищит: Пи-пи-пи!");
    }

    @Override
public void eat(final String food){
        if ("Grass".equals(food)) {
            System.out.println(name + "хрустит: обожаю травку!");
        } else if ("Carrot".equals(food)) {
            System.out.println(name + "хрустит: вкусная морковка!");
        } else {
            System.out.println(name + "грустно смотрит: я не ем это. ");
        }
    }
}







