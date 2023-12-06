import object.Card;
import object.Deck;
import object.Feedback;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Card> cards = new ArrayList<>();

        cards.add(new Card("Qual o valor de PI?", "3.14"));


        Deck deck = new Deck("Matematica", cards);

        LocalDate diadarevisao = cards.get(0).revisaoEspacada(Feedback.HARD);



        System.out.println("revisão vai ser no dia:" + diadarevisao);
        sc.close();
    }
}