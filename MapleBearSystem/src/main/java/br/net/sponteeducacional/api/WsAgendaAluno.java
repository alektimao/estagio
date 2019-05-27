/**
 * WsAgendaAluno.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAgendaAluno  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private int alunoID;

    private br.net.sponteeducacional.api.WsAulasDiarioClasseAluno[] aulasDiario;

    private br.net.sponteeducacional.api.WsAvaliacoesPortalAluno[] avaliacoesPortal;

    private br.net.sponteeducacional.api.WsAulasLivresAluno[] aulasLivres;

    public WsAgendaAluno() {
    }

    public WsAgendaAluno(
           java.lang.String retornoOperacao,
           int alunoID,
           br.net.sponteeducacional.api.WsAulasDiarioClasseAluno[] aulasDiario,
           br.net.sponteeducacional.api.WsAvaliacoesPortalAluno[] avaliacoesPortal,
           br.net.sponteeducacional.api.WsAulasLivresAluno[] aulasLivres) {
           this.retornoOperacao = retornoOperacao;
           this.alunoID = alunoID;
           this.aulasDiario = aulasDiario;
           this.avaliacoesPortal = avaliacoesPortal;
           this.aulasLivres = aulasLivres;
    }


    /**
     * Gets the retornoOperacao value for this WsAgendaAluno.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAgendaAluno.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the alunoID value for this WsAgendaAluno.
     * 
     * @return alunoID
     */
    public int getAlunoID() {
        return alunoID;
    }


    /**
     * Sets the alunoID value for this WsAgendaAluno.
     * 
     * @param alunoID
     */
    public void setAlunoID(int alunoID) {
        this.alunoID = alunoID;
    }


    /**
     * Gets the aulasDiario value for this WsAgendaAluno.
     * 
     * @return aulasDiario
     */
    public br.net.sponteeducacional.api.WsAulasDiarioClasseAluno[] getAulasDiario() {
        return aulasDiario;
    }


    /**
     * Sets the aulasDiario value for this WsAgendaAluno.
     * 
     * @param aulasDiario
     */
    public void setAulasDiario(br.net.sponteeducacional.api.WsAulasDiarioClasseAluno[] aulasDiario) {
        this.aulasDiario = aulasDiario;
    }


    /**
     * Gets the avaliacoesPortal value for this WsAgendaAluno.
     * 
     * @return avaliacoesPortal
     */
    public br.net.sponteeducacional.api.WsAvaliacoesPortalAluno[] getAvaliacoesPortal() {
        return avaliacoesPortal;
    }


    /**
     * Sets the avaliacoesPortal value for this WsAgendaAluno.
     * 
     * @param avaliacoesPortal
     */
    public void setAvaliacoesPortal(br.net.sponteeducacional.api.WsAvaliacoesPortalAluno[] avaliacoesPortal) {
        this.avaliacoesPortal = avaliacoesPortal;
    }


    /**
     * Gets the aulasLivres value for this WsAgendaAluno.
     * 
     * @return aulasLivres
     */
    public br.net.sponteeducacional.api.WsAulasLivresAluno[] getAulasLivres() {
        return aulasLivres;
    }


    /**
     * Sets the aulasLivres value for this WsAgendaAluno.
     * 
     * @param aulasLivres
     */
    public void setAulasLivres(br.net.sponteeducacional.api.WsAulasLivresAluno[] aulasLivres) {
        this.aulasLivres = aulasLivres;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAgendaAluno)) return false;
        WsAgendaAluno other = (WsAgendaAluno) obj;
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
            ((this.aulasDiario==null && other.getAulasDiario()==null) || 
             (this.aulasDiario!=null &&
              java.util.Arrays.equals(this.aulasDiario, other.getAulasDiario()))) &&
            ((this.avaliacoesPortal==null && other.getAvaliacoesPortal()==null) || 
             (this.avaliacoesPortal!=null &&
              java.util.Arrays.equals(this.avaliacoesPortal, other.getAvaliacoesPortal()))) &&
            ((this.aulasLivres==null && other.getAulasLivres()==null) || 
             (this.aulasLivres!=null &&
              java.util.Arrays.equals(this.aulasLivres, other.getAulasLivres())));
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
        if (getAulasDiario() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAulasDiario());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAulasDiario(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAvaliacoesPortal() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAvaliacoesPortal());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAvaliacoesPortal(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAulasLivres() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAulasLivres());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAulasLivres(), i);
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
        new org.apache.axis.description.TypeDesc(WsAgendaAluno.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAgendaAluno"));
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
        elemField.setFieldName("aulasDiario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AulasDiario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiarioClasseAluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasDiarioClasseAluno"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avaliacoesPortal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AvaliacoesPortal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesPortalAluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAvaliacoesPortalAluno"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aulasLivres");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "AulasLivres"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasLivresAluno"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAulasLivresAluno"));
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
