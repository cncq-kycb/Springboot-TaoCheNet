
   var map;
    map = new GMaps({
        el: '#map',
        lat: 21.2334329,
        lng: 72.86372,
        scrollwheel: false
    });

    map.addMarker({
        lat: 21.2334329,
        lng: 72.86372,
        title: 'Marker with InfoWindow',
        infoWindow: {
            content: '<p>Advisor Melbourne, Merrick Way, <br>FL 12345 Australia<a href="#"  target="_blank">Themeforest</a></p>'
        }
    });    