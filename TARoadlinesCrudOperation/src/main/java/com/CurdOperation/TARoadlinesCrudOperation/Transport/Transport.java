package com.CurdOperation.TARoadlinesCrudOperation.Transport;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "transport_tabel")
public class Transport {
	@Id
	private Long id;
	private String TransportName;
	private String VehicalNum;
	private String Destination;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTransportName() {
		return TransportName;
	}
	public void setTransportName(String transportName) {
		TransportName = transportName;
	}
	public String getVehicalNum() {
		return VehicalNum;
	}
	public void setVehicalNum(String vehicalNum) {
		VehicalNum = vehicalNum;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
	

}
