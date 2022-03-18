package domain;

import java.util.ArrayList;

/**
 * Representa una fruta y algunas de sus características.
 * @author Oscar Farfan
 */
public class Fruta {
    /**
     * Representa la variable nombre de tipo String de la clase Fruta.
     */
    public String name;
    /**
     * Representa la variable peso promedio de tipo float de la clase Fruta.
     */
    private float averageWeight;
    /**
     * Representa una lista de colores de tipo String de la clase Fruta.
     */
    public ArrayList<String> colors;
    
    /**
     * Modifica el valor de la variable name.
     * @param name Valor para modificar la variable name.
     */
    public void setColor(String name){
        this.name = name;
    }
    
    /**
     * Obtiene el o los valores de la lista colors..
     * @return Devuelve el o los valores de la lista colors.
     */
    public ArrayList getColors(){
        return this.colors;
    }
}
