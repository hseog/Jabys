//import Stack

public class DiscardPile {

	private Stack<Card> pile;

	public DiscardPile() {
		pile = new Stack<Card>();
	}

	public Card draw() {
		return pile.pop();
	}

	public Card put(Card toThrow) {
		return pile.push(toThrow);
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

		return temp;
	}
}