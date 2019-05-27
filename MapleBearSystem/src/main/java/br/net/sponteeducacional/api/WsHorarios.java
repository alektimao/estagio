/**
 * WsHorarios.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsHorarios  implements java.io.Serializable {
    private int horarioID;

    private java.lang.String nome;

    private int numeroAulas;

    private boolean ativo;

    private br.net.sponteeducacional.api.WsHorarioDetalhes[] horariosDetalhes;

    public WsHorarios() {
    }

    public WsHorarios(
           int horarioID,
           java.lang.String nome,
           int numeroAulas,
           boolean ativo,
           br.net.sponteeducacional.api.WsHorarioDetalhes[] horariosDetalhes) {
           this.horarioID = horarioID;
           this.nome = nome;
           this.numeroAulas = numeroAulas;
           this.ativo = ativo;
           this.horariosDetalhes = horariosDetalhes;
    }


    /**
     * Gets the horarioID value for this WsHorarios.
     * 
     * @return horarioID
     */
    public int getHorarioID() {
        return horarioID;
    }


    /**
     * Sets the horarioID value for this WsHorarios.
     * 
     * @param horarioID
     */
    public void setHorarioID(int horarioID) {
        this.horarioID = horarioID;
    }


    /**
     * Gets the nome value for this WsHorarios.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this WsHorarios.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the numeroAulas value for this WsHorarios.
     * 
     * @return numeroAulas
     */
    public int getNumeroAulas() {
        return numeroAulas;
    }


    /**
     * Sets the numeroAulas value for this WsHorarios.
     * 
     * @param numeroAulas
     */
    public void setNumeroAulas(int numeroAulas) {
        this.numeroAulas = numeroAulas;
    }


    /**
     * Gets the ativo value for this WsHorarios.
     * 
     * @return ativo
     */
    public boolean isAtivo() {
        return ativo;
    }


    /**
     * Sets the ativo value for this WsHorarios.
     * 
     * @param ativo
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }


    /**
     * Gets the horariosDetalhes value for this WsHorarios.
     * 
     * @return horariosDetalhes
     */
    public br.net.sponteeducacional.api.WsHorarioDetalhes[] getHorariosDetalhes() {
        return horariosDetalhes;
    }


    /**
     * Sets the horariosDetalhes value for this WsHorarios.
     * 
     * @param horariosDetalhes
     */
    public void setHorariosDetalhes(br.net.sponteeducacional.api.WsHorarioDetalhes[] horariosDetalhes) {
        this.horariosDetalhes = horariosDetalhes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsHorarios)) return false;
        WsHorarios other = (WsHorarios) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.horarioID == other.getHorarioID() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            this.numeroAulas == other.getNumeroAulas() &&
            this.ativo == other.isAtivo() &&
            ((this.horariosDetalhes==null && other.getHorariosDetalhes()==null) || 
             (this.horariosDetalhes!=null &&
              java.util.Arrays.equals(this.horariosDetalhes, other.getHorariosDetalhes())));
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
        _hashCode += getHorarioID();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        _hashCode += getNumeroAulas();
        _hashCode += (isAtivo() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getHorariosDetalhes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getHorariosDetalhes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getHorariosDetalhes(), i);
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
        new org.apache.axis.description.TypeDesc(WsHorarios.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarios"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horarioID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorarioID"));
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
        elemField.setFieldName("numeroAulas");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NumeroAulas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ativo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "Ativo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("horariosDetalhes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "HorariosDetalhes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarioDetalhes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsHorarioDetalhes"));
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
