<%-- 
    Document   : mainView
    Created on : Apr 19, 2018, 9:18:31 PM
    Author     : andressaldana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--  user interface -->
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <!-- Personalized Styles -->
        <link rel="stylesheet" href="resources/styles.css">
        <!-- Personalized Scripts -->
        <script src="resources/scripts.js"></script>
        <!-- Bootstrap 4 -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
        <!-- Font Awesome -->
        <script defer src="https://use.fontawesome.com/releases/v5.0.9/js/all.js" integrity="sha384-8iPTk2s/jMVj81dnzb/iFR2sdA7u06vHJyyLlAd4snFpCl/SnyUjRrbdJsw1pGIl" crossorigin="anonymous"></script>
        <title>App</title>
        <!-- SweetAlert -->
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <!-- Google fonts -->
        <link href="https://fonts.googleapis.com/css?family=Ewert" rel="stylesheet">
    </head>
    <body>
        <!-- NavBar -->
        <nav class="navbar navbar-primary bg-primary fixed-top">
            <a class="navbar-brand" href="#" style="color:white">CryptoApp</a>  
        </nav>
        <!-- Body -->
        <div class="container">

            <div class="card" id="main-card">

                <div class="card-body text-primary" id="transparent">
                    <div class="card-deck" id="transparent">                       
                        <div class="card border-primary nav-separation" id="transparent">
                            <div class="card-body text-primary" id="card-body">
                                <div class="row">
                                    <!-- column 1 -->
                                    <div class="col">
                                       
                                        <!-- Icon and filename -->
                                        <div class="row justify-content-center button-padding">
                                            <i class="fas fa-lock-open fa-10x" id="lockIcon"></i>                                                  
                                        </div>
                                        <h5><span class="badge badge-outline-primary col align-self-center">examplefilename.txt</span></h5> 
                                        <!--Form-->
                                        <form name="form" method="post" action="FileReciever" enctype="multipart/form-data">
                                                <!--filechooser-->
                                                <div class="input-group button-padding">    
                                                    <input type="file" class="form-control-file" required name="file" id="file"/>
                                                   
                                                </div>
                                                <!--key-->
                                                <div class="input-group mb-3">
                                                    <input type="text" class="form-control" placeholder="Key" aria-label="Recipient's username" aria-describedby="basic-addon2" name="key" required>
                                                </div>
                                                <!-- Variables to choose -->
                                                <div class="row justify-content-md-center">
                                                    <!-- Algorithm to choose -->
                                                    <select class="form-control col col-lg-3 col-xl-3 button-padding btn-outline-primary" style="margin-right: 9%;">
                                                        <option>AES</option>
                                                        <option>DES</option>
                                                    </select>
                                                    <!-- Mode -->
                                                    <select class="form-control col col-lg-3 col-xl-3 button-padding btn-outline-primary" style="margin-right: 9%;">
                                                        <option>OFB</option>
                                                        <option>CBC</option>
                                                        <option>ECB</option>
                                                        <option>CFB</option>
                                                    </select>
                                                    <!-- Action -->
                                                    <select class="form-control col col-lg-3 col-xl-3 button-padding btn-outline-primary">
                                                        <option>CIPHER</option>
                                                        <option>DECIPHER</option>
                                                    </select>
                                                </div> 
                                                <button type="submit" class="btn btn-success btn-block" value="Upload" name="upload" id="upload">Go!</button> 
                                        </form>
                                        <!--submit button-->
                                        
                                    </div>    
                                    <!-- column 2 -->
                                    <div class="col">
                                        <div class="row justify-content-center button-padding">                                
                                            <i class="fas fa-cogs fa-10x" style="color:gray"></i>
                                        </div>
                                        <div class="row justify-content-center button-padding">
                                            <i class="far fa-file fa-8x" style="margin-right: 5%;margin-top: 6%;"></i>
                                        </div>
                                        <h5><span class="badge badge-outline-primary col align-self-center">examplefilename.txt</span></h5> 
                                        <form name="donwload" method="get" action="DownloadFileServlet">
                                            <div class="row justify-content-center button-padding">                                           
                                                <button type="submit" class="btn btn-success col-lg-6 col-xl-6 col-sm-6 col-6" onclick="download()"><i class="fas fa-download"></i> Download File</button>                                                                                       
                                            </div>
                                        </form> 
                                    </div>
                                </div>                                                                
                            </div>
                        </div>                            
                    </div>
                </div>             
            </div>
        </div>
    </div>
</body>
</html>
