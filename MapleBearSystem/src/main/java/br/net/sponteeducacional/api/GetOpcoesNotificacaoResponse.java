/**
 * GetOpcoesNotificacaoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class GetOpcoesNotificacaoResponse  implements java.io.Serializable {
    private br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getOpcoesNotificacaoResult;

    public GetOpcoesNotificacaoResponse() {
    }

    public GetOpcoesNotificacaoResponse(
           br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getOpcoesNotificacaoResult) {
           this.getOpcoesNotificacaoResult = getOpcoesNotificacaoResult;
    }


    /**
     * Gets the getOpcoesNotificacaoResult value for this GetOpcoesNotificacaoResponse.
     * 
     * @return getOpcoesNotificacaoResult
     */
    public br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getGetOpcoesNotificacaoResult() {
        return getOpcoesNotificacaoResult;
    }


    /**
     * Sets the getOpcoesNotificacaoResult value for this GetOpcoesNotificacaoResponse.
     * 
     * @param getOpcoesNotificacaoResult
     */
    public void setGetOpcoesNotificacaoResult(br.net.sponteeducacional.api.WsAppPortalNotasNotificacao[] getOpcoesNotificacaoResult) {
        this.getOpcoesNotificacaoResult = getOpcoesNotificacaoResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetOpcoesNotificacaoResponse)) return false;
        GetOpcoesNotificacaoResponse other = (GetOpcoesNotificacaoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getOpcoesNotificacaoResult==null && other.getGetOpcoesNotificacaoResult()==null) || 
             (this.getOpcoesNotificacaoResult!=null &&
              java.util.Arrays.equals(this.getOpcoesNotificacaoResult, other.getGetOpcoesNotificacaoResult())));
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
        if (getGetOpcoesNotificacaoResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getGetOpcoesNotificacaoResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getGetOpcoesNotificacaoResult(), i);
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
        new org.apache.axis.description.TypeDesc(GetOpcoesNotificacaoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">GetOpcoesNotificacaoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getOpcoesNotificacaoResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "GetOpcoesNotificacaoResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotasNotificacao"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotasNotificacao"));
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
