<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>Editar</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/338c5c72af.js" crossorigin="anonymous"></script>
    </head>
    <body background="Imagenes/nat.png">
    <section class="seccion-perfil-usuario">
        <div class="perfil-usuario-header">
            <div class="perfil-usuario-portada">
                <div class="perfil-usuario-avatar">
                    <img src="Imagenes/usuario2.jpg" alt="img"/>
                    <button type="button" class="boton-avatar">
                        <i class="far fa-image"></i>
                    </button>
                </div>
                <div class="Nombre_U">
                    <h3 class="Nom" >Nombre de Usuario</h3>
                </div>
                <button type="button" class="boton-portada">
                    <i class="far fa-image"></i> Cambiar fondo
                </button>
            </div>
        </div>
        <div class="perfil-usuario-body">
            <div class="perfil-usuario-bio">
                <h3 class="titulo">Descripción</h3> 
                <br>
                <input type="text" placeholder="Describete...."> 
                <br>
            </div>
            <div class="perfil-usuario-footer">
                <ul class="lista-datos">
                    <h3 class="titulo"> Detalles Personales </h3>
                    <p></p>
                    <li><i class="icono fas fa-briefcase"></i> Trabaja en.</li>
                    <li><i class="icono fas fa-map-marker-alt"></i> Ubicacion.</li>
                    <li><i class="icono fas fa-calendar-alt"></i> Fecha nacimiento.</li>
                    <li><i class="icono fas fa-share-alt"></i> Redes sociales.</li>
                    <br>
                    <br>
                    <button type="button" class="botonE">Editar</button>
                </ul>
            </div>
            <div class="Bt">
                <br>
                <a href="perfilEcoTurista.jsp"><button type="button" class="botonC">Guardar cambios</button></a>
            </div>
        </div>
    </section>
</body>
</html>