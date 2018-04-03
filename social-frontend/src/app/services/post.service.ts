import { Http } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import { Injectable } from '@angular/core';
import 'rxjs/add/operator/map';
import { Router } from '@angular/router';
import { Post } from '../entities/Post';
import { User } from '../entities/User';


@Injectable()
export class PostService {
    constructor(private http: Http, private route: Router) { }

    // create a post
    createPost(post: Post) {
        console.log('in create post service, post is: ' + JSON.stringify(post));
        return this.http.post('http://localhost:8080/Social/all/createPost', post)
        .map(resp => {
            const respPost = resp.json();
            if (respPost == null) {
                console.log('failed to post in service layer');
            } else {
                console.log('post created');
            }
        });
    }

    getUserPosts() {
        console.log('getting posts for ' + sessionStorage.getItem('currentUser'));
        const user = JSON.parse(sessionStorage.getItem('currentUser'));
        return this.http.post('http://localhost:8080/Social/all/getUserPosts', user)
        .map ( resp => {
            const retPosts = resp.json();
            console.log('returned posts');
            if (retPosts == null) {
                console.log('no posts to get');
            } else {
                console.log('got posts for ' + user);
                sessionStorage.setItem('currentUsersPosts', JSON.stringify(retPosts));
            }
        });
    }

    getViewedUserPosts() {
        console.log('getting posts for ' + sessionStorage.getItem('viewUser'));
        const user = JSON.parse(sessionStorage.getItem('viewUser'));
        return this.http.post('http://localhost:8080/Social/all/getUserPosts', user)
        .map ( resp => {
            const retPosts = resp.json();
            console.log('returned posts');
            if (retPosts == null) {
                console.log('no posts to get');
            } else {
                console.log('got posts for ' + JSON.stringify(user));
                sessionStorage.setItem('currentViewUsersPosts', JSON.stringify(retPosts));
                console.log('posts got for user: ' + sessionStorage.getItem('currentViewUsersPosts'));
            }
        });
    }

    getPostsByUser(user: User) {
        console.log('getting posts for ' + JSON.stringify(user));
        return this.http.post('http://localhost:8080/Social/all/getUserPosts', user)
        .map ( resp => {
            const retPosts = resp.json();
            console.log('returned posts');
            if (retPosts == null) {
                console.log('no posts to get');
            } else {
                console.log('got posts for ' + user);
                sessionStorage.setItem('followedUserPosts', JSON.stringify(retPosts));
            }
        });
    }

    getAllPosts() {
        return this.http.get('http://localhost:8080/Social/all/allPosts')
        .map ( resp => {
            const retPosts = resp.json();
            console.log('returned all posts');
            if (retPosts == null) {
                console.log('no posts to get');
            } else {
                sessionStorage.setItem('allPosts', JSON.stringify(retPosts));
            }
        });
    }

}
