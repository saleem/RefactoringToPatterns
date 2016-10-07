package singleton;

public class Elvis {

    private static final Elvis theOne = new Elvis();

    public static Elvis instance() {
        return theOne;
    }
}
