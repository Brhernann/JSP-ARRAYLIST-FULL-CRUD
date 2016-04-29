
package Modelo;


public class Usuario {
    
    private String user;
    private String pass;
    private String nombre;
    private String apellido;
    private int edad;

    public Usuario(String user, String pass, String nombre, String apellido, int edad) {
        this.user = user;
        this.pass = pass;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
