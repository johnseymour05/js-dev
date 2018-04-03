import { Component, OnInit } from '@angular/core';
import { User } from '../entities/User';
import { Post } from '../entities/Post';
import { PostService } from '../services/post.service';
import { Router } from '@angular/router';

@Component({
    selector: 'app-profile',
    templateUrl: './profile.component.html',
    styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {

    user: User;
    post = new Post();
    posts: Array<Post>;

    constructor(private postService: PostService, private route: Router) { }

    ngOnInit() {
        console.log('in init of profile component');
        this.user = JSON.parse(sessionStorage.getItem('currentUser'));
        console.log(this.user.username);
        this.postService.getUserPosts().subscribe();
        console.log('current posts in session storage ' + sessionStorage.getItem('currentUsersPosts'));
        this.posts = JSON.parse(sessionStorage.getItem('currentUsersPosts'));
    }

    createPost() {
        this.post.userId = this.user.userId;
        console.log('sending post to service layer : ' + JSON.stringify(this.post));
        this.postService.createPost(this.post).subscribe();
    }

    navUsers() {
        this.route.navigate(['/allUsers']);
    }

}
