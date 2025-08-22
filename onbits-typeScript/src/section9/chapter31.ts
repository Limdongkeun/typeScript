/*
* 조건부 타입
*/
type A = number extends number ? string : number;

type objB = {
    id: number,
    age: number,
}

type B = objB extends objB ? string : objB;