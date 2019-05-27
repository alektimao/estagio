/**
 * GetMidiasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetMidiasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsMidias[] getMidiasResult;

    public GetMidiasResponse() {
    }

    public GetMidiasResponse(
           br.net.sponteeducacional.api.WsMidias[] getMidiasResult) {
           this.getMidiasResult = getMidiasResult;
    }


    /**
     * Gets the getMidiasResult value for this GetMidiasResponse.
     * 
     * @return getMidiasResult
     */
    public br.net.sponteeducacional.api.WsMidias[] getGetMidiasResult() {
        return getMidiasResult;
    }


    /**
     * Sets the getMidiasResult value for this GetMidiasResponse.
     * 
     * @param getMidiasResult
     */
    public void setGetMidiasResult(br.net.sponteeducacional.api.WsMidias[] getMidiasResult) {
        this.getMidiasResult = getMidiasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMidiasResponse)) return false;
        GetMidiasResponse other = (GetMidiasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMidiasResult==null && other.getGetMidiasResult()==null) || 
             (this.getMidiasResult!=null &&
              java.util.Arrays.equals(this.getMidiasResult, other.getGetMidiasResult())));
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
        if (getGetMidiasResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetMidiasResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetMidiasResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetMidiasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMidiasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMidiasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMidiasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMidias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMidias"));
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
