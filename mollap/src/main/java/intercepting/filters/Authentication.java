public class Authentication implements Filter{

    public Authentication();

    @Override
    public void execucio(String name) {
        System.out.println("Authentication OK for " + name);
}
