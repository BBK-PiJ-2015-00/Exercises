

public class GameOfLife {
	
	public State getNextState (State current, int neighbourCount) {
		if(neighbourCount==2)
			return current;
		
		if(neighbourCount==3)
			return State.LIVE;
		
		return State.DEAD;
	}
}