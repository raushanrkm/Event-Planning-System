use rays;

INSERT INTO `address` (`id`,`city`,`state`,`street`,`zip`) VALUES (1,'Fairfield','IOWA','1000 n 4th Street','52557');
INSERT INTO `address` (`id`,`city`,`state`,`street`,`zip`) VALUES (2,'Dhuram','NC','2000 S 3rd Street','27757');
INSERT INTO `facility` (`id`,`description`,`name`) VALUES (1,'Projector','Mitsubishi');


INSERT INTO `schedule` (`id`,`date`) VALUES (1,'1985-02-03 00:00:00');


INSERT INTO `rays`.`venue` (`id`, `name`, `address_id`, `schedule_id`) VALUES ('1', 'R0', '1', '1');


INSERT INTO `rays`.`hall` (`id`, `capacity`, `cost`, `hallname`, `venue_id`) VALUES ('1', '456', '23', 'Dalby', '1');
INSERT INTO `rays`.`hall` (`id`, `capacity`, `cost`, `hallname`, `venue_id`) VALUES ('2', '38476', '283', 'Festival', '1');




INSERT INTO `rays`.`customer` (`id`, `name`, `username`, `address_id`) VALUES ('1', 'Ashutosh', 'admin', '1');
INSERT INTO `rays`.`customer` (`id`, `name`, `username`, `address_id`) VALUES ('2', 'Samikshya', 'guest', '1');
