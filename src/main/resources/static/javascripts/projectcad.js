/*
############################################################
######Dados de Javascript do sistema Projectcad
######Autor: Bruno Costa
######Data: 30/12/2017
############################################################
*/


function scanData() {
	inputDataInicio = document.getElementById("dinicio").value;
	inputDataFim    = document.getElementById("dfim").value;
	
	
	if (inputDataInicio != '' && inputDataFim != ''){
		
	dataHoraInicio = new Date(inputDataInicio.split('-').join('/'));
	dataHoraFim = new Date(inputDataFim.split('-').join('/'));
	
	var diferenca = Math.abs(dataHoraInicio - dataHoraFim); //diferença em milésimos e positivo
	var dia = 1000*60*60*24; // milésimos de segundo correspondente a um dia
	var total = Math.round(diferenca/dia); //valor total de dias arredondado 
	var emHoras = Math.round(total*24); // valor total em Horas
	
	if (inputDataInicio > inputDataFim) {
	document.getElementById('duracao').value = '-' + emHoras;
	}else{document.getElementById('duracao').value = emHoras;}
	}
}