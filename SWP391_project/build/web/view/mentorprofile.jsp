

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>6HP - Happy Programing</title>
        <link rel="stylesheet" href="../style/mentorprofile.css">
        <link rel="icon" type="image/x-icon" href="../image/mylogo.png">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
              integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link href="https://unpkg.com/aos@2.3.1/dist/aos.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
              integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>

        <!--header-->
        <%@include file="./header.jsp" %>

        <div class="container mb-5">
            <div class="part mt-5 mb-5">
                <h4 class="part-title">Mentor's profile</h4>
                <div class="line_part"></div>
            </div>

            <div class="container p-5 wrapCV">
                <div class="row">
                    <div class="col-md-12 col-sm-12 col-xs-12 wrap-infor" data-aos="fade-up" data-aos-duration="1000">
                        <div class="col-md-3 col-sm-2 col-xs-12 cv-avt-mentor">
                            <img class="rounded-circle" src="../image/avtuser.png" alt="image">
                        </div>

                        <div class="col-md-9 col-sm-10 col-xs-12 cv-personal-infor">
                            <h2 class="ml-3">Nguyen Van A</h2>

                            <div class="cv-content-infor">
                                <div class="col-md-6 col-sm-6 col-xs-12 cv-left-content-infor">
                                    <div class="item-content-infor mt-3 mb-3">
                                        <i class="ml-1 fa-solid fa-calendar-days"></i>
                                        <span class="ml-2 content-infor">19/05/1992</span>
                                    </div>

                                    <div class="item-content-infor mt-3 mb-3">
                                        <i class="ml-1 fa-solid fa-envelope"></i>
                                        <span class="ml-2 content-infor">hotro@gmail.com</span>
                                    </div>

                                    <div class="item-content-infor mt-3 mb-3">
                                        <i class="ml-1 fa-solid fa-location-arrow"></i>
                                        <span class="ml-2 content-infor">Cau Giay, Ha Noi</span>
                                    </div>
                                </div>

                                <div class="col-md-6 col-sm-6 col-xs-12 cv-right-content-infor">
                                    <div class="item-content-infor mt-3 mb-3">
                                        <i class="ml-1 fa-solid fa-phone"></i>
                                        <span class="ml-2 content-infor">0123456789</span>
                                    </div>

                                    <div class="item-content-infor mt-3 mb-3">
                                        <i class="ml-1 fa-solid fa-user"></i>
                                        <span class="ml-2 content-infor">Man</span>
                                    </div>

                                </div>
                            </div>
                        </div>

                    </div>
                </div>

                <!-- <div class="wrap-infor"> -->
                <div class="row contain-infor">

                    <div class="col-md-5 col-sm-6 col-xs-12 right-second-infor pl-4" data-aos="fade-up" data-aos-duration="1000">
                        <div class="title mb-3">
                            <i class="fa-solid fa-pencil"></i>
                            <span class="ml-2 content-infor">Skills</span>
                        </div>

                        <div class="main-content-infor">
                            <p class="subtitle">Programing</p>
                            <p>Java, Javascript, Python, C#</p>
                            <p class="subtitle">Soft Skills</p>
                            <p>Good at English communication, Teamwork</p>
                        </div>

                    </div>

                    <div class="col-md-5 col-sm-6 col-xs-12 left-second-infor pl-4" data-aos="fade-up" data-aos-duration="1000">
                        <div class="title mb-3">
                            <i class="fa-solid fa-briefcase"></i>
                            <span class="ml-2 content-infor">Work experience</span>
                        </div>

                        <div class="main-content-infor">
                            <p>FPT University</p>
                            <p>Major: IT</p>
                            <p>GPA: 8</p>
                        </div>
                    </div>

                </div>

                <div class="row contain-infor">


                    <div class="col-md-5 col-sm-6 col-xs-12 right-second-infor pl-4" data-aos="fade-up" data-aos-duration="1000">
                        <div class="title mb-3">
                            <i class="fa-solid fa-award"></i>
                            <span class="ml-2 content-infor">Achievement</span>
                        </div>

                        <div class="main-content-infor">
                            <p class="subtitle">Programing</p>
                            <p>Java, Javascript, Python, C#</p>
                            <p class="subtitle">Soft Skills</p>
                            <p>Good at English communication, Teamwork</p>
                        </div>

                    </div>


                </div>

            </div>

            <div class="part mt-5 mb-5">
                <h4 class="part-title">Comment and rate</h4>
                <div class="line_part"></div>
            </div>

            <div class="rate-comment">
                <div class="items-rate-comment" data-aos="fade-left" data-aos-duration="1000">
                    <span class="rating"><i class="fa-solid fa-star"></i><span class="rating-number">4/5</span></span>
                    <p class="cv-comment">This mentor is quite dedicated, everybody should choose him to be your own mentor.</p>
                </div>

                <div class="items-rate-comment" data-aos="fade-left" data-aos-duration="1000">
                    <span class="rating"><i class="fa-solid fa-star"></i><span class="rating-number">5/5</span></span>
                    <p class="cv-comment">With the dedicated support of this mentor, I am confident with my knowledge now.</p>
                </div>

            </div>
        </div>

        <!-- scroll to top -->
        <div>
            <button onclick="topFunction()" id="myBtn" class="scrollBtn" title="Go to top">Top</button>
        </div>

        <!--footer-->
        <%@include file="./footer.jsp" %>

        <script src="../myjs/mentorprofile.js"></script>
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
