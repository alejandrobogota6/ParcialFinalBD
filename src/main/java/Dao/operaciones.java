/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Vo.recoleccionfi;
import Vo.recolector;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author JCBOT
 */
public class operaciones {

    public Map<Integer, String> listar() throws SQLException {

        recolector re = new recolector();
        Crud_recoleccion recolec = new Crud_recoleccion();
        List<recolector> application1 = re.findAll();
        List<recoleccionfi> application2 = recolec.findAll();
        Map<Integer, String> map2 = new HashMap<Integer, String>();
        String colmenatemp = null;
        int cantidad_kilos = 0;

        for (int i = 0; i < application2.size(); i++) {

            colmenatemp = application2.get(i).getColmena();

            for (int j = 0; j < application2.size(); j++) {
                cantidad_kilos=0;
                if (colmenatemp == application2.get(i).getColmena()) {
                    cantidad_kilos = cantidad_kilos + application2.get(i).getKilosdemiel();
                }

            }
            map2.put(cantidad_kilos, colmenatemp);
        }

        return map2;

    }

}
