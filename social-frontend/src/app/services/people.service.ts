import { Http } from '@angular/http';
import { User } from '../entities/User';
import { Observable } from 'rxjs/Observable';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { Router } from '@angular/router';
import { CreateFollowerHolder } from '../entities/CreateFollowerHolder';
import { Subscription } from 'rxjs/Subscription';
import { HttpClient } from '@angular/common/http';


@Injectable()
export class PeopleService {

    people: User[];
    constructor(private http: HttpClient) {}

    getPeople(): Observable<User[]> {
        return this.http.get<User[]>('http://localhost:8080/Social/all/allUsers');
    }

}
