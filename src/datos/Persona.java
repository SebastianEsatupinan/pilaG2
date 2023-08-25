package datos;

import modelo.Base;

public class Persona extends Base{
    
    private String nombreP;
    private String direcP;
    private int edadP;

    public Persona(String nombreP, String direcP, int edadP) {
        this.nombreP = nombreP;
        this.direcP = direcP;
        this.edadP = edadP;
    }
    
    /**
     * Get the value of edadP
     *
     * @return the value of edadP
     */
    public int getEdadP() {
        return edadP;
    }

    /**
     * Set the value of edadP
     *
     * @param edadP new value of edadP
     */
    public void setEdadP(int edadP) {
        this.edadP = edadP;
    }


    /**
     * Get the value of direcP
     *
     * @return the value of direcP
     */
    public String getDirecP() {
        return direcP;
    }

    /**
     * Set the value of direcP
     *
     * @param direcP new value of direcP
     */
    public void setDirecP(String direcP) {
        this.direcP = direcP;
    }


    /**
     * Get the value of nombreP
     *
     * @return the value of nombreP
     */
    public String getNombreP() {
        return nombreP;
    }

    /**
     * Set the value of nombreP
     *
     * @param nombreP new value of nombreP
     */
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    @Override
    public String toString() {
        return nombreP +  direcP +  edadP;
    }
    
    @Override
    public Base copy() {
        return new Persona(nombreP, direcP, edadP);
    }

}
