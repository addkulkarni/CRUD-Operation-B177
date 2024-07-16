package com.DeleteData.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Data
@Entity
public class Student {
	
	@Id
	private int sid;
	private String sname;
	private String smobno;
	

}
