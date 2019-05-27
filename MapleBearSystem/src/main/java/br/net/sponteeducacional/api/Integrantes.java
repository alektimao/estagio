/**
 * Integrantes.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class Integrantes  implements java.io.Serializable {
    private int alunoID;

    private java.lang.String nome;

    private java.lang.String numeroChamada;

    private java.lang.String numeroContrato;

    private java.lang.String modulosMatriculados;

    private br.net.sponteeducacional.api.WsDisciplinas[] disciplinas;

    public Integrantes() {
    }

    public Integrantes(
           int alunoID,
           java.lang.String nome,
           java.lang.String numeroChamada,
           java.lang.String numeroContrato,
           java.lang.String modulosMatriculados,
           br.net.sponteeducacional.api.WsDisciplinas[] disciplinas) {
           this.alunoID = alunoID;
           this.nome = nome;
           this.numeroChamada = numeroChamada;
           this.numeroContrato = numeroContrato;
           this.modulosMatriculados = modulosMatriculados;
           this.disciplinas = disciplinas;
    }


    /**
     * Gets the alunoID value for this Integrantes.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this Integrantes.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the nome value for this Integrantes.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this Integrantes.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the numeroChamada value for this Integrantes.
     * 
     * @return numeroChamada
     */
    public java.lang.String getNumeroChamada() {
        return numeroChamada;
    }


    /**
     * Sets the numeroChamada value for this Integrantes.
     * 
     * @param numeroChamada
     */
    public void setNumeroChamada(java.lang.String numeroChamada) {
        this.numeroChamada = numeroChamada;
    }


    /**
     * Gets the numeroContrato value for this Integrantes.
     * 
     * @return numeroContrato
     */
    public java.lang.String getNumeroContrato() {
        return numeroContrato;
    }


    /**
     * Sets the numeroContrato value for this Integrantes.
     * 
     * @param numeroContrato
     */
    public void setNumeroContrato(java.lang.String numeroContrato) {
        this.numeroContrato = numeroContrato;
    }


    /**
     * Gets the modulosMatriculados value for this Integrantes.
     * 
     * @return modulosMatriculados
     */
    public java.lang.String getModulosMatriculados() {
        return modulosMatriculados;
    }


    /**
     * Sets the modulosMatriculados value for this Integrantes.
     * 
     * @param modulosMatriculados
     */
    public void setModulosMatriculados(java.lang.String modulosMatriculados) {
        this.modulosMatriculados = modulosMatriculados;
    }


    /**
     * Gets the disciplinas value for this Integrantes.
     * 
     * @return disciplinas
     */
    public br.net.sponteeducacional.api.WsDisciplinas[] getDisciplinas() {
        return disciplinas;
    }


    /**
     * Sets the disciplinas value for this Integrantes.
     * 
     * @param disciplinas
     */
    public void setDisciplinas(br.net.sponteeducacional.api.WsDisciplinas[] disciplinas) {
        this.disciplinas = disciplinas;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Integrantes)) return false;
        Integrantes other = (Integrantes) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.alunoID == other.getAlunoID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            ((this.numeroChamada==null && other.getNumeroChamada()==null) || 
             (this.numeroChamada!=null &&
              this.numeroChamada.equals(other.getNumeroChamada()))) &&
            ((this.numeroContrato==null && other.getNumeroContrato()==null) || 
             (this.numeroContrato!=null &&
              this.numeroContrato.equals(other.getNumeroContrato()))) &&
            ((this.modulosMatriculados==null && other.getModulosMatriculados()==null) || 
             (this.modulosMatriculados!=null &&
              this.modulosMatriculados.equals(other.getModulosMatriculados()))) &&
            ((this.disciplinas==null && other.getDisciplinas()==null) || 
             (this.disciplinas!=null &&
              java.util.Arrays.equals(this.disciplinas, other.getDisciplinas())));
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
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        if (getNumeroChamada() != null) {
            _hashCode += getNumeroChamada().hashCode();
        }
        if (getNumeroContrato() != null) {
            _hashCode += getNumeroContrato().hashCode();
        }
        if (getModulosMatriculados() != null) {
            _hashCode += getModulosMatriculados().hashCode();
        }
        if (getDisciplinas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDisciplinas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDisciplinas(), i);
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
        new org.apache.axis.description.TypeDesc(Integrantes.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Integrantes"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alunoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AlunoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroChamada");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroChamada"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroContrato");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroContrato"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modulosMatriculados");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ModulosMatriculados"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disciplinas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Disciplinas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsDisciplinas"));
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
