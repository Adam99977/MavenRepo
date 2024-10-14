package super_keyword02;

class Dog extends Animal {

    Dog(String name) {
        super(name);  // Call the constructor of the superclass
    }

    // Overriding the method of the superclass
    @Override
    void sound() {
        super.sound();  // Call the superclass version of sound()
        System.out.println(name + " barks");
    }
}