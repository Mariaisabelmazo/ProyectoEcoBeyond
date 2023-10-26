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
        <link rel="icon" href="../Imagenes/hojita.png"/>
        <title>Home</title>
        <link href="normalice/estiloNormalice.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
    <header class="hero">
        <div class="container"> 
            <nav class="nav">
                <img class = "logo" src="Imagenes/logotipo2.png" alt="" width="250" height="100">
                <h3 class="nav__items"><%= sesion.getAttribute("nombre")%></h3>
                <img class = "avatar" src="Imagenes/User.jpg" alt="">

            </div>
            </nav>
        </div>

         <div class="hero__wave"; style="overflow: hidden;" ><svg viewBox="0 0 500 150" preserveAspectRatio="none" style="height: 100%; width: 100%;"><path d="M-3.38,35.03 C159.14,67.59 305.86,15.28 501.69,39.95 L500.00,150.00 L0.00,150.00 Z" style="stroke: none; fill: white;"></path></svg></div>
         <!--Color: Blonco - class = hero wave - se borra hasta overflow-->
 </header>
 

    <div class="presentacionContainer">
    <main>
        <section class="presentationContainer">
            <div class="cont3">

                <div class="card">
                    <img src="Imagenes/publicacion1.png">
                    <h3>PARQUE ARVI</h3>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit quibusdam quisquam ut autem neque architecto tempore nostrum dolores natus dolore aut iure illum quidem, corporis ea recusandae? Quibusdam, excepturi et?</p>
                </div>

                <div class="card">
                    <img src="Imagenes/publicacion1.png">
                    <h3>PARQUE ARVI</h3>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit quibusdam quisquam ut autem neque architecto tempore nostrum dolores natus dolore aut iure illum quidem, corporis ea recusandae? Quibusdam, excepturi et?</p>
                </div>

                <div class="card">
                    <img src="Imagenes/publicacion1.png">
                    <h3>PARQUE ARVI</h3>
                    <p>Lorem ipsum dolor sit, amet consectetur adipisicing elit. Velit quibusdam quisquam ut autem neque architecto tempore nostrum dolores natus dolore aut iure illum quidem, corporis ea recusandae? Quibusdam, excepturi et?</p>
                </div>
            </div>
        </section>
    </main>
</div>
    

    <script src="https://kit.fontawesome.com/338c5c72af.js" crossorigin="anonymous"></script>
</body>
</html>