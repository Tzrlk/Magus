
package nz.co.aetheric.magus.ioun;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserContentRights.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserContentRights">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Owner"/>
 *     &lt;enumeration value="Observer"/>
 *     &lt;enumeration value="Contributor"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "UserContentRights", namespace = "http://schemas.datacontract.org/2004/07/WotC.ContentManagement")
@XmlEnum
public enum UserContentRights {

    @XmlEnumValue("Owner")
    OWNER("Owner"),
    @XmlEnumValue("Observer")
    OBSERVER("Observer"),
    @XmlEnumValue("Contributor")
    CONTRIBUTOR("Contributor");
    private final String value;

    UserContentRights(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static UserContentRights fromValue(String v) {
        for (UserContentRights c: UserContentRights.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
