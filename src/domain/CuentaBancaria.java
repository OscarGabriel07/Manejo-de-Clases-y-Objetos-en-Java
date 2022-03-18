package domain;

/**
 * Representa una cuenta bancaria y algunas de sus características.
 * @author Oscar Farfan
 */
public class CuentaBancaria {
    /**
     * Representa la variable de número de cuenta de tipo int de la clase Cuenta Bancaria.
     */
    private int accountNumber;
    /**
     * Representa la variable activada de tipo bool de la clase Cuenta Bancaria.
     */
    protected boolean activated;
    
    /**
     * Modifica el estado de la variable activated.
     * @param actived Valor pasado para modificar el estado de la variable activated.
     */
    public void setActived(boolean actived){
        this.activated = actived;
    }
    
    /**
     * Obtiene el estado de la variable activated.
     * @return Devuelve el estado de la variable activated.
     */
    public boolean getActived(){
        return this.activated;
    }
}
