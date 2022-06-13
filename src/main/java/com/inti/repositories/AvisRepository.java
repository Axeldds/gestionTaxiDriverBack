package com.inti.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.inti.entities.Avis;

@Repository
public interface AvisRepository extends JpaRepository<Avis, Long>{
	@Query(value="SELECT * FROM avis ORDER BY note DESC",nativeQuery = true)
	List<Avis> findByNote(float note);
	
	
}
