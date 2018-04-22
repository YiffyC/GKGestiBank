package com.wha.springmvc.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

// SAD = "sans autorisation de découvert" 
@Entity
@DiscriminatorValue("comptecourantSAD")
public class CompteCourantSAD extends CompteBanquaire {

	public CompteCourantSAD() {
		super();
	}

}
