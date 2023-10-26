<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<%
    HttpSession sesion = request.getSession();
    if(sesion.getAttribute("cargo") == null){
        response.sendRedirect("../login.jsp");
    }else{
        String cargo = sesion.getAttribute("cargo").toString();
        if(!cargo.equals("2")){
            response.sendRedirect("../login.jsp");
        }
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="Imagenes/hojita.png"/>
        <title>Perfil</title>
        <link href="CSS/estilos.css" rel="stylesheet" type="text/css"/>
        <script src="https://kit.fontawesome.com/338c5c72af.js" crossorigin="anonymous"></script>
    </head>
    <body background="Imagenes/nat.png">
    <section class="perfil-usuario">
        <div class="contenedor-perfil">
            <div class="portada-perfil" style="background-image: url(https://www.teahub.io/photos/full/167-1676088_fondos-de-naturaleza-verde.jpg)">
                <div class="avatar-perfil">
                    <img src="https://png.pngtree.com/element_our/20190530/ourlarge/pngtree-520-couple-avatar-boy-avatar-little-dinosaur-cartoon-cute-image_1263411.jpg" alt="img">
                </div>
                <div class="datos-perfil">
                    <h4 class="titulo-usuario"><%= sesion.getAttribute("nombre")%></h4>
                    <p class="bio-usuario">
                        Lorem ipsum dolor sit amet consectetur adipisicing elit. Reiciendis eveniet facere cumque nesciunt dicta placea similique pariatur!
                    </p>
                    <ul class="lista-perfil">
                        <li>2 Seguidos</li>
                        <li>4 Recomendaciones</li>
                    </ul>
                </div>
                <div class="opciones-perfil">
                    <a href="editar2.jsp"><button href="" type="">Editar Perfil</button></a>
                    <a href="configuracion.jsp"><button type="">Configuración</button></a>
                </div>
            </div>
        </div>
        <div class="menu-perfil">
            <ul>
                <li><a href="inicio2.jsp" title="">Inicio</a></li>
                <li><a href="recomendaciones.jsp" title="">Recomendaciones</a></li>
                <li><a href="seguidos.jsp" title="">Seguidos</a></li>
            </ul>
        </div>
    </section>
    <section class="seccion-perfil-usuario">
        <div class="perfil-usuario-body">
            <br>
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
                </ul>
            </div>
        </div>
    </section>
</body>
</html>
