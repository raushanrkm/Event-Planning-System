package com.meeting.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meeting.entity.Hall;
@Repository
public interface HallRepository extends CrudRepository<Hall, Long>{

}
