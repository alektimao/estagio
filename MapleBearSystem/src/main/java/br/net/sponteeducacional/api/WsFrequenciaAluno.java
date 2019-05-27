/**
 * WsFrequenciaAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsFrequenciaAluno  implements java.io.Serializable {
    private int alunoID;

    private java.lang.String nomeAluno;

    private java.lang.String horasAssistidas;

    private java.lang.String horasFaltas;

    private java.lang.String percentualFrequencia;

    private int totalFaltas;

    private int totalPresencas;

    private br.net.sponteeducacional.api.WsFaltasAluno[] faltas;

    public WsFrequenciaAluno() {
    }

    public WsFrequenciaAluno(
           int alunoID,
           java.lang.String nomeAluno,
           java.lang.String horasAssistidas,
           java.lang.String horasFaltas,
           java.lang.String percentualFrequencia,
           int totalFaltas,
           int totalPresencas,
           br.net.sponteeducacional.api.WsFaltasAluno[] faltas) {
           this.alunoID = alunoID;
           this.nomeAluno = nomeAluno;
           this.horasAssistidas = horasAssistidas;
           this.horasFaltas = horasFaltas;
           this.percentualFrequencia = percentualFrequencia;
           this.totalFaltas = totalFaltas;
           this.totalPresencas = totalPresencas;
           this.faltas = faltas;
    }


    /**
     * Gets the alunoID value for this WsFrequenciaAluno.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsFrequenciaAluno.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the nomeAluno value for this WsFrequenciaAluno.
     * 
     * @return nomeAluno
     */
    public java.lang.String getNomeAluno() {
        return nomeAluno;
    }


    /**
     * Sets the nomeAluno value for this WsFrequenciaAluno.
     * 
     * @param nomeAluno
     */
    public void setNomeAluno(java.lang.String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }


    /**
     * Gets the horasAssistidas value for this WsFrequenciaAluno.
     * 
     * @return horasAssistidas
     */
    public java.lang.String getHorasAssistidas() {
        return horasAssistidas;
    }


    /**
     * Sets the horasAssistidas value for this WsFrequenciaAluno.
     * 
     * @param horasAssistidas
     */
    public void setHorasAssistidas(java.lang.String horasAssistidas) {
        this.horasAssistidas = horasAssistidas;
    }


    /**
     * Gets the horasFaltas value for this WsFrequenciaAluno.
     * 
     * @return horasFaltas
     */
    public java.lang.String getHorasFaltas() {
        return horasFaltas;
    }


    /**
     * Sets the horasFaltas value for this WsFrequenciaAluno.
     * 
     * @param horasFaltas
     */
    public void setHorasFaltas(java.lang.String horasFaltas) {
        this.horasFaltas = horasFaltas;
    }


    /**
     * Gets the percentualFrequencia value for this WsFrequenciaAluno.
     * 
     * @return percentualFrequencia
     */
    public java.lang.String getPercentualFrequencia() {
        return percentualFrequencia;
    }


    /**
     * Sets the percentualFrequencia value for this WsFrequenciaAluno.
     * 
     * @param percentualFrequencia
     */
    public void setPercentualFrequencia(java.lang.String percentualFrequencia) {
        this.percentualFrequencia = percentualFrequencia;
    }


    /**
     * Gets the totalFaltas value for this WsFrequenciaAluno.
     * 
     * @return totalFaltas
     */
    public int getTotalFaltas() {
        return totalFaltas;
    }


    /**
     * Sets the totalFaltas value for this WsFrequenciaAluno.
     * 
     * @param totalFaltas
     */
    public void setTotalFaltas(int totalFaltas) {
        this.totalFaltas = totalFaltas;
    }


    /**
     * Gets the totalPresencas value for this WsFrequenciaAluno.
     * 
     * @return totalPresencas
     */
    public int getTotalPresencas() {
        return totalPresencas;
    }


    /**
     * Sets the totalPresencas value for this WsFrequenciaAluno.
     * 
     * @param totalPresencas
     */
    public void setTotalPresencas(int totalPresencas) {
        this.totalPresencas = totalPresencas;
    }


    /**
     * Gets the faltas value for this WsFrequenciaAluno.
     * 
     * @return faltas
     */
    public br.net.sponteeducacional.api.WsFaltasAluno[] getFaltas() {
        return faltas;
    }


    /**
     * Sets the faltas value for this WsFrequenciaAluno.
     * 
     * @param faltas
     */
    public void setFaltas(br.net.sponteeducacional.api.WsFaltasAluno[] faltas) {
        this.faltas = faltas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsFrequenciaAluno)) return false;
        WsFrequenciaAluno other = (WsFrequenciaAluno) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alunoID == other.getAlunoID() &&
            ((this.nomeAluno==null && other.getNomeAluno()==null) || 
             (this.nomeAluno!=null &&
              this.nomeAluno.equals(other.getNomeAluno()))) &&
            ((this.horasAssistidas==null && other.getHorasAssistidas()==null) || 
             (this.horasAssistidas!=null &&
              this.horasAssistidas.equals(other.getHorasAssistidas()))) &&
            ((this.horasFaltas==null && other.getHorasFaltas()==null) || 
             (this.horasFaltas!=null &&
              this.horasFaltas.equals(other.getHorasFaltas()))) &&
            ((this.percentualFrequencia==null && other.getPercentualFrequencia()==null) || 
             (this.percentualFrequencia!=null &&
              this.percentualFrequencia.equals(other.getPercentualFrequencia()))) &&
            this.totalFaltas == other.getTotalFaltas() &&
            this.totalPresencas == other.getTotalPresencas() &&
            ((this.faltas==null && other.getFaltas()==null) || 
             (this.faltas!=null &&
              java.util.Arrays.equals(this.faltas, other.getFaltas())));
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
        _hashCode += getAlunoID();
        if (getNomeAluno() != null) {
            _hashCode += getNomeAluno().hashCode();
        }
        if (getHorasAssistidas() != null) {
            _hashCode += getHorasAssistidas().hashCode();
        }
        if (getHorasFaltas() != null) {
            _hashCode += getHorasFaltas().hashCode();
        }
        if (getPercentualFrequencia() != null) {
            _hashCode += getPercentualFrequencia().hashCode();
        }
        _hashCode += getTotalFaltas();
        _hashCode += getTotalPresencas();
        if (getFaltas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFaltas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFaltas(), i);
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
        new org.apache.axis.description.TypeDesc(WsFrequenciaAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFrequenciaAluno"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeAluno");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeAluno"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horasAssistidas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorasAssistidas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horasFaltas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorasFaltas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("percentualFrequencia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PercentualFrequencia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFaltas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TotalFaltas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalPresencas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TotalPresencas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faltas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Faltas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFaltasAluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsFaltasAluno"));
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
