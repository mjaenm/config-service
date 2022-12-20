package com.nttdata.mvn;

import org.apache.commons.lang3.*;



/**
 * Esta clase se encarga de abreviar la frase que se imprime en pantalla
 * @author Mirian Jaén, 
 * mirian.jaen.melero@emeal.nttdata.com
 */

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("¡Vamos a jugar! Adivina las letras que faltan para completar la frase");
        System.out.println( StringUtils.abbreviate("Me gustan las lámparas", 21));
    }

}


