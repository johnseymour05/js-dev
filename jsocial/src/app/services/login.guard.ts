import { CanActivate, Router } from "@angular/router";
import { Injectable } from "@angular/core";
import { LoginService } from "./login.service";

@Injectable()
export class LoginGuard implements CanActivate {

    constructor(private ls: LoginService, private route: Router) { }

    canActivate() {
        if (!this.ls.isLoggedIn()) {
            this.route.navigate(['login']);
            return false;
        } else {
            return true;
        }
    }
}
