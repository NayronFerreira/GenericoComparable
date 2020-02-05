package servico;

import java.util.List;

public class Servico {
	
	public static  <N extends Comparable <N>> N max(List <N>lista) {
					
			N max = lista.get(0);
			
			for (N x : lista) {
				if (x.compareTo(max)>0) {
					max = x;
				}
			}
		
		return max;
	}

}
