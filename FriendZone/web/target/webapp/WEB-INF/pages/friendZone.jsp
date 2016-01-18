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
    <jsp:useBean id="allPlaces" scope="request" type="java.util.Set"/>
    <jsp:useBean id="allPosts" scope="request" type="java.util.Set"/>

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
                        <button type="button" class="btn btn-primary" id="addNew" onclick="window.location.reload();">Add</button>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-lg-offset-3 col-lg-6">
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#" id="allContacts-tab">All Contacts</a></li>
                <li role="presentation"><a href="#" id="hobbies-tab">Hobbies</a></li>
                <li role="presentation"><a href="#" id="places-tab">Places</a></li>
                <li role="presentation"><a href="#" id="posts-tab">Posts</a></li>
            </ul>
        </div>
    </div>

    <div class="top-buffer tab-panel" id="allContacts-panel">
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

    <div class="top-buffer tab-panel hidden" id="hobbies-panel">
        <div class="page-header text-centred">
            <div class="row top-buffer">
                <form class="form-inline" role="form">
                    <div class="form-group">
                        <label for="newTitleHobby">Title</label>
                        <input type="text" class="form-control" id="newTitleHobby" placeholder="Title">
                    </div>
                    <div class="form-group">
                        <label for="newDescriptionHobby">Description</label>
                        <input type="text" class="form-control" id="newDescriptionHobby" placeholder="Description">
                    </div>
                    <button type="button" class="btn btn-primary" id="addNewHobby">Add</button>
                </form>
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


    <div class="top-buffer tab-panel hidden" id="places-panel">
        <div class="page-header text-centred">
            <div class="row top-buffer">
                <form class="form-inline" role="form">
                    <div class="form-group">
                        <label for="newTitlePlace">Title</label>
                        <input type="text" class="form-control" id="newTitlePlace" placeholder="Title">
                    </div>
                    <div class="form-group">
                        <label for="newLongitudePlace">Longitude</label>
                        <input type="text" class="form-control" id="newLongitudePlace" placeholder="Longitude">
                    </div>
                    <div class="form-group">
                        <label for="newLatitudePlace">Latitude</label>
                        <input type="text" class="form-control" id="newLatitudePlace" placeholder="Latitude">
                    </div>
                    <div class="form-group">
                        <label for="newDescriptionPlace">Description</label>
                        <input type="text" class="form-control" id="newDescriptionPlace" placeholder="Description">
                    </div>
                    <button type="button" class="btn btn-primary" id="addNewPlace">Add</button>
                </form>
            </div>
            <div class="row top-buffer">
                <div class="col-lg-offset-4 col-lg-5">
                    <table class="table table-hover">
                        <thread>
                            <thread>
                                <tr>
                                    <th>Title</th>
                                    <th>Longitude</th>
                                    <th>Latitude</th>
                                    <th>Description</th>
                                </tr>
                            </thread>
                            <tbody>
                            <c:forEach items="${allPlaces}" var="places">
                                <tr>
                                    <td>${places.title}</td>
                                    <td>${places.longitude}</td>
                                    <td>${places.latitude}</td>
                                    <td>${places.description}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </thread>
                    </table>
                </div>
            </div>
        </div>
    </div>

    <div class="top-buffer tab-panel hidden" id="posts-panel">
        <div class="page-header text-centred">
            <div class="row top-buffer">
                <form class="form-inline" role="form">
                    <div class="form-group">
                        <label for="newTitlePost">Title</label>
                        <input type="text" class="form-control" id="newTitlePost" placeholder="Title">
                    </div>
                    <div class="form-group">
                        <label for="newContentPost">Content</label>
                        <input type="text" class="form-control" id="newContentPost" placeholder="Content">
                    </div>
                    <div class="form-group">
                        <label for="newDatePost">Date Post</label>
                        <input type="text" class="form-control" id="newDatePost" placeholder="Date Post">
                    </div>
                    <button type="button" class="btn btn-primary" id="addNewPost">Add</button>
                </form>
            </div>
            <div class="row top-buffer">
                <div class="col-lg-offset-4 col-lg-5">
                    <table class="table table-hover">
                        <thread>
                            <thread>
                                <tr>
                                    <th>Title</th>
                                    <th>Content</th>
                                    <th>Date Post</th>
                                </tr>
                            </thread>
                            <tbody>
                            <c:forEach items="${allPosts}" var="posts">
                                <tr>
                                    <td>${posts.title}</td>
                                    <td>${posts.content}</td>
                                    <td>${posts.date}</td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </thread>
                    </table>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/core/my-script.js"></script>

</body>
</html>
