import { Routes } from '@angular/router';
import { UserComponent } from './components/user/user.component';
import { PostComponent } from './components/post/post.component';

export const appRoutes: Routes = [
  {
    path: 'user',
    component: UserComponent,
  },
  {
    path: 'post',
    component: PostComponent,
  },
];
