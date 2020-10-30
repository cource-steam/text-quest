jQuery(document).ready(function() {
    var addr = window.location.origin;

    $('.button').click(function() {
        var id = {"id":this.id};
        $.post("/quest", id, onAjaxSuccess);
        function onAjaxSuccess(data) {
            window.location.href = '../quest?id=' + data;
        }
    });
});