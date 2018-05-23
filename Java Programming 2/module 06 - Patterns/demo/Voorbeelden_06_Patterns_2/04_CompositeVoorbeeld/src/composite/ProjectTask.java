package composite;

import java.time.LocalDate;

/**
 * De leaf-klasse ProjectTask implementeert de gemeenschappelijke interface ProjectComponent
 */
public class ProjectTask implements ProjectComponent{
    private String responsible;
    private String description;
    private LocalDate start;
    private int hours;

    public ProjectTask(String responsible, String description, LocalDate start, int hours) {
        this.responsible = responsible;
        this.description = description;
        this.start = start;
        this.hours = hours;
    }

    public int getTime() {
        return hours;
    }

    @Override
    public String toString() {
        return String.format("%s (%s) --> %d hrs", description, responsible, hours);
    }
}
