package org.jsp.linkdinlite.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.jsp.linkdinlite.Experience;
//import org.jsp.linkdinlite.util.AddressStatus;
//import org.jsp.linkdinlite.util.AddressType;
import org.jsp.linkdinlite.util.EmployeeStatus;

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
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String lastName;
	@CreationTimestamp
	private String dateOfjoin;
	private String email;
	private long phone;
	private String password;
	private double salary;
	private int pin;
	@Enumerated(EnumType.STRING)
	private Experience experience=Experience.FRESHER;
	@Enumerated(EnumType.STRING)
	private EmployeeStatus status = EmployeeStatus.ACTIVE;
	@ManyToOne
	private Employee employee;
}
