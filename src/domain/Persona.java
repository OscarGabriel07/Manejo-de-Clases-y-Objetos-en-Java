package domain;

import java.util.Date;

/**
 * Representa una persona y algunas de sus principales características.
 * @author Oscar Farfan
 */
public class Persona {
    /**
     * Representa la variable nombre de tipo String de la clase Persona.
     */
    public String name;
        /**
     * Representa la variable de primer apellido de tipo String de la clase Persona.
     */
    public String lastName1;
        /**
     * Representa la variable de segundo apellido de tipo String de la clase Persona.
     */
    public String lastName2;
        /**
     * Representa la variable fecha de nacimiento de tipo Date de la clase Persona.
     */
    public Date dateBirth;
        /**
     * Representa la variable altura de tipo float de la clase Persona.
     */
    public float height;
    
    /**
     * Modifica el valor de la variable name.
     * @param name Valor para modificar la variable name.
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * Obtiene el valor de la variable name.
     * @return Devuelve el valor de la variable name.
     */
    public String getName(){
        return this.name;
    }
    
}
