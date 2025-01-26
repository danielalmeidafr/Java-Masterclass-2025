package masterclass.topic8.Polymorphism.video;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("S","Star Wars");
//        movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while (true){
            System.out.print("Enter the type of the movie (A for Adventure, C for Comedy, S for ScienceFiction or Q to quit): ");
            String type = s.nextLine();

            if ("Qq".contains(type)){
                break;
            }

            System.out.print("Enter the title of the movie: ");
            String title = s.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
