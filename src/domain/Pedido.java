package domain;

/**
 * Representa un pedido y algunas de sus características.
 * @author Oscar Farfan
 */
public class Pedido {
    /**
     * Representa la variable id de tipo int de la clase Pedido.
     */
    private int id;
    /**
     * Representa el arreglo fruits de tipo Fruta de la clase Pedido.
     */
    public Fruta [] fruits;
    /**
     * Representa el arreglo iceCream de tipo Helado de la clase Pedido.
     */
    public Helado [] iceCream;

    /**
     * Modifica el valor del arreglo frutas.
     * @param fruits Valor para modificar el arreglo frutas.
     */
    public void setFrutas(Fruta[] fruits) {
        this.fruits = fruits;
    }

    /**
     * Obtiene el valor del arreglo iceCream.
     * @return Devuelve el valor del arreglo iceCream.
     */
    public Helado[] getIceCream() {
        return this.iceCream;
    }

        
}
