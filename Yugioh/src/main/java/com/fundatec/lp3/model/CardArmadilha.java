package com.fundatec.lp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import com.fundatec.lp3.enums.TipoArmadilha;
import com.fundatec.lp3.enums.TipoCard;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "CARD_ARMADILHA")
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
public class CardArmadilha extends Card {

	@Column
	@Enumerated(EnumType.STRING)
	private TipoArmadilha tipoArmadilha;

	public CardArmadilha(Integer id, String nome, TipoCard tipoCard, String descricao, TipoArmadilha tipoArmadilha) {
		super(id, nome, tipoCard, descricao);
		this.tipoArmadilha = tipoArmadilha;

	}

}
