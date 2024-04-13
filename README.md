# ClaseS51
Proyecto en Android Studio que contiene ejemplos relacionados al contenido visto en clases

## En que consiste el ejemplo?
El ejemplo consta de varios elementos posicionados en dos Layout, con el siguiente hilo
* Se vinculan dos elementos del primer layout, un EditText del que se obtiene su texto, y un Button al cual se le asocia un listener para el evento OnClick
* En este evento OnClick se define un Intent a la segunda actividad
* Al Intent se le agrega como parametro el valor obtenido desde el EditText
* En la segunda actividad, se recupera el valor obtenido
* En caso de ser un valor vacio, se le asigna un valor en particular
* Se muestra el valor asociandolo al TextView existente en la segunda actividad
* Ademas, se implementa un listener para el evento OnClick en la segunda actividad que retorna a la primera actividad
* Por ultimo, en la primer actividad se hace un override del metodo onResume el cual limpia el texto escrito enviado hacia la segunda actividad

Recuerde que la practica de estos elementos es fundamental.
