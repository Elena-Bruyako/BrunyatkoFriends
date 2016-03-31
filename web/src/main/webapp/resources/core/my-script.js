/**
 * Created by brunyatko on 25.11.15.
 */
$(document).ready(function(){

    function clearNavSelection() {
        $('.nav-tabs li').removeClass("active");
        $('.tab-panel').addClass("hidden");
    };

    $("#allContacts-tab").click(function(){
        clearNavSelection();
        $("#allContacts-panel").removeClass("hidden");
        $("#allContacts-tab").parent('li').addClass("active");
    });

    $("#contact-tab").click(function(){
        clearNavSelection();
        $("#contact-panel").removeClass("hidden");
        $("#contact-tab").parent('li').addClass("active");
    });

    $("#hobbies-tab").click(function(){
        clearNavSelection();
        $("#hobbies-panel").removeClass("hidden");
        $("#hobbies-tab").parent('li').addClass("active");
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

    $('#addNew').click(function(){
        var firstName = $('#newFirstName').val();
        var lastName = $('#newLastName').val();
        var dateStr = $('#newBirthDate').val();
        $.ajax({
            type: "POST",
            url: '/addNewContact',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data:'{"firstName": "' + firstName + '", "lastName": "' + lastName + '", "dateStr": "' + dateStr + '"}'
        });
        $('#requestModal').modal('toggle');

    });

    $('#addNewHobby').click(function(){
        var title = $('#newTitleHobby').val();
        var description= $('#newDescriptionHobby').val();
        $.ajax({
            type: "POST",
            url: '/addNewHobby',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data:'{"title": "' + title + '", "description": "' + description + '"}'
        });
    });

    $('#addNewPlace').click(function(){
        var title = $('#newTitlePlace').val();
        var longitude = $('#newLongitudePlace').val();
        var latitude = $('#newLatitudePlace').val();
        var description = $('#newDescriptionPlace').val();
        $.ajax({
            type: "POST",
            url: '/addNewPlace',
            contentType: "application/json; charset=utf-8",
            dataType: "json",
            data:'{"title": "' + title + '", "longitude": "' + longitude + '", "latitude": "' + latitude + '", "description": "' + description + '"}'
        });
    });

    $('#addHobbyToContact').click(function(){
        $.ajax({
            type: "POST",
            url: '/addHobbyToContact/{contactId}/{hobbyId}'
        });
        $('#requestModal').modal('toggle');

    });
});