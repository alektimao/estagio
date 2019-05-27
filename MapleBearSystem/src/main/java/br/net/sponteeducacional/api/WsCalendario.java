/**
 * WsCalendario.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsCalendario  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int calendarioID;

    private java.lang.String nomeCalendario;

    private int sabadoSemAula;

    private int domingoSemAula;

    private int padrao;

    private int diasLetivos;

    private br.net.sponteeducacional.api.WsCalendarioDetalhes[] calendarioDetalhes;

    public WsCalendario() {
    }

    public WsCalendario(
           java.lang.String retornoOperacao,
           int calendarioID,
           java.lang.String nomeCalendario,
           int sabadoSemAula,
           int domingoSemAula,
           int padrao,
           int diasLetivos,
           br.net.sponteeducacional.api.WsCalendarioDetalhes[] calendarioDetalhes) {
           this.retornoOperacao = retornoOperacao;
           this.calendarioID = calendarioID;
           this.nomeCalendario = nomeCalendario;
           this.sabadoSemAula = sabadoSemAula;
           this.domingoSemAula = domingoSemAula;
           this.padrao = padrao;
           this.diasLetivos = diasLetivos;
           this.calendarioDetalhes = calendarioDetalhes;
    }


    /**
     * Gets the retornoOperacao value for this WsCalendario.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsCalendario.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the calendarioID value for this WsCalendario.
     * 
     * @return calendarioID
     */
    public int getCalendarioID() {
        return calendarioID;
    }


    /**
     * Sets the calendarioID value for this WsCalendario.
     * 
     * @param calendarioID
     */
    public void setCalendarioID(int calendarioID) {
        this.calendarioID = calendarioID;
    }


    /**
     * Gets the nomeCalendario value for this WsCalendario.
     * 
     * @return nomeCalendario
     */
    public java.lang.String getNomeCalendario() {
        return nomeCalendario;
    }


    /**
     * Sets the nomeCalendario value for this WsCalendario.
     * 
     * @param nomeCalendario
     */
    public void setNomeCalendario(java.lang.String nomeCalendario) {
        this.nomeCalendario = nomeCalendario;
    }


    /**
     * Gets the sabadoSemAula value for this WsCalendario.
     * 
     * @return sabadoSemAula
     */
    public int getSabadoSemAula() {
        return sabadoSemAula;
    }


    /**
     * Sets the sabadoSemAula value for this WsCalendario.
     * 
     * @param sabadoSemAula
     */
    public void setSabadoSemAula(int sabadoSemAula) {
        this.sabadoSemAula = sabadoSemAula;
    }


    /**
     * Gets the domingoSemAula value for this WsCalendario.
     * 
     * @return domingoSemAula
     */
    public int getDomingoSemAula() {
        return domingoSemAula;
    }


    /**
     * Sets the domingoSemAula value for this WsCalendario.
     * 
     * @param domingoSemAula
     */
    public void setDomingoSemAula(int domingoSemAula) {
        this.domingoSemAula = domingoSemAula;
    }


    /**
     * Gets the padrao value for this WsCalendario.
     * 
     * @return padrao
     */
    public int getPadrao() {
        return padrao;
    }


    /**
     * Sets the padrao value for this WsCalendario.
     * 
     * @param padrao
     */
    public void setPadrao(int padrao) {
        this.padrao = padrao;
    }


    /**
     * Gets the diasLetivos value for this WsCalendario.
     * 
     * @return diasLetivos
     */
    public int getDiasLetivos() {
        return diasLetivos;
    }


    /**
     * Sets the diasLetivos value for this WsCalendario.
     * 
     * @param diasLetivos
     */
    public void setDiasLetivos(int diasLetivos) {
        this.diasLetivos = diasLetivos;
    }


    /**
     * Gets the calendarioDetalhes value for this WsCalendario.
     * 
     * @return calendarioDetalhes
     */
    public br.net.sponteeducacional.api.WsCalendarioDetalhes[] getCalendarioDetalhes() {
        return calendarioDetalhes;
    }


    /**
     * Sets the calendarioDetalhes value for this WsCalendario.
     * 
     * @param calendarioDetalhes
     */
    public void setCalendarioDetalhes(br.net.sponteeducacional.api.WsCalendarioDetalhes[] calendarioDetalhes) {
        this.calendarioDetalhes = calendarioDetalhes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsCalendario)) return false;
        WsCalendario other = (WsCalendario) obj;
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
            this.calendarioID == other.getCalendarioID() &&
            ((this.nomeCalendario==null && other.getNomeCalendario()==null) || 
             (this.nomeCalendario!=null &&
              this.nomeCalendario.equals(other.getNomeCalendario()))) &&
            this.sabadoSemAula == other.getSabadoSemAula() &&
            this.domingoSemAula == other.getDomingoSemAula() &&
            this.padrao == other.getPadrao() &&
            this.diasLetivos == other.getDiasLetivos() &&
            ((this.calendarioDetalhes==null && other.getCalendarioDetalhes()==null) || 
             (this.calendarioDetalhes!=null &&
              java.util.Arrays.equals(this.calendarioDetalhes, other.getCalendarioDetalhes())));
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
        _hashCode += getCalendarioID();
        if (getNomeCalendario() != null) {
            _hashCode += getNomeCalendario().hashCode();
        }
        _hashCode += getSabadoSemAula();
        _hashCode += getDomingoSemAula();
        _hashCode += getPadrao();
        _hashCode += getDiasLetivos();
        if (getCalendarioDetalhes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCalendarioDetalhes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCalendarioDetalhes(), i);
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
        new org.apache.axis.description.TypeDesc(WsCalendario.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendario"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CalendarioID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCalendario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeCalendario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sabadoSemAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SabadoSemAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("domingoSemAula");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DomingoSemAula"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("padrao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Padrao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("diasLetivos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DiasLetivos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calendarioDetalhes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CalendarioDetalhes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendarioDetalhes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCalendarioDetalhes"));
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
