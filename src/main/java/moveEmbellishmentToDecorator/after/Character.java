package moveEmbellishmentToDecorator.after;

import moveEmbellishmentToDecorator.Position;

public class Character implements Actor {

    private Position position;

    public Character(Position position){
        this.position = position;
    }

    public void moveTo(Position newPosition){
        position = newPosition;
    }
}
