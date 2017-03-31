package com.meeting.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meeting.entity.Customer;
import com.meeting.entity.Schedule;
@Repository
public interface ScheduleRepository extends CrudRepository<Schedule,Long>{
	
	
}
