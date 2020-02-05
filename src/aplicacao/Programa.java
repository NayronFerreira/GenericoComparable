package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Produto;
import servico.Servico;

public class Programa {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		List <Produto> lista = new ArrayList<>();
		String arq = "C:\\Users\\Nayron\\Downloads\\estudos.txt";
		
		try(BufferedReader bf = new BufferedReader (new FileReader(arq))){
			
			String linha = bf.readLine();
			
			while(linha!=null) {
				String [] atributo = linha.split(",");
				Produto produto = new Produto(atributo [0] , Double.parseDouble(atributo [1]) ); 
				lista.add(produto);
				linha = bf.readLine();
				
			}
			
			Produto max = Servico.max(lista);
			System.out.println("Max: "+ max);
			
		}catch(IOException x) {
			
		}
		
		
		
		leia.close();

	}

}
