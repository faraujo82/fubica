package br.com.fubica.core.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

import org.hibernate.annotations.OrderBy;
import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name="Permissao")
public class Permissao implements GrantedAuthority {
	
	private static final long serialVersionUID = 1L;

    @Id
    @SequenceGenerator(name = "IDPERMISSAO", sequenceName = "PERMISSAO_SEQUENCE", allocationSize = 1) 
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator="IDPERMISSAO")
    @Column(name = "idpermissao")  
    private Long idPermissao;

    @Column(name = "descricao", length=100)
    private String descricao;

    @Column(name = "nome", length=100)
    private String nome;

    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "usuario_perfil", joinColumns = @JoinColumn(name = "id_perfil"), inverseJoinColumns = @JoinColumn(name = "id_usuario"))
    @OrderBy(clause = "idusuario")
    private Set<Usuario> usuario = new HashSet<Usuario>();
	
	@Override
	public String getAuthority() {
		return this.descricao;
	}

	public Long getIdPermissao() {
		return idPermissao;
	}

	public void setIdPermissao(Long idPermissao) {
		this.idPermissao = idPermissao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
