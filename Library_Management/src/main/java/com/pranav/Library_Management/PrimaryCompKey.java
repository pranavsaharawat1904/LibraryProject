package com.pranav.Library_Management;

import java.io.Serializable;

import javax.persistence.IdClass;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class PrimaryCompKey implements Serializable {
	
	private int id;
	private String name;

}
