import { Injectable, Inject } from '@angular/core';
import { Http, Response } from '@angular/http';
import { BehaviorSubject } from 'rxjs/Rx';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class UserService {

  private dataSubject = new BehaviorSubject([]);
  data$: Observable<any> = this.dataSubject.asObservable();

  public users;
  private prom;
  
  constructor(@Inject(Http) public http: Http) {
    this.fetch();
  }

  getFlashcards() {
    return this.users;
  }

  fetch(): void {
    this.users = this.http.get('http://localhost:9000/users/all').map(
      resp => resp.json(),
      err => console.log(err)
    )
    .subscribe(
      resp => {
        this.dataSubject.next(resp);
      },
      err => {
        console.log('error occurred loading flashcards' + err);
      }
    );
  }
}

