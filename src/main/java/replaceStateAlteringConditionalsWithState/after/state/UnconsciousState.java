package replaceStateAlteringConditionalsWithState.after.state;

import replaceStateAlteringConditionalsWithState.Actor;

public class UnconsciousState extends State {

    public UnconsciousState(Actor myActor) {
        super(myActor);
    }

    public State nextState(State desiredState) {
        return desiredState;
    }

    public void update() {
        // Do nothing
    }
}
