package com.jpa.modal;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "map_Student",uniqueConstraints = @UniqueConstraint(columnNames = "Student MailId"))
public class Student 
{
	@Id
	@SequenceGenerator(name = "Student_Sequence",sequenceName = "id_Sequence",allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "Student_Sequence")
	@Column(name = "Student Id")
	private int stId;
	
	@Column(name = "First Name",nullable = false)
	private String faName;
	
	@Column(name = "Last name",nullable = false)
	private String laName;
	
	@Column(name = "Student MailId",nullable = false)
	private String stMail;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId")
	private List<Address> address = new ArrayList<>();
		
}
