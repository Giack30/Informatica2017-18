/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function rightCap(){
	let Cap=document.getElementById('CAP').value;
	let boolC=Cap.length===5;
	alert(boolC);
}

function rightNamSur(){
	let nameSurn= document.getElementById('nomeCognome').value;
	let boolNS=true;
	for(let i=0;i<nameSurn.length;i++){
		if(!isNaN(nameSurn.toString().charAt(i))){
			alert("trovato numero a pos°"+i+" --> "+nameSurn.toString().charAt(i));
			boolNS=false;
			break;
		
		}
	}
	alert(boolNS);
}

function checkCorrect(){
	let nameSurn= document.getElementById('nomeCognome').value;
	alert("nome " + (!nameSurn.toString().charAt(0)==='')); //se esiste primo carattere stringa non è vuota
	
	let boolSesso= document.getElementById('maschio').checked || document.getElementById('femmina').checked;
	alert("sesso "+boolSesso);
	
	let ateneo=document.getElementById('università').value;
	alert("università " + ateneo);
	
	let descrizione = document.getElementById('descrizione').value;
	if(document.getElementById('studente').checked && document.getElementById('lavoratore').checked && descrizione.toString().charAt(0)===''){
		alert("completare il modulo con descrizione");
	}
}


