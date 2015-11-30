import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class GameOfLifeShould {
	private GameOfLife game = new GameOfLife();
	
	@Test
	public void nextStateIsDeadWith0Neighbours() {
		
		assertEquals(State.DEAD, game.getNextState(State.DEAD, 0));
		assertEquals(State.DEAD, game.getNextState(State.LIVE, 0));
	}
	
	@Test
	public void nextStateIsDeadWith1Neighbour() {
		
		assertEquals(State.DEAD, game.getNextState(State.LIVE, 1));
		assertEquals(State.DEAD, game.getNextState(State.DEAD, 1));
	}
	
	@Test
	public void nextStateIsDeadWith4orMoreNeighbours() {
		
		for(int i = 4; i <= 8; i++) {
			assertEquals(State.DEAD, game.getNextState(State.DEAD, i));
			assertEquals(State.DEAD, game.getNextState(State.LIVE, i));
		}
	}
	
	@Test
	public void nextStateRemainsTheSameWith2Neighbours() {
		
		State current = State.LIVE;
		assertEquals(current, game.getNextState(current, 2));
		current = State.DEAD;
		assertEquals(current, game.getNextState(current, 2));
	}
	
	@Test
	public void nextStateIsLiveWith3Neighbours() {
		
		assertEquals(State.LIVE, game.getNextState(State.LIVE, 3));
		assertEquals(State.LIVE, game.getNextState(State.DEAD, 3));
	}
}













