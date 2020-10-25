jQuery(document).ready(function() {
    var addr = window.location.origin;


//http://127.0.0.1:8080/quest/%7Bid%7D?id=8
    $('.button').click(function() {
        var option = {"eventId": this.id};
        $.get("/quest/{id}", {"id": this.id}, onSuccess);
        function onSuccess(data) {// Здесь мы получаем данные, отправленные сервером и выводим их на экран.
            window.location.href = '..' + data;
        }
    });
});