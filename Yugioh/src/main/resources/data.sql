INSERT INTO card_monstro (nome,tipo_card,descricao,atributo,nivel,ataque,defesa,tipo_monstro)
VALUES
	('Dragão branco de olhos azuis','MONSTRO','Este dragão lendário é uma poderosa máquina de destruição. Praticamente invencível, muito poucos enfrentaram esta magnífica criatura e viveram para contar a história.','Luz','8', 3000, 2500, 'NORMAL');
	
INSERT INTO card_armadilha (nome, tipo_card, descricao, tipo_armadilha)
VALUES
	('Providência definitiva','ARMADILHA','Quando um Card de Magia/Armadilha, ou efeito de monstro, for ativado: descarte o mesmo tipo de card (Monstro, Magia ou Armadilha); negue a ativação e, se isso acontecer, destrua esse card.','ANULACAO');
	
INSERT INTO card_magia (nome, tipo_card, descricao, tipo_magia)
VALUES
	('Reviver monstro', 'MAGIA', 'Escolha 1 monstro em qualquer Cemitério; Invoque-o por Invocação-Especial.', 'NORMAL');	
