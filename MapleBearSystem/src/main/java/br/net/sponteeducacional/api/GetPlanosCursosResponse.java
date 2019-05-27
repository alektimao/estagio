/**
 * GetPlanosCursosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetPlanosCursosResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsPlanoCurso[] getPlanosCursosResult;

    public GetPlanosCursosResponse() {
    }

    public GetPlanosCursosResponse(
           br.net.sponteeducacional.api.WsPlanoCurso[] getPlanosCursosResult) {
           this.getPlanosCursosResult = getPlanosCursosResult;
    }


    /**
     * Gets the getPlanosCursosResult value for this GetPlanosCursosResponse.
     * 
     * @return getPlanosCursosResult
     */
    public br.net.sponteeducacional.api.WsPlanoCurso[] getGetPlanosCursosResult() {
        return getPlanosCursosResult;
    }


    /**
     * Sets the getPlanosCursosResult value for this GetPlanosCursosResponse.
     * 
     * @param getPlanosCursosResult
     */
    public void setGetPlanosCursosResult(br.net.sponteeducacional.api.WsPlanoCurso[] getPlanosCursosResult) {
        this.getPlanosCursosResult = getPlanosCursosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPlanosCursosResponse)) return false;
        GetPlanosCursosResponse other = (GetPlanosCursosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getPlanosCursosResult==null && other.getGetPlanosCursosResult()==null) || 
             (this.getPlanosCursosResult!=null &&
              java.util.Arrays.equals(this.getPlanosCursosResult, other.getGetPlanosCursosResult())));
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
        if (getGetPlanosCursosResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetPlanosCursosResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetPlanosCursosResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetPlanosCursosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetPlanosCursosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getPlanosCursosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetPlanosCursosResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsPlanoCurso"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsPlanoCurso"));
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
