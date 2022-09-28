

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>6HP - Happy Programing</title>
        <link rel="stylesheet" href="../style/home.css">
        <link rel="icon" type="image/x-icon" href="../image/mylogo.png">

        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"
              integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css"
              integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A=="
              crossorigin="anonymous" referrerpolicy="no-referrer" />
    </head>
    <body>
        <!-- navbar -->
        <nav id="nav_home" class="navbar navbar-expand-lg navbar-light">
            <div>
                <a href=""><img class="navbar-brand logo" src="../image/mylogo.png" alt="logo" /></a>
                <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <div>
                    <ul class="navbar-nav mr-auto">
                        <li class="nav-item active">
                            <p class="nav-link nav_item_text up_down_icon" onclick="openBar()">Find mentors
                                &#9207;</p>
                        </li>
                        <li class="nav-item active">
                            <a class="nav-link nav_item_text" href="">Become Mentor</a>
                        </li>

                    </ul>
                </div>

                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>

                <!--su dung sessionScope check DA dang nhap thi hien thi-->

                <!-- <div class="acti">
                    <div id='user_email'>email name</div>
                    <div class="nav-item dropdown nav_drop">
                        <img class="nav-link dropdown-toggle rounded-circle" src="./image/avtuser.png" alt="avtuser"
                            id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true"
                            aria-expanded="false" />
                        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                            <a class="dropdown-item" href="/changepassword">Change password</a>
                            <a class="dropdown-item" href="/profile">Profile</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" onclick={handleLogout}>Log out</a>
                        </div>
                    </div>
                </div> -->

                <!--su dung sessionScope check CHUA dang nhap thi hien thi-->

                <div class="">
                    <a class="login_text" href='/login'>Login</a>
                    <a class="login_text" href='/register'>Register</a>
                </div>

            </div>
        </nav>

        <div class="container-fluid bar" id="bar-container">
            <div class="row">
                <div class="col-md-3 col-sm-2 col-xs-12 left">
                    <div class="left_bar">
                        <ul>
                            <li class="category cate1 bg_active" onclick="openCate1()">Technologies ></li>
                            <li class="category cate2" onclick="openCate2()">Rate ></li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-9 col-sm-10 col-xs-12 right">
                    <div class="right_bar">
                        <div class="firstSubCategory active">
                            <div class="row">
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href="#">Java</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href="">Javascript</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href="">C#</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href="">Kotlin</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href="">Python</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href="">SQL</a>
                                </div>
                            </div>
                        </div>

                        <div class="secondSubCategory">
                            <div class="row">
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href=""><i class="fa-solid fa-star"></i> 0 - 1</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href=""><i class="fa-solid fa-star"></i> 1 - 2</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href=""><i class="fa-solid fa-star"></i> 2 - 3</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href=""><i class="fa-solid fa-star"></i> 3 - 4</a>
                                </div>
                                <div class="col-md-4 item_subcategory">
                                    <a class="subCategory" href=""><i class="fa-solid fa-star"></i> 4 - 5</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>


        <script src="../myjs/header.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct"
        crossorigin="anonymous"></script>
    </body>
</html>
