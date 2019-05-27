/**
 * WsBoletim.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsBoletim  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int alunoID;

    private int turmaID;

    private br.net.sponteeducacional.api.NotasBoletim[] listaNotasBoletim;

    public WsBoletim() {
    }

    public WsBoletim(
           java.lang.String retornoOperacao,
           int alunoID,
           int turmaID,
           br.net.sponteeducacional.api.NotasBoletim[] listaNotasBoletim) {
           this.retornoOperacao = retornoOperacao;
           this.alunoID = alunoID;
           this.turmaID = turmaID;
           this.listaNotasBoletim = listaNotasBoletim;
    }


    /**
     * Gets the retornoOperacao value for this WsBoletim.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsBoletim.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the alunoID value for this WsBoletim.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsBoletim.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the turmaID value for this WsBoletim.
     * 
     * @return turmaID
     */
    public int getTurmaID() {
        return turmaID;
    }


    /**
     * Sets the turmaID value for this WsBoletim.
     * 
     * @param turmaID
     */
    public void setTurmaID(int turmaID) {
        this.turmaID = turmaID;
    }


    /**
     * Gets the listaNotasBoletim value for this WsBoletim.
     * 
     * @return listaNotasBoletim
     */
    public br.net.sponteeducacional.api.NotasBoletim[] getListaNotasBoletim() {
        return listaNotasBoletim;
    }


    /**
     * Sets the listaNotasBoletim value for this WsBoletim.
     * 
     * @param listaNotasBoletim
     */
    public void setListaNotasBoletim(br.net.sponteeducacional.api.NotasBoletim[] listaNotasBoletim) {
        this.listaNotasBoletim = listaNotasBoletim;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsBoletim)) return false;
        WsBoletim other = (WsBoletim) obj;
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
            this.alunoID == other.getAlunoID() &&
            this.turmaID == other.getTurmaID() &&
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
        _hashCode += getAlunoID();
        _hashCode += getTurmaID();
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
        new org.apache.axis.description.TypeDesc(WsBoletim.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsBoletim"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("turmaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TurmaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("listaNotasBoletim");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ListaNotasBoletim"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasBoletim"));
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
