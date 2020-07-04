package com.example.test.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Entity.Propinsi;
import com.example.test.Repository.PropinsiRepository;

@Service
@Transactional
public class PropinsiService {
	
	@Autowired
	private PropinsiRepository repo;
	
	// list all propinsi data
	public List<Propinsi> listAll(){
		return repo.findAll();
	}
	
	// save propinsi data
	public void save(Propinsi propinsi) {
		repo.save(propinsi);
	}
	
	//get some id propinsi to modify
	public Propinsi get(int id) {
		return repo.findById(id).get();
	}
	
	// delete propinsi by id
	public void delete(int id) {
		repo.deleteById(id);
	}

}
