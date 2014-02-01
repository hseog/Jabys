import java.util.ArrayDeque;

public class Deck {

	private ArrayDeque<Card> pile;

	public Deck() {
		this.pile = new ArrayDeque<Card>();
		
	}

	//peek at the top of the pile
	public Card peek() {
		return pile.peekFirst();
	}

	//draw from the top of the pile
	public Card draw() {
		return pile.removeFirst();
	}

	//place a card at the top of the pile
	public void put(Card toPut) {
		return pile.addLast();
	}

	//size of the deck
	public int size() {
		return pile.size();
	}



}