/**
 * GetLayoutsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetLayoutsResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsLayouts[] getLayoutsResult;

    public GetLayoutsResponse() {
    }

    public GetLayoutsResponse(
           br.net.sponteeducacional.api.WsLayouts[] getLayoutsResult) {
           this.getLayoutsResult = getLayoutsResult;
    }


    /**
     * Gets the getLayoutsResult value for this GetLayoutsResponse.
     * 
     * @return getLayoutsResult
     */
    public br.net.sponteeducacional.api.WsLayouts[] getGetLayoutsResult() {
        return getLayoutsResult;
    }


    /**
     * Sets the getLayoutsResult value for this GetLayoutsResponse.
     * 
     * @param getLayoutsResult
     */
    public void setGetLayoutsResult(br.net.sponteeducacional.api.WsLayouts[] getLayoutsResult) {
        this.getLayoutsResult = getLayoutsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetLayoutsResponse)) return false;
        GetLayoutsResponse other = (GetLayoutsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getLayoutsResult==null && other.getGetLayoutsResult()==null) || 
             (this.getLayoutsResult!=null &&
              java.util.Arrays.equals(this.getLayoutsResult, other.getGetLayoutsResult())));
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
        if (getGetLayoutsResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetLayoutsResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetLayoutsResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetLayoutsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetLayoutsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getLayoutsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetLayoutsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLayouts"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsLayouts"));
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
