package be.kdg.todo;

import java.time.LocalDate;
import java.util.Arrays;

/**
 * User: vochtenh
 * Date: 2-12-13 16:04
 * User: venjoha
 * Date: 29-11-14 (review and adjustments for AJ1415)
 */
public class TodoLijst {
    private static final int MAX_AANTAL = 2;
    private TodoItem[] items;
    private int aantalItemsInLijst;

    public TodoLijst() {
        this.items = new TodoItem[MAX_AANTAL];
        this.aantalItemsInLijst = 0;
    }

    public void add(String tekst, LocalDate datum) throws TodoLijstException {
        TodoItem newItem = new TodoItem(tekst, datum);
        if (aantalItemsInLijst==MAX_AANTAL) {
            //throw new TodoLijstException("Maximum bereikt...");
            throw new TodoLijstVolException(); //UITBREIDING 3
        }
        items[aantalItemsInLijst++] = newItem;
        Arrays.sort(items,0,aantalItemsInLijst);
    }

    public void zetOpAfgewerkt(int index) throws TodoLijstException{
        //if (index>aantalItemsInLijst) throw new TodoLijstException("Te hoge index!");
        //if (aantalItemsInLijst==0) throw new TodoLijstException("Er zijn nog geen items!");
        //UITBREIDING 3
        if (index>aantalItemsInLijst) throw new TodoLijstTeHogeIndexException();
        if (aantalItemsInLijst==0) throw new TodoLijstLeegException();
        items[index].setAfgewerkt(true);
    }

    public void verwijderAfgewerkteItems(){
        TodoItem[] newItems = new TodoItem[MAX_AANTAL];
        int newAantal = 0;
        for (int i=0;i<aantalItemsInLijst;i++){
            if (!items[i].isAfgewerkt()) {
                newItems[newAantal++]=items[i];
            }
        }
        this.items = newItems;
        this.aantalItemsInLijst = newAantal;
    }

    public void printAll(){
        for (int i=0;i<aantalItemsInLijst;i++){
            System.out.println(items[i]);
        }
    }

    public void printNietAfgewerkt(){
        for (int i=0;i<aantalItemsInLijst;i++){
            if (!items[i].isAfgewerkt()) {
                System.out.println((i+1) + ")" + items[i]);
            }
        }
    }
}
