/*
* 인터페이스 확장
*/

interface Animal {
    name: string,
    age: number,
}

interface Dog extends Animal {
    breed: string,
}

interface Cat extends Animal {
    isScret: boolean,
}