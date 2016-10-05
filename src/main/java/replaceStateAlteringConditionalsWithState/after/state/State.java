package replaceStateAlteringConditionalsWithState.after.state;

import replaceStateAlteringConditionalsWithState.Actor;

public abstract class State {
    protected Actor myActor;

    public State(Actor myActor){
        this.myActor = myActor;
    }

    public abstract State nextState(State desiredState);
    public abstract void update();
}
