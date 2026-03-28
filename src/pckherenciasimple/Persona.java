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
public class Persona {
    private int ID;
    private int tipoID;
    private String Nombre;
    private String Apellido;
    private Date Nacimiento;
    private char genero;
    private String TipoSangre;
    private double Peso;
    private double Altura;
    private int Carnet;
    static final int SIN_REGISTRAR = 0;
    static final int REGISTRO_CIVIL = 1;
    static final int TARJETA_IDENTIDAD =2;
    static final int CEDULA_CIUDADANIA =3;
    static final int PASAPORTE=4;
    static final int CEDULA_EXTRANJERA=5;

    public Persona() {
        this.ID = 0;
        this.tipoID = SIN_REGISTRAR;
        this.Nombre = " ";
        this.Apellido = " ";
        this.Nacimiento = null;
        this.genero = ' ';
        this.TipoSangre = " ";
        this.Peso = 0.0;
        this.Altura = 0.0; 
        this.Carnet = 0;
    }

    public Persona(int ID, int tipoID, String Nombre, String Apellido, Date Nacimiento, char genero, String TipoSangre, double Peso, double Altura, int Carnet) {
        this.ID = ID;
        this.tipoID = tipoID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacimiento = Nacimiento;
        this.genero = genero;
        this.TipoSangre = TipoSangre;
        this.Peso = Peso;
        this.Altura = Altura;
        this.Carnet = Carnet;
    }
    
    //constructor copia

    public Persona(Persona per) {
        this.ID = per.ID;
        this.tipoID = per.tipoID;
        this.Nombre = per.Nombre;
        this.Apellido = per.Apellido;
        this.Nacimiento = per.Nacimiento;
        this.genero = per.genero;
        this.TipoSangre = per.TipoSangre;
        this.Peso = per.Peso;
        this.Altura = per.Altura;
        this.Carnet = per.Carnet;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getTipoID() {
        return tipoID;
    }

    public void setTipoID(int tipoID) {
        this.tipoID = tipoID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }
/*
    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }
*/
    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }
    
}
