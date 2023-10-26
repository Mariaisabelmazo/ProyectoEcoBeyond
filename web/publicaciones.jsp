<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cargo") == null){
        response.sendRedirect("../login.jsp");
    }else{
        String cargo = sesion.getAttribute("cargo").toString();
        if(!cargo.equals("1")){
            response.sendRedirect("../login.jsp");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>Publicaciones</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <section class="hero">
        <div class="container"> 
            <nav class="nav2">
                <img class = "logo" src="Imagenes/logotipo2.png" alt="" width="250" height="100">
                <h3 class="nav__items"><%= sesion.getAttribute("nombre")%></h3>
                <img class ="avatar" src="Imagenes/User.jpg" alt="">
                </nav>
        </div>
         <div class="hero__wave"; style="overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: rgba(167, 224, 97, 0.842);"></path></svg></div>
         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->
    </section>
    <section class="header2">
        <div class="menu-perfil">
                <a href="EcoInfluencer/perfilEcoInfluencer.jsp">Perfil</a>
                <a href="seguidores.jsp" title="">Seguidores</a>
                <a href="recomendados.jsp" title="">Recomendados</a>
                <a href="configuracion.jsp" title="">Configuración</a>
                <a href="publicar.jsp" title="">Publicar</a>
        </div>
    </section>
    <section class="contenedor galeria">
        <div class="item">
            <img src="Imagenes/publicacion1.png" alt="" class="item-img">
            <div class="item-text"></div>
            <h3>Parque Arví</h3>
            <p>El Parque Regional Ecoturístico Arví es un parque natural ecológico localizado en el nororiente de Medellín. Abarca territorios de varios municipios del departamento de Antioquia, Bello, Copacabana, Guarne y Medellín.</p>
        </div>
        <div class="item">
            <img src="Imagenes/publicacion2.png" alt="" class="item-img">
            <div class="item-text"></div>
            <h3>Piedra del Peñol</h3>
            <p>El peñón de Guatapé, o piedra del Peñol, es un monolito de 220 metros de altura, localizado en El Peñol-Guatapé, Antioquia, Colombia.​ </p>
        </div>
        <div class="item">
            <img src="Imagenes/publicacion3.png" alt="" class="item-img">
            <div class="item-text"></div>
            <h3>Parque de los Pies Descalzos</h3>
            <p>El Parque de los Pies Descalzos es un espacio público colombiano de la ciudad de Medellín, creado por las Empresas Públicas de Medellín en la zona administrativa de la ciudad.</p>
        </div>
        <div class="item">
            <img src="Imagenes/publicacion4.png" alt="" class="item-img">
            <div class="item-text"></div>
            <h3>Pueblito Paisa</h3>
            <p>El Pueblito Paisa de Medellín es uno de los sitios turísticos más visitados de la ciudad que combina tres elementos que todos amamos: la tradición antioqueña, gastronomía y arquitectura del lugar; la vista majestuosa de Medellín y las montañas que recorren el Valle de Aburrá.</p>
        </div>
    </section>
</div>
</body>
</html>
