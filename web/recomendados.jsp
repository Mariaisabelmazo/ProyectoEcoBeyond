<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cargo") == null){
        response.sendRedirect("login.jsp");
    }else{
        String cargo = sesion.getAttribute("cargo").toString();
        if(!cargo.equals("1")){
            response.sendRedirect("login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>recomendados</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <section class="hero">
        <div class="container"> 
            <nav class="nav2">
                <img class = "logo" src="Imagenes/logotipo2.png" alt="" width="250" height="100">
                <h3 class="nav__items"><%= sesion.getAttribute("nombre")%></h3>
                <img class = "avatar" src="Imagenes/usuario.jpeg" alt="">
            </div>
            </nav>
        </div>
         <div class="hero__wave"; style="overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: rgba(167, 224, 97, 0.842);"></path></svg></div>
         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->
    </section>
    <section class="header2">
        <div class="menu-perfil">
                <a href="EcoInfluencer/perfilEcoInfluencer.jsp" title="">Perfil</a>
                <a href="publicaciones.jsp" title="">Publicaciones</a>
                <a href="seguidores.jsp" title="">Seguidores</a>
                <a href="configuracion.jsp" title="">Configuración</a>
        </div>
    </section>
    <section class="seguidores">
        <div class="seg">
            <div class="seguidor">
                <img src="Imagenes/recomendador1.png" alt="">
                <div class="contenido-texto-card">
                    <h4>Eco-Turista 1</h4>
                    <p>Hola!, te recomiendo ir a los Tamarindos, es super lindo, sirve para estar en familia ya que es un parque acuatico, te puedes relajar y pasarla super bien</p>
                </div>
            </div>
            <div class="seguidor">
                <img src="Imagenes/recomendador2.jpg" alt="">
                <div class="contenido-texto-card">
                    <h4>Eco-Turista 2</h4>
                    <p>Visita la ostería Rio Escondido, esta hubicada en San Geronimo Antioquia, es un lugar de relajación ya sea en pareja o en familia. Tiene una gran diversidad tanto flora como fauna, es fantastico para etsar lejos de la ciudad y conectarte con la naturaleza</p>
                </div>
            </div>
            <div class="seguidor">
                <img src="Imagenes/recomendador3.jpg" alt="">
                <div class="contenido-texto-card">
                    <h4>Eco-Turista 3</h4>
                    <p>Me encantan tus reseñas, he visitado el Parque Arví y me pareció fenomenal. Te recomiendo ir a visitar Los Termales se encuentran en Nariño Antioquia.</p>
                </div>
            </div>
        </div>
</body>
</html>