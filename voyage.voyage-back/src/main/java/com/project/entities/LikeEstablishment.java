package com.project.entities;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="t_like_establishment", uniqueConstraints = @UniqueConstraint(columnNames = { "id",
"id" }))
public class LikeEstablishment extends AbstractEntityId{
	
	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
    @JoinColumn(nullable = false, name="account_id")
    private Account likerId;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@Fetch(FetchMode.JOIN)
    @JoinColumn(nullable = false, name="establishment_id")
    private Establishment establishmentId;
	
	public LikeEstablishment() {
		
	} 

	public Account getLikerId() {
		return likerId;
	}

	public void setLikerId(Account likerId) {
		this.likerId = likerId;
	}

	public Establishment getEstablishmentId() {
		return establishmentId;
	}

	public void setEstablishmentId(Establishment establishmentId) {
		this.establishmentId = establishmentId;
	}

	@Override
    public int hashCode() {
	return Objects.hash(likerId, establishmentId);
    }


	@Override
    public boolean equals(Object obj) {
	if (this == obj) {
	    return true;
	}
	if (!(obj instanceof LikeEstablishment)) {
	    return false;
	}
	LikeEstablishment other = (LikeEstablishment) obj;
	return likerId.equals(other.likerId) && establishmentId.equals(other.establishmentId);
    }
	
	

}

