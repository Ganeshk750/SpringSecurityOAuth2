package com.ganesh.rentcloud.authorization.server.model;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "permission")
@Data
public class Permission implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 8454440793683278717L;
	
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;

}
