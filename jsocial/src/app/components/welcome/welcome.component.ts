import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';

import { Subscription } from 'rxjs/Subscription';
import { OnChanges } from '@angular/core';
import { Post } from '../../entities/Post';
import { User } from '../../entities/User';
import { MessageService } from '../../services/message.service';

@Component({
    selector: 'app-welcome',
    templateUrl: './welcome.component.html',
    styleUrls: ['./welcome.component.css'],
})
export class WelcomeComponent implements OnInit {

    post = new Post();
    posts: Post[];
    followedPosts = new Array<Post>();
    user: User;
    constructor(private route: Router, private messageService: MessageService) { }

    ngOnInit() {
        this.user = JSON.parse(sessionStorage.getItem('currentUser'));
        this.messageService.getAllPosts().subscribe( (resp) => {
            this.posts = resp;
            for (let j = 0; j < this.posts.length; j++) {
                for (let i = 0; i < this.user.following.length; i++) {
                    if (this.posts[j].userId === this.user.following[i].followedUserId) {
                        this.followedPosts.push(this.posts[j]);
                    }
                }
            }
        });
    }

    createPost() {
        this.post.userId = this.user.userId;
        this.posts.push(this.post);
        console.log('sending message to service layer : ' + JSON.stringify(this.post));
        this.messageService.createPost(this.post).subscribe();
    }
}
