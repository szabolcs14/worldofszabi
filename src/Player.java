//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.ArrayList;

public class Player {
    public Scene scene;
    private ArrayList<Item> inventory;

    public Player(Scene startingScene) {
        this.scene = startingScene;
        this.inventory = new ArrayList();
    }

    public Scene getCurrentScene() {
        return this.scene;
    }

    public void setCurrentScene(Scene scene) {
        this.scene = scene;
    }

    public void takeItem(Item item) {
        this.inventory.add(item);
    }

    public String getInventoryString() {
        if (this.inventory.isEmpty()) {
            return "A leltárad üres!";
        } else {
            StringBuilder returnString = new StringBuilder();

            for(Item item : this.inventory) {
                returnString.append(" ").append(item.getName());
            }

            return returnString.toString();
        }
    }
}