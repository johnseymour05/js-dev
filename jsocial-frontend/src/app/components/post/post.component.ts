import { Component, Inject } from '@angular/core';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { Subscription } from 'rxjs/Rx';
import { PostService } from '../../services/post/post.service';

@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent implements OnInit {
  public posts;

  constructor(private postService: PostService) { }

  ngOnInit() {
    this.getData();
  }

  getData() {
    this.postService.getAllPosts().subscribe(
      posts => this.posts = posts
    );
  }
}
