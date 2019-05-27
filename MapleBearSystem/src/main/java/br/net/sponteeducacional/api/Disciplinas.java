/**
 * Disciplinas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class Disciplinas  implements java.io.Serializable {
    private int disciplinaID;

    private java.lang.String nome;

    private java.lang.String modulo;

    private java.lang.String CH;

    public Disciplinas() {
    }

    public Disciplinas(
           int disciplinaID,
           java.lang.String nome,
           java.lang.String modulo,
           java.lang.String CH) {
           this.disciplinaID = disciplinaID;
           this.nome = nome;
           this.modulo = modulo;
           this.CH = CH;
    }


    /**
     * Gets the disciplinaID value for this Disciplinas.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this Disciplinas.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nome value for this Disciplinas.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Disciplinas.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the modulo value for this Disciplinas.
     * 
     * @return modulo
     */
    public java.lang.String getModulo() {
        return modulo;
    }


    /**
     * Sets the modulo value for this Disciplinas.
     * 
     * @param modulo
     */
    public void setModulo(java.lang.String modulo) {
        this.modulo = modulo;
    }


    /**
     * Gets the CH value for this Disciplinas.
     * 
     * @return CH
     */
    public java.lang.String getCH() {
        return CH;
    }


    /**
     * Sets the CH value for this Disciplinas.
     * 
     * @param CH
     */
    public void setCH(java.lang.String CH) {
        this.CH = CH;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Disciplinas)) return false;
        Disciplinas other = (Disciplinas) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.modulo==null && other.getModulo()==null) || 
             (this.modulo!=null &&
              this.modulo.equals(other.getModulo()))) &&
            ((this.CH==null && other.getCH()==null) || 
             (this.CH!=null &&
              this.CH.equals(other.getCH())));
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
        _hashCode += getDisciplinaID();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getModulo() != null) {
            _hashCode += getModulo().hashCode();
        }
        if (getCH() != null) {
            _hashCode += getCH().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Disciplinas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DisciplinaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Modulo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CH");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CH"));
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
