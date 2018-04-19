package com.reservation.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.reservation.dto.RoomSearch;

@Named
@ManagedBean
@Scope("session")
public class SearchRoom {

	@Inject
	private RoomSearch room;

	public String execute() {
		if (room != null && room.getName().equalsIgnoreCase("123")) {
			return "search";
		} else {

			return "noresults";
		}
	}

	public RoomSearch getRoom() {
		return room;
	}

	public void setRoom(RoomSearch room) {
		this.room = room;
	}
}
