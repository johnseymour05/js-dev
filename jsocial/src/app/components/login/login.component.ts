import { Component, OnInit } from '@angular/core';
import { User } from '../../entities/User';
import { LoginService } from '../../services/login.service';

@Component({
    selector: 'app-login',
    templateUrl: './login.component.html',
    styleUrls: ['./login.component.css'],
})
export class LoginComponent implements OnInit {

    user = new User();
    regUser = new User();

    constructor(private loginService: LoginService) { }
    ngOnInit() {
    }
    login() {
        this.loginService.login(this.user).subscribe();
    }
    register() {
        this.loginService.register(this.regUser).subscribe();
    }

}
