//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2025.09.26 a las 09:29:44 AM CEST 
//


package generated;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Nombre_QNAME = new QName("", "nombre");
    private final static QName _Dir_QNAME = new QName("", "dir");
    private final static QName _Provincia_QNAME = new QName("", "provincia");
    private final static QName _Cif_QNAME = new QName("", "cif");
    private final static QName _DirEnv_QNAME = new QName("", "dir_env");
    private final static QName _Fecha_QNAME = new QName("", "fecha");
    private final static QName _Ref_QNAME = new QName("", "ref");
    private final static QName _Desc_QNAME = new QName("", "desc");
    private final static QName _Cant_QNAME = new QName("", "cant");
    private final static QName _Precio_QNAME = new QName("", "precio");
    private final static QName _Importe_QNAME = new QName("", "importe");
    private final static QName _Base_QNAME = new QName("", "base");
    private final static QName _CuotaIva_QNAME = new QName("", "cuota_iva");
    private final static QName _Total_QNAME = new QName("", "total");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Factura }
     * 
     */
    public Factura createFactura() {
        return new Factura();
    }

    /**
     * Create an instance of {@link DatosEmpresa }
     * 
     */
    public DatosEmpresa createDatosEmpresa() {
        return new DatosEmpresa();
    }

    /**
     * Create an instance of {@link Poblacion }
     * 
     */
    public Poblacion createPoblacion() {
        return new Poblacion();
    }

    /**
     * Create an instance of {@link DatosCliente }
     * 
     */
    public DatosCliente createDatosCliente() {
        return new DatosCliente();
    }

    /**
     * Create an instance of {@link DatosFactura }
     * 
     */
    public DatosFactura createDatosFactura() {
        return new DatosFactura();
    }

    /**
     * Create an instance of {@link Linea }
     * 
     */
    public Linea createLinea() {
        return new Linea();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "nombre")
    public JAXBElement<String> createNombre(String value) {
        return new JAXBElement<String>(_Nombre_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dir")
    public JAXBElement<String> createDir(String value) {
        return new JAXBElement<String>(_Dir_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "provincia")
    public JAXBElement<String> createProvincia(String value) {
        return new JAXBElement<String>(_Provincia_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cif")
    public JAXBElement<String> createCif(String value) {
        return new JAXBElement<String>(_Cif_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "dir_env")
    public JAXBElement<String> createDirEnv(String value) {
        return new JAXBElement<String>(_DirEnv_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "fecha")
    public JAXBElement<XMLGregorianCalendar> createFecha(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_Fecha_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "ref")
    public JAXBElement<String> createRef(String value) {
        return new JAXBElement<String>(_Ref_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "desc")
    public JAXBElement<String> createDesc(String value) {
        return new JAXBElement<String>(_Desc_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cant")
    public JAXBElement<BigInteger> createCant(BigInteger value) {
        return new JAXBElement<BigInteger>(_Cant_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "precio")
    public JAXBElement<BigInteger> createPrecio(BigInteger value) {
        return new JAXBElement<BigInteger>(_Precio_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "importe")
    public JAXBElement<BigDecimal> createImporte(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Importe_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "base")
    public JAXBElement<BigDecimal> createBase(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Base_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "cuota_iva")
    public JAXBElement<BigDecimal> createCuotaIva(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CuotaIva_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "", name = "total")
    public JAXBElement<BigDecimal> createTotal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Total_QNAME, BigDecimal.class, null, value);
    }

}
