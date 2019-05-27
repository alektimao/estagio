/**
 * GetQuadroHorariosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetQuadroHorariosResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsQuadroHorarios[] getQuadroHorariosResult;

    public GetQuadroHorariosResponse() {
    }

    public GetQuadroHorariosResponse(
           br.net.sponteeducacional.api.WsQuadroHorarios[] getQuadroHorariosResult) {
           this.getQuadroHorariosResult = getQuadroHorariosResult;
    }


    /**
     * Gets the getQuadroHorariosResult value for this GetQuadroHorariosResponse.
     * 
     * @return getQuadroHorariosResult
     */
    public br.net.sponteeducacional.api.WsQuadroHorarios[] getGetQuadroHorariosResult() {
        return getQuadroHorariosResult;
    }


    /**
     * Sets the getQuadroHorariosResult value for this GetQuadroHorariosResponse.
     * 
     * @param getQuadroHorariosResult
     */
    public void setGetQuadroHorariosResult(br.net.sponteeducacional.api.WsQuadroHorarios[] getQuadroHorariosResult) {
        this.getQuadroHorariosResult = getQuadroHorariosResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetQuadroHorariosResponse)) return false;
        GetQuadroHorariosResponse other = (GetQuadroHorariosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getQuadroHorariosResult==null && other.getGetQuadroHorariosResult()==null) || 
             (this.getQuadroHorariosResult!=null &&
              java.util.Arrays.equals(this.getQuadroHorariosResult, other.getGetQuadroHorariosResult())));
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
        if (getGetQuadroHorariosResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetQuadroHorariosResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetQuadroHorariosResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetQuadroHorariosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetQuadroHorariosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getQuadroHorariosResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetQuadroHorariosResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuadroHorarios"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsQuadroHorarios"));
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
