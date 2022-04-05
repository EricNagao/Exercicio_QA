package Segundo;
public class movieTestDive {
    String title;
    String genre;
    int rating;
    
    public static void main(String[] args) {
        newMovie one = new newMovie();
        one.title = "vixi maria";
        one.genre = "terror";
        one.rating = 8; 
        newMovie two = new newMovie();
        two.title = "só as comedias";
        two.genre = "comedia";
        two.rating = 5;
        newMovie three = new newMovie();
        three.title = "sem drama";
        three.genre = "drama";
        three.rating = 1;
        

        one.playIt();

        two.playIt();    

        three.playIt();
        
    }
       
            
}
