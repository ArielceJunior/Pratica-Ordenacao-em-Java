package view;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Candidate;

public class Main {
	public static void main(String[] args) {
		String csv = "dadosConcurso.csv";
		List<Candidate> Candidates = new ArrayList<>();


		try (BufferedReader br = new BufferedReader(new FileReader(csv))) {
			String line;
			br.readLine(); 
			while ((line = br.readLine()) != null) {
				String[] values = line.split(",");
				int id = Integer.parseInt(values[0]);
				String name = values[1];
				String birthDate = values[2];
				int grade = Integer.parseInt(values[3]);

				Candidate Candidate = new Candidate(id, name, birthDate , grade);
				Candidates.add(Candidate);
			}
		} catch (IOException e) {
			System.out.println("Erro ao ler o arquivo: " + e.getMessage());
		}


		Collections.sort(Candidates);


		System.out.println("Lista de Candidatos Ordenada:");
		for (Candidate Candidate : Candidates) {
			System.out.println(Candidate);
		}
	}
}