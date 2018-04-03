import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import {NgbModule} from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import {AppComponent} from './app.component';
import {NavComponent} from './nav/nav.component';
import {FirstComponent} from './components/first/first.component';
import { appRoutes } from './routes';
import { UserService } from './services/users/user.service';

@NgModule({
 imports: [
   BrowserModule,
   HttpModule,
   NgbModule.forRoot(),
   RouterModule.forRoot(appRoutes),
   FormsModule,
 ],
 declarations: [
  AppComponent,
  NavComponent,
   FirstComponent,
  ],
 providers: [
   UserService,

 ],
 bootstrap: [AppComponent]
})
export class AppModule { }