package replaceStateAlteringConditionalsWithState.after.state;

import replaceStateAlteringConditionalsWithState.Actor;

public class PatrollingState extends State {

    public PatrollingState(Actor myActor) {
        super(myActor);
    }

    public State nextState(State desiredState) {
        return desiredState;
    }

    public void update() {
        myActor.followPath();
    }
}
