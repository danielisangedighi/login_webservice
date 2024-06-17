# Web Sevice Boiler-Plate with Secure Login Authentication and Database connection 
## Executive Summary
  This is a boiler plate for a Web Service Application with the Secure Login apparatus already created.
  I use it for developing Web Services that require secure login authentication, and stratified user access permissions to endpoint resources.
  It is a Model-View-Controller structured REST API built with Spring Boot framework, that can connect to a MySQL Database.
## Introduction
  The most commercialized softwares are Web Services.
  They can be packaged and deployed on Cloud servers or On-Premise on local or remote servers.
  They can also be built and packaged in containers to make them more portable and easily distributable.

## Security
  One of the key features that can add value to such Web Services is a secure User Account creation portal from the Web User Interface (WebUI).
  So that, when Users arrive on the Home Page of the Web Service, they can register with their personal details to create an account.
  Then that User can log into the Web Service Welcome Page, and access the various resources and endpoints to peform their required functions.
  It is important that the Web Service can protect the users password - even from the Database Administrator for privacy assurance.

## User Access Control
  It is also important to separate the functions of the various users; based on the levels of permission assigned to their user profiles.
  This levels of permission are usually stratifed as below:
  1. Administrator
  2. Basic User

Thus, the user will have access to various endpoints with respect to the levels of permissions assigned to their database records.

I would suggest that the DataBase Administrator creates the First Administrator User directly; in the Database.
- You can do that by using an SQL Query to change the Category Attribute (from Basic User to Administrator) for that First Users Record using MySQL Workbench, or any other tool you may prefer.
---
With the structure laid out above, a Web Service Application Developer can expand on the Service Handler Methods to extend its functionalty to other Endpoints from the Service Classes.

I hope you find this repository useful.

Please, feel free to reach out to via [my email](mailto:isangedighidaniel@gmail.com) if you need any support or have any questions about its usage.
💖
  
