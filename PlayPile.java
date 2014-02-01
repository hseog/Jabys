//import Queue
import java.util.Stack;

public class PlayPile {
	Stack<Card> pile;

	public PlayPile() {
		pile = new Stack<Card>();
	}

	public void playHand(Hand toPlay) {
		pile.push(toThrow);
	}

	public boolean isEmpty() {
		return pile.isEmpty();
	}

	public Stack<Card> refillDeck() {
		Stack<Card> temp = new Stack<Card>();
		//keep the top 4 cards
		temp.push(pile.pop());
		temp.push(pile.pop());
		temp.push(pile.pop());
		temp.push(pile.pop());

		Stack<Card> newPile = new  Stack<Card>();
		newPile.push(temp.pop());
		newPile.push(temp.pop());
		newPile.push(temp.pop());
		newPile.push(temp.pop());

		temp = pile;
		pile = newPile;

		Collections.shuffle(temp);

		return temp;
	}

	
}