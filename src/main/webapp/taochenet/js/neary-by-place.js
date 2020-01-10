$(document).ready(function(){
	"use strict";
	var image_src = "images/";
	var map;
	var infowindow;
	var bounds = new google.maps.LatLngBounds();

	var PlaceArray = [ "restaurant", "cafe", "bar", "grocery_or_supermarket", "parks", "school", "shopping_mall", "movie_theater", "bank", "university"];
	var PlaceCounter = 0;

	function initialize() {
		"use strict";
		var pyrmont = new google.maps.LatLng(41.2732625, -95.83776660000001);

		map = new google.maps.Map(document.getElementById('googleMapNearestPlaces'), {
			center: pyrmont,
			zoom: 1,
			icon:'images/map_marker.png',
			scrollwheel: false,
			rankby: 'distance',
			styles: [{"featureType":"administrative","elementType":"labels.text.fill","stylers":[{"color":"#444444"}]},{"featureType":"landscape","elementType":"all","stylers":[{"color":"#f2f2f2"}]},{"featureType":"poi","elementType":"all","stylers":[{"visibility":"off"}]},{"featureType":"road","elementType":"all","stylers":[{"saturation":-100},{"lightness":45}]},{"featureType":"road.highway","elementType":"all","stylers":[{"visibility":"simplified"}]},{"featureType":"road.arterial","elementType":"labels.icon","stylers":[{"visibility":"off"}]},{"featureType":"transit","elementType":"all","stylers":[{"visibility":"off"}]},{"featureType":"water","elementType":"all","stylers":[{"color":"#46bcec"},{"visibility":"on"}]}]
		});

		var marker=new google.maps.Marker({position:pyrmont,icon:'images/map_marker.png'});
		marker.setMap(map);
		var request = {
			location: pyrmont,
			radius: 1000,
			types: [ "restaurant", "cafe", "bar", "grocery_or_supermarket", "parks", "school", "shopping_mall", "movie_theater", "bank", "university"],
		};

		infowindow = new google.maps.InfoWindow();
		var service = new google.maps.places.PlacesService(map);
		service.nearbySearch(request, callback);
	}

	function callback(results, status) {
		"use strict";
		if (status == google.maps.places.PlacesServiceStatus.OK) {
			for (var i = 0; i < results.length; i++) {
				createMarker(results[i]);
			}
		}
	}

	function createMarker(place) {
		"use strict";
		var place_icon;
		place_icon =  "images/map-icons/" + place.types['0'] + ".png";
		
		var PlaceType = place.types['0'];

		if( jQuery.inArray( PlaceType, PlaceArray ) == -1 ){
			return;
		}
		
		PlaceArray = jQuery.grep(PlaceArray, function(value) {
		  return value != PlaceType;
		});

		var Distance = distance();

		function distance() {
			var lat1 = 41.2732625;
			var lon1 = -95.83776660000001;
			var lat2 = place.geometry.location['H'];
			var lon2 = place.geometry.location['L'];
			
			var radlat1 = Math.PI * lat1/180;
			var radlat2 = Math.PI * lat2/180;
			var radlon1 = Math.PI * lon1/180;
			var radlon2 = Math.PI * lon2/180;
			var theta = lon1-lon2;
			var radtheta = Math.PI * theta/180;
			var dist = Math.sin(radlat1) * Math.sin(radlat2) + Math.cos(radlat1) * Math.cos(radlat2) * Math.cos(radtheta);
			dist = Math.acos(dist);
			dist = dist * 180/Math.PI;
			dist = dist * 60 * 1.1515;
			dist = dist * 1.609344;		
			return Math.round( dist * 100 )/100;
		}
			
		if( PlaceType == "cafe"){
			PlaceType = "Cofee";
		}
		if( PlaceType == "grocery_or_supermarket"){
			PlaceType = "Groceries";
		}
		if( PlaceType == "shopping_mall"){
			PlaceType = "Shopping";
		}
		if( PlaceType == "movie_theater"){
			PlaceType = "Entertainment";
		}
		if( PlaceType == "bank"){
			PlaceType = "Errands";
		}

		jQuery("#near-by-place-detail").append("<div class='near-location-info'><ul><li class='right'>"+PlaceType+"</li><li class='left'>"+Distance+" Km</li></ul><span>"+place.name+"</span></div>");

		var placeLoc = place.geometry.location;
		var marker = new google.maps.Marker({
			map: map,
			position: place.geometry.location,
			icon:place_icon,
		});

		google.maps.event.addListener(marker, 'click', function() {
			infowindow.setContent(place.name);
			infowindow.open(map, this);
		});

		bounds.extend(marker.position);

		//now fit the map to the newly inclusive bounds
		map.fitBounds(bounds);

		//(optional) restore the zoom level after the map is done scaling
		var listener = google.maps.event.addListener(map, "idle", function () {
		    map.setZoom(1);
		    google.maps.event.removeListener(listener);
		});

	}
	google.maps.event.addDomListener(window, 'load', initialize);
});