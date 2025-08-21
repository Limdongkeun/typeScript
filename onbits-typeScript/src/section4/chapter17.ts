/*
* 함수 타입의 호환성
* 특정 함수 타입을 다른 함수 타입으로 취급해도 괜찮은가를 판단
* 1. 반환값의 타입이 호환되는가
* 2. 매개변수의 타입잉 호환되는가
*/

//기준1. 반환값이 호환되는가
type A = () => number;
type B = () => 10;


let a: A = () => 10;
let b: B = () => 10;

a = b; //허용 업캐스팅
// b = a; //불가 다운캐스팅이기 때문에

/*
*기준2. 매개변수가 호환되는다
*/

// 2-1. 매개변수의 개수가 같을 때 -> 이때는 업캐스팅은 불가 다운캐스팅은 가능
type C = (value: number) => void;
type D = (value: 10) => void;

let c: C = (value) => {
};
let d: D = (value) => {
};

// c = d; 불가 매개변수의 개수가 같을 때는 업캐스팅이 안 됨
d = c; //가능 이건 다운캐스팅인데 매개변수의 타입을 기준으로 하니까 가능

type Animal = {
    name: string,
}

type Dog = {
    name: string,
    color: string,
}

let animalFunc = (animal: Animal) => {
    console.log(animal.name);
};
let dogFunc = (dog: Dog) => {
    console.log(dog.name);
    console.log(dog.color);
};

// animalFunc = dogFunc; 업캐스팅인데도 안 됨 이유는
let testFunc = (animal: Animal) => {
    console.log(animal.name);
    // console.log(animal.color);
};


dogFunc = animalFunc;

// 2-2. 매개변수의 개수가 다를 때
// 할당하려는 매개변수의 갯수가 다를 때는 적은걸 많은걸로 넣을 수 있다 단! 조건은 타입이 동일해야 한다
type Func1 = (a: number, b: number) => void;
type Func2 = (a: number) => void;

let func1: Func1 = (a, b) => {
};
let func2: Func2 = (a) => {
};

func1 = func2;
// func2 = func1;
