import java.util.ArrayList;
import java.util.HashMap;

public class Scene {
    private String description;
    private ArrayList<Item> items;
    private HashMap<Direction, Scene> exist;

    public Scene(String description) {
        this.description = description;
        this.items = new ArrayList<>();
        this.exist = new HashMap<>();
    }

    public  void  setExist(Direction direction, Scene neighbour){
        // itt adunk hozzá kijáratot a helyszínhez, irány ás szomszéd helyszín
        // formájában
        // A HashMap put() metúdusa hasonló az Arraylist add() metódsuához, új elemet adunk hozzá
        // csak ez key (direction) és value(szomszéd) párokat cár mindig. A Direction egx EENUM
        exist.put(direction,neighbour);
    }

    public  void addItem(Item item){
        items.add(item);
    }

    // Az adott irányban milyen szomszédos helyszín van
    public Scene getExit(Direction direction){
        return exist.get(direction);
    }
}
