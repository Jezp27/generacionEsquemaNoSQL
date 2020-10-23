package solucion;

/*Este ejemplo fue tomado de internet y fue modificado para acceder y
 pintar figuras desde la BD*/
import java.sql.*;
import com.mongodb.*;

public class OracleMongo {

    public static void main(String args[]) {
        generarYcargarEstadisticas();
        visualizarEstadisticas();
    }

    public static void generarYcargarEstadisticas() {
        // Conexión a MongoDB
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        // Conexión a base de datos y coleccion
        DB database = mongoClient.getDB("estadistica");
        DBCollection collection = database.getCollection("resumenVentas");
        Connection conn;
        Statement sentencia;
        ResultSet resultado;
        String consulta;
        DBObject resumen, query;

        try { // Se carga el driver JDBC-ODBC
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (Exception e) {
            System.out.println("No se pudo cargar el driver JDBC");
            return;
        }

        try { // Se establece la conexi�n con la base de datos Oracle Express
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jdordonezn", "97022602");
            sentencia = conn.createStatement();
            //Limpiar colección de Mongo
            query = new BasicDBObject();
            collection.remove(query);
        } catch (SQLException e) {
            System.out.println("No hay conexi�n con la base de datos.");
            return;
        }
        try {
            //1. Total de ventas (suma del atributo valor) por sucursal.
            consulta = "SELECT SUM(valor) AS Total_ventas_sucursal,V.codigo_sucursal,S.nombre_sucursal FROM VENTA V INNER JOIN SUCURSAL S ON V.codigo_sucursal=S.codigo_sucursal GROUP BY(V.codigo_sucursal,S.nombre_sucursal)";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por surcursal..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_sucursal", resultado.getInt("Total_ventas_sucursal"))
                        .append("codigo_sucursal", resultado.getInt("codigo_sucursal"))
                        .append("nombre_sucursal", resultado.getString("nombre_sucursal"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //2. Total de ventas (suma del atributo valor) por ciudad
            consulta = "SELECT VENT_C.Total_ventas AS Total_ventas_ciudad, C.codigo_ciudad, C.nombre_ciudad FROM (SELECT SUM(valor) AS Total_ventas,S.codigo_ciudad FROM VENTA V INNER JOIN SUCURSAL S ON V.codigo_sucursal=S.codigo_sucursal GROUP BY(S.codigo_ciudad)) VENT_C INNER JOIN CIUDAD C ON VENT_C.codigo_ciudad=C.codigo_ciudad";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por ciudad..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_ciudad", resultado.getInt("Total_ventas_ciudad"))
                        .append("codigo_ciudad", resultado.getInt("codigo_ciudad"))
                        .append("nombre_ciudad", resultado.getString("nombre_ciudad"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //3. Total de ventas (suma del atributo valor) por departamento.
            consulta = "SELECT VENT_D.Total_ventas AS Total_ventas_dpto, D.codigo_dpto, D.nombre_dpto FROM (SELECT SUM(VENT_C.Total_ventas) Total_ventas, C.codigo_dpto FROM (SELECT SUM(valor) AS Total_ventas,S.codigo_ciudad FROM VENTA V INNER JOIN SUCURSAL S ON V.codigo_sucursal=S.codigo_sucursal GROUP BY(S.codigo_ciudad)) VENT_C INNER JOIN CIUDAD C ON VENT_C.codigo_ciudad=C.codigo_ciudad GROUP BY C.CODIGO_DPTO) VENT_D INNER JOIN DPTO D ON D.codigo_dpto=VENT_D.codigo_dpto";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por departamento..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_dpto", resultado.getInt("Total_ventas_dpto"))
                        .append("codigo_dpto", resultado.getInt("codigo_dpto"))
                        .append("nombre_dpto", resultado.getString("nombre_dpto"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //4. Total de ventas (suma del atributo valor) por país.
            consulta = "SELECT SUM(VENT_D.Total_ventas) AS Total_ventas_pais , D.nombre_pais FROM (SELECT SUM(VENT_C.Total_ventas) Total_ventas, C.codigo_dpto FROM (SELECT SUM(valor) AS Total_ventas,S.codigo_ciudad FROM VENTA V INNER JOIN SUCURSAL S ON V.codigo_sucursal=S.codigo_sucursal GROUP BY(S.codigo_ciudad)) VENT_C INNER JOIN CIUDAD C ON VENT_C.codigo_ciudad=C.codigo_ciudad GROUP BY C.CODIGO_DPTO) VENT_D INNER JOIN DPTO D ON D.codigo_dpto=VENT_D.codigo_dpto GROUP BY D.nombre_pais";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por pais..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_pais", resultado.getInt("Total_ventas_pais"))
                        .append("nombre_pais", resultado.getString("nombre_pais"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //5.	Total de ventas (suma del atributo valor) por vendedor.
            consulta = "SELECT SUM(valor) AS Total_ventas_vendedor,VD.codigo_vendedor,VD.nombre_vendedor FROM VENTA VT INNER JOIN VENDEDOR VD ON VT.codigo_vendedor=VD.codigo_vendedor GROUP BY(VD.codigo_vendedor,VD.nombre_vendedor)";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por vendedor..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_vendedor", resultado.getInt("Total_ventas_vendedor"))
                        .append("codigo_vendedor", resultado.getInt("codigo_vendedor"))
                        .append("nombre_vendedor", resultado.getString("nombre_vendedor"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //6.	Total de ventas (suma del atributo valor) por gremio.
            consulta = "SELECT VENT_V.Total_ventas AS Total_ventas_gremio, G.codigo_gremio, G.nombre_gremio FROM (SELECT SUM(valor) AS Total_ventas,VD.codigo_gremio FROM VENTA VT INNER JOIN VENDEDOR VD ON VT.codigo_vendedor=VD.codigo_vendedor GROUP BY(VD.codigo_gremio)) VENT_V INNER JOIN GREMIO G ON VENT_V.codigo_gremio=G.codigo_gremio";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por gremio..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_gremio", resultado.getInt("Total_ventas_gremio"))
                        .append("codigo_gremio", resultado.getInt("codigo_gremio"))
                        .append("nombre_gremio", resultado.getString("nombre_gremio"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //7. 	Total de ventas (suma del atributo valor) por producto.
            consulta = "SELECT SUM(valor) AS Total_ventas_producto,P.cod_barras,P.nombre_producto FROM VENTA VT INNER JOIN PRODUCTO P ON VT.cod_barras=P.cod_barras GROUP BY(P.cod_barras,P.nombre_producto)";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por producto..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_producto", resultado.getInt("Total_ventas_producto"))
                        .append("cod_barras", resultado.getInt("cod_barras"))
                        .append("nombre_producto", resultado.getString("nombre_producto"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            //8. Total de ventas (suma del atributo valor) por marca.
            consulta = "SELECT VENT_M.Total_ventas AS Total_ventas_marca, M.nombre_marca, M.descripcion FROM MARCA M INNER JOIN (SELECT SUM(valor) AS Total_ventas,P.nombre_marca FROM VENTA VT INNER JOIN PRODUCTO P ON VT.cod_barras=P.cod_barras GROUP BY(P.nombre_marca)) VENT_M ON M.nombre_marca=VENT_M.nombre_marca";
            resultado = sentencia.executeQuery(consulta);
            System.out.println("Total ventas por marca..");
            while (resultado.next()) {
                resumen = new BasicDBObject("total_ventas_marca", resultado.getInt("Total_ventas_marca"))
                        .append("nombre_marca", resultado.getString("nombre_marca"))
                        .append("descripcion", resultado.getString("descripcion"));
                //System.out.println(resumen);
                //Insersión a MongoDB
                collection.insert(resumen);
            }
            System.out.println("Datos calculados en Oracles e insertados en MongoDB");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static String visualizarEstadisticas() {
        // Conexión a MongoDB
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        // Conexión a base de datos y coleccion
        DB database = mongoClient.getDB("estadistica");
        DBCollection collection = database.getCollection("resumenVentas");
        DBObject condBool, condExist, ordenDesc, document;
        DBCursor cursor;
        String resultado = "";

        //. 1	Las 3 sucursales (código y nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada una de ellas).
        condBool = new BasicDBObject("$exists", true);
        condExist = new BasicDBObject("total_ventas_sucursal", condBool);
        ordenDesc = new BasicDBObject("total_ventas_sucursal", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "TotalVentasPorSucursal\tCodigoSucursal\tNombreSucursal\n";
            //System.out.println("TotV_sucursal\tcodigo_sucursal\tnombre_sucursal");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado +=  document.get("total_ventas_sucursal") + "\t\t" + document.get("codigo_sucursal") + "\t\t" + document.get("nombre_sucursal")+"\n";
            //System.out.println(document.get("total_ventas_sucursal") + "\t\t" + document.get("codigo_sucursal") + "\t\t" + document.get("nombre_sucursal"));
        }
        //2. Las 3 ciudades (código y nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada una de ellas).
        condExist = new BasicDBObject("total_ventas_ciudad", condBool);
        ordenDesc = new BasicDBObject("total_ventas_ciudad", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";    
        resultado += "TotalVentasPorCiudad\tCodigoCiudad\t\tNombreCiudad" +"\n";
            //System.out.println("TotV_ciudad\tcodigo_ciudad\tnombre_ciudad");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_ciudad") + "\t\t" + document.get("codigo_ciudad") + "\t\t" + document.get("nombre_ciudad")+"\n";
            //System.out.println(document.get("total_ventas_ciudad") + "\t\t" + document.get("codigo_ciudad") + "\t\t" + document.get("nombre_ciudad"));
        }
        //3. Los 3 departamentos (código y nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada uno de ellos).
        condExist = new BasicDBObject("total_ventas_dpto", condBool);
        ordenDesc = new BasicDBObject("total_ventas_dpto", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";
        resultado += "TotalVentasPorDpto\tCodigoDpto\t\tNombreDpto" +"\n";
            //System.out.println("TotV_dpto\tcodigo_dpto\tnombre_dpto");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_dpto") + "\t\t" + document.get("codigo_dpto") + "\t\t" + document.get("nombre_dpto")+"\n";
            //System.out.println(document.get("total_ventas_dpto") + "\t\t" + document.get("codigo_dpto") + "\t\t" + document.get("nombre_dpto"));
        }
        //4. Los 3 países (nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada uno de ellos).
        condExist = new BasicDBObject("total_ventas_pais", condBool);
        ordenDesc = new BasicDBObject("total_ventas_pais", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";
        resultado += "TotalVentasPorPais\tNombrePais" +"\n";
        //System.out.println("TotV_pais\tnombre_pais");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_pais") + "\t\t" + document.get("nombre_pais") +"\n";
            //System.out.println(document.get("total_ventas_pais") + "\t\t" + document.get("nombre_pais"));
        }
        //5. Los 3 vendedores (código y nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada uno de ellos).
        condExist = new BasicDBObject("total_ventas_vendedor", condBool);
        ordenDesc = new BasicDBObject("total_ventas_vendedor", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";
        resultado += "TotalVentasPorVendedor\tCodigoVendedor\tNombreVendedor" +"\n";
            //System.out.println("TotV_vended\tcodigo_vendedor\tnombre_vendedor");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_vendedor") + "\t\t" + document.get("codigo_vendedor") + "\t\t" + document.get("nombre_vendedor") +"\n";
            //System.out.println(document.get("total_ventas_vendedor") + "\t\t" + document.get("codigo_vendedor") + "\t\t" + document.get("nombre_vendedor"));
        }
        //6. Los 3 gremios (código y nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada uno de ellos).
        condExist = new BasicDBObject("total_ventas_gremio", condBool);
        ordenDesc = new BasicDBObject("total_ventas_gremio", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";
        resultado += "TotalVentasPorGremio\tCodigoGremio\t\tNombreGremio" +"\n";
            //System.out.println("TotV_gremio\tcodigo_gremio\tnombre_gremio");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_gremio") + "\t\t" + document.get("codigo_gremio") + "\t\t" + document.get("nombre_gremio") +"\n";
            //System.out.println(document.get("total_ventas_gremio") + "\t\t" + document.get("codigo_gremio") + "\t" + document.get("nombre_gremio"));
        }
        //7. Los 3 productos (codbarras y nombre) con mayor total de ventas (se debe mostrar el total de ventas de cada uno de ellos).
        condExist = new BasicDBObject("total_ventas_producto", condBool);
        ordenDesc = new BasicDBObject("total_ventas_producto", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";
        resultado += "TotalVentasPorProducto\tCodBarras\t\tNombreProducto"  +"\n";
            //System.out.println("TotV_producto\tcod_barras\tnombre_producto");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_producto") + "\t\t" + document.get("cod_barras") + "\t\t" + document.get("nombre_producto")  +"\n";
                //System.out.println(document.get("total_ventas_producto") + "\t\t" + document.get("cod_barras") + "\t" + document.get("nombre_producto"));
        }
        //8. Las 3 marcas (nombre y descripción) con mayor total de ventas (se debe mostrar el total de ventas de cada una de ellas).
        condExist = new BasicDBObject("total_ventas_marca", condBool);
        ordenDesc = new BasicDBObject("total_ventas_marca", -1);
        cursor = collection.find(condExist).sort(ordenDesc).limit(3);
        resultado += "----------------------------------------------------------------------------------------------------------\n";
        resultado += "TotalVentasPorMarca\tNombreMarca\t\tDescripcion"  +"\n";
            //System.out.println("TotV_Marca\tnombre_marca\tdescripcion");
        while (cursor.hasNext()) {
            document = cursor.next();
            resultado += document.get("total_ventas_marca") + "\t\t" + document.get("nombre_marca") + "\t\t" + document.get("descripcion") +"\n";
            //System.out.println(document.get("total_ventas_marca") + "\t\t" + document.get("nombre_marca") + "\t" + document.get("descripcion"));
        }
        
        return resultado;
    }
}
