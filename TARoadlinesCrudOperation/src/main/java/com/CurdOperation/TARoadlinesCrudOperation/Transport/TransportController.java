package com.CurdOperation.TARoadlinesCrudOperation.Transport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class TransportController {
	@Autowired
	private TransportRepository repo;
	
	@PostMapping("/addTransport")
	public Transport addTransport(@RequestBody Transport transport) {
		return repo.save(transport);
	}
	
	@GetMapping("/getTransportbyid")
	public Transport getTransportByid(@RequestParam Long id) {
		return repo.findById(id).get();
		}
	
	@GetMapping("/getTransportByVehicalNum")
	public List<Transport> getTransportByVehicalNum(@RequestParam String VehicalNum){
		return repo.findByVehicalNum(VehicalNum);
	}
	@GetMapping("/getTransportByTransportName")
	public List<Transport> getTransportByTransportName(@RequestParam String TransportName){
		return repo.findByTransportName(TransportName);
	
}
	
	@GetMapping("/getAllTransport")
	public List<Transport> getAllTransport(){
		return repo.findAll();
}
	
	@PutMapping("/updateBookById")
	public Transport updateTransportById(@RequestBody  Transport transport) {
		return repo.save(transport);
}
	@DeleteMapping("/deleteTransportById")
	public void deleteTransportById(@RequestParam Long id) {
		repo.deleteById(id);
	}
	
	@DeleteMapping("/deleteAllTransport")
	public void deleteAllTransport() {
		repo.deleteAll();
	}
}
