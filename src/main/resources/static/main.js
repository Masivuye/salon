function $(s) {
    
}


/**
 *
 * */
$(document).ready(function () {
    $('.btn, .table .btnUpdate').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var option = $(this).text();
        if(option === "Update") {
            $.get(href, function (order, status) {
                $('.myForm #cust_num').val(order.id);
                $('.myForm #cust_name').val(order.name);
                $('.myForm #comment').val(order.comment);
            });
            $('.myForm #exampleModal').modal();
        }else{
            $('.myForm #cust_num').val("");
            $('.myForm #cust_name').val("");
            $('.myForm #comment').val("");
            $('.myForm #exampleModal').modal();
        }
    });

    $('.table .btnDelete').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        $('#exampleModalCenter #delRef').attr('href', href);
        $('#exampleModalCenter').modal();
    });
});