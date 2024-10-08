package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidate implements Comparable<Candidate> {
    private int id;
    private String name;
    private LocalDate birthDate;
    private int grade;

    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    
    public Candidate(int id, String name, String birthDate, int grade) {
        this.id = id;
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate, formatter);
        this.grade = grade;
    }
    
    @Override
    public int compareTo(Candidate outro) {
        
        if (this.grade != outro.grade) {
            return Integer.compare(outro.grade, this.grade);
        }
        
        return this.birthDate.compareTo(outro.birthDate);
    }

    @Override
    public String toString() {
        return "ID: "+ id +", Nome: "+name+", Data de Nascimento: "+birthDate+ ", Nota: "+grade;
    }
    
    
    
}