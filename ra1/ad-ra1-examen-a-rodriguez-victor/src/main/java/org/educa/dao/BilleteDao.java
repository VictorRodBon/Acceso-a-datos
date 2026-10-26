package org.educa.dao;

import generated.Billetes;
import jakarta.xml.bind.JAXBException;

import java.io.IOException;

public interface BilleteDao {
    /**
     * Obtener un String con los datos del fichero de entrada (lineas separadas por "\n")
     * @param path ruta de origen
     * @return retorna un String con el contenido del fichero
     * @throws IOException Excepción de fallo de ejecución en entrada/salida
     */
    String readTxt(String path) throws IOException;
    /**
     * Escribir el objeto billetes introducido en un fichero xml
     * @param billetes objeto de tipo Billetes
     * @param path ruta de destino del fichero xml
     * @throws JAXBException excepción de fallo de ejecución de JAXB
     */
    void exportBilletes(Billetes billetes, String path) throws JAXBException;
}
