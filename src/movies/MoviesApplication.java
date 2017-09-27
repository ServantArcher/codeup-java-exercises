package movies;

import util.Input;

public class MoviesApplication {




//     public static void menu(){
//         System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category.");
//     }



     public static void filterMovies(String selectedCategory){
         Movie[] movies=MoviesArray.findAll();
         for(Movie movie: movies){
             String userCategory=movie.getCategory();
             if(userCategory.equalsIgnoreCase(selectedCategory) || selectedCategory.equalsIgnoreCase("all")) {
                 System.out.println(movie.getTitle()+" , "+movie.getCategory());
             }
         }


     }

    public static void main(String[] args) {
        int userInput;
         do {
            System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in the horror category\n5 - view movies in the scifi category.");
            Input input = new Input();
            userInput = input.getInt();
            if (userInput == 1) {
                filterMovies("all");
            } else if (userInput == 2) {
                filterMovies("animated");
            } else if (userInput == 3) {
                filterMovies("drama");
            } else if (userInput == 4) {
                filterMovies("horror");
            } else if (userInput == 5) {
                filterMovies("scifi");
            }
        }
        while(userInput!=0);



    }
}
