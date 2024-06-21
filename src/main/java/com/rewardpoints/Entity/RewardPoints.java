package com.rewardpoints.Entity;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Table(name = "Reward_Points")
public class RewardPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String customerId;
    private String firstName;
    private String lastName;
    private double amount;
    private LocalDate date;
    
    public RewardPoints() {
    	
    }

	public RewardPoints(Long id, String customerId, String firstName, String lastName, double amount, LocalDate date) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.amount = amount;
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "RewardPoints [id=" + id + ", customerId=" + customerId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", amount=" + amount + ", date=" + date + "]";
	}
    

	
	
}
