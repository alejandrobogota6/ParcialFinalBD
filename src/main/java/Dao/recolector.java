/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Vo.recoleccionfi;
import Vo.recolector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JCBOT
 */
public class recolector {

    public List<recolector> findAll() throws SQLException {
        List<recolector> departamentos = null;
        String query = "SELECT * FROM recolector";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
           
            int id;
            String nombre;
            

            while (rs.next()) {
                if (departamentos == null) {
                    departamentos = new ArrayList<recolector>();
                }

                recolector registro = new recolector();

                id = rs.getInt("id");
                registro.setId(id);

                nombre = rs.getString("nombre");
                registro.setNombre(nombre);


                departamentos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return departamentos;
    }



}
