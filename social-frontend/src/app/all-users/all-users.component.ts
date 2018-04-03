import { Component, OnInit } from '@angular/core';
import { User } from '../entities/User';
import { Post } from '../entities/Post';
import { PostService } from '../services/post.service';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
@Component({
    selector: 'app-all-users',
    templateUrl: './all-users.component.html',
    styleUrls: ['./all-users.component.css'],
})
export class AllUsersComponent implements OnInit {

    allUsers: Array<User>;

    constructor(private userService: UserService, private route: Router) { }

    ngOnInit() {
        this.userService.getAllUsers().subscribe();
        this.allUsers = JSON.parse(sessionStorage.getItem('allUsers'));
    }

    goToUserProfile(user: User) {
        sessionStorage.setItem('viewUser', JSON.stringify(user));
        this.route.navigate(['/viewUser']);
    }

    followUser(user: User) {
        this.userService.followUser(user).subscribe();
    }
}
