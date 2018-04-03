import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { Router } from '@angular/router';
import { CreateFollowerHolder } from '../entities/CreateFollowerHolder';
import { Subscription } from 'rxjs/Subscription';
import { HttpClient } from '@angular/common/http';
import { User } from '../entities/User';


@Injectable()
export class PeopleService {

    currentUser: User;
    people: User[];
    holder = new CreateFollowerHolder();

    constructor(private http: HttpClient) {}

    getPeople(): Observable<User[]> {
        return this.http.get<User[]>('http://localhost:8080/Social/all/allUsers');
    }
    followUser(user: User) {
        this.currentUser = JSON.parse(sessionStorage.getItem('currentUser'));
        this.holder.currentUser = this.currentUser;
        this.holder.idOfUserToBeFollowed = user.userId;
        return this.http.post('http://localhost:8080/Social/all/followUser', this.holder);
    }

}
