/**
 * SetMudancaEntreTurmasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class SetMudancaEntreTurmasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsMudancaEntreTurmas setMudancaEntreTurmasResult;

    public SetMudancaEntreTurmasResponse() {
    }

    public SetMudancaEntreTurmasResponse(
           br.net.sponteeducacional.api.WsMudancaEntreTurmas setMudancaEntreTurmasResult) {
           this.setMudancaEntreTurmasResult = setMudancaEntreTurmasResult;
    }


    /**
     * Gets the setMudancaEntreTurmasResult value for this SetMudancaEntreTurmasResponse.
     * 
     * @return setMudancaEntreTurmasResult
     */
    public br.net.sponteeducacional.api.WsMudancaEntreTurmas getSetMudancaEntreTurmasResult() {
        return setMudancaEntreTurmasResult;
    }


    /**
     * Sets the setMudancaEntreTurmasResult value for this SetMudancaEntreTurmasResponse.
     * 
     * @param setMudancaEntreTurmasResult
     */
    public void setSetMudancaEntreTurmasResult(br.net.sponteeducacional.api.WsMudancaEntreTurmas setMudancaEntreTurmasResult) {
        this.setMudancaEntreTurmasResult = setMudancaEntreTurmasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetMudancaEntreTurmasResponse)) return false;
        SetMudancaEntreTurmasResponse other = (SetMudancaEntreTurmasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setMudancaEntreTurmasResult==null && other.getSetMudancaEntreTurmasResult()==null) || 
             (this.setMudancaEntreTurmasResult!=null &&
              this.setMudancaEntreTurmasResult.equals(other.getSetMudancaEntreTurmasResult())));
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
        if (getSetMudancaEntreTurmasResult() != null) {
            _hashCode += getSetMudancaEntreTurmasResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetMudancaEntreTurmasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetMudancaEntreTurmasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setMudancaEntreTurmasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetMudancaEntreTurmasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMudancaEntreTurmas"));
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
