/**
 * IndicesGestaoComercial.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class IndicesGestaoComercial  implements java.io.Serializable {
    private int funcionarioID;

    private java.lang.String nomeFuncionario;

    private br.net.sponteeducacional.api.Indicador[] indicadores;

    public IndicesGestaoComercial() {
    }

    public IndicesGestaoComercial(
           int funcionarioID,
           java.lang.String nomeFuncionario,
           br.net.sponteeducacional.api.Indicador[] indicadores) {
           this.funcionarioID = funcionarioID;
           this.nomeFuncionario = nomeFuncionario;
           this.indicadores = indicadores;
    }


    /**
     * Gets the funcionarioID value for this IndicesGestaoComercial.
     * 
     * @return funcionarioID
     */
    public int getFuncionarioID() {
        return funcionarioID;
    }


    /**
     * Sets the funcionarioID value for this IndicesGestaoComercial.
     * 
     * @param funcionarioID
     */
    public void setFuncionarioID(int funcionarioID) {
        this.funcionarioID = funcionarioID;
    }


    /**
     * Gets the nomeFuncionario value for this IndicesGestaoComercial.
     * 
     * @return nomeFuncionario
     */
    public java.lang.String getNomeFuncionario() {
        return nomeFuncionario;
    }


    /**
     * Sets the nomeFuncionario value for this IndicesGestaoComercial.
     * 
     * @param nomeFuncionario
     */
    public void setNomeFuncionario(java.lang.String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }


    /**
     * Gets the indicadores value for this IndicesGestaoComercial.
     * 
     * @return indicadores
     */
    public br.net.sponteeducacional.api.Indicador[] getIndicadores() {
        return indicadores;
    }


    /**
     * Sets the indicadores value for this IndicesGestaoComercial.
     * 
     * @param indicadores
     */
    public void setIndicadores(br.net.sponteeducacional.api.Indicador[] indicadores) {
        this.indicadores = indicadores;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IndicesGestaoComercial)) return false;
        IndicesGestaoComercial other = (IndicesGestaoComercial) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.funcionarioID == other.getFuncionarioID() &&
            ((this.nomeFuncionario==null && other.getNomeFuncionario()==null) || 
             (this.nomeFuncionario!=null &&
              this.nomeFuncionario.equals(other.getNomeFuncionario()))) &&
            ((this.indicadores==null && other.getIndicadores()==null) || 
             (this.indicadores!=null &&
              java.util.Arrays.equals(this.indicadores, other.getIndicadores())));
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
        _hashCode += getFuncionarioID();
        if (getNomeFuncionario() != null) {
            _hashCode += getNomeFuncionario().hashCode();
        }
        if (getIndicadores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIndicadores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIndicadores(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IndicesGestaoComercial.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "IndicesGestaoComercial"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("funcionarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FuncionarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeFuncionario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeFuncionario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indicadores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicadores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicador"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Indicador"));
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
