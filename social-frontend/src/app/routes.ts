import { Routes, CanActivate } from '@angular/router';
import { Component } from '@angular/core/src/metadata/directives';
import { TemplateComponent } from './template/template.component';
import { LoginComponent } from './login/login.component';
import { LoginGuard } from './services/login.guard';
import { AllUsersComponent } from './all-users/all-users.component';
import { ViewUserComponent } from './view-user/view-user.component';
import { ProfileComponent } from './profile/profile.component';
import { HomeComponent } from './home/home.component';
import { PeopleComponent } from './people/people.component';
import { WelcomeComponent } from './welcome/welcome.component';

export const appRoutes: Routes = [
  {
    path: '',
    component: TemplateComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'home',
    component: HomeComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'profile',
    component: ProfileComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'allUsers',
    component: AllUsersComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'viewUser',
    component: ViewUserComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'people',
    component: PeopleComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'welcome',
    component: WelcomeComponent,
    canActivate: [LoginGuard],
  },
];
