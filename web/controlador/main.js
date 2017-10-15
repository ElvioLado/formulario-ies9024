$(document).ready(function(){

    $('ul.tabs li a:first').addClass('active');
    $('.secciones article').hide();
    $('.secciones article:first').show();
    $('ul.tabs li a').click(
    function(){
    $('ul.tabs li a').removeClass('active');
    $(this).addClass('active');
    $('.secciones article').hide();
    var  activeTab = $(this).attr('href');
    $(activeTab).show();
    return false;
    });
});

function validacion() {
    /*
    if(document.getElementsByName("tipo")[0].checked){
        tipodoc =document.getElementsByName("tipo")[0].value;
    }

    if(document.getElementsByName("tipo")[1].checked){
        tipodoc =document.getElementsByName("tipo")[1].value;
    }

    if(document.getElementsByName("tipo")[2].checked){
        tipodoc =document.getElementsByName("tipo")[2].value;
    }

    if(document.getElementsByName("tipo")[3].checked){
        tipodoc =document.getElementsByName("tipo")[3].value;
    }*/
    apellido = document.getElementById("apellidos").value;
    nombre = document.getElementById("nombres").value;
    tipodoc = document.querySelector("input[name='tipo']:checked").value;
    numdni = document.getElementById("numdni").value;
    provincia = document.getElementById("provincia").value;
    departamento = document.getElementById("departamento").value;
    nacionalidad = document.getElementById("nacionalidad").value;
    nacimiento = document.getElementById("nacimiento").value;
    

    if(apellido == null || apellido.length == 0 || /^\s+$/.test(apellido)) {
        // Si no se cumple la condicion...
        alert('El campo Apellido esta vacio');
        return false;
    }else if (nombre == null || nombre.length == 0 || /^\s+$/.test(nombre)) {
        // Si no se cumple la condicion...
        alert('El campo Nombre esta vacio');
        return false;
    }else if ( numdni== null || numdni.length == 0 || /^\s+$/.test(numdni)) {
        // Si no se cumple la condicion...
        alert('[El campo Numero DNI esta vacio');
        return false;
    }else if ( provincia== null || provincia.length == 0 || /^\s+$/.test(provincia)) {
        // Si no se cumple la condicion...
        alert('El campo Provincia esta vacio');
        return false;
    }else if ( departamento== null || departamento.length == 0 || /^\s+$/.test(departamento)) {
        // Si no se cumple la condicion...
        alert('El campo Departamento esta vacio');
        return false;
    }else if ( nacionalidad== null || nacionalidad.length == 0 || /^\s+$/.test(nacionalidad)) {
        // Si no se cumple la condicion...
        alert('El campo Nacionalidad esta vacio');
        return false;
    }else if ( nacimiento== null || nacimiento.length == 0 || /^\s+$/.test(nacimiento)) {
        // Si no se cumple la condicion...
        alert('El campo Nacimiento esta vacio');
        return false;
    }
 
    // Si el script ha llegado a este punto, todas las condiciones
    // se han cumplido, por lo que se devuelve el valor true
    return true;
}



function efecto(){
    $('#fotocargando').hide();
    $('#contenidoWeb').fadeIn(500);

}

function estaVacio(campo) {
  var campo = document.getElementById(campo).value;
  if(campo == null || campo.length == 0 || /^\s+$/.test(campo)) {
     // Si no se cumple la condicion...
     return true;
  }else {
     return false;
  }
}
