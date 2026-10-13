//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.09.26 a las 09:29:44 AM CEST 
//


package generated;

import java.math.BigInteger;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{}nombre"/&gt;
 *         &lt;element ref="{}dir_env"/&gt;
 *         &lt;element ref="{}poblacion"/&gt;
 *         &lt;element ref="{}provincia"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="n_cli" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "nombre",
    "dirEnv",
    "poblacion",
    "provincia"
})
@XmlRootElement(name = "datos_cliente")
public class DatosCliente {

    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(name = "dir_env", required = true)
    protected String dirEnv;
    @XmlElement(required = true)
    protected Poblacion poblacion;
    @XmlElement(required = true)
    protected String provincia;
    @XmlAttribute(name = "n_cli", required = true)
    protected BigInteger nCli;

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad dirEnv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirEnv() {
        return dirEnv;
    }

    /**
     * Define el valor de la propiedad dirEnv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirEnv(String value) {
        this.dirEnv = value;
    }

    /**
     * Obtiene el valor de la propiedad poblacion.
     * 
     * @return
     *     possible object is
     *     {@link Poblacion }
     *     
     */
    public Poblacion getPoblacion() {
        return poblacion;
    }

    /**
     * Define el valor de la propiedad poblacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Poblacion }
     *     
     */
    public void setPoblacion(Poblacion value) {
        this.poblacion = value;
    }

    /**
     * Obtiene el valor de la propiedad provincia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * Define el valor de la propiedad provincia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvincia(String value) {
        this.provincia = value;
    }

    /**
     * Obtiene el valor de la propiedad nCli.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNCli() {
        return nCli;
    }

    /**
     * Define el valor de la propiedad nCli.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNCli(BigInteger value) {
        this.nCli = value;
    }

}
