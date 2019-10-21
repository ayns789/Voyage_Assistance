package com.project.entities;



import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="t_email")
public class Email extends AbstractEntityId {
	
	@Convert(converter = BooleanConverter.class)
    @Column(length = 6, nullable = false)
	private boolean professional;
	
	
	@NotBlank
	private String email;
	
	@OneToOne
	@JoinColumn(nullable=true, name="account_id")
	private Account account;
	
	@ManyToOne
	@JoinColumn(nullable=true, name="establishment_id")
	private Establishment establishment;
	
	@OneToOne(mappedBy="email")
	private Contact contact;
	
	
	public Email() {
		
	}

	public boolean isProfessional() {
		return professional;
	}

	public void setProfessional(boolean professional) {
		this.professional = professional;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Establishment getEstablishment() {
		return establishment;
	}

	public void setEstablishment(Establishment establishment) {
		this.establishment = establishment;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}


}
