import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import {UserComponent} from './components/user/user.component';
import { appRoutes } from './routes';
import { UserService } from './services/users/user.service';
import { HttpClientModule } from '@angular/common/http';
import { PostComponent } from './components/post/post.component';
import { PostService } from './services/post/post.service';


@NgModule({
 imports: [
   BrowserModule,
   HttpModule,
   NgbModule.forRoot(),
   RouterModule.forRoot(appRoutes),
   FormsModule,
   HttpClientModule,
 ],
 declarations: [
  AppComponent,
  NavComponent,
  UserComponent,
  PostComponent,
  ],
 providers: [
   UserService,
   PostService,

 ],
 bootstrap: [AppComponent]
})
export class AppModule { }
