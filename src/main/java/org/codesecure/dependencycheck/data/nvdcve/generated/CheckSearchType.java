/*
 * This file is part of DependencyCheck.
 *
 * DependencyCheck is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 *
 * DependencyCheck is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * DependencyCheck. If not, see http://www.gnu.org/licenses/.
 *
 * Copyright (c) 2012 Jeremy Long. All Rights Reserved.
 */
package org.codesecure.dependencycheck.data.nvdcve.generated;

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2012.10.21 at 11:58:46 AM EDT
//
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for checkSearchType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="checkSearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="system" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}token" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "checkSearchType", namespace = "http://scap.nist.gov/schema/scap-core/0.1")
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class CheckSearchType {

    @XmlAttribute(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String system;
    @XmlAttribute
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String name;

    /**
     * Gets the value of the system property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setName(String value) {
        this.name = value;
    }
}
