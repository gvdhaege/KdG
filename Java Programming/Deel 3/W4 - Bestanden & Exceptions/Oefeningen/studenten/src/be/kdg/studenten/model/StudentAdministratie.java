package be.kdg.studenten.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StudentAdministratie {
    private List<Student> studenten;
    private final InputStream inputStream;

    public StudentAdministratie() {
        studenten = new ArrayList<>();
        this.inputStream = this.getClass().getResourceAsStream("studenten.txt");
        this.readStudenten();
    }

    public List<Student> getStudenten() {
        return studenten;
    }

    private void readStudenten() {
        // Hier aanvullen...
    }
}
