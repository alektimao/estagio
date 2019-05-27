/**
 * WsBolsa.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsBolsa  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int bolsaID;

    private java.lang.String descricao;

    private java.lang.String tipoDesconto;

    private br.net.sponteeducacional.api.WsDescontos[] descontos;

    public WsBolsa() {
    }

    public WsBolsa(
           java.lang.String retornoOperacao,
           int bolsaID,
           java.lang.String descricao,
           java.lang.String tipoDesconto,
           br.net.sponteeducacional.api.WsDescontos[] descontos) {
           this.retornoOperacao = retornoOperacao;
           this.bolsaID = bolsaID;
           this.descricao = descricao;
           this.tipoDesconto = tipoDesconto;
           this.descontos = descontos;
    }


    /**
     * Gets the retornoOperacao value for this WsBolsa.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsBolsa.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the bolsaID value for this WsBolsa.
     * 
     * @return bolsaID
     */
    public int getBolsaID() {
        return bolsaID;
    }


    /**
     * Sets the bolsaID value for this WsBolsa.
     * 
     * @param bolsaID
     */
    public void setBolsaID(int bolsaID) {
        this.bolsaID = bolsaID;
    }


    /**
     * Gets the descricao value for this WsBolsa.
     * 
     * @return descricao
     */
    public java.lang.String getDescricao() {
        return descricao;
    }


    /**
     * Sets the descricao value for this WsBolsa.
     * 
     * @param descricao
     */
    public void setDescricao(java.lang.String descricao) {
        this.descricao = descricao;
    }


    /**
     * Gets the tipoDesconto value for this WsBolsa.
     * 
     * @return tipoDesconto
     */
    public java.lang.String getTipoDesconto() {
        return tipoDesconto;
    }


    /**
     * Sets the tipoDesconto value for this WsBolsa.
     * 
     * @param tipoDesconto
     */
    public void setTipoDesconto(java.lang.String tipoDesconto) {
        this.tipoDesconto = tipoDesconto;
    }


    /**
     * Gets the descontos value for this WsBolsa.
     * 
     * @return descontos
     */
    public br.net.sponteeducacional.api.WsDescontos[] getDescontos() {
        return descontos;
    }


    /**
     * Sets the descontos value for this WsBolsa.
     * 
     * @param descontos
     */
    public void setDescontos(br.net.sponteeducacional.api.WsDescontos[] descontos) {
        this.descontos = descontos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsBolsa)) return false;
        WsBolsa other = (WsBolsa) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.retornoOperacao==null && other.getRetornoOperacao()==null) || 
             (this.retornoOperacao!=null &&
              this.retornoOperacao.equals(other.getRetornoOperacao()))) &&
            this.bolsaID == other.getBolsaID() &&
            ((this.descricao==null && other.getDescricao()==null) || 
             (this.descricao!=null &&
              this.descricao.equals(other.getDescricao()))) &&
            ((this.tipoDesconto==null && other.getTipoDesconto()==null) || 
             (this.tipoDesconto!=null &&
              this.tipoDesconto.equals(other.getTipoDesconto()))) &&
            ((this.descontos==null && other.getDescontos()==null) || 
             (this.descontos!=null &&
              java.util.Arrays.equals(this.descontos, other.getDescontos())));
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
        if (getRetornoOperacao() != null) {
            _hashCode += getRetornoOperacao().hashCode();
        }
        _hashCode += getBolsaID();
        if (getDescricao() != null) {
            _hashCode += getDescricao().hashCode();
        }
        if (getTipoDesconto() != null) {
            _hashCode += getTipoDesconto().hashCode();
        }
        if (getDescontos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDescontos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDescontos(), i);
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
        new org.apache.axis.description.TypeDesc(WsBolsa.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBolsa"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bolsaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "BolsaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descricao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Descricao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoDesconto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TipoDesconto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descontos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Descontos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDescontos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDescontos"));
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
