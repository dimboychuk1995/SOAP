
package test2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the test2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: test2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ZdepartmetsListResponse }
     * 
     */
    public ZdepartmetsListResponse createZdepartmetsListResponse() {
        return new ZdepartmetsListResponse();
    }

    /**
     * Create an instance of {@link TableOfZorgUnitList }
     * 
     */
    public TableOfZorgUnitList createTableOfZorgUnitList() {
        return new TableOfZorgUnitList();
    }

    /**
     * Create an instance of {@link Bapiret2 }
     * 
     */
    public Bapiret2 createBapiret2() {
        return new Bapiret2();
    }

    /**
     * Create an instance of {@link ZdepartmetsList }
     * 
     */
    public ZdepartmetsList createZdepartmetsList() {
        return new ZdepartmetsList();
    }

    /**
     * Create an instance of {@link ZorgUnitList }
     * 
     */
    public ZorgUnitList createZorgUnitList() {
        return new ZorgUnitList();
    }

}
