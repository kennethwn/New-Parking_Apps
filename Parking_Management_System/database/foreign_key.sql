ALTER TABLE kendaraan
ADD CONSTRAINT fk_id_membership FOREIGN KEY(id_membership)
REFERENCES membership(id_membership),
ADD CONSTRAINT fk_id_jenis_kendaraan FOREIGN KEY(id_jenis_kendaraan)
REFERENCES jenis_kendaraan(id_jenis_kendaraan);

ALTER TABLE kendaraan_payment
ADD CONSTRAINT fk_id_nopol FOREIGN KEY(nopol)
REFERENCES kendaraan(nopol),
ADD CONSTRAINT fk_id_payment FOREIGN KEY(id_payment)
REFERENCES payment(id_payment),
ADD CONSTRAINT fk_id_status_payment FOREIGN KEY(id_status_payment)
REFERENCES status_payment(id_status_payment);

ALTER TABLE kendaraan
ADD INDEX all_kendaraan_idx(nopol);

ALTER TABLE kendaraan_payment
ADD INDEX all_kendaraan_payment_idx(id_kendaraan_payment,nopol,id_payment,id_status_payment);

SHOW CREATE TABLE kendaraan;
SHOW CREATE TABLE kendaraan_payment;