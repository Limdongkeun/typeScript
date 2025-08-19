/*
* 타입 좁히기
* 조건문 등을 이용해 넓은 타입에서 좁은 타입으로
* 타입을 상황에 따라 좁히는 방법
*/


type Person = {
    name: string,
    age: number,
};

//value = >number : toFixed()
//value = >string : toUpperCase()
function func(value: number | string | Date | null | Person) {
    // value 여기서는 두 타입을 다 추론 하기 때문에 number나 string의 method가 작동하지 않음
    if(typeof value === "string") { // 이런 표현이 타입가드
        console.log(value.toUpperCase());
    } else if (typeof value === "number"){
        console.log(value.toFixed());
    } else if (value instanceof Date) {
        console.log(value.getDate());
    } else if (value && "age" in value) {
        console.log(`${value.name}은 ${value.age}살 입니다`);
    }
}


