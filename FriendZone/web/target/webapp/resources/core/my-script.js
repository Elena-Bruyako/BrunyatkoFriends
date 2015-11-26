/**
 * Created by brunyatko on 25.11.15.
 */
$(document).ready(function(){

    function clearNavSelection() {
        $('.nav-tabs li').removeClass("active");
        $('.tab-panel').addClass("hidden");
    };

    $("#allcontact-tab").click(function(){
        clearNavSelection();
        $("#allContact-panel").removeClass("hidden");
        $("#allContact-tab").parent('li').addClass("active");
    });

    function displayError(message) {
        $('#client-order-response').removeClass('bg-success');
        $('#client-order-response').addClass('bg-danger');
        $('#client-order-response').text(message);
    }

    function displayClientOrderSuccess() {
        $('#client-order-response').removeClass('bg-danger');
        $('#client-order-response').addClass('bg-success');
        $('#client-order-response').text('Thank you for you order! Just wait for a minute :)');
    }

    function updateStatus(allContacts) {
        $('#allContacts').text(allContacts);
    }

    $('#addNewContact').click(function () {
        var firstName = $('#firstName').val();
        var lastName = $('#lastName').val();
        $.ajax({
            type: "POST",
            url: '/newContact',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data: '{"firstName": "' + firstName + '", "lastName": "' + lastName + '"}'
//            success: function(data) {
//                if (data.status === 'OK') {
//                    updateStatus(data.barStatus);
//                    displayClientOrderSuccess();
//                } else {
//                    displayError(data.errorMessage);
//                }
//            }
        });
    });

});