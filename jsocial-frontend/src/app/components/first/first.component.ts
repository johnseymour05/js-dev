import { Component, Inject} from '@angular/core';
import { UserService } from '../../services/users/user.service';
import { OnInit } from '@angular/core/src/metadata/lifecycle_hooks';
import { Subscription } from 'rxjs/Rx';

@Component({
 selector: 'app-first',
 templateUrl: './first.component.html',
 styleUrls: ['./first.component.css']
})
export class FirstComponent implements OnInit {
    public users;
    public usersObserver: Subscription;

    constructor( private userService : UserService) {
    }

    ngOnInit() {
        this.getData();
      }
    
      getData() {
        this.usersObserver = this.userService.data$.subscribe(
          requestData => {
            console.log(requestData);
            this.users = requestData;
          },
          error => console.log(error)
        );
    
      }
}
