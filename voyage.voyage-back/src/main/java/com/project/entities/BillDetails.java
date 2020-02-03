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
	
	@Column(nullable = false, name="bil_date_payment")
	private LocalDate datePayment;
	
	@NotBlank
	@Column(name="bil_means_payment")
	private String meansPayment;
	
	@Convert(converter = BooleanConverter.class)
    @Column(length = 6, nullable = false, name="bil_valid_payment")
	private boolean validPayment;
	
	@NotNull
	@Column(name="bil_price_booking")
	private double priceBooking;
	
	@Column(nullable=true, name="bil_additional_costs")
	private double additionalCosts;
	
	@Column(name="bil_price_total")
	private double priceTotal;
	
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

	public double getPriceTotal() {
		return priceTotal;
	}

	public void setPriceTotal(double priceTotal) {
		this.priceTotal = priceTotal;
	}

	
}

