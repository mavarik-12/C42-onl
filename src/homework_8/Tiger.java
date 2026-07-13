package homework_8;

 class Tiger extends Animal {
     public Tiger( String name){
         super(name);
     }
     @Override
 public final void voice(){
         System.out.println(name + "рычит: Р-р-р!");
     }

     @Override
     public void eat(final String food){
         if ("Meat".equals(food)) {
             System.out.println(name + "рад: свежая добыча!");
         } else {
             System.out.println(name + "фыркает: мне нужно мясо, а не это.");
         }
     }
 }

