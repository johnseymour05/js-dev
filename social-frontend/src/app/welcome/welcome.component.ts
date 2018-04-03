import { Component, OnInit } from '@angular/core';
import { User } from '../entities/User';
import { Post } from '../entities/Post';
import { PostService } from '../services/post.service';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';
import { MessageService } from '../services/message.service';
import { Subscription } from 'rxjs/Subscription';
import { OnChanges } from '@angular/core';

@Component({
    selector: 'app-welcome',
    templateUrl: './welcome.component.html',
    styleUrls: ['./welcome.component.css'],
})
export class WelcomeComponent implements OnInit {

    private postSubscription: Subscription;
    post = new Post();
    posts: Post[];
    user: User;
    constructor(private route: Router, private messageService: MessageService) { }

    ngOnInit() {
        this.user = JSON.parse(sessionStorage.getItem('currentUser'));
        this.postSubscription = this.messageService.getAllPosts().subscribe( (resp) => {
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
