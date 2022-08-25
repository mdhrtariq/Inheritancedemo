 class A {
     public void show() {
         System.out.println("I AM A ZERO");
     }
 }

     class B {
        public void show() {
            System.out.println("I AM A HERO");
        }
    }

         class C extends B
        {
            public static void main(String[] args)
            {
                C obj = new C();
                B obj1= new B();
                A obj2= new A();
                obj2.show();
                obj.show();
                obj2.show();
                obj.show();
                obj2.show();
                obj.show();

            }
        }

