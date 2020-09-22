package com.project.entities;

import java.util.List;
import java.util.Set;

import com.project.dtos.AccountAuthViewDto;
import com.project.entities.BooleanConverter;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="t_account")
public class Account extends AbstractEntityId {

	@Column(nullable = false, name="acc_first_name")
	private String firstName;

	@Column( nullable = false, name="acc_last_name")
	private String lastName;
	
	@Column( nullable = false, unique = true, name="acc_login")
    private String username;

    @Column( nullable = false, name="acc_password")
    private String password;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "t_account_role",
	    joinColumns = @JoinColumn(name = "account_id"),
	    inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 10, nullable = false)
    private boolean enabled;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 10, nullable = false)
    private boolean accountNonExpired;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 10, nullable = false)
    private boolean accountNonLocked;

    @Convert(converter = BooleanConverter.class)
    @Column(length = 10, nullable = false)
    private boolean credentialsNonExpired;
    
    @ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable=false, name="civility_id")
	private Civility civility;
	
	@OneToOne(mappedBy="account")
	private Email email;
	
	@OneToMany(mappedBy="account")
	private List<Phone> phones;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(
		       name = "t_account_address",
		       joinColumns = @JoinColumn(name = "account_id", referencedColumnName="id"),
		       inverseJoinColumns = @JoinColumn(name = "address_id", referencedColumnName="id")
		    )
	 private List<Address> addresses;

    public Account() {
	// Empty no-arg constructor (Hibernate)
    }

    /**
     * Creates a new enabled custom user.
     *
     * @param password an encrypted password
     * @param username a unique username
     * @param roles    some roles
     */
    public Account(String firstName, String lastName, String username, String password, Set<Role> roles, Civility civility, Email email, List<Phone> phones, List<Address> addresses) {
	this(firstName, lastName, username, password, roles, true, true, true, true, civility, email, phones, addresses);
    }

   
    public Account(String firstName, String lastName, String username, String password, Set<Role> roles,
			boolean enabled, boolean accountNonExpired, boolean accountNonLocked, boolean credentialsNonExpired,
			Civility civility, Email email, List<Phone> phones, List<Address> addresses) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.username = username;
		this.password = password;
		this.roles = roles;
		this.enabled = enabled;
		this.accountNonExpired = accountNonExpired;
		this.accountNonLocked = accountNonLocked;
		this.credentialsNonExpired = credentialsNonExpired;
		this.civility = civility;
		this.email = email;
		this.phones = phones;
		this.addresses = addresses;
	}

	public Long getId() {
	return id;
    }

    public String getUsername() {
	return username;
    }

    public String getPassword() {
	return password;
    }

    public Set<Role> getRoles() {
	return roles;
    }

    public boolean isEnabled() {
	return enabled;
    }

    public boolean isAccountNonExpired() {
	return accountNonExpired;
    }

    public boolean isAccountNonLocked() {
	return accountNonLocked;
    }

    public boolean isCredentialsNonExpired() {
	return credentialsNonExpired;
    }

    public String getFirstName() {
	return firstName;
    }

    public String getLastName() {
	return lastName;
    }
    
	public Civility getCivility() {
		return civility;
	}

	public void setCivility(Civility civility) {
		this.civility = civility;
	}

	public Email getEmail() {
		return email;
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Account [firstname=" + firstName + ", lastname=" + lastName 
				+ ", username=" + username + ", password=[PROTECTED], roles=" + roles 
				+ ", enabled=" + enabled + ", accountNonExpired=" + accountNonExpired
				+ ", accountNonLocked=" + accountNonLocked + ", credentialsNonExpired=" + credentialsNonExpired
				+ ", civility=" + civility + ", email=" + email + ", phones=" + phones + ", addresses=" + addresses + "]";
	}

    
    
}
