import { Component, OnInit } from '@angular/core';
import { User } from '../entities/User';
import { Post } from '../entities/Post';
import { PostService } from '../services/post.service';
import { Router } from '@angular/router';

@Component({
    selector: 'app-view-user',
    templateUrl: './view-user.component.html',
    styleUrls: ['./view-user.component.css'],
})
export class ViewUserComponent implements OnInit {

    viewUser: User;
    posts: Array<Post>;

    constructor(private postService: PostService, private route: Router) { }

    ngOnInit() {
        this.viewUser = JSON.parse(sessionStorage.getItem('viewUser'));
        this.postService.getViewedUserPosts().subscribe();
        console.log('posts got for user: ' + sessionStorage.getItem('currentViewUsersPosts'));
        this.posts = JSON.parse(sessionStorage.getItem('currentViewUsersPosts'));
        console.log('posts loaded in view user component: ' + JSON.stringify(this.posts));
    }

}
