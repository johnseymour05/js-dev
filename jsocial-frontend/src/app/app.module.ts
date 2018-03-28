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
import {AnotherComponent} from './components/another/another.component';
import {BeanComponent} from './components/bean/bean.component';
import {PokemonComponent} from './components/pokemon/pokemon.component';
import {UserComponent} from './components/user/user.component';
import { appRoutes } from './routes';

@NgModule({
 imports: [
   BrowserModule,
   HttpModule,
   NgbModule.forRoot(),
   RouterModule.forRoot(appRoutes),
   FormsModule
 ],
 declarations: [
   AppComponent,
   NavComponent,
   FirstComponent,
   AnotherComponent,
   BeanComponent,
   PokemonComponent,
   UserComponent
  ],
 providers: [

  ],
 bootstrap: [AppComponent]
})
export class AppModule { }
