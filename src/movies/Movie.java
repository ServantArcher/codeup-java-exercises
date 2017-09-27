package movies;

public class Movie {
    private String name;
    private String category;


    public Movie(String name, String category) {
        this.name = name;
        this.category = category;

    }

    public String getTitle(){
        return this.name;
    }
    public String getCategory(){
        return this.category;
    }
}

