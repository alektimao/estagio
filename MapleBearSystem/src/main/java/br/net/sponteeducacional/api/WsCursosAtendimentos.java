/**
 * WsCursosAtendimentos.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsCursosAtendimentos  implements java.io.Serializable {
    private int cursoID;

    private java.lang.String nomeCurso;

    private int tiposCursoID;

    private java.lang.String nomeTipoCurso;

    private int serieID;

    private java.lang.String nomeSerie;

    public WsCursosAtendimentos() {
    }

    public WsCursosAtendimentos(
           int cursoID,
           java.lang.String nomeCurso,
           int tiposCursoID,
           java.lang.String nomeTipoCurso,
           int serieID,
           java.lang.String nomeSerie) {
           this.cursoID = cursoID;
           this.nomeCurso = nomeCurso;
           this.tiposCursoID = tiposCursoID;
           this.nomeTipoCurso = nomeTipoCurso;
           this.serieID = serieID;
           this.nomeSerie = nomeSerie;
    }


    /**
     * Gets the cursoID value for this WsCursosAtendimentos.
     * 
     * @return cursoID
     */
    public int getCursoID() {
        return cursoID;
    }


    /**
     * Sets the cursoID value for this WsCursosAtendimentos.
     * 
     * @param cursoID
     */
    public void setCursoID(int cursoID) {
        this.cursoID = cursoID;
    }


    /**
     * Gets the nomeCurso value for this WsCursosAtendimentos.
     * 
     * @return nomeCurso
     */
    public java.lang.String getNomeCurso() {
        return nomeCurso;
    }


    /**
     * Sets the nomeCurso value for this WsCursosAtendimentos.
     * 
     * @param nomeCurso
     */
    public void setNomeCurso(java.lang.String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }


    /**
     * Gets the tiposCursoID value for this WsCursosAtendimentos.
     * 
     * @return tiposCursoID
     */
    public int getTiposCursoID() {
        return tiposCursoID;
    }


    /**
     * Sets the tiposCursoID value for this WsCursosAtendimentos.
     * 
     * @param tiposCursoID
     */
    public void setTiposCursoID(int tiposCursoID) {
        this.tiposCursoID = tiposCursoID;
    }


    /**
     * Gets the nomeTipoCurso value for this WsCursosAtendimentos.
     * 
     * @return nomeTipoCurso
     */
    public java.lang.String getNomeTipoCurso() {
        return nomeTipoCurso;
    }


    /**
     * Sets the nomeTipoCurso value for this WsCursosAtendimentos.
     * 
     * @param nomeTipoCurso
     */
    public void setNomeTipoCurso(java.lang.String nomeTipoCurso) {
        this.nomeTipoCurso = nomeTipoCurso;
    }


    /**
     * Gets the serieID value for this WsCursosAtendimentos.
     * 
     * @return serieID
     */
    public int getSerieID() {
        return serieID;
    }


    /**
     * Sets the serieID value for this WsCursosAtendimentos.
     * 
     * @param serieID
     */
    public void setSerieID(int serieID) {
        this.serieID = serieID;
    }


    /**
     * Gets the nomeSerie value for this WsCursosAtendimentos.
     * 
     * @return nomeSerie
     */
    public java.lang.String getNomeSerie() {
        return nomeSerie;
    }


    /**
     * Sets the nomeSerie value for this WsCursosAtendimentos.
     * 
     * @param nomeSerie
     */
    public void setNomeSerie(java.lang.String nomeSerie) {
        this.nomeSerie = nomeSerie;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsCursosAtendimentos)) return false;
        WsCursosAtendimentos other = (WsCursosAtendimentos) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cursoID == other.getCursoID() &&
            ((this.nomeCurso==null && other.getNomeCurso()==null) || 
             (this.nomeCurso!=null &&
              this.nomeCurso.equals(other.getNomeCurso()))) &&
            this.tiposCursoID == other.getTiposCursoID() &&
            ((this.nomeTipoCurso==null && other.getNomeTipoCurso()==null) || 
             (this.nomeTipoCurso!=null &&
              this.nomeTipoCurso.equals(other.getNomeTipoCurso()))) &&
            this.serieID == other.getSerieID() &&
            ((this.nomeSerie==null && other.getNomeSerie()==null) || 
             (this.nomeSerie!=null &&
              this.nomeSerie.equals(other.getNomeSerie())));
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
        _hashCode += getCursoID();
        if (getNomeCurso() != null) {
            _hashCode += getNomeCurso().hashCode();
        }
        _hashCode += getTiposCursoID();
        if (getNomeTipoCurso() != null) {
            _hashCode += getNomeTipoCurso().hashCode();
        }
        _hashCode += getSerieID();
        if (getNomeSerie() != null) {
            _hashCode += getNomeSerie().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsCursosAtendimentos.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsCursosAtendimentos"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeCurso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeCurso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tiposCursoID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "TiposCursoID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeTipoCurso");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeTipoCurso"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serieID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "SerieID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nomeSerie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "NomeSerie"));
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
