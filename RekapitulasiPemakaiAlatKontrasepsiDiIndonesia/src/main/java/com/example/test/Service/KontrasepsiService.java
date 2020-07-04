package com.example.test.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Entity.Kontrasepsi;
import com.example.test.Repository.KontrasepsiRepository;

@Service
@Transactional
public class KontrasepsiService {
	
	@Autowired
	private KontrasepsiRepository repo;
	
	public List<Kontrasepsi> listAll(){
		return repo.findAll();
	}
	
	public void save(Kontrasepsi kontrasepsi) {
		repo.save(kontrasepsi);
	}
	
	public Kontrasepsi get(int id) {
		return repo.findById(id).get();
	}
	
	public void delete(int id) {
		repo.deleteById(id);
	}

}
