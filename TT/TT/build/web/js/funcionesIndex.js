/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function cargarElementoDinamicamente(url, elemento){
    var request = new XMLHttpRequest();
    request.open("GET", url, false);
    request.send(null);
    elemento.innerHTML = request.responseText;
}

function cargarFuncionesMonitoreo(){
    cargarElementoDinamicamente("funcionesMonitoreo.jsp", document.getElementById("contenidoDinamico"));
    
}