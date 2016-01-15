<%--
  Created by IntelliJ IDEA.
  User: brunyatko
  Date: 12.01.16
  Time: 12:20
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
    <jsp:useBean id="contact" scope="request" type="com.bruyako.model.ContactDto"/>
    <jsp:useBean id="hobby" scope="request" type="java.util.HashSet"/>
    <jsp:useBean id="place" scope="request" type="java.util.HashSet"/>
    <jsp:useBean id="post" scope="request" type="java.util.HashSet"/>
    <jsp:useBean id="allHobbies" scope="request" type="java.util.List"/>

</head>
<body>

<div class="container-fluid">
    <div class="page-header text-centred">
        <h1>Contact Info</h1>
        <div class="row">
            <div class="col-lg-offset-3 col-lg-6">
                <ul class="nav nav-tabs">
                    <li role="presentation" class="active"><a href="#" id="friend-tab">Friends</a></li>
                    <li role="presentation"><a href="#" id="hobbies-tab">Hobbies</a></li>
                    <li role="presentation"><a href="#" id="message-tab">Message</a></li>
                    <li role="presentation"><a href="#" id="places-tab">Places</a></li>
                    <li role="presentation"><a href="#" id="posts-tab">Posts</a></li>
                </ul>
            </div>
        </div>
    </div>

    <div class="top-buffer tab-panel" id="hobbies-panel">
        <div class="row top-buffer">
            <div class="page-header text-centred">
                <button type="submit" class="btn btn-primary" data-toggle="modal" data-target="#requestModal">
                    Add new Hobby
                </button>
            </div>

            <div class="modal fade" id="requestModal" tabindex="-1" role="dialog">
                <div class="modal-dialog" role="document">
                    <div class="modal-content">
                        <table class="table table-hover">
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
                                    <td><a href="/look/${contact.contactId}/${hobbies.hobbyId}">Add</a></td>
                                </tr>
                            </c:forEach>
                            </tbody>
                        </table>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-lg-offset-4 col-lg-5">
                <table class="table table-hover">
                    <thread>
                        <tr>
                            <th>Title</th>
                            <th>Description</th>
                        </tr>
                    </thread>
                    <tbody>
                    <c:forEach items="${hobby}" var="hobby">
                    <tr>
                        <td>${hobby.title}</td>
                        <td>${hobby.description}</td>
                        <td><a href="delete/${hobby.hobbyId}">Delete</a></td>
                    </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>

</div>


<script type="text/javascript" src="webjars/jquery/2.1.1/jquery.min.js"></script>
<script type="text/javascript" src="webjars/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/resources/core/my-script.js"></script>

</body>
</html>
