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

    $("#contact-tab").click(function(){
        clearNavSelection();
        $("#contact-panel").removeClass("hidden");
        $("#contact-tab").parent('li').addClass("active");
    });

    $("#friend-tab").click(function(){
        clearNavSelection();
        $("#friend-panel").removeClass("hidden");
        $("#friend-tab").parent('li').addClass("active");
    });

    $("#hobbies-tab").click(function(){
        clearNavSelection();
        $("#hobbies-panel").removeClass("hidden");
        $("#hobbies-tab").parent('li').addClass("active");
    });

    $("#message-tab").click(function(){
        clearNavSelection();
        $("#message-panel").removeClass("hidden");
        $("#message-tab").parent('li').addClass("active");
    });

    $("#places-tab").click(function(){
        clearNavSelection();
        $("#places-panel").removeClass("hidden");
        $("#places-tab").parent('li').addClass("active");
    });

    $("#posts-tab").click(function(){
        clearNavSelection();
        $("#posts-panel").removeClass("hidden");
        $("#posts-tab").parent('li').addClass("active");
    });

    function updatePage(barStatus) {
        alert("vse horosho");
    }

    $('#addNew').click(function(){
        var firstName = $('#newFirstName').val();
        var lastName = $('#newLastName').val();
        var dateStr = $('#newBirthDate').val();
        $.ajax({
            type: "POST",
            url: '/addNewContact',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data:'{"firstName": "' + firstName + '", "lastName": "' + lastName + '", "dateStr": "' + dateStr + '"}',
            success: function(data) {
                if (data.status === 'OK') {
                    updatePage(data.barStatus);
                } else {
                    alert(data.errorMessage);
                }
            }
        });
        $('#requestModal').modal('toggle');

    });

});