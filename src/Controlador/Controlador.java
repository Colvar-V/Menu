
package Controlador;
import Modelo.*;
import VistaAdmin.*;
import VistaCliente.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import java.util.Collections;

public class Controlador implements ActionListener {
    //Objetos Ventanas cliente
    private Inicio objInicio;
    private Registro objRegistro;
    private Sesion objSesion;
    private PedidoRapido objRPedido;
    private Menu objMenu;
    private DatosAdicionales objDatosA;
    private OpcionesCliente objOpcCliente;
    private Domicilio objDomicilio;
    private Reservaciones objReservaciones;
    private Alerta objAlerta;
    private OpcionesAdmin objOpcAdmin;
    
    //objetos Ventanas Admin
    private Usuarios objUsuarios;
    private DatosAdicionalesAdmin objDatosAdmin;
    private EdicionMenu objEdMenu;
    private Pedido objPedido; 
    private ReporteReservaciones objRRervas;
    
    //Operaciones
    private Admin objAdmin;
    private Cliente objCliente;
    private ArrayList<Cliente> lcliente;
    private ArrayList<Admin> ladmin;
    private ArrayList<Reservas> lreservas;

    public Controlador(Inicio objInicio, Registro objRegistro, Sesion objSesion,
            PedidoRapido objRPedido, Menu objMenu, DatosAdicionales objDatosA, 
            OpcionesCliente objOpcCliente, Domicilio objDomicilio, Reservaciones objReservaciones, 
            Alerta objAlerta, OpcionesAdmin objOpcAdmin, Usuarios objReportes, DatosAdicionalesAdmin objDatosAdmin,
            EdicionMenu objEdMenu, Admin objAdmin, Cliente objCliente, ArrayList<Cliente> lcliente,ArrayList<Admin> ladmin,
            Pedido objPedido,ReporteReservaciones objRRervas,ArrayList<Reservas> lreservas) {
        //Ventana Cliente
        this.objInicio = objInicio;
        this.objRegistro = objRegistro;
        this.objSesion = objSesion;
        this.objRPedido = objRPedido; 
        this.objMenu = objMenu;
        this.objDatosA = objDatosA;
        this.objOpcCliente = objOpcCliente;
        this.objDomicilio = objDomicilio;
        this.objReservaciones = objReservaciones;
        this.objAlerta = objAlerta; 
        //Ventana Admin
        this.objOpcAdmin = objOpcAdmin; 
        this.objUsuarios = objReportes;
        this.objDatosAdmin = objDatosAdmin;
        this.objEdMenu = objEdMenu;
        this.objRRervas =objRRervas;
        // operaciones
        this.objAdmin = objAdmin;
        this.objCliente = objCliente; 
        this.lcliente = lcliente;
        this.ladmin = ladmin;
        this.objPedido = objPedido;
        this.lreservas = lreservas;
    }
    
    public Controlador () {
        this.objAdmin = new Admin();
        this.objCliente = new Cliente();
        this.lcliente = new ArrayList();
        this.ladmin= new ArrayList();
        this.lreservas = new ArrayList();
        //Ventanas cliente
        this.objInicio = new Inicio();
        this.objRegistro = new Registro();
        this.objSesion = new Sesion();
        this.objRPedido = new PedidoRapido();
        this.objDatosA = new DatosAdicionales();
        this.objAlerta = new Alerta(); 
        this.objMenu = new Menu();
        this.objOpcCliente = new OpcionesCliente(); 
        this.objDomicilio = new Domicilio();
        this.objReservaciones = new Reservaciones();
        //Ventanas admin
        this.objDatosAdmin = new DatosAdicionalesAdmin();
        this.objUsuarios = new Usuarios();
        this.objOpcAdmin = new OpcionesAdmin();
        this.objEdMenu = new EdicionMenu();
        this.objPedido= new Pedido();
        this.objRRervas = new ReporteReservaciones(); 
        //botones
        this.objInicio.getBtnIniciarSesion().addActionListener(this);
        this.objSesion.getBtnIniciarSesion().addActionListener(this);
        this.objInicio.getBtnRegistro().addActionListener(this);
        this.objInicio.getBtnRPedido().addActionListener(this);
        this.objSesion.getBtnCasa().addActionListener(this);
        this.objRegistro.getBtnCancelar().addActionListener(this);
        this.objRegistro.getBtnCrearCuenta().addActionListener(this);
        this.objRPedido.getBtnCancelar().addActionListener(this);
        this.objDatosA.getBtnTerminar().addActionListener(this);
        this.objAlerta.getBtnAlerta().addActionListener(this);
        this.objOpcCliente.getBtnMenu().addActionListener(this);
        this.objOpcCliente.getBtnDomicilios().addActionListener(this);
        this.objOpcCliente.getBtnCerrarCliente().addActionListener(this);
        this.objOpcCliente.getBtnReservaciones().addActionListener(this);
        this.objOpcCliente.getBtnDomicilios().addActionListener(this);
        this.objDatosAdmin.getBtnFinalizar().addActionListener(this);
        this.objOpcAdmin.getBtnEdiMenu().addActionListener(this);
        this.objOpcAdmin.getBtnIndicadores().addActionListener(this);
        this.objOpcAdmin.getBtnUsuarios().addActionListener(this);
        this.objOpcAdmin.getBtnCerrarAdmin().addActionListener(this);
        this.objOpcAdmin.getBtnCerrarAdmin().addActionListener(this);
        this.objEdMenu.getBtnPublicar().addActionListener(this);
        this.objRPedido.getBtnContinuar().addActionListener(this);
        this.objMenu.getBtnEnviarOrden().addActionListener(this);
        this.objMenu.getBtnDomicilio().addActionListener(this);
        this.objMenu.getBtnVolver().addActionListener(this);
        this.objPedido.getBtnPedido1().addActionListener(this);
        this.objPedido.getBtnPedido2().addActionListener(this);
        this.objPedido.getBtnPedido3().addActionListener(this);
        this.objPedido.getBtnPedido4().addActionListener(this);
        this.objPedido.getBtnPedido5().addActionListener(this);
        this.objPedido.getBtnPedido6().addActionListener(this);
        this.objReservaciones.getBtnReservaciones().addActionListener(this);
        this.objPedido.getBtnSalir().addActionListener(this);
        this.objPedido.getBtnSalir().addActionListener(this);
        
    }
    
