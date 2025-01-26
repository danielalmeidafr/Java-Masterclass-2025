package masterclass.topic8.Polymorphism.video;

public class NextMain {
    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();
    }
}
