/**
 * GetOcorrenciasAlunoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetOcorrenciasAlunoResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsOcorrencias[] getOcorrenciasAlunoResult;

    public GetOcorrenciasAlunoResponse() {
    }

    public GetOcorrenciasAlunoResponse(
           br.net.sponteeducacional.api.WsOcorrencias[] getOcorrenciasAlunoResult) {
           this.getOcorrenciasAlunoResult = getOcorrenciasAlunoResult;
    }


    /**
     * Gets the getOcorrenciasAlunoResult value for this GetOcorrenciasAlunoResponse.
     * 
     * @return getOcorrenciasAlunoResult
     */
    public br.net.sponteeducacional.api.WsOcorrencias[] getGetOcorrenciasAlunoResult() {
        return getOcorrenciasAlunoResult;
    }


    /**
     * Sets the getOcorrenciasAlunoResult value for this GetOcorrenciasAlunoResponse.
     * 
     * @param getOcorrenciasAlunoResult
     */
    public void setGetOcorrenciasAlunoResult(br.net.sponteeducacional.api.WsOcorrencias[] getOcorrenciasAlunoResult) {
        this.getOcorrenciasAlunoResult = getOcorrenciasAlunoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOcorrenciasAlunoResponse)) return false;
        GetOcorrenciasAlunoResponse other = (GetOcorrenciasAlunoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOcorrenciasAlunoResult==null && other.getGetOcorrenciasAlunoResult()==null) || 
             (this.getOcorrenciasAlunoResult!=null &&
              java.util.Arrays.equals(this.getOcorrenciasAlunoResult, other.getGetOcorrenciasAlunoResult())));
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
        if (getGetOcorrenciasAlunoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetOcorrenciasAlunoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetOcorrenciasAlunoResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetOcorrenciasAlunoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOcorrenciasAlunoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOcorrenciasAlunoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOcorrenciasAlunoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOcorrencias"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsOcorrencias"));
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
