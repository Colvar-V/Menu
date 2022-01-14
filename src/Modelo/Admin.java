
package Modelo;


public class Admin extends Usuario {
    private String Cargo,Cedula;
 

    public Admin(String Cargo, String Cedula, String nombre, String correo, String telefono, String contraseña) {
        super(nombre, correo, telefono, contraseña);
        this.Cargo = Cargo;
        this.Cedula = Cedula;
    }
    

    public Admin() {
     
    }
    

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    
}
