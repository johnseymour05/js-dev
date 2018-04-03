import { Component, OnInit } from '@angular/core';

import { Router } from '@angular/router';

import { Subscription } from 'rxjs/Subscription';
import { OnChanges } from '@angular/core';
import { Post } from '../../entities/Post';
import { User } from '../../entities/User';
import { MessageService } from '../../services/message.service';

@Component({
    selector: 'app-profile',
    templateUrl: './profile.component.html',
    styleUrls: ['./profile.component.css'],
})
export class ProfileComponent implements OnInit {

    post = new Post();
    posts: Post[];
    user: User;
    constructor(private route: Router, private messageService: MessageService) { }

    ngOnInit() {
        this.user = JSON.parse(sessionStorage.getItem('currentUser'));
        this.messageService.getUserPosts(this.user).subscribe( (resp) => {
            this.posts = resp;
        });
    }

    createPost() {
        this.post.userId = this.user.userId;
        this.posts.push(this.post);
        console.log('sending message to service layer : ' + JSON.stringify(this.post));
        this.messageService.createPost(this.post).subscribe();
    }
}
