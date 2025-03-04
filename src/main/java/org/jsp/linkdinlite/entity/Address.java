package org.jsp.linkdinlite.entity;

import org.jsp.linkdinlite.util.AddressStatus;
import org.jsp.linkdinlite.util.AddressType;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String email;
	private String AddressLine1;
	private String AddressLine2;
	private String city;
	private String state;
	private String country;
	private double salary;
	private int pin;
	@Enumerated(EnumType.STRING)
	private AddressStatus status=AddressStatus.ACTIVE;
	@Enumerated(EnumType.STRING)
	private AddressType type;
	@ManyToOne
	private Employee employee;
	
}
