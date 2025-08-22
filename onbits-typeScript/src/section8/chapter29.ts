/*
* 맵드 타입
*/

interface User {
    id: number;
    name: string;
    age: number;
}

// type UserMap = {
//     [key in "id" | "user" | "age"]?: User[key];
// };

type UserMap = {
    [key in keyof User]?: User[key];
};

type readOnlyUser = {
    readonly [key in keyof User]: User[key];
}

function fetchUser(): User {
    return {
        id: 1,
        name: "peter",
        age: 10,
    };
}

function updateUser(user: UserMap) {

}

updateUser({
    // id: 1,
    // name: "peter",
    age: 115,
})