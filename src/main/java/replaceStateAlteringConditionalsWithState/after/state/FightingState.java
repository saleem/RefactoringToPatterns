package replaceStateAlteringConditionalsWithState.after.state;

import replaceStateAlteringConditionalsWithState.Actor;

public class FightingState extends State {

    public FightingState(Actor myActor) {
        super(myActor);
    }

    public State nextState(State desiredState) {
        return desiredState;
    }

    public void update() {
        myActor.attackCurrentTarget();
    }
}
