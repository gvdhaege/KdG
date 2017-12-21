package be.kdg.todo;

import java.time.LocalDate;
import java.util.Arrays;

public class TodoLijst {
    private static final int MAX_AANTAL = 100;
    private TodoItem[] items;
    private int aantalItemsInLijst;

    public TodoLijst() {
        this.items = new TodoItem[MAX_AANTAL];
        this.aantalItemsInLijst = 0;
    }

    public void add(String tekst, LocalDate datum) {

    }

    public void zetOpAfgewerkt(int index) {

    }

    public void verwijderAfgewerkteItems(){

    }

    public void printAll(){

    }

    public void printNietAfgewerkt(){

    }
}
