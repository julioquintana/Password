package com.ejercicios.password;

public class Password {
	int longitud = 8;
	String clave;
	
	Password(){
		this.clave= generarClave(this.longitud);
	}
	Password(int longit){
		this.clave= generarClave(longit);
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	private String generarClave(int longitud) {
		String clave = "";
		for(int i=1 ; i <= longitud; i++) {
			int tipoCaracter = (int) (Math.random() * 3) + 1;
		if(tipoCaracter == 1 ) {//LETRA MAYUSCULA
				clave +=(char) Math.floor(Math.random()*(90-65+1)+65);
			}else if(tipoCaracter == 2) {//letra minuscula
				clave +=(char) Math.floor(Math.random()*(122-97+1)+97);
	
			}else if(tipoCaracter == 3) {//numeros
				clave += (int)(Math.random() * 9);
			}
		}
		return clave;
	}
	public boolean esFuerte(String clave) {
		int mayuscula = 0;
		int minuscula = 0;
		int numeros = 0;
		for(int i=0 ; i < clave.length(); i++) {
			char caracter = clave.charAt(i);
			int caracterAscii = (int)caracter;
			if( caracterAscii >= 65 && caracterAscii <= 90 ) {
				mayuscula++;
			}else if( caracterAscii >= 97 && caracterAscii <= 122 ) {
				minuscula++;
			}else {
				numeros++;
			}
		}
		if(mayuscula >2 && minuscula > 1 && numeros >5) return true;
		return false;
	}

}
