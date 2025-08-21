/*
* 함수 타입 정의
*/

//함수를 설명하는 가장 좋은 방법
// 어떤 매개변수를 받고, 어떤 결과값을 반환하는지 이야기 -> js
// 어떤 [타입의[ 매개변수를 받고, 어떤 [타입의] 결과값을 반환하는지 -> ts

function func(a: number, b: number): number {
    return a + b;
}

/*
* 화살표 함수의 타입 정의
*/

const add = (a: number, b: number) => a + b;

/*
* 함수의 매개변수
*/
function introduce(name = "임동근", age: number, tall?: number) { //? 선택적 매개변수는 항상 맨 마지막
    console.log(`${name}`);
    if (typeof tall === "number") console.log(
        `${tall + 10}cm`
    )
}

introduce("임동", 173);

introduce("얌", 30)


function getSum(...rest: number[]) {
    let sum = 0;
    rest.forEach(item => {
        sum += item;
    })
    console.log(sum);
    //위 아래 동일
    // for(let i = 0; i < rest.length; i++) {
    //     sum += rest[i];
    // }
    // console.log(sum);
}

getSum(1, 2, 3)
getSum(1, 2, 3, 4, 5, 6)
