
//da update na coluna cpf
//concatenando os . e o - no local correto
//onde o tamanho do cpf for 11
//cpf com os . e - fica com 14 de tamanho, entao da pra saber se ta faltando . e - testando se o tamanho
// é menor que 14. Nesse caso fui mais especifico e usei 11 mesmo.
update pessoa set cpf =
	CONCAT( SUBSTRING(cpf,1,3) , '.',
	SUBSTRING(cpf,4,3), '.',
	SUBSTRING(cpf,7,3), '-',
	SUBSTRING(cpf,10,2))
where length(cpf) = 11;