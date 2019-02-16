package examen1lab2_joeldiaz;

import java.util.ArrayList;
import java.util.Date;

public class usuario {
    private String user;
    private String pass;
    private Date nacimiento;
    private int telefono;
    private String correo;
    private String nombre;
    private int genFav;
    private ArrayList<libro> libros = new ArrayList();
    private ArrayList amigos = new ArrayList();

    public usuario() {
    }

    public usuario(String usuario, String pass, Date nacimiento, int telefono, String correo, String nombre, int genFav) {
        this.user = usuario;
        this.pass = pass;
        this.nacimiento = nacimiento;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.genFav = genFav;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String usuario) {
        this.user = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getGenFav() {
        return genFav;
    }

    public void setGenFav(int genFav) {
        this.genFav = genFav;
    }

    public ArrayList<libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libro> libros) {
        this.libros = libros;
    }

    public ArrayList getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList amigos) {
        this.amigos = amigos;
    }

    @Override
    public String toString() {
        return user;
    }
    
    
}
