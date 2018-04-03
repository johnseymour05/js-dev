import { FollowedUser } from "./FollowedUser";

export class User {
    userId: number;
    username: number;
    password: String;
    following: Array<FollowedUser>;
}
