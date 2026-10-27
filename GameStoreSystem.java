import java.util.ArrayList;
import java.util.Comparator;

class Game implements Comparable<Game>{
    String name;
    double price;
    int rating;

    public Game(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    @Override
    public int compareTo(Game o) {
        return Double.compare(this.price, o.price);
    }

}

public class GameStoreSystem {
    public static void main(String[] args) {

        ArrayList<Game> games = new ArrayList<>();

        games.add(new Game("Minecraft", 500, 9));
        games.add(new Game("GTA V", 700, 8));
        games.add(new Game("Star Valley", 300, 10));

        games.sort(
            Comparator.comparingInt((Game game) -> game.rating).reversed()
        );
        
        for(Game game : games){
            System.out.println(game.name + " - " + game.rating);
        }
    }
}
