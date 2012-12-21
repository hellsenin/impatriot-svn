<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="ui" uri="http://egovframework.gov/ctl/ui"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
	<title>제이와이케이 디벨로퍼</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <link href="<c:url value='/'/>css/redmond/jquery-ui-1.9.2.custom.css" rel="stylesheet">
	<script src="<c:url value='/'/>js/jquery-1.8.3.js"></script>
	<script src="<c:url value='/'/>js/jquery-ui-1.9.2.custom.js"></script>
	<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>
	<script type="text/javascript">
var map;
function initialize() {
 var myOptions = {
  zoom: 6,
  mapTypeId: google.maps.MapTypeId.ROADMAP
 };
 map = new google.maps.Map(document.getElementById('map_canvas'), myOptions);

 if (navigator.geolocation) {
  //alert('navigator.geolocation: ' + navigator.geolocation);

  navigator.geolocation.getCurrentPosition(function (position) {
   //alert('position: ' + position);

   alert(position.coords.latitude + ', ' + position.coords.longitude);

   var pos = new google.maps.LatLng(position.coords.latitude, position.coords.longitude);
   
   var infowindow = new google.maps.InfoWindow({map: map, position: pos, content: 'Location found using HTML5.'});

   map.setCenter(pos);
  }, function () {
   handleNoGeolocation(true);
  });
 } else {
  handleNoGeolocation(false);
 }
}

function handleNoGeolocation(errorFlag) {
 alert(errorFlag);

 if (errorFlag) {
  var content = 'Error: The Geolocation service failed.';
 } else {
  var content = 'Error: Your browser doesn\'t support geolocation.';
 }

 var options = {
  map: map,
  position: new google.maps.LatLng(60, 105),
  content: content
 };

 var infowindow = new google.map.InfoWindow(options);
 map.setCenter(options.position);
}

google.maps.event.addDomListener(window, 'load', initialize);
	</script>
</head>
<body>
<div id="map_canvas" style="width:400;height:300"></div>
</body>
</html>