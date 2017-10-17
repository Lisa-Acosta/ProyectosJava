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
public class Medico extends Persona {
    
    // private String nombre;
    // private String apellido;
    // private int dni;
    private int MN;
    private int MPE;
    private ArrayList<Especialidad> especialidades;
    private boolean estado;
    private ArrayList<Horario> horario;

    public Medico( int dni,String nombre, String apellido, int MN, int MPE,
            ArrayList<Especialidad> especialidades, boolean estado, ArrayList<Horario> horario) {
        //this.nombre = nombre;
        //this.apellido = apellido;
        //this.dni = dni;
        super(dni, nombre, apellido);
        this.MN = MN;
        this.MPE = MPE;
        this.especialidades = especialidades;
        this.estado = estado;
        this.horario = horario;
    }

    public int getMN() {
        return MN;
    }

    public void setMN(int MN) {
        this.MN = MN;
    }

    public int getMPE() {
        return MPE;
    }

    public void setMPE(int MPE) {
        this.MPE = MPE;
    }

    public ArrayList<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(ArrayList<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public ArrayList<Horario> getHorario() {
        return horario;
    }

    public void setHorario(ArrayList<Horario> horario) {
        this.horario = horario;
    }
    public String mostrar(){
        return "Nombre y Apellido: "+super.getNombre()+" "+super.getApellido()
                +"\n DNI: "+super.getDni()
                +"\n MN: "+this.getMN() + "\t MPE: "+this.getMPE()
                + "\nEspecialidades: "+this.nombreEspecialidades()
                +"\nHorario: "+this.getHorario()
                +"\n";
    }
    
    private String nombreEspecialidades(){
        String dev = "";
        int i = 1;
        for (Especialidad e: this.getEspecialidades())
        {
            dev+= "Especialidad "+i+": "+ e.getNombre();
            i++;
        }
        return dev;
    }
    
    private String horarios(){
        String dev="";
        int i = 1;
        for (Horario h: this.getHorario())
        {
            dev+= h.mostrar()+"\n";
            i++;
        }
        return dev;
    }
    
    public static boolean atenderTurno(Turno turno){
        return turno.cambiarEstado("atendido");
    }
    public boolean registrarHC(Turno t, String descripcion, int num){
        Paciente p = t.getPaciente();
        GregorianCalendar f = t.getFecha();
        HistoriaClinica c = new HistoriaClinica(num , descripcion, f, this, p,"");
        return p.addHistoriaClinica(c);
    }
    /*
    Ver los turnos que tiene asignados al médico para una fecha específica 
    o bien todos los asigandos en esa semana.
    */
//    public ArrayList<Turnos> verTurnos(GregorianCalendar fecha=null)
//    {
//        if(fecha!= null){
//            return Turno.obtenerTurnos(this.fecha);
//        }
//        else{
//            GregorianCalendar hoy = new GregorianCalendar();
//            GregorianCalendar semanaSig = hoy+7;
//            return Turno.obtenerTurnos(this,hoy,semanaSig);
//        }
//        //return Turno.obtenerTurnos(this,fecha);
//    }
} 
    
    
