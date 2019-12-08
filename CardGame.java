package JavaPrograms;

import java.util.Random;
class Cards{
    private String face;
    private String suit;
    public Cards(String cardface,String cardsuit) {
        face = cardface;
        suit = cardsuit;
    }
    public String toString()
    {
        return face + " of " + suit;
    }

}
class DeckOfCards{
    private Cards deck[];
    private int currentcards=0;
    private final int no_of_card=52;
    private Random randomno;
    public DeckOfCards(){
        String faces[]={"ace","deuces","three","four","five","six","seven","eight","nine","ten","jack","queen","king"};
        String suits[]={"hearts","spade","diamond","clubs"};
        deck = new Cards[no_of_card];
        randomno  = new Random();
        for(int i=0;i<deck.length;i++)
        {
            deck[i]=new Cards(faces[i%13],suits[i/13]);
        }

    }
    public void shuffle(){
        currentcards=0;
        for(int first=0;first<deck.length;first++){
            int second = randomno.nextInt(no_of_card);
            Cards temp = deck[first];
            deck[first]=deck[second];
            deck[second]=temp;
        }
    }
    public Cards dealCard(){
        if(currentcards<deck.length)
            return deck[currentcards];
        else
            return null;
    }
}
public class CardGame{
    public static void main(String arg[]){
        DeckOfCards obj = new DeckOfCards();
        obj.shuffle();
        for(int i=0;i<13;i++){
            System.out.println(obj.dealCard());
        }
    }

}