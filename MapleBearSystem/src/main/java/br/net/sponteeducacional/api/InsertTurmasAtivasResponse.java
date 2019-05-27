/**
 * InsertTurmasAtivasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class InsertTurmasAtivasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult insertTurmasAtivasResult;

    public InsertTurmasAtivasResponse() {
    }

    public InsertTurmasAtivasResponse(
           br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult insertTurmasAtivasResult) {
           this.insertTurmasAtivasResult = insertTurmasAtivasResult;
    }


    /**
     * Gets the insertTurmasAtivasResult value for this InsertTurmasAtivasResponse.
     * 
     * @return insertTurmasAtivasResult
     */
    public br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult getInsertTurmasAtivasResult() {
        return insertTurmasAtivasResult;
    }


    /**
     * Sets the insertTurmasAtivasResult value for this InsertTurmasAtivasResponse.
     * 
     * @param insertTurmasAtivasResult
     */
    public void setInsertTurmasAtivasResult(br.net.sponteeducacional.api.InsertTurmasAtivasResponseInsertTurmasAtivasResult insertTurmasAtivasResult) {
        this.insertTurmasAtivasResult = insertTurmasAtivasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof InsertTurmasAtivasResponse)) return false;
        InsertTurmasAtivasResponse other = (InsertTurmasAtivasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.insertTurmasAtivasResult==null && other.getInsertTurmasAtivasResult()==null) || 
             (this.insertTurmasAtivasResult!=null &&
              this.insertTurmasAtivasResult.equals(other.getInsertTurmasAtivasResult())));
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
        if (getInsertTurmasAtivasResult() != null) {
            _hashCode += getInsertTurmasAtivasResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(InsertTurmasAtivasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">InsertTurmasAtivasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("insertTurmasAtivasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "InsertTurmasAtivasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>InsertTurmasAtivasResponse>InsertTurmasAtivasResult"));
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
