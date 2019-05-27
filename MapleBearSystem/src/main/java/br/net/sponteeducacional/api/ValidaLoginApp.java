/**
 * ValidaLoginApp.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class ValidaLoginApp  implements java.io.Serializable {
    private java.lang.String sLogin;

    private java.lang.String sSenha;

    private java.lang.String sEmpresa;

    private int nTipoUsuario;

    private java.lang.String sTokenApp;

    public ValidaLoginApp() {
    }

    public ValidaLoginApp(
           java.lang.String sLogin,
           java.lang.String sSenha,
           java.lang.String sEmpresa,
           int nTipoUsuario,
           java.lang.String sTokenApp) {
           this.sLogin = sLogin;
           this.sSenha = sSenha;
           this.sEmpresa = sEmpresa;
           this.nTipoUsuario = nTipoUsuario;
           this.sTokenApp = sTokenApp;
    }


    /**
     * Gets the sLogin value for this ValidaLoginApp.
     * 
     * @return sLogin
     */
    public java.lang.String getSLogin() {
        return sLogin;
    }


    /**
     * Sets the sLogin value for this ValidaLoginApp.
     * 
     * @param sLogin
     */
    public void setSLogin(java.lang.String sLogin) {
        this.sLogin = sLogin;
    }


    /**
     * Gets the sSenha value for this ValidaLoginApp.
     * 
     * @return sSenha
     */
    public java.lang.String getSSenha() {
        return sSenha;
    }


    /**
     * Sets the sSenha value for this ValidaLoginApp.
     * 
     * @param sSenha
     */
    public void setSSenha(java.lang.String sSenha) {
        this.sSenha = sSenha;
    }


    /**
     * Gets the sEmpresa value for this ValidaLoginApp.
     * 
     * @return sEmpresa
     */
    public java.lang.String getSEmpresa() {
        return sEmpresa;
    }


    /**
     * Sets the sEmpresa value for this ValidaLoginApp.
     * 
     * @param sEmpresa
     */
    public void setSEmpresa(java.lang.String sEmpresa) {
        this.sEmpresa = sEmpresa;
    }


    /**
     * Gets the nTipoUsuario value for this ValidaLoginApp.
     * 
     * @return nTipoUsuario
     */
    public int getNTipoUsuario() {
        return nTipoUsuario;
    }


    /**
     * Sets the nTipoUsuario value for this ValidaLoginApp.
     * 
     * @param nTipoUsuario
     */
    public void setNTipoUsuario(int nTipoUsuario) {
        this.nTipoUsuario = nTipoUsuario;
    }


    /**
     * Gets the sTokenApp value for this ValidaLoginApp.
     * 
     * @return sTokenApp
     */
    public java.lang.String getSTokenApp() {
        return sTokenApp;
    }


    /**
     * Sets the sTokenApp value for this ValidaLoginApp.
     * 
     * @param sTokenApp
     */
    public void setSTokenApp(java.lang.String sTokenApp) {
        this.sTokenApp = sTokenApp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidaLoginApp)) return false;
        ValidaLoginApp other = (ValidaLoginApp) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sLogin==null && other.getSLogin()==null) || 
             (this.sLogin!=null &&
              this.sLogin.equals(other.getSLogin()))) &&
            ((this.sSenha==null && other.getSSenha()==null) || 
             (this.sSenha!=null &&
              this.sSenha.equals(other.getSSenha()))) &&
            ((this.sEmpresa==null && other.getSEmpresa()==null) || 
             (this.sEmpresa!=null &&
              this.sEmpresa.equals(other.getSEmpresa()))) &&
            this.nTipoUsuario == other.getNTipoUsuario() &&
            ((this.sTokenApp==null && other.getSTokenApp()==null) || 
             (this.sTokenApp!=null &&
              this.sTokenApp.equals(other.getSTokenApp())));
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
        if (getSLogin() != null) {
            _hashCode += getSLogin().hashCode();
        }
        if (getSSenha() != null) {
            _hashCode += getSSenha().hashCode();
        }
        if (getSEmpresa() != null) {
            _hashCode += getSEmpresa().hashCode();
        }
        _hashCode += getNTipoUsuario();
        if (getSTokenApp() != null) {
            _hashCode += getSTokenApp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidaLoginApp.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", ">ValidaLoginApp"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSenha");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sSenha"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SEmpresa");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sEmpresa"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("NTipoUsuario");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "nTipoUsuario"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("STokenApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "sTokenApp"));
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
