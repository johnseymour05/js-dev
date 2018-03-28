
import { Component,  OnInit, Inject } from '@angular/core';
import { Http } from '@angular/http';
import { Observable } from 'rxjs';
import { User } from './beans/User';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  users: Array<User> = [];

  constructor(@Inject(Http) public http: Http) {

  }

  ngOnInit() {

    this.http.get('http://localhost:8080/ERS_Project_Seymour/angular').subscribe( 
      (successResp) => {
        this.users = successResp.json();
      },
      (failResp) => {
        alert('failed to load users');
      }
    );
  }
}
