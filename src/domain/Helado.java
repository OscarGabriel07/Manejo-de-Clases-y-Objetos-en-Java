package domain;

/**
 * Representa un helado y algunas de sus características.
 * @author Oscar Farfan
 */
public class Helado {
    /**
     * Representa la variable id de tipo int de la clase Helado.
     */
    private int id;
    /**
     * Representa la variable sabor de tipo String de la clase Helado.
     */
    public String flavor;
    /**
     * Representa la variable precio de tipo int de la clase Helado.
     */
    public int price;

    /**
     * Obtiene el valor de la variable Id.
     * @return Devuelve el valor de la variable Id.
     */
    public int getId() {
        return id;
    }

    /**
     *  Modifica el valor de la variable price.
     * @param price Valor para modificar la variable price.
     */
    public void setPrecio(int price) {
        this.price = price;
    }
    
    
}
