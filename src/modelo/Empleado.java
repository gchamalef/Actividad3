/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author pc01
 */
public class Empleado extends Persona {
    private String codigo;
    private float sueldo, bono;
    private int id, puesto;
    Conexion cn;
    public Empleado(){}

    public Empleado(String codigo, float sueldo, float bono, int id, int puesto, String nombres, String apellidos, String direccion, String telefono, String fecha_nacimiento) {
        super(nombres, apellidos, direccion, telefono, fecha_nacimiento);
        this.codigo = codigo;
        this.sueldo = sueldo;
        this.bono = bono;
        this.id = id;
        this.puesto = puesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getBono() {
        return bono;
    }

    public void setBono(float bono) {
        this.bono = bono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPuesto() {
        return puesto;
    }

    public void setPuesto(int puesto) {
        this.puesto = puesto;
    }

    @Override
    public DefaultTableModel leer() {
        DefaultTableModel tabla = new DefaultTableModel();
        try{
            cn = new Conexion();
            cn.abrir_conexion();
            String query;
            query = "select e.id_empleado as id, e.codigo, e.nombres, e.apellidos, e.direccion, e.telefono, e.fecha_nacimiento, p.puesto as puesto, e.sueldo, e.bono, e.sueldo + e.bono as sueldo_total from empleados e join puestos p on e.id_puesto = p.id_puesto order by id;";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
            String encabezado[] = {"Id","Codigo","Nombres","Apellidos","Direccion","Telefono","Nacimiento","Puesto","Sueldo","Bono","Total"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[11];
            while(consulta.next()){
                datos[0] = consulta.getString("id");
                datos[1] = consulta.getString("e.codigo");
                datos[2] = consulta.getString("e.nombres");
                datos[3] = consulta.getString("e.apellidos");
                datos[4] = consulta.getString("e.direccion");
                datos[5] = consulta.getString("e.telefono");
                datos[6] = consulta.getString("e.fecha_nacimiento");
                datos[7] = consulta.getString("puesto");
                datos[8] = consulta.getString("e.sueldo");
                datos[9] = consulta.getString("e.bono");
                datos[10] = consulta.getString("sueldo_total");
                tabla.addRow(datos);
            }
        } catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        
        return tabla;
    }
    public DefaultComboBoxModel leer_puesto(){
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        try{
            cn = new Conexion();
            cn.abrir_conexion();
            String query;
            query = "select id_puesto as id, puesto from puestos";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
            combo.addElement("0) Seleccione puesto.");
            while(consulta.next()){
                combo.addElement(consulta.getString("id")+") "+consulta.getString("puesto"));
            }
            cn.cerrar_conexion();
        } catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
        return combo;
    }

    @Override
    public void crear() {
        try{
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query;
            query = "insert into empleados(codigo, nombres, apellidos, direccion, telefono, fecha_nacimiento, id_puesto, sueldo, bono) values(?,?,?,?,?,?,?,?,?);";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getCodigo());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setInt(7, getPuesto());
            parametro.setFloat(8, getSueldo());
            parametro.setFloat(9, getBono());
            int executar = parametro.executeUpdate();
            System.out.println("Se inserto: " + Integer.toString(executar) + " Registro");
            cn.cerrar_conexion();
        } catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    @Override
    public void actualizar(){
        try{
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query;
            query = "update empleados set codigo = ?, nombres = ?, apellidos = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?, id_puesto = ?, sueldo = ?, bono = ? where id_empleado = ?;";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getCodigo());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, getFecha_nacimiento());
            parametro.setInt(7, getPuesto());
            parametro.setFloat(8, getSueldo());
            parametro.setFloat(9, getBono());
            parametro.setInt(10, getId());
            int executar = parametro.executeUpdate();
            System.out.println("Se actualizao: " + Integer.toString(executar) + " Registro");
            cn.cerrar_conexion();
        } catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
    
    @Override
    public void borrar(){
        try{
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrir_conexion();
            String query = "delete from empleados where id_empleado = ?;";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setInt(1, getId());
            int executar = parametro.executeUpdate();
            System.out.println("Se elimino: " + Integer.toString(executar) + "Registro");
            cn.cerrar_conexion();
        } catch(SQLException ex){
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
