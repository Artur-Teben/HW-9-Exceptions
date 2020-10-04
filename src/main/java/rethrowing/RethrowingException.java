package rethrowing;

public class RethrowingException {

    public void someMethod() throws Exception {
        someMethod2();
    }

    public void someMethod2() throws Exception {
        throw new Exception();
    }
}
