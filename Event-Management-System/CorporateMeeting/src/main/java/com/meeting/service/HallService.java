package com.meeting.service;

import java.util.List;

import com.meeting.entity.Hall;
import com.meeting.entity.Schedule;

public interface HallService {
public List<Hall>getAllAvailableHall(Schedule schedule);

public Hall findOne(Long id);




}
