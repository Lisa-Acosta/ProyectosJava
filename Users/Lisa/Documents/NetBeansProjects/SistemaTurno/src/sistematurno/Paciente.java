/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematurno;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 *
 * @author Lisa
 */
public class Paciente extends Persona{
    private int nroLegajo;
    private ObraSocial os;
    public ArrayList<HistoriaClinica>hc;

    public Paciente( int dni, String nombre, String apellido, GregorianCalendar fechaNacimiento,
            char sexo, ArrayList<Telefono> telefonos, ArrayList<Direccion> direcciones, int nroLegajo, ObraSocial os) {
        super(dni, nombre, apellido, fechaNacimiento, sexo, telefonos, direcciones);
        this.nroLegajo = nroLegajo;
        this.os = os;
        this.hc = new ArrayList<>();
    }

    public int getNroLegajo() {
        return nroLegajo;
    }

    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }


    public ObraSocial getOs() {
        return os;
    }

    public void setOs(ObraSocial os) {
        this.os = os;
    }

    public ArrayList<HistoriaClinica> getHc() {
        return hc;
    }

    public void setHc(ArrayList<HistoriaClinica> hc) {
        this.hc = hc;
    }
    
    public boolean addHistoriaClinica(HistoriaClinica hc){
        return this.hc.add(hc);
    }
    
    
}
