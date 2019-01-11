package org.sid.dao;

import org.sid.entites.Hopital;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

//@Repository("hopitalRepository")
public interface HopitalRepository extends JpaRepository<Hopital, Long> {
	// @Query("select c from Hopital c where c.nom like :x")
	//public Page<Hopital> chercher(@Param("x")String mc,Pageable pageable );
	
  @Query("select h from Hopital h where h.adresse like :x")
	public Page<Hopital> chercher(@Param("x")String mc,Pageable pageable);

}
