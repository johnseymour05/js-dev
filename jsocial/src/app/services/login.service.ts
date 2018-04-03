import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { Router } from '@angular/router';
import { User } from '../entities/User';


@Injectable()
export class LoginService {
    constructor(private http: Http, private route: Router) { }

    // login using session storage
    login(user: User) {
        console.log(JSON.stringify(user));
        return this.http.post(' http://localhost:8080/Social/all/login', user)
        .map(resp => {
            const respUser = resp.json();
            if (respUser == null) {
                console.log('failed to login');
            } else {
                console.log('correct creds');
                sessionStorage.setItem('currentUser', JSON.stringify(respUser));
                console.log('login service session user is: ' + sessionStorage.getItem('currentUser'));
                this.route.navigate(['/welcome']);
            }
        });
    }

    register(regUser: User) {
        console.log(JSON.stringify(regUser));
        return this.http.post(' http://localhost:8080/Social/all/createUser', regUser)
        .map(resp => {
            const retUser = resp.json();
            if (retUser == null) {
                console.log('failed to create user');
            } else {
                console.log('correct creds');
                alert('created user');
            }
        });
    }


    isLoggedIn() {
        if (sessionStorage.getItem('currentUser') != null) {
            return true;
        } else {
            return false;
        }
    }

}
