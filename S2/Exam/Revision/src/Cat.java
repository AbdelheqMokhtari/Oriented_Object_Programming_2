public class Cat extends Animal2 implements Animal,example{
    @Override
    public void eat(String name) {
        try {
            System.out.println("the cat " + name + " is eating");
        }catch (Exception e){
            System.out.println("there is an exception");
        }
    }

    @Override
    public void eat() {

    }

    @Override
    public void eat(Lists lists) {

    }

    @Override
    public void makeVoice() {
        System.out.println("the cat is making noise !!! ");
    }

    @Override
    void walking() {
        System.out.println("The cat is walking !!! ");
    }
}
