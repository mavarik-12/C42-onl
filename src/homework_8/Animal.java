package homework_8;

abstract class Animal {
    final String name;
    public Animal (final String name){
        this.name = name;
    }

    public abstract void voice();
    public abstract void eat(String food);
}










