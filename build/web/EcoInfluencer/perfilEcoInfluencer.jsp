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

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="../Imagenes/hojita.png"/>
        <title>EcoBeyond</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <link href="../CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/338c5c72af.js" crossorigin="anonymous"></script>
    </head>
    <body background="../Imagenes/nat.png">
    <section class="perfil-usuario">
        <div class="contenedor-perfil">
            <div class="portada-perfil" style="background-image: url(https://www.teahub.io/photos/full/167-1676088_fondos-de-naturaleza-verde.jpg)">
                <div class="avatar-perfil">
                    <img src="https://png.pngtree.com/illustration/20190226/ourlarge/pngtree-girl-animal-human-and-nature-summer-image_4705.jpg" alt="img">
                </div>
                <div class="datos-perfil">
                    <h4 class="titulo-usuario"><%= sesion.getAttribute("nombre")%></h4>
                    <p class="bio-usuario">
                        Lorem ipsum dolor sit amet, consectetur adipisicing elit repellendus ex culpa natus temporibus.
                    </p>
                    <ul class="lista-perfil">
                        <li>3 Seguidores</li>
                        <li>8 Publicaciones</li>
                        <li>3 Recomendados</li>
                    </ul>
                </div>
                <div class="opciones-perfil">
                    <a href="editar.jsp"><button href="" type="">Editar Perfil</button></a>
                    <a href="configuracion.jsp"><button type="">Configuración</button></a>
                </div>
            </div>
        </div>
        <div class="menu-perfil">
            <ul>
                <li><a href="inicio.jsp" title="">Inicio</a></li>
                <li><a href="publicaciones.jsp" title="">Publicaciones</a></li>
                <li><a href="seguidores.jsp" title="">Seguidores</a></li>
                <li><a href="recomendados.jsp" title="">Recomendados</a></li>
                <li><a href="publicar.jsp" title="">Publicar</a></li>
            </ul>
        </div>
    </section>
        <br/>
        <br/>
    <section class="seccion-perfil-usuario">
        <div class="perfil-usuario-body">
            <div class="perfil-usuario-footer">
                <ul class="lista-datos">
                    <h3 class="titulo"> Detalles Personales </h3>
                    <p></p>
                    <li><i class="icono fas fa-briefcase"> Trabaja en.</i></li>
                    <li><i class="icono fas fa-map-marker-alt"> Ubicacion.</i></li>
                    <li><i class="icono fas fa-calendar-alt"> Fecha nacimiento.</i></li>
                    <li><i class="icono fas fa-share-alt"> Redes sociales.</i></li>
                    <br>
                    <br>
                </ul>
            </div>
        </div>
    </section>
</body>
</html>