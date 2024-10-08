package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Candidate implements Comparable<Candidate> {
    private int id;
    private String name;
    private LocalDate birthDate;
    private int grade;

    

    
    public Candidate(int id, String name, String birthDate, int grade) {
        this.id = id;
        this.name = name;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
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
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return "ID: "+ id +", Nome: "+name+", Data de Nascimento: "+birthDate.format(formatter)+ ", Nota: "+grade;
    }
    
    
    
}