package singleton;

public class Elvis {

    private static Elvis theOne;

    public static Elvis instance() {
        if (theOne == null) {
            theOne = new Elvis();
        }
        return theOne;
    }
}
