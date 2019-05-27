/**
 * GetBoletimAulasLivresResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetBoletimAulasLivresResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsBoletimAulasLivres getBoletimAulasLivresResult;

    public GetBoletimAulasLivresResponse() {
    }

    public GetBoletimAulasLivresResponse(
           br.net.sponteeducacional.api.WsBoletimAulasLivres getBoletimAulasLivresResult) {
           this.getBoletimAulasLivresResult = getBoletimAulasLivresResult;
    }


    /**
     * Gets the getBoletimAulasLivresResult value for this GetBoletimAulasLivresResponse.
     * 
     * @return getBoletimAulasLivresResult
     */
    public br.net.sponteeducacional.api.WsBoletimAulasLivres getGetBoletimAulasLivresResult() {
        return getBoletimAulasLivresResult;
    }


    /**
     * Sets the getBoletimAulasLivresResult value for this GetBoletimAulasLivresResponse.
     * 
     * @param getBoletimAulasLivresResult
     */
    public void setGetBoletimAulasLivresResult(br.net.sponteeducacional.api.WsBoletimAulasLivres getBoletimAulasLivresResult) {
        this.getBoletimAulasLivresResult = getBoletimAulasLivresResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetBoletimAulasLivresResponse)) return false;
        GetBoletimAulasLivresResponse other = (GetBoletimAulasLivresResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getBoletimAulasLivresResult==null && other.getGetBoletimAulasLivresResult()==null) || 
             (this.getBoletimAulasLivresResult!=null &&
              this.getBoletimAulasLivresResult.equals(other.getGetBoletimAulasLivresResult())));
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
        if (getGetBoletimAulasLivresResult() != null) {
            _hashCode += getGetBoletimAulasLivresResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetBoletimAulasLivresResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetBoletimAulasLivresResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getBoletimAulasLivresResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetBoletimAulasLivresResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletimAulasLivres"));
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
