/*
* 사용자 정의 타입 가드
*/

type Dog = {
    name: string,
    isBarking: boolean,
}

type Cat = {
    name: string,
    isMeowing: boolean,
}

type Animal = Dog | Cat;

function isDog(animal: Animal): animal is Dog {
    return (animal as Dog).isBarking !== undefined;
}


function warning(animal: Animal) {
    if (isDog(animal)) {

    } else if ("isMeowing" in animal) {

    } else {

    }
}