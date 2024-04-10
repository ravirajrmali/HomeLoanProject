package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class DocumentUpload {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int docId;

	@Lob
	@Column(length = 999999999)
	private byte[] aadharCard;
	@Lob
	@Column(length = 999999999)
	private byte[] panCard;
	@Lob
	@Column(length = 999999999)
	private byte[] profImage;
	@Lob
	@Column(length = 999999999)
	private byte[] sign;
}
