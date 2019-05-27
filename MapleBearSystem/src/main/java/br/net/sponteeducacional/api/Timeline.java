/**
 * Timeline.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class Timeline  implements java.io.Serializable {
    private java.lang.String id;

    private int cid;

    private java.lang.String title;

    private java.lang.String subtitle;

    private java.lang.String type;

    private boolean read;

    private java.util.Calendar record_date;

    private int student_id;

    private int responsible_id;

    private java.lang.String retornoOperacao;

    public Timeline() {
    }

    public Timeline(
           java.lang.String id,
           int cid,
           java.lang.String title,
           java.lang.String subtitle,
           java.lang.String type,
           boolean read,
           java.util.Calendar record_date,
           int student_id,
           int responsible_id,
           java.lang.String retornoOperacao) {
           this.id = id;
           this.cid = cid;
           this.title = title;
           this.subtitle = subtitle;
           this.type = type;
           this.read = read;
           this.record_date = record_date;
           this.student_id = student_id;
           this.responsible_id = responsible_id;
           this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the id value for this Timeline.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Timeline.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the cid value for this Timeline.
     * 
     * @return cid
     */
    public int getCid() {
        return cid;
    }


    /**
     * Sets the cid value for this Timeline.
     * 
     * @param cid
     */
    public void setCid(int cid) {
        this.cid = cid;
    }


    /**
     * Gets the title value for this Timeline.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this Timeline.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the subtitle value for this Timeline.
     * 
     * @return subtitle
     */
    public java.lang.String getSubtitle() {
        return subtitle;
    }


    /**
     * Sets the subtitle value for this Timeline.
     * 
     * @param subtitle
     */
    public void setSubtitle(java.lang.String subtitle) {
        this.subtitle = subtitle;
    }


    /**
     * Gets the type value for this Timeline.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this Timeline.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the read value for this Timeline.
     * 
     * @return read
     */
    public boolean isRead() {
        return read;
    }


    /**
     * Sets the read value for this Timeline.
     * 
     * @param read
     */
    public void setRead(boolean read) {
        this.read = read;
    }


    /**
     * Gets the record_date value for this Timeline.
     * 
     * @return record_date
     */
    public java.util.Calendar getRecord_date() {
        return record_date;
    }


    /**
     * Sets the record_date value for this Timeline.
     * 
     * @param record_date
     */
    public void setRecord_date(java.util.Calendar record_date) {
        this.record_date = record_date;
    }


    /**
     * Gets the student_id value for this Timeline.
     * 
     * @return student_id
     */
    public int getStudent_id() {
        return student_id;
    }


    /**
     * Sets the student_id value for this Timeline.
     * 
     * @param student_id
     */
    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }


    /**
     * Gets the responsible_id value for this Timeline.
     * 
     * @return responsible_id
     */
    public int getResponsible_id() {
        return responsible_id;
    }


    /**
     * Sets the responsible_id value for this Timeline.
     * 
     * @param responsible_id
     */
    public void setResponsible_id(int responsible_id) {
        this.responsible_id = responsible_id;
    }


    /**
     * Gets the retornoOperacao value for this Timeline.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this Timeline.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Timeline)) return false;
        Timeline other = (Timeline) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            this.cid == other.getCid() &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.subtitle==null && other.getSubtitle()==null) || 
             (this.subtitle!=null &&
              this.subtitle.equals(other.getSubtitle()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            this.read == other.isRead() &&
            ((this.record_date==null && other.getRecord_date()==null) || 
             (this.record_date!=null &&
              this.record_date.equals(other.getRecord_date()))) &&
            this.student_id == other.getStudent_id() &&
            this.responsible_id == other.getResponsible_id() &&
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        _hashCode += getCid();
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getSubtitle() != null) {
            _hashCode += getSubtitle().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        _hashCode += (isRead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRecord_date() != null) {
            _hashCode += getRecord_date().hashCode();
        }
        _hashCode += getStudent_id();
        _hashCode += getResponsible_id();
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Timeline.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Timeline"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cid");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "cid"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subtitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "subtitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("read");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "read"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("record_date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "record_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("student_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "student_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("responsible_id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "responsible_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
