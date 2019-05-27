/**
 * WsNotasPeriodos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsNotasPeriodos  implements java.io.Serializable {
    private int periodo;

    private java.lang.String nomePeriodo;

    private java.lang.String formulaCalculoLivre;

    private java.lang.String mediaPrevista;

    private br.net.sponteeducacional.api.WsNotaParcial[] notasParciais;

    public WsNotasPeriodos() {
    }

    public WsNotasPeriodos(
           int periodo,
           java.lang.String nomePeriodo,
           java.lang.String formulaCalculoLivre,
           java.lang.String mediaPrevista,
           br.net.sponteeducacional.api.WsNotaParcial[] notasParciais) {
           this.periodo = periodo;
           this.nomePeriodo = nomePeriodo;
           this.formulaCalculoLivre = formulaCalculoLivre;
           this.mediaPrevista = mediaPrevista;
           this.notasParciais = notasParciais;
    }


    /**
     * Gets the periodo value for this WsNotasPeriodos.
     * 
     * @return periodo
     */
    public int getPeriodo() {
        return periodo;
    }


    /**
     * Sets the periodo value for this WsNotasPeriodos.
     * 
     * @param periodo
     */
    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }


    /**
     * Gets the nomePeriodo value for this WsNotasPeriodos.
     * 
     * @return nomePeriodo
     */
    public java.lang.String getNomePeriodo() {
        return nomePeriodo;
    }


    /**
     * Sets the nomePeriodo value for this WsNotasPeriodos.
     * 
     * @param nomePeriodo
     */
    public void setNomePeriodo(java.lang.String nomePeriodo) {
        this.nomePeriodo = nomePeriodo;
    }


    /**
     * Gets the formulaCalculoLivre value for this WsNotasPeriodos.
     * 
     * @return formulaCalculoLivre
     */
    public java.lang.String getFormulaCalculoLivre() {
        return formulaCalculoLivre;
    }


    /**
     * Sets the formulaCalculoLivre value for this WsNotasPeriodos.
     * 
     * @param formulaCalculoLivre
     */
    public void setFormulaCalculoLivre(java.lang.String formulaCalculoLivre) {
        this.formulaCalculoLivre = formulaCalculoLivre;
    }


    /**
     * Gets the mediaPrevista value for this WsNotasPeriodos.
     * 
     * @return mediaPrevista
     */
    public java.lang.String getMediaPrevista() {
        return mediaPrevista;
    }


    /**
     * Sets the mediaPrevista value for this WsNotasPeriodos.
     * 
     * @param mediaPrevista
     */
    public void setMediaPrevista(java.lang.String mediaPrevista) {
        this.mediaPrevista = mediaPrevista;
    }


    /**
     * Gets the notasParciais value for this WsNotasPeriodos.
     * 
     * @return notasParciais
     */
    public br.net.sponteeducacional.api.WsNotaParcial[] getNotasParciais() {
        return notasParciais;
    }


    /**
     * Sets the notasParciais value for this WsNotasPeriodos.
     * 
     * @param notasParciais
     */
    public void setNotasParciais(br.net.sponteeducacional.api.WsNotaParcial[] notasParciais) {
        this.notasParciais = notasParciais;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsNotasPeriodos)) return false;
        WsNotasPeriodos other = (WsNotasPeriodos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.periodo == other.getPeriodo() &&
            ((this.nomePeriodo==null && other.getNomePeriodo()==null) || 
             (this.nomePeriodo!=null &&
              this.nomePeriodo.equals(other.getNomePeriodo()))) &&
            ((this.formulaCalculoLivre==null && other.getFormulaCalculoLivre()==null) || 
             (this.formulaCalculoLivre!=null &&
              this.formulaCalculoLivre.equals(other.getFormulaCalculoLivre()))) &&
            ((this.mediaPrevista==null && other.getMediaPrevista()==null) || 
             (this.mediaPrevista!=null &&
              this.mediaPrevista.equals(other.getMediaPrevista()))) &&
            ((this.notasParciais==null && other.getNotasParciais()==null) || 
             (this.notasParciais!=null &&
              java.util.Arrays.equals(this.notasParciais, other.getNotasParciais())));
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
        _hashCode += getPeriodo();
        if (getNomePeriodo() != null) {
            _hashCode += getNomePeriodo().hashCode();
        }
        if (getFormulaCalculoLivre() != null) {
            _hashCode += getFormulaCalculoLivre().hashCode();
        }
        if (getMediaPrevista() != null) {
            _hashCode += getMediaPrevista().hashCode();
        }
        if (getNotasParciais() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotasParciais());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotasParciais(), i);
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
        new org.apache.axis.description.TypeDesc(WsNotasPeriodos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasPeriodos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Periodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomePeriodo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomePeriodo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formulaCalculoLivre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "FormulaCalculoLivre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mediaPrevista");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "MediaPrevista"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasParciais");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasParciais"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotaParcial"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotaParcial"));
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
