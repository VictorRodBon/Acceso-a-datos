//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.09.26 a las 09:39:19 AM CEST 
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
 *         &lt;element ref="{}datos_empresa"/&gt;
 *         &lt;element ref="{}datos_cliente"/&gt;
 *         &lt;element ref="{}datos_factura"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="n_fac" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "datosEmpresa",
    "datosCliente",
    "datosFactura"
})
@XmlRootElement(name = "factura")
public class Factura {

    @XmlElement(name = "datos_empresa", required = true)
    protected DatosEmpresa datosEmpresa;
    @XmlElement(name = "datos_cliente", required = true)
    protected DatosCliente datosCliente;
    @XmlElement(name = "datos_factura", required = true)
    protected DatosFactura datosFactura;
    @XmlAttribute(name = "n_fac", required = true)
    protected BigInteger nFac;

    /**
     * Obtiene el valor de la propiedad datosEmpresa.
     * 
     * @return
     *     possible object is
     *     {@link DatosEmpresa }
     *     
     */
    public DatosEmpresa getDatosEmpresa() {
        return datosEmpresa;
    }

    /**
     * Define el valor de la propiedad datosEmpresa.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosEmpresa }
     *     
     */
    public void setDatosEmpresa(DatosEmpresa value) {
        this.datosEmpresa = value;
    }

    /**
     * Obtiene el valor de la propiedad datosCliente.
     * 
     * @return
     *     possible object is
     *     {@link DatosCliente }
     *     
     */
    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    /**
     * Define el valor de la propiedad datosCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosCliente }
     *     
     */
    public void setDatosCliente(DatosCliente value) {
        this.datosCliente = value;
    }

    /**
     * Obtiene el valor de la propiedad datosFactura.
     * 
     * @return
     *     possible object is
     *     {@link DatosFactura }
     *     
     */
    public DatosFactura getDatosFactura() {
        return datosFactura;
    }

    /**
     * Define el valor de la propiedad datosFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosFactura }
     *     
     */
    public void setDatosFactura(DatosFactura value) {
        this.datosFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad nFac.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNFac() {
        return nFac;
    }

    /**
     * Define el valor de la propiedad nFac.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNFac(BigInteger value) {
        this.nFac = value;
    }

}
