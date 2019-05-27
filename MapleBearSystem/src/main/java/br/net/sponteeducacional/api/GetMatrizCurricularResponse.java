/**
 * GetMatrizCurricularResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetMatrizCurricularResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsMatrizCurricular[] getMatrizCurricularResult;

    public GetMatrizCurricularResponse() {
    }

    public GetMatrizCurricularResponse(
           br.net.sponteeducacional.api.WsMatrizCurricular[] getMatrizCurricularResult) {
           this.getMatrizCurricularResult = getMatrizCurricularResult;
    }


    /**
     * Gets the getMatrizCurricularResult value for this GetMatrizCurricularResponse.
     * 
     * @return getMatrizCurricularResult
     */
    public br.net.sponteeducacional.api.WsMatrizCurricular[] getGetMatrizCurricularResult() {
        return getMatrizCurricularResult;
    }


    /**
     * Sets the getMatrizCurricularResult value for this GetMatrizCurricularResponse.
     * 
     * @param getMatrizCurricularResult
     */
    public void setGetMatrizCurricularResult(br.net.sponteeducacional.api.WsMatrizCurricular[] getMatrizCurricularResult) {
        this.getMatrizCurricularResult = getMatrizCurricularResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetMatrizCurricularResponse)) return false;
        GetMatrizCurricularResponse other = (GetMatrizCurricularResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getMatrizCurricularResult==null && other.getGetMatrizCurricularResult()==null) || 
             (this.getMatrizCurricularResult!=null &&
              java.util.Arrays.equals(this.getMatrizCurricularResult, other.getGetMatrizCurricularResult())));
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
        if (getGetMatrizCurricularResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetMatrizCurricularResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetMatrizCurricularResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetMatrizCurricularResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetMatrizCurricularResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getMatrizCurricularResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetMatrizCurricularResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsMatrizCurricular"));
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
