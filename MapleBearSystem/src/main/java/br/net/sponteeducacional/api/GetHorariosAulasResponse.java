/**
 * GetHorariosAulasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetHorariosAulasResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsHorariosAula[] getHorariosAulasResult;

    public GetHorariosAulasResponse() {
    }

    public GetHorariosAulasResponse(
           br.net.sponteeducacional.api.WsHorariosAula[] getHorariosAulasResult) {
           this.getHorariosAulasResult = getHorariosAulasResult;
    }


    /**
     * Gets the getHorariosAulasResult value for this GetHorariosAulasResponse.
     * 
     * @return getHorariosAulasResult
     */
    public br.net.sponteeducacional.api.WsHorariosAula[] getGetHorariosAulasResult() {
        return getHorariosAulasResult;
    }


    /**
     * Sets the getHorariosAulasResult value for this GetHorariosAulasResponse.
     * 
     * @param getHorariosAulasResult
     */
    public void setGetHorariosAulasResult(br.net.sponteeducacional.api.WsHorariosAula[] getHorariosAulasResult) {
        this.getHorariosAulasResult = getHorariosAulasResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetHorariosAulasResponse)) return false;
        GetHorariosAulasResponse other = (GetHorariosAulasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getHorariosAulasResult==null && other.getGetHorariosAulasResult()==null) || 
             (this.getHorariosAulasResult!=null &&
              java.util.Arrays.equals(this.getHorariosAulasResult, other.getGetHorariosAulasResult())));
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
        if (getGetHorariosAulasResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetHorariosAulasResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetHorariosAulasResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetHorariosAulasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetHorariosAulasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getHorariosAulasResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetHorariosAulasResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorariosAula"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorariosAula"));
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
