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
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <p>Java class for baseMetricsType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained
 * within this class.
 *
 * <pre>
 * &lt;complexType name="baseMetricsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://scap.nist.gov/schema/cvss-v2/0.2}metricsType">
 *       &lt;sequence>
 *         &lt;element name="score" type="{http://scap.nist.gov/schema/cvss-v2/0.2}zeroToTenDecimalType" minOccurs="0"/>
 *         &lt;element name="exploit-subscore" type="{http://scap.nist.gov/schema/cvss-v2/0.2}zeroToTenDecimalType" minOccurs="0"/>
 *         &lt;element name="impact-subscore" type="{http://scap.nist.gov/schema/cvss-v2/0.2}zeroToTenDecimalType" minOccurs="0"/>
 *         &lt;group ref="{http://scap.nist.gov/schema/cvss-v2/0.2}baseVectorsGroup"/>
 *         &lt;element name="source" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *         &lt;element name="generated-on-datetime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "baseMetricsType", propOrder = {
    "score",
    "exploitSubscore",
    "impactSubscore",
    "accessVector",
    "accessComplexity",
    "authentication",
    "confidentialityImpact",
    "integrityImpact",
    "availabilityImpact",
    "source",
    "generatedOnDatetime"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
public class BaseMetricsType
        extends MetricsType {

    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigDecimal score;
    @XmlElement(name = "exploit-subscore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigDecimal exploitSubscore;
    @XmlElement(name = "impact-subscore")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected BigDecimal impactSubscore;
    @XmlElement(name = "access-vector")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected AccessVectorType accessVector;
    @XmlElement(name = "access-complexity")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected AccessComplexityType accessComplexity;
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected AuthenticationType authentication;
    @XmlElement(name = "confidentiality-impact")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected CiaType confidentialityImpact;
    @XmlElement(name = "integrity-impact")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected CiaType integrityImpact;
    @XmlElement(name = "availability-impact")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected CiaType availabilityImpact;
    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected String source;
    @XmlElement(name = "generated-on-datetime")
    @XmlSchemaType(name = "dateTime")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    protected XMLGregorianCalendar generatedOnDatetime;

    /**
     * Gets the value of the score property.
     *
     * @return possible object is
     *     {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigDecimal getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     *
     * @param value allowed object is
     *     {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setScore(BigDecimal value) {
        this.score = value;
    }

    /**
     * Gets the value of the exploitSubscore property.
     *
     * @return possible object is
     *     {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigDecimal getExploitSubscore() {
        return exploitSubscore;
    }

    /**
     * Sets the value of the exploitSubscore property.
     *
     * @param value allowed object is
     *     {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setExploitSubscore(BigDecimal value) {
        this.exploitSubscore = value;
    }

    /**
     * Gets the value of the impactSubscore property.
     *
     * @return possible object is
     *     {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public BigDecimal getImpactSubscore() {
        return impactSubscore;
    }

    /**
     * Sets the value of the impactSubscore property.
     *
     * @param value allowed object is
     *     {@link BigDecimal }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setImpactSubscore(BigDecimal value) {
        this.impactSubscore = value;
    }

    /**
     * Gets the value of the accessVector property.
     *
     * @return possible object is
     *     {@link AccessVectorType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public AccessVectorType getAccessVector() {
        return accessVector;
    }

    /**
     * Sets the value of the accessVector property.
     *
     * @param value allowed object is
     *     {@link AccessVectorType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAccessVector(AccessVectorType value) {
        this.accessVector = value;
    }

    /**
     * Gets the value of the accessComplexity property.
     *
     * @return possible object is
     *     {@link AccessComplexityType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public AccessComplexityType getAccessComplexity() {
        return accessComplexity;
    }

    /**
     * Sets the value of the accessComplexity property.
     *
     * @param value allowed object is
     *     {@link AccessComplexityType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAccessComplexity(AccessComplexityType value) {
        this.accessComplexity = value;
    }

    /**
     * Gets the value of the authentication property.
     *
     * @return possible object is
     *     {@link AuthenticationType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public AuthenticationType getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     *
     * @param value allowed object is
     *     {@link AuthenticationType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAuthentication(AuthenticationType value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the confidentialityImpact property.
     *
     * @return possible object is
     *     {@link CiaType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public CiaType getConfidentialityImpact() {
        return confidentialityImpact;
    }

    /**
     * Sets the value of the confidentialityImpact property.
     *
     * @param value allowed object is
     *     {@link CiaType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setConfidentialityImpact(CiaType value) {
        this.confidentialityImpact = value;
    }

    /**
     * Gets the value of the integrityImpact property.
     *
     * @return possible object is
     *     {@link CiaType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public CiaType getIntegrityImpact() {
        return integrityImpact;
    }

    /**
     * Sets the value of the integrityImpact property.
     *
     * @param value allowed object is
     *     {@link CiaType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setIntegrityImpact(CiaType value) {
        this.integrityImpact = value;
    }

    /**
     * Gets the value of the availabilityImpact property.
     *
     * @return possible object is
     *     {@link CiaType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public CiaType getAvailabilityImpact() {
        return availabilityImpact;
    }

    /**
     * Sets the value of the availabilityImpact property.
     *
     * @param value allowed object is
     *     {@link CiaType }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setAvailabilityImpact(CiaType value) {
        this.availabilityImpact = value;
    }

    /**
     * Gets the value of the source property.
     *
     * @return possible object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value allowed object is
     *     {@link String }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the generatedOnDatetime property.
     *
     * @return possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public XMLGregorianCalendar getGeneratedOnDatetime() {
        return generatedOnDatetime;
    }

    /**
     * Sets the value of the generatedOnDatetime property.
     *
     * @param value allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2012-10-21T11:58:46-04:00", comments = "JAXB RI vJAXB 2.1.10 in JDK 6")
    public void setGeneratedOnDatetime(XMLGregorianCalendar value) {
        this.generatedOnDatetime = value;
    }
}
