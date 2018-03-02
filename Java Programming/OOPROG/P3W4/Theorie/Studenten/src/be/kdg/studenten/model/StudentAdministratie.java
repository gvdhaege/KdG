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
        try (final BufferedReader br = new BufferedReader(new InputStreamReader(this.inputStream))) {
            String line = br.readLine();
            Student student;

            while (line != null) {
                final StringTokenizer tokenizer = new StringTokenizer(line);
                student = new Student(
                        tokenizer.nextToken(";"),
                        tokenizer.nextToken(";"),
                        Integer.parseInt(tokenizer.nextToken(";")),
                        tokenizer.nextToken(";"));
                studenten.add(student);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
