//void
//void -> 공허 -> 아무것도 없다
//void -> 아무것도 없음을 의미하는 타임

function func(): void {
    console.log('hello');
}

function func2(): string {
    return "hello";
}


//never
//never -> 존재하지 않는
//불가능한 타임
// 그 어떤 값도 담을 수 없다
function func3(): never {
    while (true) {

    }
}

function func4(): never {
    throw new Error("error");
}