package com.fundatec.lp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import com.fundatec.lp3.enums.TipoCard;
import com.fundatec.lp3.enums.TipoMagia;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Entity(name = "CARD_MAGIA")
@EqualsAndHashCode(callSuper = false)
@Data
@NoArgsConstructor
public class CardMagia extends Card {
	
	@Column
	@Enumerated(EnumType.STRING)
	private TipoMagia tipoMagia;

	public CardMagia(Integer id, String nome, TipoCard tipoCard, String descricao, TipoMagia tipoMagia) {
		super(id, nome, tipoCard, descricao);
		this.tipoMagia = tipoMagia;
		
	}

}
