package com.inti.service.interfaces;

import java.util.List;
import com.inti.entities.Annonce;

public interface IAnnonceService {
	List<Annonce> findAll();

	Annonce findOne(Long id);

	Annonce save(Annonce annonce);

	void delete(Long id);

}