    public void setvisible(boolean bln){
        this.objInicio.pack();
        this.objInicio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objInicio.setLocationRelativeTo(null);
        objInicio.setVisible(bln);
        bln = false;
        this.objSesion.pack();
        this.objSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objSesion.setLocationRelativeTo(null);
        objSesion.setVisible(bln);
        
        this.objRegistro.pack();
        this.objRegistro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objRegistro.setLocationRelativeTo(null);
        objRegistro.setVisible(bln);
        
        this.objRPedido.pack();
        this.objRPedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objRPedido.setLocationRelativeTo(null);
        this.objRPedido.getAlertaDatos().setLocationRelativeTo(null);
        objRPedido.setVisible(bln);
        
        this.objDatosA.pack();
        this.objDatosA.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objDatosA.setLocationRelativeTo(null);
        objDatosA.setVisible(bln);
        
        this.objUsuarios.pack();
        this.objUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objUsuarios.setLocationRelativeTo(null);
        objUsuarios.setVisible(bln);
        
        this.objAlerta.pack();
        this.objAlerta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objAlerta.setLocationRelativeTo(null);
        objAlerta.setVisible(bln);
        
        this.objOpcCliente.pack();
        this.objOpcCliente.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objOpcCliente.setLocationRelativeTo(null);
        objOpcCliente.setVisible(bln);
        
        this.objReservaciones.pack();
        this.objReservaciones.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objReservaciones.getJdConfirmacion().setLocationRelativeTo(null);
        this.objReservaciones.setLocationRelativeTo(null);
        objReservaciones.setVisible(bln);
        
        this.objDatosAdmin.pack();
        this.objDatosAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objDatosAdmin.setLocationRelativeTo(null);
        objDatosAdmin.setVisible(bln);
        
        this.objOpcAdmin.pack();
        this.objOpcAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objOpcAdmin.setLocationRelativeTo(null);
        objOpcAdmin.setVisible(bln);
        
        this.objMenu.pack();
        this.objMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objMenu.setLocationRelativeTo(null);
        objMenu.setVisible(bln);
        
        this.objEdMenu.pack();
        this.objEdMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objEdMenu.setLocationRelativeTo(null);
        objEdMenu.setVisible(bln);
        
        this.objPedido.pack();
        this.objPedido.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objPedido.setLocationRelativeTo(null);
        objPedido.setVisible(bln);
        
        this.objRRervas.pack();
        this.objRRervas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objRRervas.setLocationRelativeTo(null);
        objRRervas.setVisible(bln);
        
        this.objDomicilio.pack();
        this.objDomicilio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.objDomicilio.setLocationRelativeTo(null);
        objDomicilio.setVisible(bln);
    }    
    int c=1;
    String[][] matrisCli, matrisadmin, matrispedido;
    @Override
    public void actionPerformed(ActionEvent evento) {
        //Registro
        if(this.objInicio.getBtnRegistro()== evento.getSource()){this.objRegistro.setVisible(true);this.objInicio.setVisible(false);}
        if(this.objRegistro.getBtnCancelar()== evento.getSource()){this.objInicio.setVisible(true);this.objRegistro.setVisible(false);}
        if(this.objRegistro.getBtnCrearCuenta()== evento.getSource()){
            if(this.objRegistro.getTxtNombre().getText().equals("")
                    || this.objRegistro.getTxtCorreo().getText().equals("")
                    || this.objRegistro.getTxtTelefono().getText().equals("")
                    ||this.objRegistro.getJPassContraseña().getText().equals("")){
                this.objRegistro.setVisible(false);
                this.objAlerta.setVisible(true);
            }
            else{ 
                if(this.objRegistro.getTxtCorreo().getText().contains("@gourmet.com")){
                    this.objRegistro.setVisible(false);
                    this.objDatosAdmin.setVisible(true);
                }
                else{
                    this.objRegistro.setVisible(false);
                    this.objDatosA.setVisible(true);
                }
            }
        }
        if(this.objAlerta.getBtnAlerta()== evento.getSource()){this.objRegistro.setVisible(true);this.objAlerta.setVisible(false);}
        
        //usuario
        if(this.objDatosA.getBtnTerminar()== evento.getSource()){
            Cliente cliente = new Cliente(); 
            cliente.setId(Integer.toString(c));
            cliente.setNombre(this.objRegistro.getTxtNombre().getText());
            cliente.setTelefono(this.objRegistro.getTxtTelefono().getText());
            cliente.setCorreo(this.objRegistro.getTxtCorreo().getText());
            cliente.setContraseña(this.objRegistro.getJPassContraseña().getText());
            cliente.setCumpleaños(this.objDatosA.getTxtCumpleaños().getText());
            cliente.setDireccion(this.objDatosA.getTxtDireccion().getText());
            this.lcliente.add(cliente);
            matrisCli=new String[lcliente.size()][7];
            for(int i=0; i<lcliente.size();i++){
                c=c+1;
                matrisCli[i][0]=lcliente.get(i).getId();
                matrisCli[i][1]=lcliente.get(i).getNombre();
                matrisCli[i][2]=lcliente.get(i).getTelefono();
                matrisCli[i][3]=lcliente.get(i).getCorreo();
                matrisCli[i][4]=lcliente.get(i).getCumpleaños();
                matrisCli[i][5]=lcliente.get(i).getDireccion();
                matrisCli[i][6]=lcliente.get(i).getContraseña();
            }
            this.objUsuarios.setTbUserCliente(matrisCli);
            this.objDatosA.setVisible(false);
            this.objOpcCliente.setVisible(true);
            this.objUsuarios.setVisible(true);
            this.objRegistro.getTxtNombre().setText("");
            this.objRegistro.getTxtTelefono().setText("");
            this.objRegistro.getTxtCorreo().setText("");
            this.objRegistro.getJPassContraseña().setText("");
            this.objDatosA.getTxtCumpleaños().setText("");
            this.objDatosA.getTxtDireccion().setText("");
        }
        
        if(this.objOpcCliente.getBtnCerrarCliente()== evento.getSource()){this.objInicio.setVisible(true);this.objOpcCliente.setVisible(false);}
        
        //Administrador
        if(this.objDatosAdmin.getBtnFinalizar()== evento.getSource()){
            Admin admin = new Admin();
            admin.setCedula(this.objDatosAdmin.getTxtCedula().getText());
            admin.setNombre(this.objRegistro.getTxtNombre().getText());
            admin.setTelefono(this.objRegistro.getTxtTelefono().getText());
            admin.setCorreo(this.objRegistro.getTxtCorreo().getText());
            admin.setContraseña(this.objRegistro.getJPassContraseña().getText());
            admin.setCargo(this.objDatosAdmin.getTxtCargo().getText());
            this.ladmin.add(admin);
            matrisadmin= new String[ladmin.size()][6];
            for(int i=0; i<ladmin.size();i++){
                matrisadmin[i][0]=ladmin.get(i).getCedula();
                matrisadmin[i][1]=ladmin.get(i).getNombre();
                matrisadmin[i][2]=ladmin.get(i).getTelefono();
                matrisadmin[i][3]=ladmin.get(i).getCorreo();
                matrisadmin[i][4]=ladmin.get(i).getCargo();
                matrisadmin[i][5]=ladmin.get(i).getContraseña();
            }
            this.objUsuarios.setTbUserAdmin(matrisadmin);
            this.objOpcAdmin.setVisible(true);
            this.objDatosAdmin.setVisible(false);
            this.objRegistro.getTxtNombre().setText("");
            this.objRegistro.getTxtTelefono().setText("");
            this.objRegistro.getTxtCorreo().setText("");
            this.objRegistro.getJPassContraseña().setText("");
            this.objDatosAdmin.getTxtCedula().setText("");
            this.objDatosAdmin.getTxtCargo().setText("");
        }
        
        if(this.objOpcAdmin.getBtnIndicadores()== evento.getSource()){this.objRRervas.setVisible(true);this.objOpcAdmin.setVisible(false);}
        
        if(this.objOpcAdmin.getBtnUsuarios()== evento.getSource()){this.objUsuarios.setVisible(true);this.objOpcAdmin.setVisible(false);}
        
        if(this.objOpcAdmin.getBtnPedidos()== evento.getSource()){this.objPedido.setVisible(true);this.objOpcAdmin.setVisible(false);}
        
        if(this.objOpcAdmin.getBtnCerrarAdmin()== evento.getSource()){this.objInicio.setVisible(true);this.objOpcAdmin.setVisible(false);}
        
        //inicio de Sesión
        if(this.objInicio.getBtnIniciarSesion()== evento.getSource()){this.objSesion.setVisible(true);this.objInicio.setVisible(false);}
   
        if(this.objSesion.getBtnIniciarSesion()== evento.getSource()){
            boolean user = false;
            boolean pass = false;
            for(int i=0; i<lcliente.size();i++){
                for(int j=0; j<7;j++){
                    if(this.objSesion.getTxtUsuario().getText().equals(matrisCli[i][j])){
                         user = true;
                    }
                    if(this.objSesion.getPassContraseña().getText().equals(matrisCli[i][j])){
                        pass = true;   
                    }
                }
            }
            if(user==true && pass==true){this.objOpcCliente.setVisible(true);this.objSesion.setVisible(false);}
        }
        if(this.objSesion.getBtnIniciarSesion()== evento.getSource()){
            boolean user = false;
            boolean pass = false;
            for(int i=0; i<ladmin.size();i++){
                for(int j=0; j<6;j++){
                    if(this.objSesion.getTxtUsuario().getText().equals(matrisadmin[i][j])){
                         user = true;
                    }
                    if(this.objSesion.getPassContraseña().getText().equals(matrisadmin[i][j])){
                        pass = true;   
                    }
                }
            }
            if(user==true && pass==true){this.objOpcCliente.setVisible(true);this.objSesion.setVisible(false);}
        }
        if(this.objSesion.getBtnCasa()== evento.getSource()){this.objInicio.setVisible(true);this.objSesion.setVisible(false);}
        
        //Pedido rapido
        if(this.objInicio.getBtnRPedido()== evento.getSource()){this.objRPedido.setVisible(true);this.objInicio.setVisible(false);}
        if(this.objRPedido.getBtnCancelar()== evento.getSource()){this.objInicio.setVisible(true);this.objRegistro.setVisible(false);}
        if(this.objRPedido.getBtnContinuar()==evento.getSource()){
            if(this.objRPedido.getTxtNombre().getText().equals("")
                    || this.objRPedido.getTxtTelefono().getText().equals("")){
                this.objRPedido.getAlertaDatos().setVisible(true);
            }
            else{
                this.objOpcCliente.setVisible(true);
                this.objRPedido.setVisible(false);
            }
        }
        if(this.objRPedido.getBtnCancelar()== evento.getSource()){this.objInicio.setVisible(true);this.objRegistro.setVisible(false);}
        
        //Opciones Cliente
        if(this.objOpcCliente.getBtnMenu()== evento.getSource()){this.objMenu.setVisible(true);this.objOpcCliente.setVisible(false);}
        if(this.objOpcCliente.getBtnReservaciones()== evento.getSource()){this.objReservaciones.setVisible(true);this.objOpcCliente.setVisible(false);}
        if(this.objOpcCliente.getBtnDomicilios()== evento.getSource()){this.objDomicilio.setVisible(true);this.objOpcCliente.setVisible(false);}
        
        //Opciones Administrador
        if(this.objOpcAdmin.getBtnEdiMenu()== evento.getSource()){this.objEdMenu.setVisible(true);this.objOpcAdmin.setVisible(false);}
        
        //Edicion Menu
        if(this.objEdMenu.getBtnPublicar()== evento.getSource()){
            //Entradas
            this.objMenu.getBtnEntrada1().setText(this.objEdMenu.getTxtEntrada1().getText());
            this.objMenu.getCbE1Opcion1().setText(this.objEdMenu.getTxtOpcion1E1().getText());
            this.objMenu.getCbE1Opcion2().setText(this.objEdMenu.getTxtOpcion2E1().getText());
            this.objMenu.getCbE1Opcion3().setText(this.objEdMenu.getTxtOpcion3E1().getText());
            this.objMenu.getBtnEntrada2().setText(this.objEdMenu.getTxtEntrada2().getText());
            this.objMenu.getCbE2Opcion1().setText(this.objEdMenu.getTxtOpcion1E1().getText());
            this.objMenu.getCbE2Opcion2().setText(this.objEdMenu.getTxtOpcion2E1().getText());
            this.objMenu.getCbE2Opcion3().setText(this.objEdMenu.getTxtOpcion3E1().getText());
            //Ensaladas
            this.objMenu.getCbIngrediente1().setText(this.objEdMenu.getTxtEnsalada1().getText());
            this.objMenu.getCbIngrediente2().setText(this.objEdMenu.getTxtEnsalada2().getText());
            this.objMenu.getCbIngrediente3().setText(this.objEdMenu.getTxtEnsalada3().getText());
            this.objMenu.getCbIngrediente4().setText(this.objEdMenu.getTxtEnsalada4().getText());
            this.objMenu.getCbIngrediente5().setText(this.objEdMenu.getTxtEnsalada5().getText());
            this.objMenu.getCbIngrediente6().setText(this.objEdMenu.getTxtEnsalada6().getText());
            String Ensalada[] = new String[4];
            Ensalada[0] = this.objEdMenu.getTxtOpcionEnsalada1().getText();
            Ensalada[1] = this.objEdMenu.getTxtOpcionEnsalada2().getText();
            Ensalada[2] = this.objEdMenu.getTxtOpcionEnsalada3().getText();
            Ensalada[3] = this.objEdMenu.getTxtOpcionEnsalada4().getText();
            for (int i=0;i<4;i++){
                this.objMenu.setCbxEnsalada(Ensalada[i]);
            }
            //Platillos
            this.objMenu.getLblTPLatillo1().setText(this.objEdMenu.getTxtTPlatillo1().getText());
            this.objMenu.getCbReceta1().setText(this.objEdMenu.getTxtPlato1().getText());
            this.objMenu.getCbReceta2().setText(this.objEdMenu.getTxtPlato2().getText());
            this.objMenu.getCbReceta3().setText(this.objEdMenu.getTxtPlato3().getText());
            this.objMenu.getLblTPLatillo2().setText(this.objEdMenu.getTxtTPlatillo2().getText());
            this.objMenu.getCbReceta4().setText(this.objEdMenu.getTxtPlato4().getText());
            this.objMenu.getCbReceta5().setText(this.objEdMenu.getTxtPlato5().getText());
            this.objMenu.getCbReceta6().setText(this.objEdMenu.getTxtPlato6().getText());
            this.objMenu.getLblTPLatillo3().setText(this.objEdMenu.getTxtTPlatillo3().getText());
            this.objMenu.getCbReceta7().setText(this.objEdMenu.getTxtPlato7().getText());
            this.objMenu.getCbReceta8().setText(this.objEdMenu.getTxtPlato8().getText());
            this.objMenu.getCbReceta9().setText(this.objEdMenu.getTxtPlato9().getText());
            //Bebidas
            this.objMenu.getCbBebida1().setText(this.objEdMenu.getTxtOpcion1().getText());
            String Bebida1[] = new String[6];
            Bebida1[0] = this.objEdMenu.getTxtSabor1Op1().getText();
            Bebida1[1] = this.objEdMenu.getTxtSabor1Op2().getText();
            Bebida1[2] = this.objEdMenu.getTxtSabor1Op3().getText();
            Bebida1[3] = this.objEdMenu.getTxtSabor1Op4().getText();
            Bebida1[4] = this.objEdMenu.getTxtSabor1Op5().getText();
            Bebida1[5] = this.objEdMenu.getTxtSabor1Op6().getText();
            for (int i=0;i<4;i++){
                this.objMenu.setCbxOpcionB1(Bebida1[i]);
            }
            
            this.objMenu.getCbBebida2().setText(this.objEdMenu.getTxtOpcion2().getText());
            String Bebida2[] = new String[6];
            Bebida2[0] = this.objEdMenu.getTxtSabor2Op1().getText();
            Bebida2[1] = this.objEdMenu.getTxtSabor2Op2().getText();
            Bebida2[2] = this.objEdMenu.getTxtSabor2Op3().getText();
            Bebida2[3] = this.objEdMenu.getTxtSabor2Op4().getText();
            Bebida2[4] = this.objEdMenu.getTxtSabor2Op5().getText();
            Bebida2[5] = this.objEdMenu.getTxtSabor2Op6().getText();
             for (int i=0;i<4;i++){
                this.objMenu.setCbxOpcionB1(Bebida2[i]);
            }
            this.objMenu.getCbBebida3().setText(this.objEdMenu.getTxtOpcion3().getText());
            String Bebida3[] = new String[6];
            Bebida3[0] = this.objEdMenu.getTxtSabor3Op1().getText();
            Bebida3[1] = this.objEdMenu.getTxtSabor3Op2().getText();
            Bebida3[2] = this.objEdMenu.getTxtSabor3Op3().getText();
            Bebida3[3] = this.objEdMenu.getTxtSabor3Op4().getText();
            Bebida3[4] = this.objEdMenu.getTxtSabor3Op5().getText();
            Bebida3[5] = this.objEdMenu.getTxtSabor3Op6().getText();
             for (int i=0;i<4;i++){
                this.objMenu.setCbxOpcionB1(Bebida3[i]);
            }
            this.objMenu.getCbBebida4().setText(this.objEdMenu.getTxtOpcion4().getText());
            String Bebida4[] = new String[6];
            Bebida4[0] = this.objEdMenu.getTxtSabor4Op1().getText();
            Bebida4[1] = this.objEdMenu.getTxtSabor4Op2().getText();
            Bebida4[2] = this.objEdMenu.getTxtSabor4Op3().getText();
            Bebida4[3] = this.objEdMenu.getTxtSabor4Op4().getText();
            Bebida4[4] = this.objEdMenu.getTxtSabor4Op5().getText();
            Bebida4[5] = this.objEdMenu.getTxtSabor4Op6().getText();
             for (int i=0;i<4;i++){
                this.objMenu.setCbxOpcionB1(Bebida4[i]);
            }
            this.objMenu.getCbBebida5().setText(this.objEdMenu.getTxtOpcion5().getText());
            String Bebida5[] = new String[6];
            Bebida5[0] = this.objEdMenu.getTxtSabor5Op1().getText();
            Bebida5[1] = this.objEdMenu.getTxtSabor5Op2().getText();
            Bebida5[2] = this.objEdMenu.getTxtSabor5Op3().getText();
            Bebida5[3] = this.objEdMenu.getTxtSabor5Op4().getText();
            Bebida5[4] = this.objEdMenu.getTxtSabor5Op5().getText();
            Bebida5[5] = this.objEdMenu.getTxtSabor5Op6().getText();
             for (int i=0;i<4;i++){
                this.objMenu.setCbxOpcionB1(Bebida5[i]);
            }
            this.objMenu.getCbBebida6().setText(this.objEdMenu.getTxtOpcion6().getText());
            String Bebida6[] = new String[6];
            Bebida6[0] = this.objEdMenu.getTxtSabor6Op1().getText();
            Bebida6[1] = this.objEdMenu.getTxtSabor6Op2().getText();
            Bebida6[2] = this.objEdMenu.getTxtSabor6Op3().getText();
            Bebida6[3] = this.objEdMenu.getTxtSabor6Op4().getText();
            Bebida6[4] = this.objEdMenu.getTxtSabor6Op5().getText();
            Bebida6[5] = this.objEdMenu.getTxtSabor6Op6().getText();
             for (int i=0;i<4;i++){
                this.objMenu.setCbxOpcionB1(Bebida6[i]);
            }
            
            //Postres
            this.objMenu.getCbPostre1().setText(this.objEdMenu.getTxtPostre1().getText());
            this.objMenu.getCbPOpcion1().setText(this.objEdMenu.getTxtOpc1Postre1().getText());
            this.objMenu.getCbPOpcion2().setText(this.objEdMenu.getTxtOpc2Postre1().getText());
            this.objMenu.getCbPOpcion3().setText(this.objEdMenu.getTxtOpc3Postre1().getText());
            this.objMenu.getCbPostre2().setText(this.objEdMenu.getTxtPostre2().getText());
            this.objMenu.getCbPOpcion4().setText(this.objEdMenu.getTxtOpc1Postre2().getText());
            this.objMenu.getCbPOpcion5().setText(this.objEdMenu.getTxtOpc2Postre2().getText());
            this.objMenu.getCbPOpcion6().setText(this.objEdMenu.getTxtOpc3Postre2().getText());
            this.objMenu.getCbPostre3().setText(this.objEdMenu.getTxtPostre3().getText());
            this.objMenu.getCbPOpcion7().setText(this.objEdMenu.getTxtOpc1Postre3().getText());
            this.objMenu.getCbPOpcion8().setText(this.objEdMenu.getTxtOpc2Postre3().getText());
            this.objMenu.getCbPOpcion9().setText(this.objEdMenu.getTxtOpc3Postre3().getText());
            
            this.objEdMenu.setVisible(false);
            this.objMenu.setVisible(true);
        }
        //Pedido
        int i=0;
        ArrayList<String> pedido = new ArrayList();
        if(this.objMenu.getBtnEnviarOrden()== evento.getSource()){
            //Entrada
            String entrada1, opcientrada1, entrada2, opcientrada2;
            if(this.objMenu.getCbE1Opcion1().isSelected()==true 
                    | this.objMenu.getCbE1Opcion2().isSelected()==true 
                    | this.objMenu.getCbE1Opcion3().isSelected()==true){
                entrada1 = this.objMenu.getBtnEntrada1().getText();
            }
            else{entrada1 = " ";}
            if(this.objMenu.getCbE1Opcion1().isSelected()==true){opcientrada1 =this.objMenu.getCbE1Opcion1().getText();}
            else if(this.objMenu.getCbE1Opcion2().isSelected()==true){opcientrada1 =this.objMenu.getCbE1Opcion2().getText();}
            else if(this.objMenu.getCbE1Opcion3().isSelected()==true){opcientrada1 =this.objMenu.getCbE1Opcion3().getText();}
            else {opcientrada1="";}
            
            if(this.objMenu.getCbE2Opcion1().isSelected()==true 
                    | this.objMenu.getCbE2Opcion2().isSelected()==true 
                    | this.objMenu.getCbE2Opcion3().isSelected()==true){
                entrada2 = this.objMenu.getBtnEntrada2().getText();
            }
            else{entrada2 = " ";}
            if(this.objMenu.getCbE2Opcion1().isSelected()==true){opcientrada2 =this.objMenu.getCbE2Opcion1().getText();}
            else if(this.objMenu.getCbE2Opcion2().isSelected()==true){opcientrada2 =this.objMenu.getCbE2Opcion2().getText();}
            else if(this.objMenu.getCbE2Opcion3().isSelected()==true){opcientrada2 =this.objMenu.getCbE2Opcion3().getText();}
            else {opcientrada2="";}
            //Ensalada
            String ensalada;
            if(this.objMenu.getCbIngrediente1().isSelected()==true | this.objMenu.getCbIngrediente1().isSelected()==true
                    |this.objMenu.getCbIngrediente3().isSelected()==true | this.objMenu.getCbIngrediente4().isSelected()==true
                    |this.objMenu.getCbIngrediente5().isSelected()==true | this.objMenu.getCbIngrediente6().isSelected()==true){
                ensalada="La ensalada se compone de:"+"\n";
                if(this.objMenu.getCbIngrediente1().isSelected()==true){ensalada +=(this.objMenu.getCbIngrediente1().getText())+"\n";}
                if(this.objMenu.getCbIngrediente2().isSelected()==true){ensalada +=(this.objMenu.getCbIngrediente2().getText())+"\n";}
                if(this.objMenu.getCbIngrediente3().isSelected()==true){ensalada +=(this.objMenu.getCbIngrediente3().getText())+"\n";}
                if(this.objMenu.getCbIngrediente4().isSelected()==true){ensalada +=(this.objMenu.getCbIngrediente4().getText())+"\n";}
                if(this.objMenu.getCbIngrediente5().isSelected()==true){ensalada +=(this.objMenu.getCbIngrediente5().getText())+"\n";}
                if(this.objMenu.getCbIngrediente6().isSelected()==true){ensalada +=(this.objMenu.getCbIngrediente6().getText())+"\n";}
                ensalada+=" es de tamaño:"+this.objMenu.getCbxTamaño().getSelectedItem().toString();
            }
            else {
                ensalada = this.objMenu.getCbxEnsalada().getSelectedItem().toString();
            }
            //Platillos
            String platillo1 = "";
            if(this.objMenu.getCbReceta1().isSelected()==true){platillo1+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            if(this.objMenu.getCbReceta2().isSelected()==true){platillo1+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            if(this.objMenu.getCbReceta3().isSelected()==true){platillo1+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            String platillo2 = "";
            if(this.objMenu.getCbReceta4().isSelected()==true){platillo2+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            if(this.objMenu.getCbReceta5().isSelected()==true){platillo2+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            if(this.objMenu.getCbReceta6().isSelected()==true){platillo2+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            String platillo3 = "";
            if(this.objMenu.getCbReceta7().isSelected()==true){platillo3+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            if(this.objMenu.getCbReceta8().isSelected()==true){platillo3+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            if(this.objMenu.getCbReceta9().isSelected()==true){platillo3+=(this.objMenu.getCbIngrediente1().getText())+"\n";}
            
            //Bebidas
            String bebidas = " ";
            if(this.objMenu.getCbBebida1().isSelected()==true){bebidas+=(this.objMenu.getCbBebida1().getText())+(this.objMenu.getCbxOpcionB1().getSelectedItem().toString())+"\n";}
            if(this.objMenu.getCbBebida2().isSelected()==true){bebidas+=(this.objMenu.getCbBebida2().getText())+(this.objMenu.getCbxOpcionB1().getSelectedItem().toString())+"\n";}
            if(this.objMenu.getCbBebida3().isSelected()==true){bebidas+=(this.objMenu.getCbBebida3().getText())+(this.objMenu.getCbxOpcionB1().getSelectedItem().toString())+"\n";}
            if(this.objMenu.getCbBebida4().isSelected()==true){bebidas+=(this.objMenu.getCbBebida4().getText())+(this.objMenu.getCbxOpcionB1().getSelectedItem().toString())+"\n";}
            if(this.objMenu.getCbBebida5().isSelected()==true){bebidas+=(this.objMenu.getCbBebida5().getText())+(this.objMenu.getCbxOpcionB1().getSelectedItem().toString())+"\n";}
            if(this.objMenu.getCbBebida6().isSelected()==true){bebidas+=(this.objMenu.getCbBebida6().getText())+(this.objMenu.getCbxOpcionB1().getSelectedItem().toString())+"\n";}
            
            //Postre
            String postre="";
            if(this.objMenu.getCbPostre1().isSelected()==true){postre=(this.objMenu.getCbPostre1().getText())+"\n";
            if(this.objMenu.getCbPOpcion1().isSelected()==true){postre=(this.objMenu.getCbPOpcion1().getText())+"\n";}
            if(this.objMenu.getCbPOpcion2().isSelected()==true){postre=(this.objMenu.getCbPOpcion2().getText())+"\n";}
            if(this.objMenu.getCbPOpcion3().isSelected()==true){postre=(this.objMenu.getCbPOpcion3().getText())+"\n";}
            }
            if(this.objMenu.getCbPostre2().isSelected()==true){postre=(this.objMenu.getCbPostre2().getText())+"\n";
            if(this.objMenu.getCbPOpcion4().isSelected()==true){postre=(this.objMenu.getCbPOpcion4().getText())+"\n";}
            if(this.objMenu.getCbPOpcion5().isSelected()==true){postre=(this.objMenu.getCbPOpcion5().getText())+"\n";}
            if(this.objMenu.getCbPOpcion6().isSelected()==true){postre=(this.objMenu.getCbPOpcion6().getText())+"\n";}
            }
            if(this.objMenu.getCbPostre3().isSelected()==true){postre=(this.objMenu.getCbPostre3().getText())+"\n";
            if(this.objMenu.getCbPOpcion7().isSelected()==true){postre=(this.objMenu.getCbPOpcion7().getText())+"\n";}
            if(this.objMenu.getCbPOpcion8().isSelected()==true){postre=(this.objMenu.getCbPOpcion8().getText())+"\n";}
            if(this.objMenu.getCbPOpcion9().isSelected()==true){postre=(this.objMenu.getCbPOpcion9().getText())+"\n";}
            }
            String mesa="";
            mesa=entrada1+opcientrada1+entrada2+opcientrada2+"\n"+ensalada+"\n"+
                    platillo1+"\n"+platillo2+"\n"+platillo3+"\n"+bebidas+"\n"+postre;
            pedido.add(mesa); 
            if(this.objPedido.getTxtaPedido1().getText().isEmpty()){this.objPedido.getTxtaPedido1().setText(pedido.get(i));}
            else if(this.objPedido.getTxtaPedido1().getText().isEmpty()==false){this.objPedido.getTxtaPedido2().setText(pedido.get(i));}
            else if(this.objPedido.getTxtaPedido2().getText().isEmpty()==false){this.objPedido.getTxtaPedido3().setText(pedido.get(i));}
            else if(this.objPedido.getTxtaPedido3().getText().isEmpty()==false){this.objPedido.getTxtaPedido4().setText(pedido.get(i));}
            else if(this.objPedido.getTxtaPedido4().getText().isEmpty()==false){this.objPedido.getTxtaPedido5().setText(pedido.get(i));}
            else if(this.objPedido.getTxtaPedido5().getText().isEmpty()==false){this.objPedido.getTxtaPedido6().setText(pedido.get(i));}
            if(this.objPedido.getBtnPedido1()==evento.getSource()){this.objPedido.getTxtaPedido1().setText("");}
            if(this.objPedido.getBtnPedido2()==evento.getSource()){this.objPedido.getTxtaPedido2().setText("");}
            if(this.objPedido.getBtnPedido3()==evento.getSource()){this.objPedido.getTxtaPedido3().setText("");}
            if(this.objPedido.getBtnPedido4()==evento.getSource()){this.objPedido.getTxtaPedido4().setText("");}
            if(this.objPedido.getBtnPedido5()==evento.getSource()){this.objPedido.getTxtaPedido5().setText("");}
            if(this.objPedido.getBtnPedido6()==evento.getSource()){this.objPedido.getTxtaPedido6().setText("");}
            this.objPedido.setVisible(true);
            i++;
        }
        if(this.objMenu.getBtnVolver()== evento.getSource()){this.objOpcCliente.setVisible(true);this.objMenu.setVisible(false);}
        //Reservación
        if(this.objReservaciones.getBtnReservaciones()== evento.getSource()){
            Reservas reservas= new Reservas();
            String eventos="";
            if(this.objReservaciones.getTxtOtros().getText().isEmpty()){ eventos = this.objReservaciones.getCbxEvento().getSelectedItem().toString();}
            else{eventos=this.objReservaciones.getTxtOtros().getText();}
            reservas.setDia(this.objReservaciones.getCbxDia().getSelectedItem().toString()+"/"+this.objReservaciones.getCbxMes().getSelectedItem().toString()+"/"
                    +this.objReservaciones.getCbxAño().getSelectedItem().toString());
            reservas.setUbicacion(this.objReservaciones.getCbxTam().getSelectedItem().toString()+","+this.objReservaciones.getCbxUbicacion().getSelectedItem().toString()
                    +","+this.objReservaciones.getCbxColocacion().getSelectedItem().toString());
            reservas.setEvento(eventos);
            lreservas.add(reservas);
            matrispedido= new String[lreservas.size()][4];
            for(i=0; i<lreservas.size();i++){   
                matrispedido[i][0]=lreservas.get(i).getDia();
                matrispedido[i][1]=lreservas.get(i).getUbicacion();
                matrispedido[i][2]=lreservas.get(i).getEvento();;
            }
            for(i=0; i<lreservas.size();i++){
                this.objRRervas.setTbReservaciones(matrispedido);
            }
            this.objReservaciones.getJdConfirmacion().setVisible(true);
            this.objReservaciones.setVisible(false);
            this.objOpcCliente.setVisible(true);
        }
        
        //Domicilio
        if(this.objDomicilio.getBtnPedido()== evento.getSource()){this.objDomicilio.setVisible(false);this.objMenu.setVisible(true);}
        if(this.objDomicilio.getBtnRDomicilio()== evento.getSource()){this.objDomicilio.setVisible(false);this.objMenu.setVisible(true);}
        if(this.objDomicilio.getBtnCancelar()== evento.getSource()){this.objDomicilio.setVisible(false); this.objOpcCliente.setVisible(true);}
    } 
}
