/*
 DELIMITER //
CREATE PROCEDURE SelectAllFromPersona()
BEGIN
    SELECT * FROM persona;
END//
DELIMITER ;
CALL SelectAllFromPersona();

 DELIMITER //
CREATE PROCEDURE SelectPersonaById(IN pId INT)
BEGIN
    SELECT * FROM persona WHERE id = pId;
END//
DELIMITER ;
 CALL SelectPersonaById(1);
 */