/**
 * WsAppPortalNotas.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.net.sponteeducacional.api;

public class WsAppPortalNotas  implements java.io.Serializable {
    private java.lang.String retornoOperacao;

    private java.lang.String corPrimariaApp;

    private java.lang.String corSecundariaApp;

    private java.lang.String imagemLogoApp;

    private org.apache.axis.types.UnsignedByte permiteAlterarFotoApp;

    private org.apache.axis.types.UnsignedByte permiteAlterarDadosPessoaisApp;

    private org.apache.axis.types.UnsignedByte permiteAlterarEnderecoApp;

    public WsAppPortalNotas() {
    }

    public WsAppPortalNotas(
           java.lang.String retornoOperacao,
           java.lang.String corPrimariaApp,
           java.lang.String corSecundariaApp,
           java.lang.String imagemLogoApp,
           org.apache.axis.types.UnsignedByte permiteAlterarFotoApp,
           org.apache.axis.types.UnsignedByte permiteAlterarDadosPessoaisApp,
           org.apache.axis.types.UnsignedByte permiteAlterarEnderecoApp) {
           this.retornoOperacao = retornoOperacao;
           this.corPrimariaApp = corPrimariaApp;
           this.corSecundariaApp = corSecundariaApp;
           this.imagemLogoApp = imagemLogoApp;
           this.permiteAlterarFotoApp = permiteAlterarFotoApp;
           this.permiteAlterarDadosPessoaisApp = permiteAlterarDadosPessoaisApp;
           this.permiteAlterarEnderecoApp = permiteAlterarEnderecoApp;
    }


    /**
     * Gets the retornoOperacao value for this WsAppPortalNotas.
     * 
     * @return retornoOperacao
     */
    public java.lang.String getRetornoOperacao() {
        return retornoOperacao;
    }


    /**
     * Sets the retornoOperacao value for this WsAppPortalNotas.
     * 
     * @param retornoOperacao
     */
    public void setRetornoOperacao(java.lang.String retornoOperacao) {
        this.retornoOperacao = retornoOperacao;
    }


    /**
     * Gets the corPrimariaApp value for this WsAppPortalNotas.
     * 
     * @return corPrimariaApp
     */
    public java.lang.String getCorPrimariaApp() {
        return corPrimariaApp;
    }


    /**
     * Sets the corPrimariaApp value for this WsAppPortalNotas.
     * 
     * @param corPrimariaApp
     */
    public void setCorPrimariaApp(java.lang.String corPrimariaApp) {
        this.corPrimariaApp = corPrimariaApp;
    }


    /**
     * Gets the corSecundariaApp value for this WsAppPortalNotas.
     * 
     * @return corSecundariaApp
     */
    public java.lang.String getCorSecundariaApp() {
        return corSecundariaApp;
    }


    /**
     * Sets the corSecundariaApp value for this WsAppPortalNotas.
     * 
     * @param corSecundariaApp
     */
    public void setCorSecundariaApp(java.lang.String corSecundariaApp) {
        this.corSecundariaApp = corSecundariaApp;
    }


    /**
     * Gets the imagemLogoApp value for this WsAppPortalNotas.
     * 
     * @return imagemLogoApp
     */
    public java.lang.String getImagemLogoApp() {
        return imagemLogoApp;
    }


    /**
     * Sets the imagemLogoApp value for this WsAppPortalNotas.
     * 
     * @param imagemLogoApp
     */
    public void setImagemLogoApp(java.lang.String imagemLogoApp) {
        this.imagemLogoApp = imagemLogoApp;
    }


    /**
     * Gets the permiteAlterarFotoApp value for this WsAppPortalNotas.
     * 
     * @return permiteAlterarFotoApp
     */
    public org.apache.axis.types.UnsignedByte getPermiteAlterarFotoApp() {
        return permiteAlterarFotoApp;
    }


    /**
     * Sets the permiteAlterarFotoApp value for this WsAppPortalNotas.
     * 
     * @param permiteAlterarFotoApp
     */
    public void setPermiteAlterarFotoApp(org.apache.axis.types.UnsignedByte permiteAlterarFotoApp) {
        this.permiteAlterarFotoApp = permiteAlterarFotoApp;
    }


    /**
     * Gets the permiteAlterarDadosPessoaisApp value for this WsAppPortalNotas.
     * 
     * @return permiteAlterarDadosPessoaisApp
     */
    public org.apache.axis.types.UnsignedByte getPermiteAlterarDadosPessoaisApp() {
        return permiteAlterarDadosPessoaisApp;
    }


    /**
     * Sets the permiteAlterarDadosPessoaisApp value for this WsAppPortalNotas.
     * 
     * @param permiteAlterarDadosPessoaisApp
     */
    public void setPermiteAlterarDadosPessoaisApp(org.apache.axis.types.UnsignedByte permiteAlterarDadosPessoaisApp) {
        this.permiteAlterarDadosPessoaisApp = permiteAlterarDadosPessoaisApp;
    }


    /**
     * Gets the permiteAlterarEnderecoApp value for this WsAppPortalNotas.
     * 
     * @return permiteAlterarEnderecoApp
     */
    public org.apache.axis.types.UnsignedByte getPermiteAlterarEnderecoApp() {
        return permiteAlterarEnderecoApp;
    }


    /**
     * Sets the permiteAlterarEnderecoApp value for this WsAppPortalNotas.
     * 
     * @param permiteAlterarEnderecoApp
     */
    public void setPermiteAlterarEnderecoApp(org.apache.axis.types.UnsignedByte permiteAlterarEnderecoApp) {
        this.permiteAlterarEnderecoApp = permiteAlterarEnderecoApp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WsAppPortalNotas)) return false;
        WsAppPortalNotas other = (WsAppPortalNotas) obj;
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
            ((this.corPrimariaApp==null && other.getCorPrimariaApp()==null) || 
             (this.corPrimariaApp!=null &&
              this.corPrimariaApp.equals(other.getCorPrimariaApp()))) &&
            ((this.corSecundariaApp==null && other.getCorSecundariaApp()==null) || 
             (this.corSecundariaApp!=null &&
              this.corSecundariaApp.equals(other.getCorSecundariaApp()))) &&
            ((this.imagemLogoApp==null && other.getImagemLogoApp()==null) || 
             (this.imagemLogoApp!=null &&
              this.imagemLogoApp.equals(other.getImagemLogoApp()))) &&
            ((this.permiteAlterarFotoApp==null && other.getPermiteAlterarFotoApp()==null) || 
             (this.permiteAlterarFotoApp!=null &&
              this.permiteAlterarFotoApp.equals(other.getPermiteAlterarFotoApp()))) &&
            ((this.permiteAlterarDadosPessoaisApp==null && other.getPermiteAlterarDadosPessoaisApp()==null) || 
             (this.permiteAlterarDadosPessoaisApp!=null &&
              this.permiteAlterarDadosPessoaisApp.equals(other.getPermiteAlterarDadosPessoaisApp()))) &&
            ((this.permiteAlterarEnderecoApp==null && other.getPermiteAlterarEnderecoApp()==null) || 
             (this.permiteAlterarEnderecoApp!=null &&
              this.permiteAlterarEnderecoApp.equals(other.getPermiteAlterarEnderecoApp())));
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
        if (getCorPrimariaApp() != null) {
            _hashCode += getCorPrimariaApp().hashCode();
        }
        if (getCorSecundariaApp() != null) {
            _hashCode += getCorSecundariaApp().hashCode();
        }
        if (getImagemLogoApp() != null) {
            _hashCode += getImagemLogoApp().hashCode();
        }
        if (getPermiteAlterarFotoApp() != null) {
            _hashCode += getPermiteAlterarFotoApp().hashCode();
        }
        if (getPermiteAlterarDadosPessoaisApp() != null) {
            _hashCode += getPermiteAlterarDadosPessoaisApp().hashCode();
        }
        if (getPermiteAlterarEnderecoApp() != null) {
            _hashCode += getPermiteAlterarEnderecoApp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WsAppPortalNotas.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "wsAppPortalNotas"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("retornoOperacao");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "RetornoOperacao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corPrimariaApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CorPrimariaApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corSecundariaApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "CorSecundariaApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagemLogoApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "ImagemLogoApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permiteAlterarFotoApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PermiteAlterarFotoApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permiteAlterarDadosPessoaisApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PermiteAlterarDadosPessoaisApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("permiteAlterarEnderecoApp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://api.sponteeducacional.net.br/", "PermiteAlterarEnderecoApp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"));
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
