public class Authorization implements Filter {

    public Authorization();

    @Override
    public void execucio(String name) {
        System.out.println("Authorizaation OK for " + name);
    }
}
