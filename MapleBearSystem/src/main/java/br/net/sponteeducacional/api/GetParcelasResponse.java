/**
 * GetParcelasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetParcelasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsParcela[] getParcelasResult;

    public GetParcelasResponse() {
    }

    public GetParcelasResponse(
           br.net.sponteeducacional.api.WsParcela[] getParcelasResult) {
           this.getParcelasResult = getParcelasResult;
    }


    /**
     * Gets the getParcelasResult value for this GetParcelasResponse.
     * 
     * @return getParcelasResult
     */
    public br.net.sponteeducacional.api.WsParcela[] getGetParcelasResult() {
        return getParcelasResult;
    }


    /**
     * Sets the getParcelasResult value for this GetParcelasResponse.
     * 
     * @param getParcelasResult
     */
    public void setGetParcelasResult(br.net.sponteeducacional.api.WsParcela[] getParcelasResult) {
        this.getParcelasResult = getParcelasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetParcelasResponse)) return false;
        GetParcelasResponse other = (GetParcelasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getParcelasResult==null && other.getGetParcelasResult()==null) || 
             (this.getParcelasResult!=null &&
              java.util.Arrays.equals(this.getParcelasResult, other.getGetParcelasResult())));
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
        if (getGetParcelasResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetParcelasResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetParcelasResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetParcelasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetParcelasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getParcelasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetParcelasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsParcela"));
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
