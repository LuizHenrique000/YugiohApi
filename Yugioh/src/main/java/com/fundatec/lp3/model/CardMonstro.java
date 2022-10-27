package com.fundatec.lp3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import com.fundatec.lp3.enums.TipoCard;
import com.fundatec.lp3.enums.TipoMonstro;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity(name = "CARD_MONSTRO")
@EqualsAndHashCode(callSuper = false)
@Data
public class CardMonstro extends Card{
	
	@Column
	private String atributo;
	
	@Column
	private String nivel;
	
	@Column
	private Integer ataque;
	
	@Column
	private Integer defesa;
	
	@Column
	@Enumerated(EnumType.STRING)
	private TipoMonstro tipoMonstro;
	
    public CardMonstro() {
		super();
	}

	public CardMonstro(Integer id, String nome, TipoCard tipoCard, String descricao, String atributo, String nivel, Integer ataque, Integer defesa) {
		super(id, nome, tipoCard, descricao);
		this.atributo = atributo;
		this.nivel = nivel;
		this.ataque = ataque;
		this.defesa = defesa;
	}

}
