/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pckherenciasimple;

import java.util.Date;

/**
 *
 * @author Alumnos Rio Santiago
 */
public class Estudiante extends Persona{
    
    //atributos
    
    private int NumeroCarnet;
    public Estudiante(){ // Constructor sin argumentos 
        super();
        this.NumeroCarnet=0;
    }
    // Constructor con argumentos

    public Estudiante(int ID, int tipoID, int Carnet, String Nombre, String Apellido, Date Nacimiento, char genero, String TipoSangre, double Peso, double Altura) {
        super(ID, tipoID, Nombre, Apellido, Nacimiento, genero, TipoSangre, Peso, Altura, Carnet);
        this.NumeroCarnet = Carnet;
    }
    
    public Estudiante (Estudiante est){
    super (est);
    this.NumeroCarnet = est.NumeroCarnet;
    }

    public int getNumeroCarnet() {
        return NumeroCarnet;
    }

    public void setNumeroCarnet(int NumeroCarnet) {
        this.NumeroCarnet = NumeroCarnet;
    }
    
    
    
}
