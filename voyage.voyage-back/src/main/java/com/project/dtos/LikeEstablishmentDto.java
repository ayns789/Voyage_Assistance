package com.project.dtos;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class LikeEstablishmentDto {
	
	@JsonIgnore
	private Long likerId;
	
	@NotNull(message = "{E_NOT_NULL}")
	private Long establishmentId;
	

	public LikeEstablishmentDto() {
		
	}
	
	@Override
	public String toString() {
		return "LikeEstablishmentDto [likerId=" + likerId + ", establishmentId=" + establishmentId + "]";
	}

	public Long getLikerId() {
		return likerId;
	}

	public void setLikerId(Long likerId) {
		this.likerId = likerId;
	}

	public Long getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(Long establishmentId) {
		this.establishmentId = establishmentId;
	}

}

