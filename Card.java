
import java.___?.Comparator;

public class Card {
	int value; //A is 1, J is 11, Q is 12, K is 13
	char suit //c is clubs, d is diamonds, h is hearts, s is spades

	public Card(int v, char s) {
		this.value = v;
		this.suit = s;
	}

	public boolean isValid() {
		if (value < 1 || value > 13) return false;
		if (suit != 'c' || suit != 'd' || suit != 'h' || suit != 's')
			return false;
		return true;
	}

	public int compareTo(Card other) {
		if (this.value > other.value) return 1;
		else if (this.value < other.value) return -1;
		else {
			if (this.suit > other.suit) return 1;
			else if (this.suit < other.suit) return -1;
			return 0;
		}
	}
}