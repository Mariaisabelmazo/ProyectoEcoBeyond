<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>Publicar</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="Imagenes/nat.png">
        <section class="hero">
        <div class="container"> 
            <nav class="nav2">
                <img class = "logo" src="Imagenes/logotipo2.png" alt="" width="250" height="100">
                </nav>
        </div>
         <div class="hero__wave"; style="overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: rgba(167, 224, 97, 0.842);"></path></svg></div>
         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->
    </section>
        <br>
        <br>
        <section class="seccion-perfil-usuario">
        <div class="perfil-usuario-body">
            <div class="perfil-usuario-bio">
                <h3 class="titulo">¿Que quieres publicar hoy?</h3> 
                <br>
                <input type="text" placeholder="Describelo...">
                <br>
            </div>
            <input  type="button" value="Publicar" class="btn btn-primary" id="boton2"/>
        </div>
        </section>
    </body>
</html>
