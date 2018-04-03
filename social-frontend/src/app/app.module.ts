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
import { TemplateComponent } from './template/template.component';
import { LoginComponent } from './login/login.component';
import { LoginService } from './services/login.service';
import { LoginGuard } from './services/login.guard';
import { PostService } from './services/post.service';
import { AllUsersComponent } from './all-users/all-users.component';
import { UserService } from './services/user.service';
import { ViewUserComponent } from './view-user/view-user.component';
import { ProfileComponent } from './profile/profile.component';
import { HomeComponent } from './home/home.component';
import { PeopleComponent } from './people/people.component';
import { PeopleService } from './services/people.service';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { MessageService } from './services/message.service';
import { WelcomeComponent } from './welcome/welcome.component';


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
    TemplateComponent,
    LoginComponent,
    ProfileComponent,
    HomeComponent,
    AllUsersComponent,
    ViewUserComponent,
    PeopleComponent,
    WelcomeComponent,
  ],
  providers: [
    LoginService,
    LoginGuard,
    PostService,
    UserService,
    MessageService,
    PeopleService,
    MessageService,
    HttpClient,
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
