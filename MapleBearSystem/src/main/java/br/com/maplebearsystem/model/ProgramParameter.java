package br.com.maplebearsystem.model;


import br.com.maplebearsystem.model.PessoaJuridica;
import java.io.Serializable;
import java.lang.Long;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: ProgramParameter
 *
 */
@Entity
public class ProgramParameter implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String mastersenha;
	private String masterlogin;
	private String masterToken;
	private String masterchave;

	public ProgramParameter() {
		
	}

	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getMastersenha() {
		return mastersenha;
	}

	public String getMasterlogin() {
		return masterlogin;
	}

	public String getMasterToken() {
		return masterToken;
	}

	public String getMasterchave() {
		return masterchave;
	}

	public void setMastersenha(String mastersenha) {
		this.mastersenha = mastersenha;
	}

	public void setMasterlogin(String masterlogin) {
		this.masterlogin = masterlogin;
	}

	public void setMasterToken(String masterToken) {
		this.masterToken = masterToken;
	}

	public void setMasterchave(String masterchave) {
		this.masterchave = masterchave;
	}

	
	

}
