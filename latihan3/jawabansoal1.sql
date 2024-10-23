CREATE TABLE jurusan (
id  INT PRIMARY KEY,
nama_jurusasan VARCHAR(100));

CREATE TABLE  Mahasiswa (
ID INT PRIMARY KEY,
NPM INT,
nama VARCHAR(100),
tanggal_lahir DATE,
alamat VARCHAR(100),
no_hp INT,
jurusan_id INT,
dosen_wali_id INT,
FOREIGN KEY (jurusan_id) REFERENCES jurusan (id));

