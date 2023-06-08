<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp page</title>
<!-- css -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" 
integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" 
crossorigin="anonymous">

<link href="css/my_style.css" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
.banner-background{
clip-path: polygon(30% 0%, 70% 0%, 100% 1%, 100% 91%, 63% 100%, 22% 91%, 0 99%, 0 0);
}
</style>

</head>
<body>

<!-- navbar -->
 <jsp:include page="normal_navbar.jsp" />
 
 <!--//banner-->
 
 <div class="container-fluid p-0 m-0">
 <div class="jumbotron primary-background text-white banner-background">
 <div class="container">
 <h3 class="display-5">प्रपद्ये ऑर्गेनिक फार्म में आपका स्वागत है।</h3>
 <br>
 <br>
 <p>ऑर्गेनिक दूध क्या है?</p>
 
 
 <p>ऑर्गेनिक दूध एक प्रकार का दूध है जो सख्त ऑर्गेनिक खेती व्यवसायिक प्रक्रिया का पालन करके उत्पन्न किया जाता है। 
 ऑर्गेनिक किसान संथानों, कीटनाशकों, एंटीबायोटिक या हार्मोन के उपयोग के बिना गायों को पालते हैं। इन गायों को ऑर्गेनिक चारा खिलाया जाता है,
  उनके लिए चराने की पहुंच होती है और उन्हें सिंथेटिक वृद्धि हार्मोन या एंटीबायोटिक नहीं दिया जाता है। 
  ऑर्गेनिक दूध का उत्पादन पर्यावरण की सुरक्षा, पशु कल्याण और संश्लेषण मिनिमाइज़ करने पर ध्यान केंद्रित करता है, 
  जिससे एक पौष्टिक और पर्यावरण मित्र उत्पन्न होता है।
 </p>
 
 <a href="register_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-plus"></span>Start ! its sign up Free</a>
  <a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle fa-spin"></span>Login</a>
 </div>
 </div>
  

 </div>
 
 <!-- cards -->
 
 <div class="container">
   <div class="row mb-2">

<div class="col-md-4">
<div class="card">
 
  <div class="card-body">
    <h5 class="card-title">प्रपद्ये ऑर्गेनिक गाय का दूध</h5>
    <p class="card-text">इससे ऑर्गेनिक गाय का दूध रेडीबीट्स, पेस्टिसाइड्स, हर्बिसाइड्स, और अन्य कीटनाशकों से मुक्त होता है,
     जो आम गाय के दूध में पाये जाने वाले होते हैं।  इससे ऑर्गेनिक गाय का दूध स्वास्थ्य के लिए एक सुरक्षित विकल्प होता है।
    ऑर्गेनिक चारा खाने वाली गाय का दूध पीने से शरीर में पॉलिअनसेचुरेटिड फैट में इजाफा होता है। 
    पॉलिअनसेचुरेटिड फैट का सेवन दिल के लिए फायदेमंद होता है। 
</p>

    <a href="cow_milk.jsp" class="btn primary-background text-white">Read more</a>
  </div>
</div>

</div>
<div class="col-md-4">
<div class="card">
 
  <div class="card-body">
    <h5 class="card-title">ऑर्गेनिक भैंस का दूध</h5>
    <p class="card-text">प्राकृतिक और स्वास्थ्यप्रद: ऑर्गेनिक भैंस का दूध भैंसों को सिंथेटिक कीटनाशकों और एंटीबायोटिक के बिना पाला जाता है, जो एक प्राकृतिक और स्वास्थ्यप्रद विकल्प प्रदान करता है।
     इसमें आवश्यक पोषक तत्व जैसे कि प्रोटीन, कैल्शियम, विटामिन डी और ऑमेगा-3 फैटी एसिड होते हैं जो स्वस्थ शरीर के लिए आवश्यक हैं।
     भैंस के दूध में कैल्शियम की मात्रा भी काफी अधिक होती है |</p>
    <br>
    <a href="buffalo_milk.jsp" class="btn primary-background text-white">Read more</a>
  </div>
</div>

</div>
<div class="col-md-4">
<div class="card">
 
  <div class="card-body">
    <h5 class="card-title">"जैविक खाद"</h5>
    <p class="card-text">प्राकृतिक खाद या जैविक खाद एक प्रकार का उर्वरक होता है जो पौधों को पोषक तत्व और प्राकृतिक मिट्टी को गुणवत्तापूर्ण बनाने में मदद करता है। यह गाय, भैंस, मुर्गे, घोड़े, खरगोश, मछली और अन्य प्राकृतिक स्रोतों से प्राप्त किए गए जीवाश्म या जैविक सामग्री पर आधारित होता है। इसे कृषि, बागवानी, बागवानी, और पर्यावरण संबंधी परियोजनाओं में मिट्टी की गुणवत्ता और उपज को बेहतर बनाने के लिए उपयोग किया जाता है।</p>
    <a href="varmi_compost.jsp" class="btn primary-background text-white">Read more</a>
  </div>
</div>

</div>
   
   </div>

 

</div>
 
<!--javascripts-->
        <script
            src="https://code.jquery.com/jquery-3.4.1.min.js"
            integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
       


</body>
</html>