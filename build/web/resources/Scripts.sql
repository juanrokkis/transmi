--Para agregar un usuario nuevo:
INSERT INTO Usuarios (Nombre, Apellido, Tarjeta_ID)
VALUES ('NombreUsuario', 'ApellidoUsuario', 'ID_Tarjeta');

--Para recargar saldo en una tarjeta existente:
UPDATE Tarjetas
SET Saldo = Saldo + MontoRecarga
WHERE ID_Tarjeta = 'ID_Tarjeta';

--Para realizar un viaje y deducir el saldo de la tarjeta:
INSERT INTO Viajes (Ruta_ID, Tarjeta_ID, Fecha)
VALUES ('ID_Ruta', 'ID_Tarjeta', 'FechaViaje');

UPDATE Tarjetas
SET Saldo = Saldo - MontoViaje
WHERE ID_Tarjeta = 'ID_Tarjeta';

--Para obtener los viajes de un usuario en particular:
SELECT V.ID_Viaje, R.Nombre, R.Descripción, V.Fecha
FROM Viajes V
JOIN Rutas R ON V.Ruta_ID = R.ID_Ruta
WHERE V.Tarjeta_ID = 'ID_Tarjeta';
