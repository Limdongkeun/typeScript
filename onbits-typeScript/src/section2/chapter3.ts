//object
//객체 리터럴 타입
// ?가 있으면 있어도 되고 없어도 된다 하지만 number 타입이어야 한다
let user1: { id?: number, name: string} = {
    id:1,
    name: "임동근"
};
user1.id;
console.log(user1);

user1 = {
    name: "홍길동"
}


let config:{
    readonly apiKey: string,
} = {
    apiKey: "123456"
}

let dog:  {
    name: string,
    color: string
} = {
    name: "왕왕",
    color: "blue"
}

