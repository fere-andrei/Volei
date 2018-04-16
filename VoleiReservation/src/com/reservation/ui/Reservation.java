package com.reservation.ui;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

@Named
@ManagedBean
@Scope("session")
public class Reservation implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7188503245779209841L;
	String startList = "123456789";

	public String getStartList() {
		return startList;
	}

	public void setStartList(String startList) {
		this.startList = startList;
	}
}
