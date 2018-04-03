import { Http } from '@angular/http';
import { User } from '../entities/User';
import { Observable } from 'rxjs/Observable';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { Router } from '@angular/router';
import { CreateFollowerHolder } from '../entities/CreateFollowerHolder';


@Injectable()
export class UserService {

    currentUser: User;
    holder = new CreateFollowerHolder();

    constructor(private http: Http, private route: Router) { }

    getAllUsers() {
        return this.http.get('http://localhost:8080/Social/all/allUsers')
        .map(resp => {
            const retUsers = resp.json();
            if (retUsers == null) {
                console.log('failed to get users in service layer');
            } else {
                console.log('got all users');
                sessionStorage.setItem('allUsers', JSON.stringify(retUsers));
            }
        });
    }

    followUser(user: User) {
        console.log('in follow user. current user: ' + sessionStorage.getItem('currentUser')
    + ' user to be followed: ' + JSON.stringify(user));
        this.currentUser = JSON.parse(sessionStorage.getItem('currentUser'));
        console.log(('put current user from session storage into an object: ' + JSON.stringify(this.currentUser)));
        this.holder.currentUser = this.currentUser;
        this.holder.idOfUserToBeFollowed = user.userId;
        console.log('req body to be sent to server: ' + JSON.stringify(this.holder));
        return this.http.post('http://localhost:8080/Social/all/followUser', this.holder)
        .map(resp => {
            const retUser = resp.json();
        });
    }

}
