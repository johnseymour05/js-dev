Use this file for all documentation:

What have I done in this this application

Users can login
- webpage with a form submission
    - method 1: binding
        - create an html page with divs, some being inputs and a submit 
        - on an event occurance submit the bound data into the service layer
        - make an ajax call to the appropriate server url
        - if successfull store the returned data in the session storage
    - method 2: forms

Users are not allowed to access the website without logging in
- user Authentication
    method 1: route guards
        - create a Authentication Guard class
        - implement canActivate
        - add it to the routes


Bugs to remember:
Leaky database instances -> stop and restart rds
not hitting url mappings -> add maven dependencies into deployment assembly

