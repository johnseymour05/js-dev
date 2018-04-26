import { Component, Inject } from '@angular/core';
import { UserService } from '../../services/users/user.service';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { Subscription } from 'rxjs/Rx';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  public users;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.getData();
  }

  getData() {
    this.userService.getAllUsers().subscribe(
      users => this.users = users
    );
  }
}
