/**
 * WsDisciplinasNotasParciais.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsDisciplinasNotasParciais  implements java.io.Serializable {
    private int disciplinaID;

    private java.lang.String nomeDisciplina;

    private int sistemaAvaliacaoID;

    private java.lang.String nomeSistemaAvaliacao;

    private br.net.sponteeducacional.api.WsNotasPeriodos[] notasPeriodos;

    public WsDisciplinasNotasParciais() {
    }

    public WsDisciplinasNotasParciais(
           int disciplinaID,
           java.lang.String nomeDisciplina,
           int sistemaAvaliacaoID,
           java.lang.String nomeSistemaAvaliacao,
           br.net.sponteeducacional.api.WsNotasPeriodos[] notasPeriodos) {
           this.disciplinaID = disciplinaID;
           this.nomeDisciplina = nomeDisciplina;
           this.sistemaAvaliacaoID = sistemaAvaliacaoID;
           this.nomeSistemaAvaliacao = nomeSistemaAvaliacao;
           this.notasPeriodos = notasPeriodos;
    }


    /**
     * Gets the disciplinaID value for this WsDisciplinasNotasParciais.
     * 
     * @return disciplinaID
     */
    public int getDisciplinaID() {
        return disciplinaID;
    }


    /**
     * Sets the disciplinaID value for this WsDisciplinasNotasParciais.
     * 
     * @param disciplinaID
     */
    public void setDisciplinaID(int disciplinaID) {
        this.disciplinaID = disciplinaID;
    }


    /**
     * Gets the nomeDisciplina value for this WsDisciplinasNotasParciais.
     * 
     * @return nomeDisciplina
     */
    public java.lang.String getNomeDisciplina() {
        return nomeDisciplina;
    }


    /**
     * Sets the nomeDisciplina value for this WsDisciplinasNotasParciais.
     * 
     * @param nomeDisciplina
     */
    public void setNomeDisciplina(java.lang.String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }


    /**
     * Gets the sistemaAvaliacaoID value for this WsDisciplinasNotasParciais.
     * 
     * @return sistemaAvaliacaoID
     */
    public int getSistemaAvaliacaoID() {
        return sistemaAvaliacaoID;
    }


    /**
     * Sets the sistemaAvaliacaoID value for this WsDisciplinasNotasParciais.
     * 
     * @param sistemaAvaliacaoID
     */
    public void setSistemaAvaliacaoID(int sistemaAvaliacaoID) {
        this.sistemaAvaliacaoID = sistemaAvaliacaoID;
    }


    /**
     * Gets the nomeSistemaAvaliacao value for this WsDisciplinasNotasParciais.
     * 
     * @return nomeSistemaAvaliacao
     */
    public java.lang.String getNomeSistemaAvaliacao() {
        return nomeSistemaAvaliacao;
    }


    /**
     * Sets the nomeSistemaAvaliacao value for this WsDisciplinasNotasParciais.
     * 
     * @param nomeSistemaAvaliacao
     */
    public void setNomeSistemaAvaliacao(java.lang.String nomeSistemaAvaliacao) {
        this.nomeSistemaAvaliacao = nomeSistemaAvaliacao;
    }


    /**
     * Gets the notasPeriodos value for this WsDisciplinasNotasParciais.
     * 
     * @return notasPeriodos
     */
    public br.net.sponteeducacional.api.WsNotasPeriodos[] getNotasPeriodos() {
        return notasPeriodos;
    }


    /**
     * Sets the notasPeriodos value for this WsDisciplinasNotasParciais.
     * 
     * @param notasPeriodos
     */
    public void setNotasPeriodos(br.net.sponteeducacional.api.WsNotasPeriodos[] notasPeriodos) {
        this.notasPeriodos = notasPeriodos;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsDisciplinasNotasParciais)) return false;
        WsDisciplinasNotasParciais other = (WsDisciplinasNotasParciais) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.disciplinaID == other.getDisciplinaID() &&
            ((this.nomeDisciplina==null && other.getNomeDisciplina()==null) || 
             (this.nomeDisciplina!=null &&
              this.nomeDisciplina.equals(other.getNomeDisciplina()))) &&
            this.sistemaAvaliacaoID == other.getSistemaAvaliacaoID() &&
            ((this.nomeSistemaAvaliacao==null && other.getNomeSistemaAvaliacao()==null) || 
             (this.nomeSistemaAvaliacao!=null &&
              this.nomeSistemaAvaliacao.equals(other.getNomeSistemaAvaliacao()))) &&
            ((this.notasPeriodos==null && other.getNotasPeriodos()==null) || 
             (this.notasPeriodos!=null &&
              java.util.Arrays.equals(this.notasPeriodos, other.getNotasPeriodos())));
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
        _hashCode += getDisciplinaID();
        if (getNomeDisciplina() != null) {
            _hashCode += getNomeDisciplina().hashCode();
        }
        _hashCode += getSistemaAvaliacaoID();
        if (getNomeSistemaAvaliacao() != null) {
            _hashCode += getNomeSistemaAvaliacao().hashCode();
        }
        if (getNotasPeriodos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNotasPeriodos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNotasPeriodos(), i);
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
        new org.apache.axis.description.TypeDesc(WsDisciplinasNotasParciais.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinasNotasParciais"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinaID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "DisciplinaID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeDisciplina");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeDisciplina"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sistemaAvaliacaoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SistemaAvaliacaoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSistemaAvaliacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeSistemaAvaliacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notasPeriodos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NotasPeriodos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasPeriodos"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsNotasPeriodos"));
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
