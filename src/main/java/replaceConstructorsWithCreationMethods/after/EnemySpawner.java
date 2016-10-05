package replaceConstructorsWithCreationMethods.after;

import java.util.ArrayList;
import java.util.List;

import static replaceConstructorsWithCreationMethods.after.Actor.battleWolf;
import static replaceConstructorsWithCreationMethods.after.Actor.goblinBalloon;
import static replaceConstructorsWithCreationMethods.after.Actor.orc;

public class EnemySpawner {

    public List<Actor> spawn(){
        List<Actor> enemies = new ArrayList<Actor>();
        enemies.add(orc());
        enemies.add(battleWolf().withRider(orc()));
        enemies.add(goblinBalloon());
        return enemies;
    }
}
