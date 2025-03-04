package org.jsp.linkdinlite.entity;

import org.jsp.linkdinlite.util.EducationStatus;
import org.jsp.linkdinlite.util.HeighestQualification;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
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
public class Education {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String qualification;
	private String universityname;
	private double percentage;
	private int completionyear;
	
	@Enumerated(EnumType.STRING)
	private HeighestQualification heighestqualification= HeighestQualification.YES;
	
	@Enumerated(EnumType.STRING)
	private EducationStatus status= EducationStatus.ACTIVE;
	@ManyToOne
	private Employee employee;
}
