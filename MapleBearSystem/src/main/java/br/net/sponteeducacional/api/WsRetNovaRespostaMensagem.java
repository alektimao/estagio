/**
 * WsRetNovaRespostaMensagem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsRetNovaRespostaMensagem  extends br.net.sponteeducacional.api.WsMensagemResposta  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    public WsRetNovaRespostaMensagem() {
    }

    public WsRetNovaRespostaMensagem(
           int mensagemRespostaID,
           java.lang.String resposta,
           java.lang.String dataResposta,
           org.apache.axis.types.UnsignedByte lido,
           java.lang.String origemDestino,
           int alunoID,
           int responsavelID,
           int funcionarioID,
           java.lang.String foto,
           java.lang.String retornoOperacao) {
        super(
            mensagemRespostaID,
            resposta,
            dataResposta,
            lido,
            origemDestino,
            alunoID,
            responsavelID,
            funcionarioID,
            foto);
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the retornoOperacao value for this WsRetNovaRespostaMensagem.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsRetNovaRespostaMensagem.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsRetNovaRespostaMensagem)) return false;
        WsRetNovaRespostaMensagem other = (WsRetNovaRespostaMensagem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsRetNovaRespostaMensagem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsRetNovaRespostaMensagem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
