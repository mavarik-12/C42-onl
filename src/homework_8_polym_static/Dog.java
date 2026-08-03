package homework_8_polym_static;

 class Dog extends Animal {
     public Dog(String name){
         super(name);
     }

     @Override
     public final void voice(){
         System.out.println(name + "говорит: Гав - гав!");
     }

     @Override
     public void eat(final String food) {
         if ("Meat".equals(food)) {
             System.out.println(name + "доволен: любит мясо!");
         } else {
             System.out.println(name + "морщит нос: это не мясо");
         }
     }
 }

