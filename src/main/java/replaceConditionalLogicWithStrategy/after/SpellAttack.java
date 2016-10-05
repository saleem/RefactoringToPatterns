package replaceConditionalLogicWithStrategy.after;

import java.util.Random;

public class SpellAttack implements Attack{
    public void hit(Actor target) {
        target.applyDamage(new Random().nextInt(5));
    }
}

