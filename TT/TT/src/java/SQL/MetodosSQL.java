/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author carlo
 */
public class MetodosSQL {
    
    private Connection conexion;
    private PreparedStatement sentenciaPreparada;
    private ResultSet resultado;
    
    public boolean traerMedicionHistorica(String fecha1, String fecha2){
        boolean traerMedHistorica = false;
        
        try {
            conexion = ConexionBD.conectar();
            String consulta = "SELECT Fecha, PM_1, PM2_5, PM_10 from M_UPIITA where Fecha between '?' and '?'";
            sentenciaPreparada = conexion.prepareStatement(consulta);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate localDate1 = LocalDate.parse(fecha1, formatter);
            LocalDate localDate2 = LocalDate.parse(fecha1, formatter);
            Date fechaSQL1 = Date.valueOf(localDate1);
            Date fechaSQL2 = Date.valueOf(localDate2);
            sentenciaPreparada.setDate(1, fechaSQL1);
            sentenciaPreparada.setDate(2, fechaSQL2);
            resultado = sentenciaPreparada.executeQuery();
            
            if(resultado.next()){
                traerMedHistorica = true; 
            }else{
                traerMedHistorica = false;
            }
            conexion.close();
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }finally{
            try {
                conexion.close();
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
        System.out.println("El valor de la busqueda es = " + traerMedHistorica);
        return traerMedHistorica;
    }
}
