package com.CurdOperation.TARoadlinesCrudOperation.Transport;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TransportRepository extends JpaRepository<Transport,Long> {
	public List<Transport>findByTransportName(String TransportName);
	
	public List<Transport>findByVehicalNum(String VehicalNum);

}
