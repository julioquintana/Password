package com.ejercicios.password;

public class testPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Password psw1 = new Password();
		System.out.println(psw1.getClave());
		Password psw2 = new Password(19);
		String clave =psw2.getClave();
		System.out.println(clave);
		System.out.println(psw2.esFuerte(clave));
	}

}
