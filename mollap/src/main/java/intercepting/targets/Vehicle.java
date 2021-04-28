public class Vehicle implements Target {
    
    public Vehicle();

    @Override
    public void execution(String name){
        print("Door is open" + name.toString())
    }
}
