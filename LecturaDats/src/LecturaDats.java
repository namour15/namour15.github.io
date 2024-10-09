import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
//import java.util.Date;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class LecturaDats {
    private static final String CSV_FILE_PATH = "C:\\Users\\carlo\\OneDrive\\Escritorio\\XML\\Mediciones\\UPIITA_Fechas.csv";
    private static final String JDBC_URL = "jdbc:sqlserver://CARLOSEMILIO;databaseName=Mediciones";
    private static final String JDBC_USER = "sa";
    private static final String JDBC_PASSWORD = "root";

    public static void main(String[] args) throws ParseException {
        try {
            // Leer el archivo CSV
            //List<String[]> rows = readCsv(CSV_FILE_PATH);
            List<String[]> rows = readCsv(CSV_FILE_PATH);

            // Conectar a la base de datos
            try (Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD)) {
                // Preparar la consulta SQL
                String sql = "INSERT INTO M_UPIITA (Fecha, AQI, AQI_alto, PM_1, Alto_PM_1, PM2_5, Alto_PM2_5, PM_10, Alto_PM_10, Temperatura, Temperatura_Alta, Temperatura_Baja, Humedad, Humedad_Alta, Humedad_Baja, Rocio, Max_Rocio, Min_Rocio, BH, MAXTEMPBH, MINTEMPBH, IndiceCalor, Max_IndiceCalor) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    // Insertar los datos en la base de datos
                    for (String[] row : rows) {
                        // Asumimos que las columnas son: un entero, una cadena, un decimal y una fecha.
                         // statement.setDate(1, java.sql.Date.valueOf(row[0]));
                            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yy");
                            LocalDate localDate = LocalDate.parse(row[0], formatter);
                            Date sqlDate = Date.valueOf(localDate);
                          statement.setDate(1, sqlDate);
                          //statement.setString(1, row[0]); // Columna de tipo VARCHAR
                          statement.setInt(2, Integer.parseInt(row[1]));
                          statement.setInt(3, Integer.parseInt(row[2]));
                          statement.setInt(4, Integer.parseInt(row[3]));
                          statement.setInt(5, Integer.parseInt(row[4]));
                          statement.setInt(6, Integer.parseInt(row[5]));
                          statement.setInt(7, Integer.parseInt(row[6]));
                          statement.setInt(8, Integer.parseInt(row[7]));
                          statement.setInt(9, Integer.parseInt(row[8]));
                          statement.setInt(10, Integer.parseInt(row[9]));
                          statement.setInt(11, Integer.parseInt(row[10]));
                          statement.setInt(12, Integer.parseInt(row[11]));
                          statement.setInt(13, Integer.parseInt(row[12]));
                          statement.setInt(14, Integer.parseInt(row[13]));
                          statement.setInt(15, Integer.parseInt(row[14]));
                          statement.setInt(16, Integer.parseInt(row[15]));
                          statement.setInt(17, Integer.parseInt(row[16]));
                          statement.setInt(18, Integer.parseInt(row[17]));
                          statement.setInt(19, Integer.parseInt(row[18]));
                          statement.setInt(20, Integer.parseInt(row[19]));
                          statement.setInt(21, Integer.parseInt(row[20]));
                          statement.setInt(22, Integer.parseInt(row[21]));
                          statement.setInt(23, Integer.parseInt(row[22]));
                          
                          

                          //statement.setString(2, row[1]); // Columna de tipo VARCHAR


                          statement.addBatch();
                    }
                    statement.executeBatch();
                }
            }
            System.out.println("Datos insertados con éxito.");
        } catch (IOException | CsvException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static List<String[]> readCsv(String filePath) throws IOException, CsvException {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            return reader.readAll();
        }
        

        private static List
    } 
}