/**
 * 
 */

$(document).ready(function() {

	var disabledDays = [];
	var contextroot = "/" + window.location.pathname.split('/')[1];

	$.ajax({
		url : contextroot + "/ScheduleDatesAvailable",
		type : "get",
		dataType : "json",
		success : function(datas) {

			$.each(datas, function(i, single) {
				console.log(single);
				console.log(typeof single);
				disabledDays.push(single);

			});

		},
		error : function(textStatus, errorThrown) {
			aler("web site is not loaded well try again");

		}

	}).done(function() {

		var minDate=new Date();
		var tomorrow=new Date();
		tomorrow.setDate(minDate.getDate()+1);
		 $("#datepicker").datepicker({
			    minDate: tomorrow,
			    
			    beforeShowDay: function (date) {
			      var day = date.getDay();
			      var string = jQuery.datepicker.formatDate('dd-mm-yy', date);
			      var isDisabled = ($.inArray(string, disabledDays) != -1);
			      //day != 0 disables all Sundays
			      return [ !isDisabled];
			    }
			  });
	});

});