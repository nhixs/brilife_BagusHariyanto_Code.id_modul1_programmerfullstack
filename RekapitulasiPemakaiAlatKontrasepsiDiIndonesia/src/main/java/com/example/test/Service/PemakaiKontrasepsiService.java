package com.example.test.Service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.Entity.Kontrasepsi;
import com.example.test.Entity.PemakaiKontrasepsi;
import com.example.test.Repository.PemakaiKontrasepsiRepository;

@Service
@Transactional
public class PemakaiKontrasepsiService {
	
	@Autowired
	private PemakaiKontrasepsiRepository repo;
	
	public List<PemakaiKontrasepsi> listAll(){
		return repo.findAll();
	}
	
	public void save(PemakaiKontrasepsi pemakaiKontrasepsi) {
		repo.save(pemakaiKontrasepsi);
	}

}
