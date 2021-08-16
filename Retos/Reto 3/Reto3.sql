--1
SELECT l.Documento_Identidad, l.Nombre ,l.Primer_Apellido, l.Ciudad_Residencia 
FROM Proyecto p JOIN Lider l ON p.ID_Lider = l.ID_Lider 
GROUP BY l.Documento_Identidad 
ORDER BY l.ID_Lider
LIMIT 100
;

--2
SELECT mc.Nombre_Material, mc.Precio_Unidad, p.ID_Proyecto FROM Proyecto p
JOIN Compra c ON p.ID_Proyecto =c.ID_Proyecto 
JOIN MaterialConstruccion mc ON c.ID_MaterialConstruccion = mc.ID_MaterialConstruccion
WHERE p.Ciudad = "Ibague" AND mc.Importado ="Si"
LIMIT 100; 

--3
SELECT c.Proveedor, COUNT(c.Cantidad) AS "Ventas" 
FROM Compra c
GROUP BY c.Proveedor 
ORDER BY "Ventas" DESC
LIMIT 100;
--NOTESE COMO EN EL ENUNCIADO SE BUSCA LA CANTIDAD DE VENTAS, NO LA SUMA DE ELLAS
--Tambien el uso de WHERE CON GROUP BY ES POSIBLE

--4
SELECT p.ID_Proyecto, p.Numero_Habitaciones, t.Estrato  FROM Proyecto p 
JOIN Tipo t ON p.ID_Tipo = t.ID_Tipo 
GROUP BY p.ID_Proyecto 
HAVING p.Numero_Habitaciones< "3"
LIMIT 100;

--5
SELECT p.Constructora, SUM(l.Salario) AS "Costo de líderes" FROM Proyecto p 
JOIN Lider l ON p.ID_Lider = l.ID_Lider 
GROUP BY p.Constructora
HAVING "Costo de líderes"> 40000000
LIMIT 100;