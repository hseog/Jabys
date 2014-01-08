import java.__?.Queue;
public class Deck {

	Queue<Card> pile;

	public Deck() {
		this.pile = new Queue<Card>();
	}

	//peek at the top of the pile
	public Card peek() {
		return pile.peek();
	}

	//draw from the top of the pile
	public Card draw() {
		return pile.dequeue();
	}

	//place a card at the top of the pile
	public void put(Card toPut) {
		return pile.enqueue();
	}



}