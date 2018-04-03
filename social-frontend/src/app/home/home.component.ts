import { Component, OnInit } from '@angular/core';
import { User } from '../entities/User';
import { Post } from '../entities/Post';
import { PostService } from '../services/post.service';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
    selector: 'app-home',
    templateUrl: './home.component.html',
    styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {

    user: User;
    post = new Post();
    posts: Array<Post>;
    followedPosts = new Array<Post>();

    constructor(private postService: PostService, private userService: UserService, private route: Router) { }

    ngOnInit() {
        this.postService.getAllPosts().subscribe();
        this.posts = JSON.parse(sessionStorage.getItem('allPosts'));
        this.user = JSON.parse(sessionStorage.getItem('currentUser'));

        console.log('user: ' + sessionStorage.getItem('currentUser') + 'posts: ' +
        sessionStorage.getItem('allPosts'));

        for (let i = 0; i < this.posts.length; i++) {
            for (let j = 0; j < this.user.following.length; j++) {

                console.log('this.posts[i].userId: ' + this.posts[i].userId +
                ' this.user.following[j].followedUserId: ' + this.user.following[j].followedUserId);

                if (this.posts[i].userId === this.user.following[j].followedUserId) {

                    console.log('matched this.posts[i].userId' + this.posts[i].userId +
                    'user.followingj.followeduserid' + this.user.following[j].followedUserId);
                    this.followedPosts.push(this.posts[i]);
            }
        }
    }
    }

    createPost() {
        this.post.userId = this.user.userId;
        console.log('sending post to service layer : ' + JSON.stringify(this.post));
        this.postService.createPost(this.post).subscribe();
    }

    navUsers() {
        this.route.navigate(['/allUsers']);
    }
    navProfile() {
        this.route.navigate(['/profile']);
    }

}
