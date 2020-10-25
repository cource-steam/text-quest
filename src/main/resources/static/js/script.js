jQuery(document).ready(function() {
    var addr = window.location.origin;

    $('.button').click(function() {
            var id = {"id":this.id};
            $.ajax({
                type: "GET",
                dataType: 'json',
                url: "/quest",
                data: id
            });
        });

});