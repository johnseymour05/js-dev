import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { UIRouterModule } from '@uirouter/angular';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClient } from '@angular/common/http';


import { AppComponent } from './app.component';
import { NavComponent } from './nav/nav.component';
import { appRoutes } from './routes';
import { LoginService } from './services/login.service';
import { LoginGuard } from './services/login.guard';


import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { MessageService } from './services/message.service';
import { PeopleService } from './services/people.service';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { PeopleComponent } from './components/people/people.component';
import { LoginComponent } from './components/login/login.component';
import { ProfileComponent } from './components/profile/profile.component';


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
    LoginComponent,
    PeopleComponent,
    WelcomeComponent,
    ProfileComponent,
  ],
  providers: [
    LoginService,
    LoginGuard,
    MessageService,
    PeopleService,
    MessageService,
    HttpClient,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
