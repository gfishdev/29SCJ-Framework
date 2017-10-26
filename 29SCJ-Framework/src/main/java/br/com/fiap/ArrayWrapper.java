package br.com.fiap;

import org.apache.commons.lang.ArrayUtils;

public class ArrayWrapper {

	
	public ArrayWrapper() {
		
		String carros[] = new String[]{"Toyota","Mercedes","Kia","Tico"};
		
		System.out.println("Posição do Kia: " + ArrayUtils.indexOf(carros, "Kia"));
		System.out.println(" ");
		System.out.println(ArrayUtils.toString(carros));
		
	}
	
	public static void main(String[] args) {
		
		new ArrayWrapper();
	}
	
	
}
