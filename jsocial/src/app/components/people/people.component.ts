import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Subscription } from 'rxjs/Subscription';
import { User } from '../../entities/User';
import { PeopleService } from '../../services/people.service';
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
    followUser(user: User) {
        this.peopleService.followUser(user).subscribe();
    }
}
