package com.example.demo.dtos;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @NoArgsConstructor @AllArgsConstructor
public class ClubDto {
	private String idMongo;
	private int id;
	public String pays;
	public String departement;
	public String club;
	public String responsable;
	public String telephone;
	public String mel;
	private PaysDto Pays2;
	private DepartementDto departement2;
	public String site;
	public String description;
	public String ville;
	public String cP;
	public String adresse;
	public String gcoo1;
	public String gcoo2;
	public String gaddress;
	public Boolean valide;
}
