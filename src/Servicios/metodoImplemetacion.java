package Servicios;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class metodoImplemetacion implements metodoInterfaz {
	Scanner sc = new Scanner (System.in);

	@Override
	public void añadir(List<Integer> numeros) {
		System.out.println("escribe un numero");
		int a = sc.nextInt();
		numeros.add(a);
		
		System.out.println("quieres escribir otro numero(si/no )");
		String res = sc.next();
		if(res == "si") {
			System.out.println("escribe un numero");
			numeros.add(sc.nextInt());
		}
	}

	@Override
	public void verForeach(List<Integer> numeros) {
		
		numeros.forEach(System.out::println);
	}

	@Override
	public void cambiar(List<Integer> numeros) {

		Collections.swap(numeros, 0, 6);	
	}

	@Override
	public void verFor(List<Integer> numeros) {
		for(int i = 1; i < numeros.indexOf(numeros) ;i++) {
			 System.out.println(numeros.get(i));
		}
		
	}

}
