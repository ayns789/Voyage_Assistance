package com.project.entities;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="t_booking")
public class Booking extends AbstractEntityId {

	
	@Column(nullable = false)
	private LocalDate dateBooking;
	
	@Column(nullable = false)
	private LocalDate dateStartBooking;
	
	@Column(nullable = false)
	private LocalDate dateEndBooking;
	
	@NotNull
	private Integer numberPersons;
	
	@Convert(converter = BooleanConverter.class)
    @Column(length = 6, nullable = false)
	private boolean availability;
	
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Account account;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Establishment establishment;

	public Booking () {
		
	}


	public LocalDate getDateBooking() {
		return dateBooking;
	}

	public void setDateBooking(LocalDate dateBooking) {
		this.dateBooking = dateBooking;
	}

	public LocalDate getDateStartBooking() {
		return dateStartBooking;
	}

	public void setDateStartBooking(LocalDate dateStartBooking) {
		this.dateStartBooking = dateStartBooking;
	}

	public LocalDate getDateEndBooking() {
		return dateEndBooking;
	}

	public void setDateEndBooking(LocalDate dateEndBooking) {
		this.dateEndBooking = dateEndBooking;
	}

	public int getNumberPersons() {
		return numberPersons;
	}

	public void setNumberPersons(int numberPersons) {
		this.numberPersons = numberPersons;
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


	public boolean isAvailability() {
		return availability;
	}


	public void setAvailability(boolean availability) {
		this.availability = availability;
	}
	

}
