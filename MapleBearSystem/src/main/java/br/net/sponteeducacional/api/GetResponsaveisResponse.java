/**
 * GetResponsaveisResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetResponsaveisResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsResponsavel[] getResponsaveisResult;

    public GetResponsaveisResponse() {
    }

    public GetResponsaveisResponse(
           br.net.sponteeducacional.api.WsResponsavel[] getResponsaveisResult) {
           this.getResponsaveisResult = getResponsaveisResult;
    }


    /**
     * Gets the getResponsaveisResult value for this GetResponsaveisResponse.
     * 
     * @return getResponsaveisResult
     */
    public br.net.sponteeducacional.api.WsResponsavel[] getGetResponsaveisResult() {
        return getResponsaveisResult;
    }


    /**
     * Sets the getResponsaveisResult value for this GetResponsaveisResponse.
     * 
     * @param getResponsaveisResult
     */
    public void setGetResponsaveisResult(br.net.sponteeducacional.api.WsResponsavel[] getResponsaveisResult) {
        this.getResponsaveisResult = getResponsaveisResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetResponsaveisResponse)) return false;
        GetResponsaveisResponse other = (GetResponsaveisResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getResponsaveisResult==null && other.getGetResponsaveisResult()==null) || 
             (this.getResponsaveisResult!=null &&
              java.util.Arrays.equals(this.getResponsaveisResult, other.getGetResponsaveisResult())));
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
        if (getGetResponsaveisResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetResponsaveisResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetResponsaveisResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetResponsaveisResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetResponsaveisResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getResponsaveisResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetResponsaveisResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsResponsavel"));
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
