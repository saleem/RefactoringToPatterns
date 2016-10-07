package singleton;

public enum Genres {
    COUNTRY(1900), METAL(1960), RAP(1940), ROCK(1960);


    private int startedInDecade;

    Genres(int startedInDecade) {
        this.startedInDecade = startedInDecade;
    }


    public int getStartedInDecade() {
        return startedInDecade;
    }
}
