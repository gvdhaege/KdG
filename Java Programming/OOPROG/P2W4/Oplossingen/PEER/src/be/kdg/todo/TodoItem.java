package be.kdg.todo;

import javax.xml.transform.Templates;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * User: vochtenh
 * Date: 2-12-13 16:04
 * User: venjoha
 * Date: 29-11-14 (review and adjustments for AJ1415)
 */
public class TodoItem  implements Comparable<TodoItem> {
    private String titel;
    private LocalDate deadline;
    private boolean afgewerkt;

    public TodoItem(String titel, LocalDate deadline) {
        if (titel==null||titel.equals(""))
            throw new IllegalArgumentException("Titel mag niet leeg zijn");

        this.titel = titel;
        this.afgewerkt = false;
        setDeadline(deadline);
    }

    public void setDeadline(LocalDate deadline) {
        if (Period.between(LocalDate.now(), deadline).getDays() <= 0) {
            throw new IllegalArgumentException("Deadline moet na vandaag vallen!");
        }
        this.deadline = deadline;
    }

    public void setAfgewerkt(boolean afgewerkt) {
        this.afgewerkt = afgewerkt;
    }

    public boolean isAfgewerkt() {
        return afgewerkt;
    }

    @Override
    public String toString() {
        String status = "Klaar!";
        if(!afgewerkt){
            Period timeLeft = Period.between(LocalDate.now(), deadline);
            status = String.format("Nog %d jaar, %d maanden en %d dagen", timeLeft.getYears()
                                                        , timeLeft.getMonths()
                                                        , timeLeft.getDays());
        }

        return String.format("%-30s%15s%40s"
                                    ,titel
                                    ,deadline.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                                    ,status);
    }


    @Override

    public int compareTo(TodoItem o) {
        return this.deadline.compareTo(o.deadline);
    }

}
