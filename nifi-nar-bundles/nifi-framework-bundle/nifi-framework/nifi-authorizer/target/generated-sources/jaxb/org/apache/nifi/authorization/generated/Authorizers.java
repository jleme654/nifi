//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.11 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2018.01.30 às 01:20:06 AM BRST 
//


package org.apache.nifi.authorization.generated;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="userGroupProvider" type="{}UserGroupProvider" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="accessPolicyProvider" type="{}AccessPolicyProvider" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="authorizer" type="{}Authorizer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "userGroupProvider",
    "accessPolicyProvider",
    "authorizer"
})
@XmlRootElement(name = "authorizers")
public class Authorizers {

    protected List<UserGroupProvider> userGroupProvider;
    protected List<AccessPolicyProvider> accessPolicyProvider;
    protected List<Authorizer> authorizer;

    /**
     * Gets the value of the userGroupProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userGroupProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserGroupProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserGroupProvider }
     * 
     * 
     */
    public List<UserGroupProvider> getUserGroupProvider() {
        if (userGroupProvider == null) {
            userGroupProvider = new ArrayList<UserGroupProvider>();
        }
        return this.userGroupProvider;
    }

    /**
     * Gets the value of the accessPolicyProvider property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accessPolicyProvider property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccessPolicyProvider().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccessPolicyProvider }
     * 
     * 
     */
    public List<AccessPolicyProvider> getAccessPolicyProvider() {
        if (accessPolicyProvider == null) {
            accessPolicyProvider = new ArrayList<AccessPolicyProvider>();
        }
        return this.accessPolicyProvider;
    }

    /**
     * Gets the value of the authorizer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authorizer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthorizer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Authorizer }
     * 
     * 
     */
    public List<Authorizer> getAuthorizer() {
        if (authorizer == null) {
            authorizer = new ArrayList<Authorizer>();
        }
        return this.authorizer;
    }

}
