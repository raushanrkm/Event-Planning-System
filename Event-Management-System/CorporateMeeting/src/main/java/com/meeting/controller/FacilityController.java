package com.meeting.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.meeting.entity.Reservation;

@Controller
public class FacilityController {
	@RequestMapping(value = "/addFacility", method = RequestMethod.POST)
	public String addReservation(@Valid @ModelAttribute("newReservation") Reservation reservation,
			BindingResult result,RedirectAttributes redirectAttribute) {

		redirectAttribute.addFlashAttribute(reservation);
		return "redirect:/addFacility";
	}
	
	@RequestMapping(value = "/addFacility", method = RequestMethod.GET)
	public String getReservation() {
		return "ViewFacility";
	}
}
