package replaceStateAlteringConditionalsWithState.after.state;

import replaceStateAlteringConditionalsWithState.Actor;

public class AsleepState extends State {

    public AsleepState(Actor myActor) {
        super(myActor);
    }

    public State nextState(State desiredState) {
        return desiredState;
    }

    public void update() {
        myActor.snore();
    }
}
