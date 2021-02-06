package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Program {

	public static void main(String[] args) {
		Map<String, Integer> candidato = new HashMap<>();
		String path = "C:\\Users\\Usuario\\Desktop\\material java\\in2.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			while (line != null) {
				String[] split = line.split(",");
				String name = split[0];
				int votos = Integer.parseInt(split[1]);
				if (candidato.containsKey(name)) {
					int soma = candidato.get(name) + votos;
					candidato.put(name, soma);
				} else {
					candidato.put(name, votos);
				}
				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Erro  :" + e.getMessage());
		}

		for (String name : candidato.keySet()) {
			System.out.println(name + ": " + candidato.get(name));
		}
	}
}
