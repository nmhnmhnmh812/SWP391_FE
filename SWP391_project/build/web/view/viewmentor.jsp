
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>6HP - Happy Programing</title>
        <link rel="stylesheet" href="style/viewmentor.css">
        <link rel="icon" type="image/x-icon" href="image/mylogo.png">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
              integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
              integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>

        <!-- header -->
        <%@include file="./header.jsp" %>

        <!-- Outstanding Mentors with techology -->

        <div class="container wrap-outstanding-mentor">
            <div class="part"  data-aos="fade-up" data-aos-duration="1000">
                <h4 style="text-transform: capitalize;">${requestScope.tech} Mentors</h4>
                <div class="line_part"></div>
            </div>

            <div class="list-mentors">
                <div class="row">
                    <c:forEach items="${requestScope.listMentor}" var="m">

                        <div class="col-md-3 col-sm-6 col-xs-12 card-mentor">
                            <div class="items-card-mentor">

                                <c:forEach items="${requestScope.listUser}" var="u">
                                    <c:if test="${m.getUserId() == u.getUserId()}">
                                        <div class="card-upper-part">
                                            <img class="rounded-circle" src="img_upload/${u.getAvatar()}" alt="avatar">
                                            <h4>${u.getFullname()}</h4>
                                            <c:forEach var="r" items="${requestScope.rateMap}">
                                                <c:if test="${r.key == m.getMentorId()}">
                                                    <span class="rating"><i id="star-icon" class="fa-solid fa-star"></i><span style="color:black;">${r.value}/5.0</span></span>
                                                        </c:if>
                                                    </c:forEach>

                                        </div>
                                    </c:if>
                                </c:forEach>

                                <div class="card-lower-part">
                                    <c:forEach items="${requestScope.listSkill}" var="s">
                                        <c:forEach items="${requestScope.listEnrollSkill}" var="es">
                                            <c:if test="${m.getMentorId() == es.getMentorId() && es.getSkillId() == s.getSkillId()}">

                                                <div class="card-technologies-knowledge">${s.getSkillName()}</div>
                                            </c:if>
                                        </c:forEach>
                                    </c:forEach>
                                </div>

                                <div class="openCV">
                                    <button id="btn-openCV"><a href="#">Open CV</a></button>
                                </div>
                            </div>
                        </div>

                    </c:forEach>
                    
                </div>
            </div>

            <div class="seemore" data-aos="fade-left" data-aos-duration="1000">
                <button id="btn_seemore" onclick="handleDisplayItemMentor()">See All &#9207;</button>
            </div>
        </div>


        <!-- scroll to top -->
        <div>
            <button onclick="topFunction()" id="myBtn" class="scrollBtn" title="Go to top">Top</button>
        </div>


        <!-- footer -->
        <%@include file="./footer.jsp" %>


        <script src="myjs/viewmentor.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
        <script src="https://unpkg.com/aos@2.3.1/dist/aos.js"></script>
        <script>
                AOS.init();
        </script>

    </body>
</html>