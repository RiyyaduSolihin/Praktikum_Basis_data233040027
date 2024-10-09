CREATE TABLE Mahasiswa (
ID PRIMARY KEY NOT NULL,
NIM INT NOT NULL,
Nama VARCHAR(30),
Jurusan VARCHAR(20),
Tanggallahir DATE NOT NULL
);

INSERT INTO Mahasiswa (ID, NIM, Nama, Jurusan, Tanggallahir)
VAlUES 
(1, 233040027, 'Budi Santoso' , 'Teknik Informatika', '2000-02-15')
(2, 233040027, 'Riyyadu Solihin' , 'Teknik Informatika', '2004-11-11'),
(3, 233040025, 'Riki RIKANDI' , 'Teknik Informatika', '2002-02-15'),
(4, 203040190, 'Budi Sadui' , 'Teknik Informatika', '2005-02-15'),
(5, 203040180, 'Budi Sutosa' , 'Teknik Informatika', '2001-02-15'),
(6, 203040160, 'jaya santosa' , 'Teknik Informatika', '2007-02-15');
