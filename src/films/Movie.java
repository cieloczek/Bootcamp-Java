package films;

public class Movie {
    private String title;
    private String releseDate;

    public Movie(String title, String releseDate) {
        this.title = title;
        this.releseDate = releseDate;
    }

    @Override
    public String toString() {
        return  title + " released : " +releseDate;
    }
}
