# Stock App

Stock app is a simple Spring + React Application for storing Companies , Stock Exchanges and Sectors and then analyze their Stock rates. This **Eureka Server** repository is the Microservice server part of the application. For the **SpringBoot Java** part , check [this](https://github.com/Dibyanshu-gtm/stockexchangebackend).For the **React Front End** part , check [this](https://github.com/Dibyanshu-gtm/clientapp). This app is also deployed in Heroku server . 
* Backend: https://stockexchangebackend.herokuapp.com
* Frontend: https://stockexchangefrontend.herokuapp.com
* EurekaServer https://eurekaserverstockapp.herokuapp.com/



## Technology Stack Used
* Java: Version 8
* Spring : 2.5.2
* Maven
* Database:  In memory ( H2 database )
* Database persistence: Hibernate JPA
* Spring Boot Security
* JWT Token Authorization
* React : 17.0.2
* BootStrap: 5.0.2
* FusionCharts : 3.17.0
* Other packages like react-bootstrap, react-router-dom etc. Check package.json for more 

## How to deploy locally

Prerequisite to deployment , check to it that you have NodeJs , npm or any other package manager and react installed on your setup .

* Download or Clone the code 
* Open a bash or a terminal and do 'npm install' to get all dependencies
* Once done you can run the app in development mode using npm start and open [http://localhost:3000](http://localhost:3000/) in your browser
* Go ahead and check react or npm documentation for more

## How to deploy on Heroku

* Register on Heroku and Create a Free account.
* Select New -> Create new App
* Give your application a new name and Link your GitHub repository in Settings
* Deploy the application and test it out on the deployed URL.
