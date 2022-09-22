package com.ws.perchas.quiebre.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ws.perchas.quiebre.stock.models.quiebreEc.QsFechaTarea;

@Repository
public interface QsFechaTareaRepo extends JpaRepository<QsFechaTarea, Integer>{

}
