package object;

import java.util.List;

public class Deck {
    private String titulo;
    private List<Card> cards;

    private boolean acertouCard;


    public Deck(String titulo, List<Card> cards) {
        this.titulo = titulo;
        this.cards = cards;
        acertouCard = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<Card> getCards() {
        return cards;
    }

    public void setCards(List<Card> cards) {
        this.cards = cards;
    }


    public void comecaDeck(){

    }
}
