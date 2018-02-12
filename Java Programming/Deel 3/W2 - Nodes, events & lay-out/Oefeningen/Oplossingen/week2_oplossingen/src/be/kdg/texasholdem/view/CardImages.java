package be.kdg.texasholdem.view;

import be.kdg.texasholdem.model.Card;
import javafx.scene.image.Image;

import java.util.HashMap;
import java.util.Map;

public class CardImages {
    private static final Map<Card, Image> cardImages;
    private static final Image cardBack;
    private static final String imagePath = "be/kdg/texasholdem/view/images/";

    static {
        cardBack = new Image(imagePath + "cardBack_blue4.png");

        cardImages = new HashMap<>();

        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                String fileName = "card";
                switch (suit) {
                    case HEARTS:
                        fileName += "Hearts";
                        break;
                    case DIAMONDS:
                        fileName += "Diamonds";
                        break;
                    case CLUBS:
                        fileName += "Clubs";
                        break;
                    case SPADES:
                        fileName += "Spades";
                        break;
                }
                switch (rank) {
                    case TWO:
                        fileName += "2";
                        break;
                    case THREE:
                        fileName += "3";
                        break;
                    case FOUR:
                        fileName += "4";
                        break;
                    case FIVE:
                        fileName += "5";
                        break;
                    case SIX:
                        fileName += "6";
                        break;
                    case SEVEN:
                        fileName += "7";
                        break;
                    case EIGHT:
                        fileName += "8";
                        break;
                    case NINE:
                        fileName += "9";
                        break;
                    case TEN:
                        fileName += "10";
                        break;
                    case JACK:
                        fileName += "J";
                        break;
                    case QUEEN:
                        fileName += "Q";
                        break;
                    case KING:
                        fileName += "K";
                        break;
                    case ACE:
                        fileName += "A";
                        break;
                }
                fileName += ".png";
                cardImages.put(new Card(suit, rank), new Image(imagePath + fileName));
            }
        }
    }

    static Image get(Card card) {
        return cardImages.get(card);
    }

    static Image getCardBack() {
        return cardBack;
    }
}
