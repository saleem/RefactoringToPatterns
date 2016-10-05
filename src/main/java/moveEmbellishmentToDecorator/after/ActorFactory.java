package moveEmbellishmentToDecorator.after;

import moveEmbellishmentToDecorator.Position;

public class ActorFactory {

    public static Actor createActor(Position position){
        return new Character(position);
    }

    public static Actor createActorWithFireAura(Position position){
        Actor actor = createActor(position);
        return new RadiusDecorator(actor);
    }

}
