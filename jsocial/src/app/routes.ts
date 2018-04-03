import { Routes, CanActivate } from '@angular/router';
import { Component } from '@angular/core/src/metadata/directives';

import { LoginGuard } from './services/login.guard';
import { LoginComponent } from './components/login/login.component';
import { PeopleComponent } from './components/people/people.component';
import { WelcomeComponent } from './components/welcome/welcome.component';
import { ProfileComponent } from './components/profile/profile.component';


export const appRoutes: Routes = [
  {
    path: 'login',
    component: LoginComponent,
  },
  {
    path: 'people',
    component: PeopleComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'profile',
    component: ProfileComponent,
    canActivate: [LoginGuard],
  },
  {
    path: 'welcome',
    component: WelcomeComponent,
    canActivate: [LoginGuard],
  },
];
