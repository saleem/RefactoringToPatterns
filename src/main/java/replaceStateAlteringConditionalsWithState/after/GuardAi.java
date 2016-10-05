package replaceStateAlteringConditionalsWithState.after;

import replaceStateAlteringConditionalsWithState.after.state.State;

public class GuardAi {
    State currentState;

    public GuardAi(State currentState) {
        this.currentState = currentState;
    }

    public void setState(State desiredState){
        currentState = currentState.nextState(desiredState);
    }

    public void update(){
        currentState.update();
    }
}
