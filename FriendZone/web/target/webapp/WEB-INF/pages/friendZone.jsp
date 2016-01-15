<%--
  Created by IntelliJ IDEA.
  User: brunyatko
  Date: 25.11.15
  Time: 13:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Contact Service</title>
    <meta name="viewport" content="initial-scale=1, maximum-scale=1">
    <link rel='stylesheet' href='webjars/bootstrap/3.2.0/css/bootstrap.min.css'>
    <link rel="stylesheet" type="text/css" href="/resources/core/my-style.css">

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <jsp:useBean id="allContacts" scope="request" type="java.util.List"/>
    <jsp:useBean id="allHobbies" scope="request" type="java.util.List"/>
    <%--<jsp:useBean id="allPlaces" scope="request" type="java.util.Set"/>--%>

</head>
<body>

<div class="container-fluid">
    <div class="page-header text-centred">
        <h1>Contact Service</h1>
        <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#requestModal">
            Add new Contact
        </button>
        <div class="modal fade" id="requestModal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h4 class="modal-title" id="myModalLabel">Please, fill all fields</h4>
                    </div>
                    <div class="modal-body">
                        <div class="form">
                            <div class="form-group">
                                <label for="newFirstName">First Name</label>
                                <input type="text" class="form-control" id="newFirstName"
                                       placeholder="First Name">
                            </div>
                            <div class="form-group">
                                <label for="newLastName">Last Name</label>
                                <input type="text" class="form-control" id="newLastName"
                                       placeholder="Last Name">
                            </div>
                            <div class="form-group">
                                <label for="newBirthDate">Birth Date</label>
                                <input type="text" class="form-control" id="newBirthDate"
                                       placeholder="Birth Date">
                            </div>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" id="addNew">Add</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-lg-offset-3 col-lg-6">
            <ul class="nav nav-tabs">
                <li role="presentation"><a href="#" id="allContact-tab">All Contacts</a></li>
                <li role="presentation"><a href="#" id="friends-tab">Friends</a></li>
                <li role="presentation"><a href="#" id="hobbies-tab">Hobbies</a></li>
                <li role="presentation"><a href="#" id="message-tab">Message</a></li>
                <li role="presentation"><a href="#" id="places-tab">Places</a></li>
                <li role="presentation"><a href="#" id="posts-tab">Posts</a></li>
            </ul>
        </div>
    </div>

    <div class="top-buffer tab-panel" id="allContact-panel">
        <div class="row top-buffer">
            <div class="col-lg-offset-4 col-lg-5">
                <table class="table table-hover">
                    <thread>
                        <tr>
                            <th>First name</th>
                            <th>Last name</th>
                            <th>Birth date</th>
                        </tr>
                    </thread>
                    <tbody>
                    <c:forEach items="${allContacts}" var="contact">
                    <tr>
                        <td>${contact.firstName}</td>
                        <td>${contact.lastName}</td>
                        <td>${contact.birthDate}</td>
                        <td><a href="look/${contact.contactId}">Look</a></td>
                        <td><a href="delete/${contact.contactId}">Delete</a></td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

    <div class="top-buffer tab-panel hidden" id="friends-panel">
        <%--<div class="row top-buffer">--%>
            <%--<div class="col-lg-offset-4 col-lg-5">--%>
                <%--<table class="table table-hover">--%>
                    <%--<thread>--%>
                        <%--<tr>--%>
                            <%--<th>First name</th>--%>
                            <%--<th>Last name</th>--%>
                            <%--<th>Birth date</th>--%>
                        <%--</tr>--%>
                    <%--</thread>--%>
                    <%--<tbody>--%>
                    <%--<c:forEach items="${allContacts}" var="contact">--%>
                        <%--<tr>--%>
                            <%--<td>${contact.firstName}</td>--%>
                            <%--<td>${contact.lastName}</td>--%>
                            <%--<td>${contact.birthDate}</td>--%>
                            <%--<td><a href="look/${contact.contactId}">Look</a></td>--%>
                            <%--<td><a href="delete/${contact.contactId}">Delete</a></td>--%>
                        <%--</tr>--%>
                    <%--</c:forEach>--%>
                    <%--</tbody>--%>
                <%--</table>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>

    <div class="top-buffer tab-panel hidden" id="hobbies-panel">
        <div class="page-header text-centred">
            <div class="row top-buffer">
                <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#requestModal">
                    Add new Hobby
                </button>
            </div>
            <div class="modal fade" id="requestModal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                <span aria-hidden="true">&times;</span>
                            </button>
                            <h4 class="modal-title" id="myModalLabel">Please, fill all fields</h4>
                        </div>
                        <div class="modal-body">
                            <div class="form">
                                <div class="form-group">
                                    <label for="newTitle">Title</label>
                                    <input type="text" class="form-control" id="newTitle"
                                           placeholder="Title">
                                </div>
                                <div class="form-group">
                                    <label for="newDescription">Description</label>
                                    <input type="text" class="form-control" id="newDescription"
                                           placeholder="Description">
                                </div>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                            <button type="button" class="btn btn-primary" id="addNewHobby">Add</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row top-buffer">
                <div class="col-lg-offset-4 col-lg-5">
                    <table class="table table-hover">
                        <thread>
                            <thread>
                                <tr>
                                    <th>Title</th>
                                    <th>Description</th>
                                </tr>
                            </thread>
                            <tbody>
                            <c:forEach items="${allHobbies}" var="hobbies">
                                <tr>
                                    <td>${hobbies.title}</td>
                                    <td>${hobbies.description}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </thread>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <div class="top-buffer tab-panel hidden" id="message-panel">
        <%--<div class="page-header text-centred">--%>
            <%--<button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#requestModal">--%>
                <%--Add new Hobby--%>
            <%--</button>--%>
            <%--<div class="modal fade" id="requestModal" tabindex="-1" role="dialog">--%>
                <%--<div class="modal-dialog" role="document">--%>
                    <%--<div class="modal-content">--%>
                        <%--<div class="modal-header">--%>
                            <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                                <%--<span aria-hidden="true">&times;</span>--%>
                            <%--</button>--%>
                            <%--<h4 class="modal-title" id="myModalLabel">Please, fill all fields</h4>--%>
                        <%--</div>--%>
                        <%--<div class="modal-body">--%>
                            <%--<div class="form">--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newTitle">Title</label>--%>
                                    <%--<input type="text" class="form-control" id="newFirstName"--%>
                                           <%--placeholder="First Name">--%>
                                <%--</div>--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newDescription">Description</label>--%>
                                    <%--<input type="text" class="form-control" id="newLastName"--%>
                                           <%--placeholder="Last Name">--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="modal-footer">--%>
                            <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                            <%--<button type="button" class="btn btn-primary" id="addNewHobby">Add</button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="row top-buffer">--%>
            <%--<div class="col-lg-offset-4 col-lg-5">--%>
                <%--<table class="table table-hover">--%>
                    <%--<thread>--%>
                        <%--<thread>--%>
                            <%--<tr>--%>
                                <%--<th>Title</th>--%>
                                <%--<th>Description</th>--%>
                            <%--</tr>--%>
                        <%--</thread>--%>
                        <%--<tbody>--%>
                        <%--<c:forEach items="${allHobbies}" var="hobbies">--%>
                            <%--<tr>--%>
                                <%--<td>${hobbies.title}</td>--%>
                                <%--<td>${hobbies.description}</td>--%>
                            <%--</tr>--%>
                        <%--</c:forEach>--%>
                        <%--</tbody>--%>
                    <%--</thread>--%>
                <%--</table>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>

    <div class="top-buffer tab-panel hidden" id="places-panel">
        <%--<div class="page-header text-centred">--%>
            <%--<button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#requestModal">--%>
                <%--Add new Place--%>
            <%--</button>--%>
            <%--<div class="modal fade" id="requestModal" tabindex="-1" role="dialog">--%>
                <%--<div class="modal-dialog" role="document">--%>
                    <%--<div class="modal-content">--%>
                        <%--<div class="modal-header">--%>
                            <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                                <%--<span aria-hidden="true">&times;</span>--%>
                            <%--</button>--%>
                            <%--<h4 class="modal-title" id="myModalLabel">Please, fill all fields</h4>--%>
                        <%--</div>--%>
                        <%--<div class="modal-body">--%>
                            <%--<div class="form">--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newTitlePlace">Title</label>--%>
                                    <%--<input type="text" class="form-control" id="newTitlePlace"--%>
                                           <%--placeholder="Title">--%>
                                <%--</div>--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newLongitudePlace">Longitude</label>--%>
                                    <%--<input type="text" class="form-control" id="newLongitudePlace"--%>
                                           <%--placeholder="Longitude">--%>
                                <%--</div>--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newLatitudePlace">Latitude</label>--%>
                                    <%--<input type="text" class="form-control" id="newLatitudePlace"--%>
                                           <%--placeholder="Latitude">--%>
                                <%--</div>--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newDescriptionPlace">Description</label>--%>
                                    <%--<input type="text" class="form-control" id="newDescriptionPlace"--%>
                                           <%--placeholder="Description">--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="modal-footer">--%>
                            <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                            <%--<button type="button" class="btn btn-primary" id="addNewPlace">Add</button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="row top-buffer">--%>
            <%--<div class="col-lg-offset-4 col-lg-5">--%>
                <%--<table class="table table-hover">--%>
                    <%--<thread>--%>
                        <%--<thread>--%>
                            <%--<tr>--%>
                                <%--<th>Title</th>--%>
                                <%--<th>Longitude</th>--%>
                                <%--<th>Latitude</th>--%>
                                <%--<th>Description</th>--%>
                            <%--</tr>--%>
                        <%--</thread>--%>
                        <%--<tbody>--%>
                        <%--<c:forEach items="${allPlaces}" var="places">--%>
                            <%--<tr>--%>
                                <%--<td>${places.title}</td>--%>
                                <%--<td>${places.longitude}</td>--%>
                                <%--<td>${places.latitude}</td>--%>
                                <%--<td>${places.description}</td>--%>
                            <%--</tr>--%>
                        <%--</c:forEach>--%>
                        <%--</tbody>--%>
                    <%--</thread>--%>
                <%--</table>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>

    <div class="top-buffer tab-panel hidden" id="posts-panel">
        <%--<div class="page-header text-centred">--%>
            <%--<button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#requestModal">--%>
                <%--Add new Hobby--%>
            <%--</button>--%>
            <%--<div class="modal fade" id="requestModal" tabindex="-1" role="dialog">--%>
                <%--<div class="modal-dialog" role="document">--%>
                    <%--<div class="modal-content">--%>
                        <%--<div class="modal-header">--%>
                            <%--<button type="button" class="close" data-dismiss="modal" aria-label="Close">--%>
                                <%--<span aria-hidden="true">&times;</span>--%>
                            <%--</button>--%>
                            <%--<h4 class="modal-title" id="myModalLabel">Please, fill all fields</h4>--%>
                        <%--</div>--%>
                        <%--<div class="modal-body">--%>
                            <%--<div class="form">--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newTitle">Title</label>--%>
                                    <%--<input type="text" class="form-control" id="newFirstName"--%>
                                           <%--placeholder="First Name">--%>
                                <%--</div>--%>
                                <%--<div class="form-group">--%>
                                    <%--<label for="newDescription">Description</label>--%>
                                    <%--<input type="text" class="form-control" id="newLastName"--%>
                                           <%--placeholder="Last Name">--%>
                                <%--</div>--%>
                            <%--</div>--%>
                        <%--</div>--%>
                        <%--<div class="modal-footer">--%>
                            <%--<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>--%>
                            <%--<button type="button" class="btn btn-primary" id="addNewHobby">Add</button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</div>--%>
            <%--</div>--%>
        <%--</div>--%>
        <%--<div class="row top-buffer">--%>
            <%--<div class="col-lg-offset-4 col-lg-5">--%>
                <%--<table class="table table-hover">--%>
                    <%--<thread>--%>
                        <%--<thread>--%>
                            <%--<tr>--%>
                                <%--<th>Title</th>--%>
                                <%--<th>Description</th>--%>
                            <%--</tr>--%>
                        <%--</thread>--%>
                        <%--<tbody>--%>
                        <%--<c:forEach items="${allHobbies}" var="hobbies">--%>
                            <%--<tr>--%>
                                <%--<td>${hobbies.title}</td>--%>
                                <%--<td>${hobbies.description}</td>--%>
                            <%--</tr>--%>
                        <%--</c:forEach>--%>
                        <%--</tbody>--%>
                    <%--</thread>--%>
                <%--</table>--%>
            <%--</div>--%>
        <%--</div>--%>
    </div>

</div>



<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/core/my-script.js"></script>

</body>
</html>
