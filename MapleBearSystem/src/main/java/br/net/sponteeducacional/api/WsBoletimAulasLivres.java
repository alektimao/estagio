/**
 * WsBoletimAulasLivres.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsBoletimAulasLivres  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int contratoAulaLivreID;

    private br.net.sponteeducacional.api.NotasBoletimAulasLivres[] listaNotasBoletim;

    public WsBoletimAulasLivres() {
    }

    public WsBoletimAulasLivres(
           java.lang.String retornoOperacao,
           int contratoAulaLivreID,
           br.net.sponteeducacional.api.NotasBoletimAulasLivres[] listaNotasBoletim) {
           this.retornoOperacao = retornoOperacao;
           this.contratoAulaLivreID = contratoAulaLivreID;
           this.listaNotasBoletim = listaNotasBoletim;
    }


    /**
     * Gets the retornoOperacao value for this WsBoletimAulasLivres.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsBoletimAulasLivres.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the contratoAulaLivreID value for this WsBoletimAulasLivres.
     * 
     * @return contratoAulaLivreID
     */
    public int getContratoAulaLivreID() {
        return contratoAulaLivreID;
    }


    /**
     * Sets the contratoAulaLivreID value for this WsBoletimAulasLivres.
     * 
     * @param contratoAulaLivreID
     */
    public void setContratoAulaLivreID(int contratoAulaLivreID) {
        this.contratoAulaLivreID = contratoAulaLivreID;
    }


    /**
     * Gets the listaNotasBoletim value for this WsBoletimAulasLivres.
     * 
     * @return listaNotasBoletim
     */
    public br.net.sponteeducacional.api.NotasBoletimAulasLivres[] getListaNotasBoletim() {
        return listaNotasBoletim;
    }


    /**
     * Sets the listaNotasBoletim value for this WsBoletimAulasLivres.
     * 
     * @param listaNotasBoletim
     */
    public void setListaNotasBoletim(br.net.sponteeducacional.api.NotasBoletimAulasLivres[] listaNotasBoletim) {
        this.listaNotasBoletim = listaNotasBoletim;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsBoletimAulasLivres)) return false;
        WsBoletimAulasLivres other = (WsBoletimAulasLivres) obj;
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
            this.contratoAulaLivreID == other.getContratoAulaLivreID() &&
            ((this.listaNotasBoletim==null && other.getListaNotasBoletim()==null) || 
             (this.listaNotasBoletim!=null &&
              java.util.Arrays.equals(this.listaNotasBoletim, other.getListaNotasBoletim())));
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
        _hashCode += getContratoAulaLivreID();
        if (getListaNotasBoletim() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getListaNotasBoletim());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getListaNotasBoletim(), i);
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
        new org.apache.axis.description.TypeDesc(WsBoletimAulasLivres.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletimAulasLivres"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contratoAulaLivreID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ContratoAulaLivreID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaNotasBoletim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ListaNotasBoletim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletimAulasLivres"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletimAulasLivres"));
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
