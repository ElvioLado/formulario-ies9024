$(document).ready(function(){
    
    $('ul.tabs li a:first').addClass('active');
    $('.secciones article').hide();
    $('.secciones article:first').show();
    $('ul.tabs li a').click(function(){
        $('ul.tabs li a').removeClass('active');
        $(this).addClass('active');
        $('.secciones article').hide();
        var  activeTab = $(this).attr('href');
        $(activeTab).show();
        return false;
    }); 
    function validacion() {
    apellido = document.getElementById("apellidos")  
    nombre = document.getElementById("nombres");
    numdni = document.getElementById("numdni");
    provincia = document.getElementById("provincia");
    departamento = document.getElementById("departamento");
    nacionalidad = document.getElementById("nacionalidad");
    nacimiento = document.getElementById("nacimiento");
    sexo = document.getElementBynames("sexo").values();
    if (apellido == null || apellido.length == 0 || /^\s+$/.test(apellido)) {
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
    }  
 
    // Si el script ha llegado a este punto, todas las condiciones
    // se han cumplido, por lo que se devuelve el valor true
    return true;
}
    
});