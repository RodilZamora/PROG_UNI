package acceso;

import java.sql.*;
import conexion.*;
import clases.*;
import java.util.*;

public class Acceso extends Conexion{
    Connection con = conectar();

    
public int graba_distrito(String cod, String nom) {
        int sw = 0;
        String sql = "exec graba_distrito ?,?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            ps.setString(2, nom);
            int nfilas = ps.executeUpdate();
            if (nfilas > 0) {
                sw = 1;
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sw;
 }

 
  public String busca_distrito(String cod) {
       String nom = null;
       String sql = "exec busca_distrito ?";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            ResultSet rs = ps.executeQuery();
            if (rs.next() == true) {
               nom = rs.getString(1);
            }              
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return nom;
    }

public int modifica_distrito(String cod, String nom) {
        int sw = 0;
        String sql = "exec modifica_distrito ?,?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            ps.setString(2, nom);
            int nfilas = ps.executeUpdate();
            if (nfilas > 0) {
                sw = 1;
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sw;
 }


public int elimina_distrito(String cod) {
        int sw = 0;
        String sql = "exec elimina_distrito ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cod);
            int nfilas = ps.executeUpdate();
            if (nfilas > 0) {
                sw = 1;
            }
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return sw;
 }

 public List<Distrito> lista_todos_distritos() {
       List<Distrito> lista = new ArrayList();
       String sql = "exec lista_todos_distritos";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next() == true) {
               Distrito d = new Distrito();
               d.setCodigo(rs.getString(1));
               d.setNombre(rs.getString(2));
               lista.add(d);                
            }              
        } 
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return lista;
    }

