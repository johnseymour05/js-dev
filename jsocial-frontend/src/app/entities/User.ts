import { Follow } from "./Follow";

export class User {
    // "userId": 1,
    //     "username": "user1",
    //     "password": "pass",
    //     "email": null,
    //     "bio": null,
    //     "follows": []
    userId: number;
    username: String;
    password: String;
    email: String;
    bio: String;
    follows: Array<Follow>;
}