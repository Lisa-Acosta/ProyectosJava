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
public class Turno {
    GregorianCalendar fecha;
    String estado= "en espera";
    boolean urgencia;
    String especialidad;
    Paciente paciente;
    Medico medico;

    public Turno(GregorianCalendar fecha, boolean urgencia, String especialidad, 
            Medico medico, Paciente paciente) {
        this.fecha = fecha;
        this.urgencia = urgencia;
        this.especialidad = especialidad;
        this.medico = medico;
        this.paciente = paciente;
    }

    public Turno() {
        this.setEstado("En espera");
    }
 
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isUrgencia() {
        return urgencia;
    }

    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }   
     public boolean cambiarEstado(String estado){
         String estadoAnterior = this.getEstado();
         this.setEstado(estado);
         return(estadoAnterior.equals(this.getEstado())&& this.getEstado().equals(estado));
     }
     public boolean cambiarFecha(GregorianCalendar fecha){
         GregorianCalendar fechaAnterior = this.getFecha();
         this.setFecha(fecha);
         return(fechaAnterior.equals(this.getFecha())&& this.getFecha().equals(fecha));
     }
     
     
}
