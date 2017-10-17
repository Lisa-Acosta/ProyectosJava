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
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private GregorianCalendar fechaNacimiento;
    private char sexo;
    public ArrayList<Telefono>telefonos;
    public ArrayList<Direccion>direcciones;

    public Persona(int dni, String nombre, String apellido, GregorianCalendar fechaNacimiento,
            char sexo, ArrayList<Telefono> telefonos, ArrayList<Direccion> direcciones) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.sexo = sexo;
        this.telefonos = telefonos;
        this.direcciones = direcciones;
    }

    public Persona(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(GregorianCalendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public ArrayList<Direccion> getDirecciones() {
        return direcciones;
    }

    public void setDirecciones(ArrayList<Direccion> direcciones) {
        this.direcciones = direcciones;
    }
    
    public String mostrar(){
        return "Nombre y Apellido: "+this.getNombre()+" "+this.getApellido()
                +"\n DNI: "+this.getDni()
                +"\n Fecha de Nacimiento: "+this.getFechaNacimiento() + "\t Sexo: "+this.getSexo()
                + "\nTelefonos: "+this.getTelefonos()
                +"\nDirección : "+this.getDirecciones()
                +"\n";
    }
    
}
