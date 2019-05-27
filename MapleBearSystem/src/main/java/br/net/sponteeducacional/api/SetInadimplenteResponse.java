/**
 * SetInadimplenteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class SetInadimplenteResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult setInadimplenteResult;

    public SetInadimplenteResponse() {
    }

    public SetInadimplenteResponse(
           br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult setInadimplenteResult) {
           this.setInadimplenteResult = setInadimplenteResult;
    }


    /**
     * Gets the setInadimplenteResult value for this SetInadimplenteResponse.
     * 
     * @return setInadimplenteResult
     */
    public br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult getSetInadimplenteResult() {
        return setInadimplenteResult;
    }


    /**
     * Sets the setInadimplenteResult value for this SetInadimplenteResponse.
     * 
     * @param setInadimplenteResult
     */
    public void setSetInadimplenteResult(br.net.sponteeducacional.api.SetInadimplenteResponseSetInadimplenteResult setInadimplenteResult) {
        this.setInadimplenteResult = setInadimplenteResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SetInadimplenteResponse)) return false;
        SetInadimplenteResponse other = (SetInadimplenteResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.setInadimplenteResult==null && other.getSetInadimplenteResult()==null) || 
             (this.setInadimplenteResult!=null &&
              this.setInadimplenteResult.equals(other.getSetInadimplenteResult())));
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
        if (getSetInadimplenteResult() != null) {
            _hashCode += getSetInadimplenteResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetInadimplenteResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">SetInadimplenteResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("setInadimplenteResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SetInadimplenteResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">>SetInadimplenteResponse>SetInadimplenteResult"));
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
