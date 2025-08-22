/*
* keyof
*/

interface Persion {
    name: string,
    age: number
}

function printName(person: Persion, key: keyof Persion) {
    console.log(person[key]);

}

const person: Persion = {
    name: "peter",
    age: 10,
}

console.log(person);
printName(person, "name");
printName(person, "age");
