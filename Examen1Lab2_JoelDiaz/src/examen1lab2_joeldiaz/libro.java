package examen1lab2_joeldiaz;

public class libro {
    private String nombre;
    private String desc;
    private int puntaje;
    private int copias;
    private int genero;
    private double precio;
    private String edicion;
    private String autor;
    private int publi;

    public libro() {
    }

    public libro(String nombre, String desc, int puntaje, int copias, int genero, double precio, String edicion, String autor, int publi) {
        this.nombre = nombre;
        this.desc = desc;
        this.puntaje = puntaje;
        this.copias = copias;
        this.genero = genero;
        this.precio = precio;
        this.edicion = edicion;
        this.autor = autor;
        this.publi = publi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getCopias() {
        return copias;
    }

    public void setCopias(int copias) {
        this.copias = copias;
    }

    public int getGenero() {
        return genero;
    }
    
    //////////////////////////////////////////////////////////////////
    public String stringGenero(){
        String stGen="";
        if (genero==1){
            stGen="Fantasia";
        }
        if (genero==2){
            stGen="Romance";
        }
        if (genero==3) {
            stGen="Accion";
        }
        if (genero==4) {
            stGen="Historia";
        }
        return stGen;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPubli() {
        return publi;
    }

    public void setPubli(int publi) {
        this.publi = publi;
    }

    
    public String toString2() {
        return "\nnombre=" + nombre + "\ndescripcion=" + desc + "\npuntaje=" + puntaje + "\ncopias=" + copias + "\ngenero=" + stringGenero() + "\nprecio=" + precio + "\nedicion=" + edicion + "\nautor=" + autor + "\npublicacion=" + publi;
    }
    
    @Override
    public String toString(){
        return nombre;
    }
    
    
}
