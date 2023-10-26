<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cargo") == null){
        response.sendRedirect("login.jsp");
    }else{
        String cargo = sesion.getAttribute("cargo").toString();
        if(!cargo.equals("2")){
            response.sendRedirect("login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>Recomendaciones</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body background="Imagenes/nat.png">
    <section class="hero">
        <div class="container"> 
            <nav class="nav2">
                <img class = "logo" src="Imagenes/logotipo2.png" alt="" width="250" height="100">
                <h3 class="nav__items"><%= sesion.getAttribute("nombre")%></h3>
                <img class = "avatar" src="Imagenes/usuario2.jpg" alt="">
            </div>
            </nav>
        </div>
         <div class="hero__wave"; style="overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: rgba(167, 224, 97, 0.842);"></path></svg></div>
         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->
    </section>
    <section class="header2">
        <div class="menu-perfil">
                <a href="perfilEcoTurista.jsp" title="">Perfil</a>
                <a href="seguidos.jsp" title="">Seguidos</a>
                <a href="configuracion.jsp" title="">Configuración</a>
                <a href="#" title="">Agregar Recomendación</a>
        </div>
    </section>
    <section class="seguidores">
        <div class="seg">
            <div class="seguidor">
                <img src="Imagenes/usuario2.jpg" alt="">
                <div class="contenido-texto-card">
                    <h4>Nombre Usuario</h4>
                    <p>Hola!, te recomiendo ir al Jardín Botánico es una zona verde bastante grande situada en la ciudad de Medellín :D</p>
                    <h5>Para: @Susana</h5>
                </div>
            </div>
            <div class="seguidor">
                <img src="Imagenes/usuario2.jpg" alt="">
                <div class="contenido-texto-card">
                    <h4>Nombre Usuario</h4>
                    <p>Oye te recomiendo ir al Parque de los pies descalzos, tuve una gran experiencia alla ya que es diferente a lo que se ve normalmente :3</p>
                    <h5>Para: @Marian_123</h5>
                </div>
            </div>
            <div class="seguidor">
                <img src="Imagenes/usuario2.jpg" alt="">
                <div class="contenido-texto-card">
                    <h4>Nombre Usuario</h4>
                    <p>La Plaza Botero, alla podrás encontrar Arte y Cultura en un mismo lugar muy resaltante en medellín uwu.</p>
                    <h5>Para: @Yuyu_2001</h5>
                </div>
            </div>
            <div class="seguidor">
                <img src="Imagenes/usuario2.jpg" alt="">
                <div class="contenido-texto-card">
                    <h4>Nombre Usuario</h4>
                    <p>Me gustaría que comentarás sobre El Parque Temático Hacienda Napoles, esta situado en la Republica de Colombia y me dicen que es super!</p>
                    <h5>Para: @Sam091</h5>
                </div>
            </div>
        </div>
</body>
</html>