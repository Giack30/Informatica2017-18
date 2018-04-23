/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
let cognome, nome ,matricola ,regione ,email ,telefono;
function doAction(){
	checkCorrect();
}

function checkCorrect(){
	cognome=document.getElementById('cognome').value; //controllo se campo cognonome non è vuoto
	let boolC = cognome.toString().charAt(0)!=='';
	alert("Cognome "+boolC);
	
	nome=document.getElementById('nome').value; //controllo se campo nome non è vuoto
	let boolN = nome.toString().charAt(0)!=='';
	alert("Nome "+boolN);
	
	matricola=document.getElementById('matricola').value; //controllo se campo matricola è un numero e non vuoto
	let boolM;
	if(!isNaN(+matricola) && matricola.toString().charAt(0)!=='') boolM=true;
	else boolM=false;

	alert("matricola "+boolM);
	
	telefono=document.getElementById('telefono').value;
	let boolT;	//controllo se campo telefono non è vuoto ed è composto solo da numeri
	if(!isNaN(+telefono) && telefono.toString().charAt(0)!=='') boolT=true;
	else boolT=false;
	
	alert("telefono "+boolT);
	
	email=document.getElementById('email').value; //controllo se campo email non è vuoto
	let containsChio=false; //mail deve per forza avere una chiocciola
	let charChio='@';
	for(let i=0;i<email.length;i++){
		if(email.toString().charAt(i)===charChio) containsChio=true;
	}
	let boolE = email.toString().charAt(0)!=='' && containsChio; //se non è vuota e contiene chiocciola
	alert("email "+boolE);
}
