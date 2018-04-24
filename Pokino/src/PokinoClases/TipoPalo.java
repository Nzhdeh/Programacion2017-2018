package PokinoClases;

import java.util.Random;

public enum TipoPalo 
{
	O,C,E,B;//O es oros, C es copas, E es espadas, B es bastos
	
	//devuelve el palo de la carta aleatoriamente
	public static TipoPalo getRandomPalo() 
	{
        Random random = new Random();
        return values()[random.nextInt(values().length)];
    }
}
