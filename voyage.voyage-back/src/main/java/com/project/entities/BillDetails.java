package com.project.entities;



import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="t_bill_details")
public class BillDetails extends AbstractEntityId {
	
	@Column(nullable = false)
	private LocalDate datePayment;
	
	@NotBlank
	private String meansPayment;
	
	@Convert(converter = BooleanConverter.class)
    @Column(length = 6, nullable = false)
	private boolean validPayment;
	
	@NotNull
	private double priceBooking;
	
	@Column(nullable=true)
	private double additionalCosts;
	
	@ManyToOne
	@JoinColumn(nullable = false, name="booking_id")
	private Booking booking;
	
	public BillDetails() {
		
	}

	public LocalDate getDatePayment() {
		return datePayment;
	}

	public void setDatePayment(LocalDate datePayment) {
		this.datePayment = datePayment;
	}

	public String getMeansPayment() {
		return meansPayment;
	}

	public void setMeansPayment(String meansPayment) {
		this.meansPayment = meansPayment;
	}

	public boolean isValidPayment() {
		return validPayment;
	}

	public void setValidPayment(boolean validPayment) {
		this.validPayment = validPayment;
	}

	public double getPriceBooking() {
		return priceBooking;
	}

	public void setPriceBooking(double priceBooking) {
		this.priceBooking = priceBooking;
	}

	public double getAdditionalCosts() {
		return additionalCosts;
	}

	public void setAdditionalCosts(double additionalCosts) {
		this.additionalCosts = additionalCosts;
	}

	public Booking getBooking() {
		return booking;
	}

	public void setBooking(Booking booking) {
		this.booking = booking;
	}

	
}
