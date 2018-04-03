import { Component, OnInit } from '@angular/core';
import { User } from '../entities/User';
import { Router } from '@angular/router';
import { PeopleService } from '../services/people.service';
import { Subscription } from 'rxjs/Subscription';
@Component({
    selector: 'app-people',
    templateUrl: './people.component.html',
    styleUrls: ['./people.component.css'],
})
export class PeopleComponent implements OnInit {

    people: Array<User>;
    peopleSubscription: Subscription;

    constructor(private peopleService: PeopleService, private route: Router) { }
    ngOnInit() {
        this.peopleSubscription = this.peopleService.getPeople().subscribe((resp) => {
            this.people = resp;
        });
    }
}
