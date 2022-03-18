package domain;

/**
 * Representa un animal y algunas de sus características.
 * @author Oscar Farfan
 */
public class Animal {
    /**
     * Representa la variable nombre de tipo String de la clase Animal.
     */
    public String name;
    /**
     * Representa la variable altura de tipo float de la clase Animal.
     */
    public float height;
    /**
     * Representa la variable tipo de tipo String de la clase Animal.
     */
    public String tipo;
    /**
     * Representa la variable edad de tipo int de la clase Animal.
     */
    public int age;

    /**
     * Obtiene el valor de la variable name.
     * @return Devuelve el valor de la variable name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Modifica el valor de la variable heigth.
     * @param height Valor para modificar la variable height.
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * Modifica el valor de la variable age.
     * @param age Valor para modificar la variable age.
     */
    public void setAge(int age) {
        this.age = age;
    }
        
}
