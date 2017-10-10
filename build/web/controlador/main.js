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
});

function validacion() {
  apellido = document.getElementById("apellidos")  
    
  if (apellidos == null || apellidos.length == 0 || /^\s+$/.test(apellidos)) {
    // Si no se cumple la condicion...
    alert('[ERROR] El campo debe tener un valor de...');
    return false;
  }  
 
  // Si el script ha llegado a este punto, todas las condiciones
  // se han cumplido, por lo que se devuelve el valor true
  return true;
}