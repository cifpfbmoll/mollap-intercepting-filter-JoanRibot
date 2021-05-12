public class Vehicle implements Target {
    
    public Vehicle();

    @Override
    public void execution(String name){
        System.out.println("Door is open" + name)
    }
}
